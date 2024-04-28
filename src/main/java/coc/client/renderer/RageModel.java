package coc.client.renderer;

import net.mcreator.clashofclansweapons.ModID;
import net.mcreator.clashofclansweapons.entity.CCIncantesimo2Entity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class RageModel extends AnimatedGeoModel<CCIncantesimo2Entity> {
    @Override
    public ResourceLocation getModelLocation(CCIncantesimo2Entity entiity) {
        return new ResourceLocation(ModID.MOD_ID, "geo/ragespell_cc.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(CCIncantesimo2Entity entity) {
        return new ResourceLocation(ModID.MOD_ID, "textures/entities/rage_spell_circle.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(CCIncantesimo2Entity entity) {
        return new ResourceLocation(ModID.MOD_ID, "animations/ragespell_cc.animation.json");
    }
}
