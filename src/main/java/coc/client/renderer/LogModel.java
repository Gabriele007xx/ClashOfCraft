package coc.client.renderer;

import net.mcreator.clashofclansweapons.ModID;
import net.mcreator.clashofclansweapons.entity.CCIncantesimo2Entity;
import net.mcreator.clashofclansweapons.entity.LogEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class LogModel extends AnimatedGeoModel<LogEntity> {
    @Override
    public ResourceLocation getModelLocation(LogEntity entiity) {
        return new ResourceLocation(ModID.MOD_ID, "geo/log.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(LogEntity entity) {
        return new ResourceLocation(ModID.MOD_ID, "textures/entities/log.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(LogEntity entity) {
        return new ResourceLocation(ModID.MOD_ID, "animations/log.animation.json");
    }
}
