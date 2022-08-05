
package net.mcreator.clashofclansweapons.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.clashofclansweapons.entity.AirBBEntity;
import net.mcreator.clashofclansweapons.client.model.Modelair_dinamite;

public class AirBBRenderer extends MobRenderer<AirBBEntity, Modelair_dinamite<AirBBEntity>> {
	public AirBBRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelair_dinamite(context.bakeLayer(Modelair_dinamite.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(AirBBEntity entity) {
		return new ResourceLocation("clashofclansweapons:textures/entities/air_b.png");
	}
}
