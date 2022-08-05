
package net.mcreator.clashofclansweapons.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.monster.RangedAttackMob;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.ai.goal.RangedAttackGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
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
import net.minecraft.network.chat.TextComponent;

import net.mcreator.clashofclansweapons.procedures.GameRuleProcedureProcedure;
import net.mcreator.clashofclansweapons.procedures.CannonCartEntityDiesProcedure;
import net.mcreator.clashofclansweapons.init.ClashofclansweaponsModEntities;

public class CannonCartEntity extends PathfinderMob implements RangedAttackMob {
	public CannonCartEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(ClashofclansweaponsModEntities.CANNON_CART.get(), world);
	}

	public CannonCartEntity(EntityType<CannonCartEntity> type, Level world) {
		super(type, world);
		xpReward = 0;
		setNoAi(false);
		setCustomName(new TextComponent("Cannon Cart"));
		setCustomNameVisible(true);
		setPersistenceRequired();
	}

	@Override
	public Packet<?> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();
		this.targetSelector.addGoal(1, new NearestAttackableTargetGoal(this, EagleArtilleryEntity.class, false, false) {
			@Override
			public boolean canUse() {
				double x = CannonCartEntity.this.getX();
				double y = CannonCartEntity.this.getY();
				double z = CannonCartEntity.this.getZ();
				Entity entity = CannonCartEntity.this;
				Level world = CannonCartEntity.this.level;
				return super.canUse() && GameRuleProcedureProcedure.execute(world);
			}
		});
		this.targetSelector.addGoal(2, new NearestAttackableTargetGoal(this, InfernoTowerEntity.class, false, false) {
			@Override
			public boolean canUse() {
				double x = CannonCartEntity.this.getX();
				double y = CannonCartEntity.this.getY();
				double z = CannonCartEntity.this.getZ();
				Entity entity = CannonCartEntity.this;
				Level world = CannonCartEntity.this.level;
				return super.canUse() && GameRuleProcedureProcedure.execute(world);
			}
		});
		this.targetSelector.addGoal(3, new NearestAttackableTargetGoal(this, XbowLv1Entity.class, false, false) {
			@Override
			public boolean canUse() {
				double x = CannonCartEntity.this.getX();
				double y = CannonCartEntity.this.getY();
				double z = CannonCartEntity.this.getZ();
				Entity entity = CannonCartEntity.this;
				Level world = CannonCartEntity.this.level;
				return super.canUse() && GameRuleProcedureProcedure.execute(world);
			}
		});
		this.targetSelector.addGoal(4, new NearestAttackableTargetGoal(this, BattleBuilderHutLeveltwoEntity.class, false, false) {
			@Override
			public boolean canUse() {
				double x = CannonCartEntity.this.getX();
				double y = CannonCartEntity.this.getY();
				double z = CannonCartEntity.this.getZ();
				Entity entity = CannonCartEntity.this;
				Level world = CannonCartEntity.this.level;
				return super.canUse() && GameRuleProcedureProcedure.execute(world);
			}
		});
		this.targetSelector.addGoal(5, new NearestAttackableTargetGoal(this, ScattershotEntity.class, false, false) {
			@Override
			public boolean canUse() {
				double x = CannonCartEntity.this.getX();
				double y = CannonCartEntity.this.getY();
				double z = CannonCartEntity.this.getZ();
				Entity entity = CannonCartEntity.this;
				Level world = CannonCartEntity.this.level;
				return super.canUse() && GameRuleProcedureProcedure.execute(world);
			}
		});
		this.targetSelector.addGoal(6, new NearestAttackableTargetGoal(this, MortarLv14Entity.class, false, false) {
			@Override
			public boolean canUse() {
				double x = CannonCartEntity.this.getX();
				double y = CannonCartEntity.this.getY();
				double z = CannonCartEntity.this.getZ();
				Entity entity = CannonCartEntity.this;
				Level world = CannonCartEntity.this.level;
				return super.canUse() && GameRuleProcedureProcedure.execute(world);
			}
		});
		this.targetSelector.addGoal(7, new NearestAttackableTargetGoal(this, MortarLv10EEntity.class, false, false) {
			@Override
			public boolean canUse() {
				double x = CannonCartEntity.this.getX();
				double y = CannonCartEntity.this.getY();
				double z = CannonCartEntity.this.getZ();
				Entity entity = CannonCartEntity.this;
				Level world = CannonCartEntity.this.level;
				return super.canUse() && GameRuleProcedureProcedure.execute(world);
			}
		});
		this.targetSelector.addGoal(8, new NearestAttackableTargetGoal(this, MortarLv1EntityEntity.class, false, false) {
			@Override
			public boolean canUse() {
				double x = CannonCartEntity.this.getX();
				double y = CannonCartEntity.this.getY();
				double z = CannonCartEntity.this.getZ();
				Entity entity = CannonCartEntity.this;
				Level world = CannonCartEntity.this.level;
				return super.canUse() && GameRuleProcedureProcedure.execute(world);
			}
		});
		this.targetSelector.addGoal(9, new NearestAttackableTargetGoal(this, CannonLv1Entity.class, false, false) {
			@Override
			public boolean canUse() {
				double x = CannonCartEntity.this.getX();
				double y = CannonCartEntity.this.getY();
				double z = CannonCartEntity.this.getZ();
				Entity entity = CannonCartEntity.this;
				Level world = CannonCartEntity.this.level;
				return super.canUse() && GameRuleProcedureProcedure.execute(world);
			}
		});
		this.targetSelector.addGoal(10, new NearestAttackableTargetGoal(this, Monster.class, false, false));
		this.goalSelector.addGoal(11, new RandomStrollGoal(this, 1));
		this.goalSelector.addGoal(12, new RandomLookAroundGoal(this));
		this.goalSelector.addGoal(13, new FloatGoal(this));
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
	public void die(DamageSource source) {
		super.die(source);
		double x = this.getX();
		double y = this.getY();
		double z = this.getZ();
		Entity sourceentity = source.getEntity();
		Entity entity = this;
		Level world = this.level;

		CannonCartEntityDiesProcedure.execute(world, x, y, z);
	}

	@Override
	public void performRangedAttack(LivingEntity target, float flval) {
		CannonCartLv1RangedItemEntity.shoot(this, target);
	}

	public static void init() {
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.2);
		builder = builder.add(Attributes.MAX_HEALTH, 15);
		builder = builder.add(Attributes.ARMOR, 10);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 5);
		return builder;
	}
}
