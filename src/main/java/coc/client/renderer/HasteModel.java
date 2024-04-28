package coc.client.renderer;

import net.mcreator.clashofclansweapons.ClashofclansweaponsMod;
import net.mcreator.clashofclansweapons.entity.HasteEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class HasteModel extends AnimatedGeoModel<HasteEntity> {
    @Override
    public ResourceLocation getModelLocation(HasteEntity hasteEntity) {
        return new ResourceLocation(ClashofclansweaponsMod.MODID,"geo/bottle.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(HasteEntity hasteAreaEntity) {
        return new ResourceLocation(ClashofclansweaponsMod.MODID, "textures/entities/haste_bottle.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(HasteEntity hasteAreaEntity) {
        return new ResourceLocation(ClashofclansweaponsMod.MODID, "animations/bottle.animation.json");
    }
}
