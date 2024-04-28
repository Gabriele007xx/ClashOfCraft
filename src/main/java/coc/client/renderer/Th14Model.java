package coc.client.renderer;

import net.mcreator.clashofclansweapons.ModID;
import net.mcreator.clashofclansweapons.entity.TownHall14Entity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class Th14Model extends AnimatedGeoModel<TownHall14Entity> {
    @Override
    public ResourceLocation getModelLocation(TownHall14Entity entity) {
        return new ResourceLocation(ModID.MOD_ID, "geo/th14.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(TownHall14Entity entity) {
        return new ResourceLocation(ModID.MOD_ID, "textures/entities/th14.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(TownHall14Entity entity) {
        return new ResourceLocation(ModID.MOD_ID, "animations/th14.animation.json");
    }
}
