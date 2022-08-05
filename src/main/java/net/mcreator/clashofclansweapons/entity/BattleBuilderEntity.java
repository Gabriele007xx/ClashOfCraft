
package net.mcreator.clashofclansweapons.entity;

import util.Position;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;

import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.Packet;
import net.minecraft.core.BlockPos;

import net.mcreator.clashofclansweapons.init.ClashofclansweaponsModEntities;

import java.util.List;

import coc.buidings.defence.Building;

public class BattleBuilderEntity extends PathfinderMob {
	Position HutPos = null;

	public BattleBuilderEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(ClashofclansweaponsModEntities.BATTLE_BUILDER.get(), world);
	}

	public BattleBuilderEntity(EntityType<BattleBuilderEntity> type, Level world) {
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
		this.goalSelector.addGoal(1, new RandomStrollGoal(this, 1));
		this.goalSelector.addGoal(2, new RandomLookAroundGoal(this));
		this.goalSelector.addGoal(3, new FloatGoal(this));
		this.goalSelector.addGoal(4, new BattleBuilderEntity.HealBuildingsGoal(this));
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

	public static void init() {
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.2);
		builder = builder.add(Attributes.MAX_HEALTH, 20);
		builder = builder.add(Attributes.ARMOR, 0);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 0);
		builder = builder.add(Attributes.FOLLOW_RANGE, 16);
		builder = builder.add(Attributes.ARMOR, 4);
		return builder;
	}

	class HealBuildingsGoal extends Goal {
		private BattleBuilderEntity entity;
		private LivingEntity target;
		private boolean isHealing = false;
		private final int ATTACK_SPEED = 14;
		private int CURRENT_ATTACK = 0;

		public HealBuildingsGoal(BattleBuilderEntity entity) {
			this.entity = entity;
		}

		@Override
		public void tick() {
			if (!isHealing) {
				target = findTarget();
				if (target != null) {
					isHealing = true;
				}
			}
			if (isHealing) {
				moveTo(new Position(target.getX(), target.getY(), target.getZ()));
				if (entity.getBoundingBox().inflate(1f, 1f, 1f).intersects(target.getBoundingBox())) {
					CURRENT_ATTACK++;
					System.out.println("Ok!");
					if (CURRENT_ATTACK >= ATTACK_SPEED) {
						target.setHealth(target.getHealth() + 3f);
						System.out.println("Target curato");
						CURRENT_ATTACK = 0;
						if (target.getHealth() >= target.getMaxHealth()) {
							isHealing = false;
						}
					}
				}
			}
		}

		@Override
		public void start() {
		}

		@Override
		public boolean canUse() {
			return true;
		}

		@Override
		public boolean isInterruptable() {
			return true;
		}

		@Override
		public void stop() {
			target = null;
		}

		private void moveTo(Position pos) {
			BattleBuilderEntity.this.navigation.moveTo(pos.x(), pos.y(), pos.z(), 1f);
		}

		private LivingEntity findTarget() {
			List<LivingEntity> list = entity.level.getEntitiesOfClass(LivingEntity.class,
					(new AABB(new BlockPos(entity.getX(), entity.getY(), entity.getZ()))).inflate(14.0D, 2.0D, 14.0D));
			for (LivingEntity ent : list) {
				if (ent instanceof Building) {
					if (ent.getHealth() < ent.getMaxHealth()) {
						return ent;
					}
				}
			}
			return null;
		}
	}
}
