package net.mcreator.clashofclansweapons.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.clashofclansweapons.entity.InfernoTowerEntity;
import net.mcreator.clashofclansweapons.client.model.Modelinfernotowerlv1new;

public class InfernoTowerRenderer extends MobRenderer<InfernoTowerEntity, Modelinfernotowerlv1new<InfernoTowerEntity>> {
	public InfernoTowerRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelinfernotowerlv1new(context.bakeLayer(Modelinfernotowerlv1new.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(InfernoTowerEntity entity) {
		return new ResourceLocation("clashofclansweapons:textures/infernotowerlv1.png");
	}
}
