package net.mcreator.clashofclansweapons.procedures;

import net.minecraft.world.entity.Entity;

public class ShowcooldownProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (!entity.getPersistentData().getBoolean("canusehammer")) {
			return true;
		}
		return false;
	}
}
