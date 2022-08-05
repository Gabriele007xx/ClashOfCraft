
package net.mcreator.clashofclansweapons.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.clashofclansweapons.entity.GiantCannonBBEntity;
import net.mcreator.clashofclansweapons.client.model.Modelgiant_cannon;

public class GiantCannonBBRenderer extends MobRenderer<GiantCannonBBEntity, Modelgiant_cannon<GiantCannonBBEntity>> {
	public GiantCannonBBRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelgiant_cannon(context.bakeLayer(Modelgiant_cannon.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(GiantCannonBBEntity entity) {
		return new ResourceLocation("clashofclansweapons:textures/entities/gianet_cannone.png");
	}
}
