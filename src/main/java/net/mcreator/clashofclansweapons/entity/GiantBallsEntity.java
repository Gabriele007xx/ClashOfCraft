
package net.mcreator.clashofclansweapons.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.ItemSupplier;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.Packet;
import net.minecraft.core.BlockPos;

import net.mcreator.clashofclansweapons.init.ClashofclansweaponsModEntities;

import java.util.Random;
import java.util.List;

@OnlyIn(value = Dist.CLIENT, _interface = ItemSupplier.class)
public class GiantBallsEntity extends AbstractArrow implements ItemSupplier {

	public GiantBallsEntity(PlayMessages.SpawnEntity packet, Level world) {
		super(ClashofclansweaponsModEntities.GIANT_BALLS.get(), world);
	}

	public GiantBallsEntity(EntityType<? extends GiantBallsEntity> type, Level world) {
		super(type, world);
	}

	public GiantBallsEntity(EntityType<? extends GiantBallsEntity> type, double x, double y, double z, Level world) {
		super(type, x, y, z, world);
	}

	public GiantBallsEntity(EntityType<? extends GiantBallsEntity> type, LivingEntity entity, Level world) {
		super(type, entity, world);
	}

	@Override
	public Packet<?> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public ItemStack getItem() {
		return ItemStack.EMPTY;
	}

	@Override
	protected ItemStack getPickupItem() {
		return ItemStack.EMPTY;
	}

	@Override
	protected void doPostHurtEffects(LivingEntity entity) {
		super.doPostHurtEffects(entity);
		entity.setArrowCount(entity.getArrowCount() - 1);
	}

	@Override
	public void tick() {
		super.tick();
		List<LivingEntity>
 entities = this.level.getEntitiesOfClass(LivingEntity.class,
					(new AABB(new BlockPos(this.getX(), this.getY(), this.getZ()))).inflate(1.0D, 1.0D, 1.0D));
					for (LivingEntity e : entities) {
							e.hurt(DamageSource.GENERIC, 5);
						
					}
		
		if (this.inGround)
			this.discard();
	}

	public static GiantBallsEntity shoot(Level world, LivingEntity entity, Random random, float power, double damage, int knockback) {
		GiantBallsEntity entityarrow = new GiantBallsEntity(ClashofclansweaponsModEntities.GIANT_BALLS.get(), entity, world);
		entityarrow.shoot(entity.getViewVector(1).x, entity.getViewVector(1).y, entity.getViewVector(1).z, power * 2, 0);
		entityarrow.setSilent(true);
		entityarrow.setCritArrow(false);
		entityarrow.setBaseDamage(damage);
		entityarrow.setKnockback(knockback);
		world.addFreshEntity(entityarrow);
		world.playSound(null, entity.getX(), entity.getY(), entity.getZ(),
				ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.arrow.shoot")), SoundSource.PLAYERS, 1,
				1f / (random.nextFloat() * 0.5f + 1) + (power / 2));
		return entityarrow;
	}

	public static GiantBallsEntity shoot(LivingEntity entity, LivingEntity target) {
		GiantBallsEntity entityarrow = new GiantBallsEntity(ClashofclansweaponsModEntities.GIANT_BALLS.get(), entity, entity.level);
		double dx = target.getX() - entity.getX();
		double dy = target.getY() + target.getEyeHeight() - 1.1;
		double dz = target.getZ() - entity.getZ();
		entityarrow.shoot(dx, dy - entityarrow.getY() + Math.hypot(dx, dz) * 0.2F, dz, 2f * 2, 12.0F);
		entityarrow.setSilent(true);
		entityarrow.setBaseDamage(1.25);
		entityarrow.setKnockback(2);
		entityarrow.setPierceLevel((byte)127);
		entityarrow.setCritArrow(false);
		entity.level.addFreshEntity(entityarrow);
		entity.level.playSound(null, entity.getX(), entity.getY(), entity.getZ(),
				ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.arrow.shoot")), SoundSource.PLAYERS, 1,
				1f / (new Random().nextFloat() * 0.5f + 1));
		return entityarrow;
	}
}
