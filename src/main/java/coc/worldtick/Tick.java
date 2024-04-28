package coc.worldtick;

import coc.raid.MobRaid;
import net.minecraft.server.level.ServerLevel;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class Tick {
    public static MobRaid raid = new MobRaid();
    @SubscribeEvent
    public static void onLevel(TickEvent.WorldTickEvent event)
    {
    }
}
