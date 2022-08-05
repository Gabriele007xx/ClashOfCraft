package net.mcreator.clashofclansweapons.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.clashofclansweapons.entity.BattleMachineLv20Entity;
import net.mcreator.clashofclansweapons.entity.BMachineEntity;

public class OverlayshowingfuncProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity.getVehicle()) instanceof BMachineEntity || (entity.getVehicle()) instanceof BattleMachineLv20Entity
				|| (entity.getVehicle()) instanceof BMachineEntity) {
			return true;
		}
		return false;
	}
}
