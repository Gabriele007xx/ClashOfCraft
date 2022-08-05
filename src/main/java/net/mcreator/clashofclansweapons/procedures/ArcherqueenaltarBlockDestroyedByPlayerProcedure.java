package net.mcreator.clashofclansweapons.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.clashofclansweapons.network.ClashofclansweaponsModVariables;
import net.mcreator.clashofclansweapons.entity.ArcherQueenEntity;

import java.util.Comparator;

public class ArcherqueenaltarBlockDestroyedByPlayerProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(ClashofclansweaponsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new ClashofclansweaponsModVariables.PlayerVariables())).aq) {
			if (!((Entity) world.getEntitiesOfClass(ArcherQueenEntity.class, AABB.ofSize(new Vec3(x, y, z), 128, 128, 128), e -> true).stream()
					.sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)).level.isClientSide())
				((Entity) world.getEntitiesOfClass(ArcherQueenEntity.class, AABB.ofSize(new Vec3(x, y, z), 128, 128, 128), e -> true).stream()
						.sorted(new Object() {
							Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
								return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
							}
						}.compareDistOf(x, y, z)).findFirst().orElse(null)).discard();
			{
				boolean _setval = false;
				entity.getCapability(ClashofclansweaponsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.aq = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
