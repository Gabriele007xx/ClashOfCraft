package net.mcreator.clashofclansweapons.procedures;

import net.minecraft.world.entity.Entity;

public class InfernoTowerLv1ItemBulletHitsLivingEntityProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.setSecondsOnFire(15);
	}
}
