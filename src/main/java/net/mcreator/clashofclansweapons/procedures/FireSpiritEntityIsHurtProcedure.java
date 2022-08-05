package net.mcreator.clashofclansweapons.procedures;

import net.minecraft.world.entity.Entity;

public class FireSpiritEntityIsHurtProcedure {
	public static void execute(Entity sourceentity) {
		if (sourceentity == null)
			return;
		sourceentity.setSecondsOnFire(15);
	}
}
