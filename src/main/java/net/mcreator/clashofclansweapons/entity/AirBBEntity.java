
package net.mcreator.clashofclansweapons.entity;

import util.Position;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.monster.Phantom;
import net.minecraft.world.entity.ai.navigation.PathNavigation;
import net.minecraft.world.entity.ai.navigation.FlyingPathNavigation;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.entity.ai.control.FlyingMoveControl;
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

import java.util.Random;
import java.util.List;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

public class AirBBEntity extends PathfinderMob {
	private boolean isHunting = false;

	public AirBBEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(ClashofclansweaponsModEntities.AIR_BB.get(), world);
	}

	public AirBBEntity(EntityType<AirBBEntity> type, Level world) {
		super(type, world);
		xpReward = 0;
		setNoAi(false);
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
		this.goalSelector.addGoal(2, new RandomStrollGoal(this, 0.8, 20) {
			@Override
			protected Vec3 getPosition() {
				Random random = AirBBEntity.this.getRandom();
				double dir_x = AirBBEntity.this.getX() + ((random.nextFloat() * 2 - 1) * 16);
				double dir_y = AirBBEntity.this.getY() + ((random.nextFloat() * 2 - 1) * 16);
				double dir_z = AirBBEntity.this.getZ() + ((random.nextFloat() * 2 - 1) * 16);
				return new Vec3(dir_x, dir_y, dir_z);
			}
		});
		this.goalSelector.addGoal(1, new AirBBEntity.AirBombProjectileChaseGoal(this));
	}

	@Override
	public MobType getMobType() {
		return MobType.UNDEFINED;
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
	public boolean causeFallDamage(float l, float d, DamageSource source) {
		return false;
	}

	@Override
	public boolean hurt(DamageSource source, float amount) {
		if (source == DamageSource.DROWN)
			return false;
		if (source.isExplosion())
			return false;
		return super.hurt(source, amount);
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
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.2);
		builder = builder.add(Attributes.MAX_HEALTH, 1);
		builder = builder.add(Attributes.ARMOR, 0);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 0);
		builder = builder.add(Attributes.FOLLOW_RANGE, 32);
		builder = builder.add(Attributes.KNOCKBACK_RESISTANCE, 255);
		builder = builder.add(Attributes.FLYING_SPEED, 0.2);
		return builder;
	}

	class AirBombProjectileChaseGoal extends Goal {
		LivingEntity target = null;
		AirBBEntity entity;

		public AirBombProjectileChaseGoal(AirBBEntity entity) {
			this.entity = entity;
		}

		@Override
		public boolean canUse() {
			return true;
		}

		@Override
		public boolean isInterruptable() {
			return false;
		}

		@Override
		public void start() {
			target = findTarget();
		}

		@Override
		public void tick() {
			if (target != null) {
					AirBBEntity.this.isHunting = true;
			} else {
				target = findTarget();
			}
			if (isHunting) {
				moveTo(new Position(target.getX(), target.getY(), target.getZ()));
				if (entity.getBoundingBox().intersects(target.getBoundingBox())) {
					target.hurt(DamageSource.GENERIC, 4f);
					if(entity.level instanceof ServerLevel server)
					{
						server.sendParticles(ParticleTypes.EXPLOSION,entity.getX(),entity.getY(),entity.getZ(),5,1,1,1,1);
					}
					
					entity.discard();
				}
			}
		}

		@Override
		public void stop() {
		}

		private void moveTo(Position pos) {
			AirBBEntity.this.navigation.moveTo(pos.x(), pos.y(), pos.z(), 2.3f);
		}

		private LivingEntity findTarget() {
			List<LivingEntity> list = entity.level.getEntitiesOfClass(LivingEntity.class,
					(new AABB(new BlockPos(entity.getX(), entity.getY(), entity.getZ()))).inflate(16.0D, 16.0D, 16.0D));
			for (LivingEntity ent : list) {
				if (ent instanceof Phantom) {
					return ent;
				}
			}
			return null;
		}
	}
}
