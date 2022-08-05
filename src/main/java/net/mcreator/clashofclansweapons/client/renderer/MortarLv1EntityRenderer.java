package net.mcreator.clashofclansweapons.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.clashofclansweapons.entity.MortarLv1EntityEntity;
import net.mcreator.clashofclansweapons.client.model.Modelmortarlv1;

public class MortarLv1EntityRenderer extends MobRenderer<MortarLv1EntityEntity, Modelmortarlv1<MortarLv1EntityEntity>> {
	public MortarLv1EntityRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmortarlv1(context.bakeLayer(Modelmortarlv1.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(MortarLv1EntityEntity entity) {
		return new ResourceLocation("clashofclansweapons:textures/mortarlv1.png");
	}
}
