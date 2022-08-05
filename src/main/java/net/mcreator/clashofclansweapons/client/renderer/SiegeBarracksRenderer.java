
package net.mcreator.clashofclansweapons.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.clashofclansweapons.entity.SiegeBarracksEntity;
import net.mcreator.clashofclansweapons.client.model.Modelsiegebarracks;

public class SiegeBarracksRenderer extends MobRenderer<SiegeBarracksEntity, Modelsiegebarracks<SiegeBarracksEntity>> {
	public SiegeBarracksRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsiegebarracks(context.bakeLayer(Modelsiegebarracks.LAYER_LOCATION)), 2f);
	}

	@Override
	public ResourceLocation getTextureLocation(SiegeBarracksEntity entity) {
		return new ResourceLocation("clashofclansweapons:textures/entities/siegebarracks.png");
	}
}
