
package net.mcreator.clashofclansweapons.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;

import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.monster.Phantom;
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
import net.minecraft.network.chat.TextComponent;
import net.minecraft.core.BlockPos;

import net.mcreator.clashofclansweapons.init.ClashofclansweaponsModEntities;

import java.util.List;

public class AirBBBEntity extends PathfinderMob {
	private final int ATTACK_SPEED = 60;
	private int CURRENT = 0;
	private boolean canAttackNow = true;

	public AirBBBEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(ClashofclansweaponsModEntities.AIR_BBB.get(), world);
	}

	public AirBBBEntity(EntityType<AirBBBEntity> type, Level world) {
		super(type, world);
		xpReward = 0;
		setNoAi(false);
		setCustomName(new TextComponent("Air Bombs (Liv.1)"));
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
		if (source.isExplosion())
			return false;
		return super.hurt(source, amount);
	}

	public static void init() {
	}

	@Override
	public void baseTick() {
		super.baseTick();
		recharge();
		if (checkforEnemies() && canAttackNow) {
			AirBBEntity entity = new AirBBEntity(ClashofclansweaponsModEntities.AIR_BB.get(), level);
			entity.moveTo(getX(), getY() + 3f, getZ());
			level.addFreshEntity(entity);
			canAttackNow = false;
		}
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0);
		builder = builder.add(Attributes.MAX_HEALTH, 50);
		builder = builder.add(Attributes.ARMOR, 3);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 0);
		builder = builder.add(Attributes.FOLLOW_RANGE, 16);
		builder = builder.add(Attributes.KNOCKBACK_RESISTANCE, 255);
		return builder;
	}

	private boolean checkforEnemies() {
		List<LivingEntity> entities = level.getEntitiesOfClass(LivingEntity.class,
				(new AABB(new BlockPos(getX(),getY(),getZ()))).inflate(16.0D, 16.0D, 16.0D));
		for (LivingEntity e : entities) {
			if (e instanceof Phantom) {
				return true;
			}
			
		}
		return false;

	}

	private void recharge() {
		if (!canAttackNow) {
			CURRENT++;
			if (CURRENT >= ATTACK_SPEED) {
				canAttackNow = true;
				CURRENT = 0;
			}
		}
	}
}
