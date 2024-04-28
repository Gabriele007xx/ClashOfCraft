package net.mcreator.clashofclansweapons;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, "clashofclansweapons");
    public static final RegistryObject<SoundEvent> GRAVEYARD_SPELL = registerSoundEvent("graveyard_deploy");

            private static RegistryObject<SoundEvent> registerSoundEvent(String name)
            {
                return SOUND_EVENTS.register(name, ()->new SoundEvent(new ResourceLocation(ClashofclansweaponsMod.MODID, name)));

            }


            public static void register(IEventBus bus)
            {
                SOUND_EVENTS.register(bus);
            }
}
