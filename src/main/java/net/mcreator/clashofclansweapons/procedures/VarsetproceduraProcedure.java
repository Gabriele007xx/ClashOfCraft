package net.mcreator.clashofclansweapons.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.clashofclansweapons.network.ClashofclansweaponsModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class VarsetproceduraProcedure {
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
		{
			double _setval = (entity.getVehicle()) instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1;
			entity.getCapability(ClashofclansweaponsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.bmh = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
