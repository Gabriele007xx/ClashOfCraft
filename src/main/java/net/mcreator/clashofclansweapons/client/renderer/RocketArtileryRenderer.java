
package net.mcreator.clashofclansweapons.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.clashofclansweapons.entity.RocketArtileryEntity;
import net.mcreator.clashofclansweapons.client.model.Modelrocketartilyery;

public class RocketArtileryRenderer extends MobRenderer<RocketArtileryEntity, Modelrocketartilyery<RocketArtileryEntity>> {
	public RocketArtileryRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelrocketartilyery(context.bakeLayer(Modelrocketartilyery.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(RocketArtileryEntity entity) {
		return new ResourceLocation("clashofclansweapons:textures/rocketartilyery.png");
	}
}
