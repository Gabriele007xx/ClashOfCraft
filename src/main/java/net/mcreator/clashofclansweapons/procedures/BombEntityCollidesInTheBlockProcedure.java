package net.mcreator.clashofclansweapons.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.Explosion;
import net.minecraft.core.BlockPos;

public class BombEntityCollidesInTheBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.destroyBlock(new BlockPos(x, y, z), false);
		if (world instanceof Level _level && !_level.isClientSide())
			_level.explode(null, x, y, z, 2, Explosion.BlockInteraction.BREAK);
	}
}
