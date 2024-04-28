package coc.client.renderer;

import net.mcreator.clashofclansweapons.ModID;
import net.mcreator.clashofclansweapons.entity.HealerEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class HealerModel extends AnimatedGeoModel<HealerEntity> {
    @Override
    public ResourceLocation getModelLocation(HealerEntity entiity) {
        return new ResourceLocation(ModID.MOD_ID, "geo/healer.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(HealerEntity entity) {
        return new ResourceLocation(ModID.MOD_ID, "textures/entities/healer.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(HealerEntity entity) {
        return new ResourceLocation(ModID.MOD_ID, "animations/healer.animation.json");
    }
}
