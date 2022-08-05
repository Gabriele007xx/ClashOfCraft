
package net.mcreator.clashofclansweapons.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.clashofclansweapons.entity.HogRiderEntity;
import net.mcreator.clashofclansweapons.client.model.Modelhogridernew;

public class HogRiderRenderer extends MobRenderer<HogRiderEntity, Modelhogridernew<HogRiderEntity>> {
	public HogRiderRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelhogridernew(context.bakeLayer(Modelhogridernew.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(HogRiderEntity entity) {
		return new ResourceLocation("clashofclansweapons:textures/entities/hogrider.png");
	}
}
