package net.mcreator.clashofclansweapons.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.clashofclansweapons.init.ClashofclansweaponsModEntities;
import net.mcreator.clashofclansweapons.entity.WizardEntity;
import net.mcreator.clashofclansweapons.entity.Pekkalevel1Entity;

public class SiegeBarracksOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putDouble("progress", (entity.getPersistentData().getDouble("progress") + 1));
		if (entity.getPersistentData().getDouble("progress") >= 40 && entity.getPersistentData().getBoolean("canspawnpekka")) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new Pekkalevel1Entity(ClashofclansweaponsModEntities.PEKKALEVEL_1.get(), _level);
				entityToSpawn.moveTo(x, y, z, 0, 0);
				entityToSpawn.setYBodyRot(0);
				entityToSpawn.setYHeadRot(0);
				entityToSpawn.setDeltaMovement(0, 0, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null,
							null);
				world.addFreshEntity(entityToSpawn);
			}
			entity.getPersistentData().putBoolean("canspawnpekka", (false));
			entity.getPersistentData().putDouble("progress", 0);
			entity.hurt(DamageSource.GENERIC, 1);
		}
		if (entity.getPersistentData().getDouble("progress") >= 100) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new WizardEntity(ClashofclansweaponsModEntities.WIZARD.get(), _level);
				entityToSpawn.moveTo(x, y, z, 0, 0);
				entityToSpawn.setYBodyRot(0);
				entityToSpawn.setYHeadRot(0);
				entityToSpawn.setDeltaMovement(0, 0, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null,
							null);
				world.addFreshEntity(entityToSpawn);
			}
			entity.getPersistentData().putDouble("progress", 0);
			entity.hurt(DamageSource.GENERIC, 1);
		}
	}
}
