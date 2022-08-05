package net.mcreator.clashofclansweapons.procedures;

import net.minecraft.world.entity.Entity;

public class Entityhittedbarbaianswordlv7Procedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.setSecondsOnFire(15);
	}
}
