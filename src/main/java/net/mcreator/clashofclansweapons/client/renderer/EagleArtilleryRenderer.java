package net.mcreator.clashofclansweapons.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.clashofclansweapons.entity.EagleArtilleryEntity;
import net.mcreator.clashofclansweapons.client.model.Modelangle_artyierynew;

public class EagleArtilleryRenderer extends MobRenderer<EagleArtilleryEntity, Modelangle_artyierynew<EagleArtilleryEntity>> {
	public EagleArtilleryRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelangle_artyierynew(context.bakeLayer(Modelangle_artyierynew.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(EagleArtilleryEntity entity) {
		return new ResourceLocation("clashofclansweapons:textures/wagleartillery.png");
	}
}
