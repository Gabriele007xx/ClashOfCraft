package net.mcreator.clashofclansweapons.procedures;

import net.minecraft.world.entity.Entity;

public class DoubleCannonShotgunWhileBulletFlyingTickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.setNoGravity((false));
	}
}
