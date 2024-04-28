
package net.mcreator.clashofclansweapons.entity;

import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.monster.Ghast;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.pathfinder.Path;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.Packet;
import net.minecraft.core.BlockPos;

import net.mcreator.clashofclansweapons.init.ClashofclansweaponsModGameRules;
import net.mcreator.clashofclansweapons.init.ClashofclansweaponsModEntities;

import coc.troop.clancapital.ClanCapitalTroopBase;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.controller.AnimationController;

import java.util.EnumSet;

public class MountainGolemEntity extends ClanCapitalTroopBase implements IAnimatable{
	private int COOLDOWN = 0;
	private static final EntityDataAccessor<Boolean> DATA_IS_ATTACKING = SynchedEntityData.defineId(MountainGolemEntity.class, EntityDataSerializers.BOOLEAN);
private AnimationFactory factory = new AnimationFactory(this);
	public MountainGolemEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(ClashofclansweaponsModEntities.MOUNTAIN_GOLEM.get(), world);
	}

	@Override
	public void registerGoals() {
		this.targetSelector.addGoal(2, new NearestAttackableTargetGoal(this, Monster.class, false, false));
		this.goalSelector.addGoal(3, new RandomStrollGoal(this, 1));
		this.goalSelector.addGoal(1,new GolemMeleeAttackGoal(this,1,false));
	}

	public MountainGolemEntity(EntityType<MountainGolemEntity> type, Level world) {
		super(type, world);
		xpReward = 0;
		setNoAi(false);
		setPersistenceRequired();
	}

	@Override
	public Packet<?> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	public void playStepSound(BlockPos pos, BlockState blockIn) {
		this.playSound(ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.stone.step")), 0.15f, 1);
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.death"));
	}

	public static void init() {
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.16);
		builder = builder.add(Attributes.MAX_HEALTH, 750);
		builder = builder.add(Attributes.ARMOR, 0);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 40);
		builder = builder.add(Attributes.KNOCKBACK_RESISTANCE, 255);
		builder = builder.add(Attributes.ATTACK_KNOCKBACK, 5);
		return builder;
	}
	protected void defineSynchedData() {
		super.defineSynchedData();
		this.entityData.define(DATA_IS_ATTACKING, false);
	}
	@Override
	public void die(DamageSource source) {
		super.die(source);
		if (!this.level.isClientSide()) {
			if (this.level.getLevelData().getGameRules().getBoolean(ClashofclansweaponsModGameRules.DESTROYENVIROMENTRULE)) {
				this.level.explode(null, this.getX(), this.getY(), this.getZ(), 7, Explosion.BlockInteraction.BREAK);
			} else {
				this.level.explode(null, this.getX(), this.getY(), this.getZ(), 7, Explosion.BlockInteraction.NONE);
			}
		}
	}
	
