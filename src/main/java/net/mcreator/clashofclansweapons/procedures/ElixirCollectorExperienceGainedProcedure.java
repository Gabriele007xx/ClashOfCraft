package net.mcreator.clashofclansweapons.procedures;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.clashofclansweapons.network.ClashofclansweaponsModVariables;

public class ElixirCollectorExperienceGainedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getTileData().getDouble(tag);
				return -1;
			}
		}.getValue(world, new BlockPos(x, y, z), "targetlevel") == 2) {
			{
				double _setval = (entity.getCapability(ClashofclansweaponsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new ClashofclansweaponsModVariables.PlayerVariables())).esp + 7;
				entity.getCapability(ClashofclansweaponsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.esp = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if (new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getTileData().getDouble(tag);
				return -1;
			}
		}.getValue(world, new BlockPos(x, y, z), "targetlevel") == 3) {
			{
				double _setval = (entity.getCapability(ClashofclansweaponsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new ClashofclansweaponsModVariables.PlayerVariables())).esp + 15;
				entity.getCapability(ClashofclansweaponsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.esp = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if (new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getTileData().getDouble(tag);
				return -1;
			}
		}.getValue(world, new BlockPos(x, y, z), "targetlevel") == 4) {
			{
				double _setval = (entity.getCapability(ClashofclansweaponsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new ClashofclansweaponsModVariables.PlayerVariables())).esp + 24;
				entity.getCapability(ClashofclansweaponsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.esp = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if (new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getTileData().getDouble(tag);
				return -1;
			}
		}.getValue(world, new BlockPos(x, y, z), "targetlevel") == 5) {
			{
				double _setval = (entity.getCapability(ClashofclansweaponsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new ClashofclansweaponsModVariables.PlayerVariables())).esp + 48;
				entity.getCapability(ClashofclansweaponsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.esp = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
