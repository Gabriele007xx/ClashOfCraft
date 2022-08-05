
package net.mcreator.clashofclansweapons.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;

import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.Packet;
import net.minecraft.nbt.CompoundTag;

import net.mcreator.clashofclansweapons.procedures.PlayerSpawnProcedure;
import net.mcreator.clashofclansweapons.procedures.NightWitchEntityIsHurtProcedure;
import net.mcreator.clashofclansweapons.procedures.NightWitchEntityDiesProcedure;
import net.mcreator.clashofclansweapons.procedures.GameRuleProcedureProcedure;
import net.mcreator.clashofclansweapons.procedures.CooldownWitchProcedure;
import net.mcreator.clashofclansweapons.init.ClashofclansweaponsModEntities;

import javax.annotation.Nullable;

public class NightWitchEntity extends PathfinderMob {
	public NightWitchEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(ClashofclansweaponsModEntities.NIGHT_WITCH.get(), world);
	}

	public NightWitchEntity(EntityType<NightWitchEntity> type, Level world) {
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
		this.targetSelector.addGoal(1, new NearestAttackableTargetGoal(this, EagleArtilleryEntity.class, true, true) {
			@Override
			public boolean canUse() {
				double x = NightWitchEntity.this.getX();
				double y = NightWitchEntity.this.getY();
				double z = NightWitchEntity.this.getZ();
				Entity entity = NightWitchEntity.this;
				Level world = NightWitchEntity.this.level;
				return super.canUse() && GameRuleProcedureProcedure.execute(world);
			}
		});
		this.targetSelector.addGoal(2, new NearestAttackableTargetGoal(this, InfernoTowerEntity.class, true, true) {
			@Override
			public boolean canUse() {
				double x = NightWitchEntity.this.getX();
				double y = NightWitchEntity.this.getY();
				double z = NightWitchEntity.this.getZ();
				Entity entity = NightWitchEntity.this;
				Level world = NightWitchEntity.this.level;
				return super.canUse() && GameRuleProcedureProcedure.execute(world);
			}
		});
		this.targetSelector.addGoal(3, new NearestAttackableTargetGoal(this, XbowLv1Entity.class, true, true) {
			@Override
			public boolean canUse() {
				double x = NightWitchEntity.this.getX();
				double y = NightWitchEntity.this.getY();
				double z = NightWitchEntity.this.getZ();
				Entity entity = NightWitchEntity.this;
				Level world = NightWitchEntity.this.level;
				return super.canUse() && GameRuleProcedureProcedure.execute(world);
			}
		});
		this.targetSelector.addGoal(4, new NearestAttackableTargetGoal(this, BattleBuilderHutLeveltwoEntity.class, true, true) {
			@Override
			public boolean canUse() {
				double x = NightWitchEntity.this.getX();
				double y = NightWitchEntity.this.getY();
				double z = NightWitchEntity.this.getZ();
				Entity entity = NightWitchEntity.this;
				Level world = NightWitchEntity.this.level;
				return super.canUse() && GameRuleProcedureProcedure.execute(world);
			}
		});
		this.targetSelector.addGoal(5, new NearestAttackableTargetGoal(this, ScattershotEntity.class, true, true) {
			@Override
			public boolean canUse() {
				double x = NightWitchEntity.this.getX();
				double y = NightWitchEntity.this.getY();
				double z = NightWitchEntity.this.getZ();
				Entity entity = NightWitchEntity.this;
				Level world = NightWitchEntity.this.level;
				return super.canUse() && GameRuleProcedureProcedure.execute(world);
			}
		});
		this.targetSelector.addGoal(6, new NearestAttackableTargetGoal(this, MortarLv14Entity.class, true, true) {
			@Override
			public boolean canUse() {
				double x = NightWitchEntity.this.getX();
				double y = NightWitchEntity.this.getY();
				double z = NightWitchEntity.this.getZ();
				Entity entity = NightWitchEntity.this;
				Level world = NightWitchEntity.this.level;
				return super.canUse() && GameRuleProcedureProcedure.execute(world);
			}
		});
		this.targetSelector.addGoal(7, new NearestAttackableTargetGoal(this, MortarLv10EEntity.class, true, true) {
			@Override
			public boolean canUse() {
				double x = NightWitchEntity.this.getX();
				double y = NightWitchEntity.this.getY();
				double z = NightWitchEntity.this.getZ();
				Entity entity = NightWitchEntity.this;
				Level world = NightWitchEntity.this.level;
				return super.canUse() && GameRuleProcedureProcedure.execute(world);
			}
		});
		this.targetSelector.addGoal(8, new NearestAttackableTargetGoal(this, MortarLv1EntityEntity.class, true, true) {
			@Override
			public boolean canUse() {
				double x = NightWitchEntity.this.getX();
				double y = NightWitchEntity.this.getY();
				double z = NightWitchEntity.this.getZ();
				Entity entity = NightWitchEntity.this;
				Level world = NightWitchEntity.this.level;
				return super.canUse() && GameRuleProcedureProcedure.execute(world);
			}
		});
		this.targetSelector.addGoal(9, new NearestAttackableTargetGoal(this, CannonLv1Entity.class, true, true) {
			@Override
			public boolean canUse() {
				double x = NightWitchEntity.this.getX();
				double y = NightWitchEntity.this.getY();
				double z = NightWitchEntity.this.getZ();
				Entity entity = NightWitchEntity.this;
				Level world = NightWitchEntity.this.level;
				return super.canUse() && GameRuleProcedureProcedure.execute(world);
			}
		});
		this.targetSelector.addGoal(10, new NearestAttackableTargetGoal(this, Monster.class, false, false));
		this.goalSelector.addGoal(11, new MeleeAttackGoal(this, 1.2, false) {
			@Override
			protected double getAttackReachSqr(LivingEntity entity) {
				return (double) (4.0 + entity.getBbWidth() * entity.getBbWidth());
			}
		});
		this.goalSelector.addGoal(12, new RandomStrollGoal(this, 1));
		this.goalSelector.addGoal(13, new RandomLookAroundGoal(this));
		this.goalSelector.addGoal(14, new FloatGoal(this));
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
		NightWitchEntityIsHurtProcedure.execute(this.level, this.getX(), this.getY(), this.getZ(), this);
		return super.hurt(source, amount);
	}

	@Override
	public void die(DamageSource source) {
		super.die(source);
		NightWitchEntityDiesProcedure.execute(this.level, this.getX(), this.getY(), this.getZ());
	}

	@Override
	public SpawnGroupData finalizeSpawn(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason,
			@Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
		SpawnGroupData retval = super.finalizeSpawn(world, difficulty, reason, livingdata, tag);
		PlayerSpawnProcedure.execute(this);
		return retval;
	}

	@Override
	public void baseTick() {
		super.baseTick();
		CooldownWitchProcedure.execute(this);
	}

	public static void init() {
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.2);
		builder = builder.add(Attributes.MAX_HEALTH, 10);
		builder = builder.add(Attributes.ARMOR, 0);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 3);
		builder = builder.add(Attributes.FOLLOW_RANGE, 16);
		return builder;
	}
}
