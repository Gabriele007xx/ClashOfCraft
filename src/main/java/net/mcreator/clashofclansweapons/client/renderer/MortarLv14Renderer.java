package net.mcreator.clashofclansweapons.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.clashofclansweapons.entity.MortarLv14Entity;
import net.mcreator.clashofclansweapons.client.model.Modelmortar_lv_14new;

public class MortarLv14Renderer extends MobRenderer<MortarLv14Entity, Modelmortar_lv_14new<MortarLv14Entity>> {
	public MortarLv14Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelmortar_lv_14new(context.bakeLayer(Modelmortar_lv_14new.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(MortarLv14Entity entity) {
		return new ResourceLocation("clashofclansweapons:textures/mortar_lv_14.png");
	}
}
