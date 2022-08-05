package net.mcreator.clashofclansweapons.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.entity.Entity;

import net.mcreator.clashofclansweapons.entity.BattleMachineLv20Entity;
import net.mcreator.clashofclansweapons.entity.BattleMachineLv10Entity;
import net.mcreator.clashofclansweapons.entity.BMachineEntity;

public class JumpProceduraProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity.getVehicle()) instanceof BMachineEntity || (entity.getVehicle()) instanceof BattleMachineLv10Entity
				|| (entity.getVehicle()) instanceof BattleMachineLv20Entity) {
			(entity.getVehicle()).setDeltaMovement(new Vec3(0, 0.5, 0));
		}
	}
}
