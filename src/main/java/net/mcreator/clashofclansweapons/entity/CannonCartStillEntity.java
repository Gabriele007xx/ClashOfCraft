
package net.mcreator.clashofclansweapons.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.monster.RangedAttackMob;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.ai.goal.RangedAttackGoal;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.Packet;
import net.minecraft.core.particles.ParticleTypes;

import net.mcreator.clashofclansweapons.procedures.GameRuleProcedureProcedure;
import net.mcreator.clashofclansweapons.procedures.CannonCartStillOnEntityTickUpdateProcedure;
import net.mcreator.clashofclansweapons.init.ClashofclansweaponsModEntities;

public class CannonCartStillEntity extends PathfinderMob implements RangedAttackMob {
	public CannonCartStillEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(ClashofclansweaponsModEntities.CANNON_CART_POSE.get(), world);
	}

	public CannonCartStillEntity(EntityType<CannonCartStillEntity> type, Level world) {
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
	protected void registerGoals() {
		super.registerGoals();
		this.targetSelector.addGoal(1, new NearestAttackableTargetGoal(this, AirDefenceEntity.class, true, true) {
			@Override
			public boolean canUse() {
				double x = CannonCartStillEntity.this.getX();
				double y = CannonCartStillEntity.this.getY();
				double z = CannonCartStillEntity.this.getZ();
				Entity entity = CannonCartStillEntity.this;
				Level world = CannonCartStillEntity.this.level;
				return super.canUse() && GameRuleProcedureProcedure.execute(world);
			}
		});
		this.targetSelector.addGoal(2, new NearestAttackableTargetGoal(this, InfernoTowerEntity.class, true, true) {
			@Override
			public boolean canUse() {
				double x = CannonCartStillEntity.this.getX();
				double y = CannonCartStillEntity.this.getY();
				double z = CannonCartStillEntity.this.getZ();
				Entity entity = CannonCartStillEntity.this;
				Level world = CannonCartStillEntity.this.level;
				return super.canUse() && GameRuleProcedureProcedure.execute(world);
			}
		});
		this.targetSelector.addGoal(3, new NearestAttackableTargetGoal(this, XbowLv1Entity.class, true, true) {
			@Override
			public boolean canUse() {
				double x = CannonCartStillEntity.this.getX();
				double y = CannonCartStillEntity.this.getY();
				double z = CannonCartStillEntity.this.getZ();
				Entity entity = CannonCartStillEntity.this;
				Level world = CannonCartStillEntity.this.level;
				return super.canUse() && GameRuleProcedureProcedure.execute(world);
			}
		});
		this.targetSelector.addGoal(4, new NearestAttackableTargetGoal(this, BattleBuilderHutLeveltwoEntity.class, true, true) {
			@Override
			public boolean canUse() {
				double x = CannonCartStillEntity.this.getX();
				double y = CannonCartStillEntity.this.getY();
				double z = CannonCartStillEntity.this.getZ();
				Entity entity = CannonCartStillEntity.this;
				Level world = CannonCartStillEntity.this.level;
				return super.canUse() && GameRuleProcedureProcedure.execute(world);
			}
		});
		this.targetSelector.addGoal(5, new NearestAttackableTargetGoal(this, ScattershotEntity.class, true, true) {
			@Override
			public boolean canUse() {
				double x = CannonCartStillEntity.this.getX();
				double y = CannonCartStillEntity.this.getY();
				double z = CannonCartStillEntity.this.getZ();
				Entity entity = CannonCartStillEntity.this;
				Level world = CannonCartStillEntity.this.level;
				return super.canUse() && GameRuleProcedureProcedure.execute(world);
			}
		});
		this.targetSelector.addGoal(6, new NearestAttackableTargetGoal(this, MortarLv14Entity.class, true, true) {
			@Override
			public boolean canUse() {
				double x = CannonCartStillEntity.this.getX();
				double y = CannonCartStillEntity.this.getY();
				double z = CannonCartStillEntity.this.getZ();
				Entity entity = CannonCartStillEntity.this;
				Level world = CannonCartStillEntity.this.level;
				return super.canUse() && GameRuleProcedureProcedure.execute(world);
			}
		});
		this.targetSelector.addGoal(7, new NearestAttackableTargetGoal(this, MortarLv10EEntity.class, true, true) {
			@Override
			public boolean canUse() {
				double x = CannonCartStillEntity.this.getX();
				double y = CannonCartStillEntity.this.getY();
				double z = CannonCartStillEntity.this.getZ();
				Entity entity = CannonCartStillEntity.this;
				Level world = CannonCartStillEntity.this.level;
				return super.canUse() && GameRuleProcedureProcedure.execute(world);
			}
		});
		this.targetSelector.addGoal(8, new NearestAttackableTargetGoal(this, MortarLv1EntityEntity.class, true, true) {
			@Override
			public boolean canUse() {
				double x = CannonCartStillEntity.this.getX();
				double y = CannonCartStillEntity.this.getY();
				double z = CannonCartStillEntity.this.getZ();
				Entity entity = CannonCartStillEntity.this;
				Level world = CannonCartStillEntity.this.level;
				return super.canUse() && GameRuleProcedureProcedure.execute(world);
			}
		});
		this.targetSelector.addGoal(9, new NearestAttackableTargetGoal(this, CannonLv1Entity.class, true, true) {
			@Override
			public boolean canUse() {
				double x = CannonCartStillEntity.this.getX();
				double y = CannonCartStillEntity.this.getY();
				double z = CannonCartStillEntity.this.getZ();
				Entity entity = CannonCartStillEntity.this;
				Level world = CannonCartStillEntity.this.level;
				return super.canUse() && GameRuleProcedureProcedure.execute(world);
			}
		});
		this.targetSelector.addGoal(10, new NearestAttackableTargetGoal(this, Monster.class, false, false));
		this.goalSelector.addGoal(11, new FloatGoal(this));
		this.goalSelector.addGoal(1, new RangedAttackGoal(this, 1.25, 24, 10) {
			@Override
			public boolean canContinueToUse() {
				return this.canUse();
			}
		});
	}

	@Override
	public MobType getMobType() {
		return MobType.UNDEFINED;
	}

	@Override
	public boolean removeWhenFarAway(double distanceToClosestPlayer) {
		return false;
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.death"));
	}

	@Override
	public boolean hurt(DamageSource source, float amount) {
		if (source == DamageSource.CACTUS)
			return false;
		if (source == DamageSource.DROWN)
			return false;
		return super.hurt(source, amount);
	}

	@Override
	public void baseTick() {
		super.baseTick();
		double x = this.getX();
		double y = this.getY();
		double z = this.getZ();
		Entity entity = this;
		Level world = this.level;

		CannonCartStillOnEntityTickUpdateProcedure.execute(entity);
	}

	@Override
	public void performRangedAttack(LivingEntity target, float flval) {
		CannonCartLv1RangedItemEntity.shoot(this, target);
	}

	public void aiStep() {
		super.aiStep();
		double x = this.getX();
		double y = this.getY();
		double z = this.getZ();
		Entity entity = this;
		Level world = this.level;
		for (int l = 0; l < 2; ++l) {
			double x0 = x + 0.5 + (random.nextFloat() - 0.5) * 0.3000000014901161D;
			double y0 = y + 1.2 + (random.nextFloat() - 0.5) * 0.3000000014901161D;
			double z0 = z + 0.5 + (random.nextFloat() - 0.5) * 0.3000000014901161D;
			world.addParticle(ParticleTypes.FLAME, x0, y0, z0, 0, 0, 0);
		}
	}

	public static void init() {
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0);
		builder = builder.add(Attributes.MAX_HEALTH, 15);
		builder = builder.add(Attributes.ARMOR, 8);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 3);
		return builder;
	}
}
