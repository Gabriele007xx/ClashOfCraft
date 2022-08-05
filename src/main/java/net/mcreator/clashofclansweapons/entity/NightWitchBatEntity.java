
package net.mcreator.clashofclansweapons.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.ai.navigation.PathNavigation;
import net.minecraft.world.entity.ai.navigation.FlyingPathNavigation;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.control.FlyingMoveControl;
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
import net.minecraft.core.BlockPos;

import net.mcreator.clashofclansweapons.procedures.GameRuleProcedureProcedure;
import net.mcreator.clashofclansweapons.init.ClashofclansweaponsModEntities;

import java.util.Random;

public class NightWitchBatEntity extends PathfinderMob {
	public NightWitchBatEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(ClashofclansweaponsModEntities.NIGHT_WITCH_BAT.get(), world);
	}

	public NightWitchBatEntity(EntityType<NightWitchBatEntity> type, Level world) {
		super(type, world);
		xpReward = 0;
		setNoAi(false);
		setPersistenceRequired();
		this.moveControl = new FlyingMoveControl(this, 10, true);
	}

	@Override
	public Packet<?> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	protected PathNavigation createNavigation(Level world) {
		return new FlyingPathNavigation(this, world);
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();
		this.goalSelector.addGoal(1, new MeleeAttackGoal(this, 2, true) {
			@Override
			protected double getAttackReachSqr(LivingEntity entity) {
				return (double) (4.0 + entity.getBbWidth() * entity.getBbWidth());
			}
		});
		this.targetSelector.addGoal(2, new NearestAttackableTargetGoal(this, EagleArtilleryEntity.class, true, true) {
			@Override
			public boolean canUse() {
				double x = NightWitchBatEntity.this.getX();
				double y = NightWitchBatEntity.this.getY();
				double z = NightWitchBatEntity.this.getZ();
				Entity entity = NightWitchBatEntity.this;
				Level world = NightWitchBatEntity.this.level;
				return super.canUse() && GameRuleProcedureProcedure.execute(world);
			}
		});
		this.targetSelector.addGoal(3, new NearestAttackableTargetGoal(this, InfernoTowerEntity.class, true, true) {
			@Override
			public boolean canUse() {
				double x = NightWitchBatEntity.this.getX();
				double y = NightWitchBatEntity.this.getY();
				double z = NightWitchBatEntity.this.getZ();
				Entity entity = NightWitchBatEntity.this;
				Level world = NightWitchBatEntity.this.level;
				return super.canUse() && GameRuleProcedureProcedure.execute(world);
			}
		});
		this.targetSelector.addGoal(4, new NearestAttackableTargetGoal(this, XbowLv1Entity.class, true, true) {
			@Override
			public boolean canUse() {
				double x = NightWitchBatEntity.this.getX();
				double y = NightWitchBatEntity.this.getY();
				double z = NightWitchBatEntity.this.getZ();
				Entity entity = NightWitchBatEntity.this;
				Level world = NightWitchBatEntity.this.level;
				return super.canUse() && GameRuleProcedureProcedure.execute(world);
			}
		});
		this.targetSelector.addGoal(5, new NearestAttackableTargetGoal(this, BattleBuilderHutLeveltwoEntity.class, true, true) {
			@Override
			public boolean canUse() {
				double x = NightWitchBatEntity.this.getX();
				double y = NightWitchBatEntity.this.getY();
				double z = NightWitchBatEntity.this.getZ();
				Entity entity = NightWitchBatEntity.this;
				Level world = NightWitchBatEntity.this.level;
				return super.canUse() && GameRuleProcedureProcedure.execute(world);
			}
		});
		this.targetSelector.addGoal(6, new NearestAttackableTargetGoal(this, ScattershotEntity.class, true, true) {
			@Override
			public boolean canUse() {
				double x = NightWitchBatEntity.this.getX();
				double y = NightWitchBatEntity.this.getY();
				double z = NightWitchBatEntity.this.getZ();
				Entity entity = NightWitchBatEntity.this;
				Level world = NightWitchBatEntity.this.level;
				return super.canUse() && GameRuleProcedureProcedure.execute(world);
			}
		});
		this.targetSelector.addGoal(7, new NearestAttackableTargetGoal(this, MortarLv14Entity.class, true, true) {
			@Override
			public boolean canUse() {
				double x = NightWitchBatEntity.this.getX();
				double y = NightWitchBatEntity.this.getY();
				double z = NightWitchBatEntity.this.getZ();
				Entity entity = NightWitchBatEntity.this;
				Level world = NightWitchBatEntity.this.level;
				return super.canUse() && GameRuleProcedureProcedure.execute(world);
			}
		});
		this.targetSelector.addGoal(8, new NearestAttackableTargetGoal(this, MortarLv10EEntity.class, true, true) {
			@Override
			public boolean canUse() {
				double x = NightWitchBatEntity.this.getX();
				double y = NightWitchBatEntity.this.getY();
				double z = NightWitchBatEntity.this.getZ();
				Entity entity = NightWitchBatEntity.this;
				Level world = NightWitchBatEntity.this.level;
				return super.canUse() && GameRuleProcedureProcedure.execute(world);
			}
		});
		this.targetSelector.addGoal(9, new NearestAttackableTargetGoal(this, MortarLv1EntityEntity.class, true, true) {
			@Override
			public boolean canUse() {
				double x = NightWitchBatEntity.this.getX();
				double y = NightWitchBatEntity.this.getY();
				double z = NightWitchBatEntity.this.getZ();
				Entity entity = NightWitchBatEntity.this;
				Level world = NightWitchBatEntity.this.level;
				return super.canUse() && GameRuleProcedureProcedure.execute(world);
			}
		});
		this.targetSelector.addGoal(10, new NearestAttackableTargetGoal(this, CannonLv1Entity.class, true, true) {
			@Override
			public boolean canUse() {
				double x = NightWitchBatEntity.this.getX();
				double y = NightWitchBatEntity.this.getY();
				double z = NightWitchBatEntity.this.getZ();
				Entity entity = NightWitchBatEntity.this;
				Level world = NightWitchBatEntity.this.level;
				return super.canUse() && GameRuleProcedureProcedure.execute(world);
			}
		});
		this.targetSelector.addGoal(11, new NearestAttackableTargetGoal(this, AirDefenceEntity.class, true, true) {
			@Override
			public boolean canUse() {
				double x = NightWitchBatEntity.this.getX();
				double y = NightWitchBatEntity.this.getY();
				double z = NightWitchBatEntity.this.getZ();
				Entity entity = NightWitchBatEntity.this;
				Level world = NightWitchBatEntity.this.level;
				return super.canUse() && GameRuleProcedureProcedure.execute(world);
			}
		});
		this.targetSelector.addGoal(12, new NearestAttackableTargetGoal(this, Monster.class, false, false));
		this.goalSelector.addGoal(13, new RandomStrollGoal(this, 0.8, 20) {
			@Override
			protected Vec3 getPosition() {
				Random random = NightWitchBatEntity.this.getRandom();
				double dir_x = NightWitchBatEntity.this.getX() + ((random.nextFloat() * 2 - 1) * 16);
				double dir_y = NightWitchBatEntity.this.getY() + ((random.nextFloat() * 2 - 1) * 16);
				double dir_z = NightWitchBatEntity.this.getZ() + ((random.nextFloat() * 2 - 1) * 16);
				return new Vec3(dir_x, dir_y, dir_z);
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
	public SoundEvent getAmbientSound() {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.bat.ambient"));
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.bat.hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.bat.death"));
	}

	@Override
	public boolean causeFallDamage(float l, float d, DamageSource source) {
		return false;
	}

	@Override
	protected void checkFallDamage(double y, boolean onGroundIn, BlockState state, BlockPos pos) {
	}

	@Override
	public void setNoGravity(boolean ignored) {
		super.setNoGravity(true);
	}

	public void aiStep() {
		super.aiStep();
		this.setNoGravity(true);
	}

	public static void init() {
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.3);
		builder = builder.add(Attributes.MAX_HEALTH, 8);
		builder = builder.add(Attributes.ARMOR, 0);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 4);
		builder = builder.add(Attributes.FOLLOW_RANGE, 16);
		builder = builder.add(Attributes.FLYING_SPEED, 0.3);
		return builder;
	}
}