@Override
	public void  registerControllers(AnimationData data)
	{
		data.addAnimationController(new AnimationController(this,"controller",0,this::predicate));
	}
	@Override
	public AnimationFactory getFactory()
	{
		return this.factory;
	}
	private <E extends IAnimatable> PlayState predicate(AnimationEvent<E> event)
	{
		if(entityData.get(DATA_IS_ATTACKING))
		{
			event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.mountain_go.attack", false));
			return PlayState.CONTINUE;
		}
		if(event.isMoving())
		{
			event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.mountain_go.walk", true));
			return PlayState.CONTINUE;
		}
		event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.mountain_go.idle", true));
		return PlayState.CONTINUE;
	}
	@Override
	public void tick() {
		super.tick();
		if(entityData.get(DATA_IS_ATTACKING))
		{
			COOLDOWN++;
			if(COOLDOWN >= 50)
			{
				entityData.set(DATA_IS_ATTACKING, false);
				COOLDOWN = 0;
			}
		}
	}
	class GolemMeleeAttackGoal extends Goal
	{

		protected final MountainGolemEntity mob;
		private final double speedModifier;
		private final boolean followingTargetEvenIfNotSeen;
		private Path path;
		private double pathedTargetX;
		private double pathedTargetY;
		private double pathedTargetZ;
		private int ticksUntilNextPathRecalculation;
		private int ticksUntilNextAttack;
		private final int attackInterval = 20;
		private long lastCanUseCheck;
		private static final long COOLDOWN_BETWEEN_CAN_USE_CHECKS = 20L;
		private int failedPathFindingPenalty = 0;
		private boolean canPenalize = false;

		public GolemMeleeAttackGoal(MountainGolemEntity p_25552_, double p_25553_, boolean p_25554_) {
			this.mob = p_25552_;
			this.speedModifier = p_25553_;
			this.followingTargetEvenIfNotSeen = p_25554_;
			this.setFlags(EnumSet.of(Goal.Flag.MOVE, Goal.Flag.LOOK));
		}

		public boolean canUse() {
			long i = this.mob.level.getGameTime();
			if (i - this.lastCanUseCheck < 20L) {
				return false;
			} else {
				this.lastCanUseCheck = i;
				LivingEntity livingentity = this.mob.getTarget();
				if (livingentity == null) {
					return false;
				} else if (!livingentity.isAlive()) {
					return false;
				} else {
					if (canPenalize) {
						if (--this.ticksUntilNextPathRecalculation <= 0) {
							this.path = this.mob.getNavigation().createPath(livingentity, 0);
							this.ticksUntilNextPathRecalculation = 4 + this.mob.getRandom().nextInt(7);
							return this.path != null;
						} else {
							return true;
						}
					}
					this.path = this.mob.getNavigation().createPath(livingentity, 0);
					if (this.path != null) {
						return true;
					} else {
						return this.getAttackReachSqr(livingentity) >= this.mob.distanceToSqr(livingentity.getX(), livingentity.getY(), livingentity.getZ());
					}
				}
			}
		}

		public boolean canContinueToUse() {
			LivingEntity livingentity = this.mob.getTarget();
			if (livingentity == null) {
				return false;
			} else if (!livingentity.isAlive()) {
				return false;
			} else if (!this.followingTargetEvenIfNotSeen) {
				return !this.mob.getNavigation().isDone();
			} else if (!this.mob.isWithinRestriction(livingentity.blockPosition())) {
				return false;
			} else {
				return !(livingentity instanceof Player) || !livingentity.isSpectator() && !((Player)livingentity).isCreative();
			}
		}

		public void start() {
			this.mob.getNavigation().moveTo(this.path, this.speedModifier);
			this.mob.setAggressive(true);
			this.ticksUntilNextPathRecalculation = 0;
			this.ticksUntilNextAttack = 0;
		}

		public void stop() {
			LivingEntity livingentity = this.mob.getTarget();
			if (!EntitySelector.NO_CREATIVE_OR_SPECTATOR.test(livingentity)) {
				this.mob.setTarget((LivingEntity)null);
			}

			this.mob.setAggressive(false);
			this.mob.getNavigation().stop();
		}

		public boolean requiresUpdateEveryTick() {
			return true;
		}

		public void tick() {
			LivingEntity livingentity = this.mob.getTarget();
			if (livingentity != null) {
				this.mob.getLookControl().setLookAt(livingentity, 30.0F, 30.0F);
				double d0 = this.mob.distanceToSqr(livingentity.getX(), livingentity.getY(), livingentity.getZ());
				this.ticksUntilNextPathRecalculation = Math.max(this.ticksUntilNextPathRecalculation - 1, 0);
				if ((this.followingTargetEvenIfNotSeen || this.mob.getSensing().hasLineOfSight(livingentity)) && this.ticksUntilNextPathRecalculation <= 0 && (this.pathedTargetX == 0.0D && this.pathedTargetY == 0.0D && this.pathedTargetZ == 0.0D || livingentity.distanceToSqr(this.pathedTargetX, this.pathedTargetY, this.pathedTargetZ) >= 1.0D || this.mob.getRandom().nextFloat() < 0.05F)) {
					this.pathedTargetX = livingentity.getX();
					this.pathedTargetY = livingentity.getY();
					this.pathedTargetZ = livingentity.getZ();
					this.ticksUntilNextPathRecalculation = 4 + this.mob.getRandom().nextInt(7);
					if (this.canPenalize) {
						this.ticksUntilNextPathRecalculation += failedPathFindingPenalty;
						if (this.mob.getNavigation().getPath() != null) {
							net.minecraft.world.level.pathfinder.Node finalPathPoint = this.mob.getNavigation().getPath().getEndNode();
							if (finalPathPoint != null && livingentity.distanceToSqr(finalPathPoint.x, finalPathPoint.y, finalPathPoint.z) < 1)
								failedPathFindingPenalty = 0;
							else
								failedPathFindingPenalty += 10;
						} else {
							failedPathFindingPenalty += 10;
						}
					}
					if (d0 > 1024.0D) {
						this.ticksUntilNextPathRecalculation += 10;
					} else if (d0 > 256.0D) {
						this.ticksUntilNextPathRecalculation += 5;
					}

					if (!this.mob.getNavigation().moveTo(livingentity, this.speedModifier)) {
						this.ticksUntilNextPathRecalculation += 15;
					}

					this.ticksUntilNextPathRecalculation = this.adjustedTickDelay(this.ticksUntilNextPathRecalculation);
				}

				this.ticksUntilNextAttack = Math.max(this.ticksUntilNextAttack - 1, 0);
				this.checkAndPerformAttack(livingentity, d0);
			}
		}

		protected void checkAndPerformAttack(LivingEntity p_25557_, double p_25558_) {
			double d0 = this.getAttackReachSqr(p_25557_);
			if (p_25558_ <= d0 && this.ticksUntilNextAttack <= 0) {
				this.resetAttackCooldown();
				setAttacking(true);
				this.mob.swing(InteractionHand.MAIN_HAND);
				this.mob.doHurtTarget(p_25557_);
			}

		}

		protected void resetAttackCooldown() {
			this.ticksUntilNextAttack = this.adjustedTickDelay(20);
		}

		protected boolean isTimeToAttack() {
			return this.ticksUntilNextAttack <= 0;
		}

		protected int getTicksUntilNextAttack() {
			return this.ticksUntilNextAttack;
		}

		protected int getAttackInterval() {
			return this.adjustedTickDelay(20);
		}

		protected double getAttackReachSqr(LivingEntity p_25556_) {
			return (double)(this.mob.getBbWidth() * 2.0F * this.mob.getBbWidth() * 2.0F + p_25556_.getBbWidth());
		}
	}
	public void setAttacking(boolean value)
	{
		this.entityData.set(DATA_IS_ATTACKING, value);
	}
}
