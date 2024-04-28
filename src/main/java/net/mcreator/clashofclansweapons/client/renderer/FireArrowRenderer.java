package net.mcreator.clashofclansweapons.client.renderer;

import net.mcreator.clashofclansweapons.ClashofclansweaponsMod;
import net.mcreator.clashofclansweapons.entity.FireArrowEntity;
import net.minecraft.client.renderer.entity.ArrowRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;

public class FireArrowRenderer extends ArrowRenderer<FireArrowEntity> {
    public FireArrowRenderer(EntityRendererProvider.Context p_173917_) {
        super(p_173917_);
    }

    @Override
    public ResourceLocation getTextureLocation(FireArrowEntity p_114482_) {
        return new ResourceLocation(ClashofclansweaponsMod.MODID,"textures/entities/fire_arrow.png");
    }
}
