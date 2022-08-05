package net.mcreator.clashofclansweapons.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;

public class CannonCartStillOnEntityTickUpdateProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putDouble("ability", (entity.getPersistentData().getDouble("ability") + 1));
		if (entity.getPersistentData().getDouble("ability") == 20) {
			entity.hurt(DamageSource.GENERIC, 1);
			entity.getPersistentData().putDouble("ability", 0);
		}
	}
}
