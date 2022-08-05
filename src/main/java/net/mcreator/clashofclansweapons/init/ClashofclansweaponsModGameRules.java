
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.clashofclansweapons.init;

import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.GameRules;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClashofclansweaponsModGameRules {
	public static final GameRules.Key<GameRules.BooleanValue> ATTACKBUILDINGS = GameRules.register("attackBuildings", GameRules.Category.MOBS,
			GameRules.BooleanValue.create(false));
	public static final GameRules.Key<GameRules.BooleanValue> DESTROYENVIROMENTRULE = GameRules.register("destroyEnviromentrule",
			GameRules.Category.MOBS, GameRules.BooleanValue.create(true));
	public static final GameRules.Key<GameRules.BooleanValue> MODE2018 = GameRules.register("mode2018", GameRules.Category.MOBS,
			GameRules.BooleanValue.create(false));
}
