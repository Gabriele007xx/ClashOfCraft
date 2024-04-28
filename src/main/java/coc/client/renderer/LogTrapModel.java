package coc.client.renderer;

import net.mcreator.clashofclansweapons.ModID;
import net.mcreator.clashofclansweapons.entity.LogEntity;
import net.mcreator.clashofclansweapons.entity.LogTrapEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class LogTrapModel extends AnimatedGeoModel<LogTrapEntity> {
    @Override
    public ResourceLocation getModelLocation(LogTrapEntity entiity) {
        return new ResourceLocation(ModID.MOD_ID, "geo/logtrap.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(LogTrapEntity entity) {
        return new ResourceLocation(ModID.MOD_ID, "textures/entities/log.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(LogTrapEntity entity) {
        return new ResourceLocation(ModID.MOD_ID, "animations/logtrap.animation.json");
    }
}
