
package net.mcreator.clashofclansweapons.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.clashofclansweapons.entity.AirBBBEntity;
import net.mcreator.clashofclansweapons.client.model.Modelair_bo;

public class AirBBBRenderer extends MobRenderer<AirBBBEntity, Modelair_bo<AirBBBEntity>> {
	public AirBBBRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelair_bo(context.bakeLayer(Modelair_bo.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(AirBBBEntity entity) {
		return new ResourceLocation("clashofclansweapons:textures/entities/air_b.png");
	}
}
