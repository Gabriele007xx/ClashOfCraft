
package net.mcreator.clashofclansweapons.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.ItemSupplier;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.Packet;

import net.mcreator.clashofclansweapons.procedures.AirdefenceRangedBulletHitsBlockProcedure;
import net.mcreator.clashofclansweapons.init.ClashofclansweaponsModEntities;

import java.util.Random;

@OnlyIn(value = Dist.CLIENT, _interface = ItemSupplier.class)
public class AirdefenceRangedEntity extends AbstractArrow implements ItemSupplier {
	public AirdefenceRangedEntity(PlayMessages.SpawnEntity packet, Level world) {
		super(ClashofclansweaponsModEntities.AIRDEFENCE_RANGED.get(), world);
	}

	public AirdefenceRangedEntity(EntityType<? extends AirdefenceRangedEntity> type, Level world) {
		super(type, world);
	}

	public AirdefenceRangedEntity(EntityType<? extends AirdefenceRangedEntity> type, double x, double y, double z, Level world) {
		super(type, x, y, z, world);
	}

	public AirdefenceRangedEntity(EntityType<? extends AirdefenceRangedEntity> type, LivingEntity entity, Level world) {
		super(type, entity, world);
	}

	@Override
	public Packet<?> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public ItemStack getItem() {
		return new ItemStack(Items.FIREWORK_ROCKET);
	}

	@Override
	protected ItemStack getPickupItem() {
		return null;
	}

	@Override
	protected void doPostHurtEffects(LivingEntity entity) {
		super.doPostHurtEffects(entity);
		entity.setArrowCount(entity.getArrowCount() - 1);
	}

	@Override
	public void playerTouch(Player entity) {
		super.playerTouch(entity);
		AirdefenceRangedBulletHitsBlockProcedure.execute(this.level, this.getX(), this.getY(), this.getZ());
	}

	@Override
	public void onHitEntity(EntityHitResult entityHitResult) {
		super.onHitEntity(entityHitResult);
		AirdefenceRangedBulletHitsBlockProcedure.execute(this.level, this.getX(), this.getY(), this.getZ());
	}

	@Override
	public void onHitBlock(BlockHitResult blockHitResult) {
		super.onHitBlock(blockHitResult);
		AirdefenceRangedBulletHitsBlockProcedure.execute(this.level, blockHitResult.getBlockPos().getX(), blockHitResult.getBlockPos().getY(),
				blockHitResult.getBlockPos().getZ());
	}

	@Override
	public void tick() {
		super.tick();
		if (this.inGround)
			this.discard();
	}

	public static AirdefenceRangedEntity shoot(Level world, LivingEntity entity, Random random, float power, double damage, int knockback) {
		AirdefenceRangedEntity entityarrow = new AirdefenceRangedEntity(ClashofclansweaponsModEntities.AIRDEFENCE_RANGED.get(), entity, world);
		entityarrow.shoot(entity.getViewVector(1).x, entity.getViewVector(1).y, entity.getViewVector(1).z, power * 2, 0);
		entityarrow.setSilent(true);
		entityarrow.setCritArrow(false);
		entityarrow.setBaseDamage(damage);
		entityarrow.setKnockback(knockback);
		world.addFreshEntity(entityarrow);
		world.playSound(null, entity.getX(), entity.getY(), entity.getZ(),
				ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("clashofclansweapons:entity.aidefence.fireworkssfx")), SoundSource.PLAYERS,
				1, 1f);
		return entityarrow;
	}

	public static AirdefenceRangedEntity shoot(LivingEntity entity, LivingEntity target) {
		AirdefenceRangedEntity entityarrow = new AirdefenceRangedEntity(ClashofclansweaponsModEntities.AIRDEFENCE_RANGED.get(), entity, entity.level);
		double dx = target.getX() - entity.getX();
		double dy = target.getY() + target.getEyeHeight() - 1.1;
		double dz = target.getZ() - entity.getZ();
		entityarrow.shoot(dx, dy - entityarrow.getY() + Math.hypot(dx, dz) * 0.2F, dz, 1f * 2, 12.0F);
		entityarrow.setSilent(true);
		entityarrow.setBaseDamage(4);
		entityarrow.setKnockback(0);
		entityarrow.setCritArrow(false);
		entity.level.addFreshEntity(entityarrow);
		entity.level.playSound(null, entity.getX(), entity.getY(), entity.getZ(),
				ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("clashofclansweapons:entity.aidefence.fireworkssfx")), SoundSource.PLAYERS,
				1, 1f);
		return entityarrow;
	}
}
