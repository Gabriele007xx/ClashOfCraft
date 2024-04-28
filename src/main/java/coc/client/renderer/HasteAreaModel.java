package coc.client.renderer;

import net.mcreator.clashofclansweapons.ClashofclansweaponsMod;
import net.mcreator.clashofclansweapons.entity.HasteAreaEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class HasteAreaModel extends AnimatedGeoModel<HasteAreaEntity> {
    @Override
    public ResourceLocation getModelLocation(HasteAreaEntity hasteAreaEntity) {
        return new ResourceLocation(ClashofclansweaponsMod.MODID, "geo/haste_area.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(HasteAreaEntity hasteAreaEntity) {
        return new ResourceLocation(ClashofclansweaponsMod.MODID, "textures/entities/haste.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(HasteAreaEntity hasteAreaEntity) {
        return new ResourceLocation(ClashofclansweaponsMod.MODID, "animations/haste_area.animation.json");
    }
}
