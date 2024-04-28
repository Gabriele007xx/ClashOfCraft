package coc.spawn;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.Level;
import net.minecraftforge.registries.ForgeRegistries;

public class SpellS {
    public static void execute(Level level, String string, Entity entity)
    {
        level.playSound(null, entity.getX(), entity.getY(), entity.getZ(),
                ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(string)), SoundSource.PLAYERS,
                1, 1f);
    }

}
