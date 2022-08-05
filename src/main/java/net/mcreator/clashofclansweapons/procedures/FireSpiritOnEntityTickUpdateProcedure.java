package net.mcreator.clashofclansweapons.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.core.BlockPos;

public class FireSpiritOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean found = false;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		double foundx = 0;
		double foundy = 0;
		double foundz = 0;
		entity.setSecondsOnFire(15);
		if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.WATER
				|| (world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.WATER
				|| (world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.BUBBLE_COLUMN) {
			entity.hurt(DamageSource.GENERIC, 1);
		}
		if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.LAVA
				|| (world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.LAVA) {
			entity.hurt(DamageSource.GENERIC, -1);
		}
		sx = -2;
		found = false;
		for (int index0 = 0; index0 < (int) (4); index0++) {
			sy = -2;
			for (int index1 = 0; index1 < (int) (4); index1++) {
				sz = -2;
				for (int index2 = 0; index2 < (int) (4); index2++) {
					if ((world.getBlockState(new BlockPos(x + sx, y + sy, z + sz))).getBlock() == Blocks.SNOW_BLOCK) {
						found = true;
						foundx = x + sx;
						foundy = y + sy;
						foundz = z + sz;
					}
					sz = sz + 1;
				}
				sy = sy + 1;
			}
			sx = sx + 1;
		}
		if (found == true) {
			world.setBlock(new BlockPos(foundx, foundy, foundz), Blocks.WATER.defaultBlockState(), 3);
		}
	}
}
