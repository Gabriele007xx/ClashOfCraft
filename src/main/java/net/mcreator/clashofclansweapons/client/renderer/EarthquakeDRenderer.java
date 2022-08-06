
package net.mcreator.clashofclansweapons.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.clashofclansweapons.entity.EarthquakeDEntity;
import net.mcreator.clashofclansweapons.client.model.Modelearthquake_model;

public class EarthquakeDRenderer extends MobRenderer<EarthquakeDEntity, Modelearthquake_model<EarthquakeDEntity>> {
	public EarthquakeDRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelearthquake_model(context.bakeLayer(Modelearthquake_model.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EarthquakeDEntity entity) {
		return new ResourceLocation("clashofclansweapons:textures/entities/earthquake_entity.png");
	}
}
