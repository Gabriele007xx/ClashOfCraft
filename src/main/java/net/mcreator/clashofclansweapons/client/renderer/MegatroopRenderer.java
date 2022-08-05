
package net.mcreator.clashofclansweapons.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.clashofclansweapons.entity.MegatroopEntity;
import net.mcreator.clashofclansweapons.client.model.Modelflyingf;

public class MegatroopRenderer extends MobRenderer<MegatroopEntity, Modelflyingf<MegatroopEntity>> {
	public MegatroopRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelflyingf(context.bakeLayer(Modelflyingf.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(MegatroopEntity entity) {
		return new ResourceLocation("clashofclansweapons:textures/entities/flying_.png");
	}
}
