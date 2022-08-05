package net.mcreator.clashofclansweapons.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.clashofclansweapons.init.ClashofclansweaponsModEntities;
import net.mcreator.clashofclansweapons.entity.DoubleCannonShotgunEntity;

public class DoubleCannonShotgunRangedItemUsedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, new BlockPos(x, y, z),
						ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("clashofclansweapons:ite.doublecannon.shoot")),
						SoundSource.NEUTRAL, 1, 1);
			} else {
				_level.playLocalSound(x, y, z,
						ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("clashofclansweapons:ite.doublecannon.shoot")),
						SoundSource.NEUTRAL, 1, 1, false);
			}
		}
		{
			Entity _shootFrom = entity;
			Level projectileLevel = _shootFrom.level;
			if (!projectileLevel.isClientSide()) {
				Projectile _entityToSpawn = new Object() {
					public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
						AbstractArrow entityToSpawn = new DoubleCannonShotgunEntity(ClashofclansweaponsModEntities.DOUBLE_CANNON_SHOTGUN.get(),
								level);
						entityToSpawn.setOwner(shooter);
						entityToSpawn.setBaseDamage(damage);
						entityToSpawn.setKnockback(knockback);
						return entityToSpawn;
					}
				}.getArrow(projectileLevel, entity, 5, 0);
				_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
				_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 2, 0);
				projectileLevel.addFreshEntity(_entityToSpawn);
			}
		}
		{
			Entity _shootFrom = entity;
			Level projectileLevel = _shootFrom.level;
			if (!projectileLevel.isClientSide()) {
				Projectile _entityToSpawn = new Object() {
					public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
						AbstractArrow entityToSpawn = new DoubleCannonShotgunEntity(ClashofclansweaponsModEntities.DOUBLE_CANNON_SHOTGUN.get(),
								level);
						entityToSpawn.setOwner(shooter);
						entityToSpawn.setBaseDamage(damage);
						entityToSpawn.setKnockback(knockback);
						return entityToSpawn;
					}
				}.getArrow(projectileLevel, entity, 5, 0);
				_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
				_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 2, 0);
				projectileLevel.addFreshEntity(_entityToSpawn);
			}
		}
		{
			Entity _shootFrom = entity;
			Level projectileLevel = _shootFrom.level;
			if (!projectileLevel.isClientSide()) {
				Projectile _entityToSpawn = new Object() {
					public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
						AbstractArrow entityToSpawn = new DoubleCannonShotgunEntity(ClashofclansweaponsModEntities.DOUBLE_CANNON_SHOTGUN.get(),
								level);
						entityToSpawn.setOwner(shooter);
						entityToSpawn.setBaseDamage(damage);
						entityToSpawn.setKnockback(knockback);
						return entityToSpawn;
					}
				}.getArrow(projectileLevel, entity, 5, 0);
				_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
				_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 2, 0);
				projectileLevel.addFreshEntity(_entityToSpawn);
			}
		}
		if (entity instanceof Player _player)
			_player.getCooldowns().addCooldown(itemstack.getItem(), 32);
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.FLAME, x, y, z, 5, 1, 1, 1, 1);
	}
}
