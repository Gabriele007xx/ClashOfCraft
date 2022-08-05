package net.mcreator.clashofclansweapons.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.clashofclansweapons.init.ClashofclansweaponsModGameRules;

public class GameRuleProcedureProcedure {
	public static boolean execute(LevelAccessor world) {
		if (world.getLevelData().getGameRules().getBoolean(ClashofclansweaponsModGameRules.ATTACKBUILDINGS)) {
			return true;
		}
		return false;
	}
}
