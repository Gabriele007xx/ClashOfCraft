
package net.mcreator.clashofclansweapons.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.ItemSupplier;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.Packet;

import net.mcreator.clashofclansweapons.procedures.DoubleCannonShotgunWhileBulletFlyingTickProcedure;
import net.mcreator.clashofclansweapons.init.ClashofclansweaponsModEntities;

import java.util.Random;

@OnlyIn(value = Dist.CLIENT, _interface = ItemSupplier.class)
public class DoubleCannonShotgunEntity extends AbstractArrow implements ItemSupplier {
	public DoubleCannonShotgunEntity(PlayMessages.SpawnEntity packet, Level world) {
		super(ClashofclansweaponsModEntities.DOUBLE_CANNON_SHOTGUN.get(), world);
	}

	public DoubleCannonShotgunEntity(EntityType<? extends DoubleCannonShotgunEntity> type, Level world) {
		super(type, world);
	}

	public DoubleCannonShotgunEntity(EntityType<? extends DoubleCannonShotgunEntity> type, double x, double y, double z, Level world) {
		super(type, x, y, z, world);
	}

	public DoubleCannonShotgunEntity(EntityType<? extends DoubleCannonShotgunEntity> type, LivingEntity entity, Level world) {
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
		return new ItemStack(Items.FIRE_CHARGE);
	}

	@Override
	protected void doPostHurtEffects(LivingEntity entity) {
		super.doPostHurtEffects(entity);
		entity.setArrowCount(entity.getArrowCount() - 1);
	}

	@Override
	public void tick() {
		super.tick();
		DoubleCannonShotgunWhileBulletFlyingTickProcedure.execute(this.getOwner());
		if (this.inGround)
			this.discard();
	}

	public static DoubleCannonShotgunEntity shoot(Level world, LivingEntity entity, Random random, float power, double damage, int knockback) {
		DoubleCannonShotgunEntity entityarrow = new DoubleCannonShotgunEntity(ClashofclansweaponsModEntities.DOUBLE_CANNON_SHOTGUN.get(), entity,
				world);
		entityarrow.shoot(entity.getViewVector(1).x, entity.getViewVector(1).y, entity.getViewVector(1).z, power * 2, 0);
		entityarrow.setSilent(true);
		entityarrow.setCritArrow(false);
		entityarrow.setBaseDamage(damage);
		entityarrow.setKnockback(knockback);
		world.addFreshEntity(entityarrow);
		world.playSound(null, entity.getX(), entity.getY(), entity.getZ(),
				ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("clashofclansweapons:placeholder.empty.ogg")), SoundSource.PLAYERS, 1,
				1f / (random.nextFloat() * 0.5f + 1) + (power / 2));
		return entityarrow;
	}

	public static DoubleCannonShotgunEntity shoot(LivingEntity entity, LivingEntity target) {
		DoubleCannonShotgunEntity entityarrow = new DoubleCannonShotgunEntity(ClashofclansweaponsModEntities.DOUBLE_CANNON_SHOTGUN.get(), entity,
				entity.level);
		double dx = target.getX() - entity.getX();
		double dy = target.getY() + target.getEyeHeight() - 1.1;
		double dz = target.getZ() - entity.getZ();
		entityarrow.shoot(dx, dy - entityarrow.getY() + Math.hypot(dx, dz) * 0.2F, dz, 0.4f * 2, 12.0F);
		entityarrow.setSilent(true);
		entityarrow.setBaseDamage(5);
		entityarrow.setKnockback(0);
		entityarrow.setCritArrow(false);
		entity.level.addFreshEntity(entityarrow);
		entity.level.playSound(null, entity.getX(), entity.getY(), entity.getZ(),
				ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("clashofclansweapons:placeholder.empty.ogg")), SoundSource.PLAYERS, 1,
				1f / (new Random().nextFloat() * 0.5f + 1));
		return entityarrow;
	}
}
