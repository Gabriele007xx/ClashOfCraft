package net.mcreator.clashofclansweapons.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.entity.Entity;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class CooldownWitchProcedure {
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
		if (!entity.getPersistentData().getBoolean("canusewitch")) {
			entity.getPersistentData().putDouble("witchcooldown", (entity.getPersistentData().getDouble("witchcooldown") + 1));
			if (entity.getPersistentData().getDouble("witchcooldown") == 140) {
				entity.getPersistentData().putBoolean("canusewitch", (true));
				entity.getPersistentData().putDouble("witchcooldown", 0);
			}
		}
	}
}
