package net.mcreator.clashofclansweapons.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.clashofclansweapons.init.ClashofclansweaponsModParticleTypes;

public class WitchStickSkullBulletHitsBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (ClashofclansweaponsModParticleTypes.WITCH_PROJECTILE.get()), x, y, z, 80, 2, 2, 2, 1);
	}
}
