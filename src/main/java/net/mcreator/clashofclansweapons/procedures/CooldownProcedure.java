package net.mcreator.clashofclansweapons.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.entity.Entity;

import net.mcreator.clashofclansweapons.entity.BattleMachineLv20Entity;
import net.mcreator.clashofclansweapons.entity.BattleMachineLv10Entity;
import net.mcreator.clashofclansweapons.entity.BMachineEntity;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class CooldownProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player);
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (((entity.getVehicle()) instanceof BMachineEntity || (entity.getVehicle()) instanceof BattleMachineLv20Entity
				|| (entity.getVehicle()) instanceof BattleMachineLv10Entity) && !entity.getPersistentData().getBoolean("canusehammer")) {
			entity.getPersistentData().putDouble("cooldownhammer", (entity.getPersistentData().getDouble("cooldownhammer") + 1));
			if (entity.getPersistentData().getDouble("cooldownhammer") == 280) {
				entity.getPersistentData().putBoolean("canusehammer", (true));
				entity.getPersistentData().putDouble("cooldownhammer", 0);
			}
		}
	}
}
