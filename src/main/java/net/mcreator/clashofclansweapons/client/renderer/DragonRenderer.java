package net.mcreator.clashofclansweapons.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.clashofclansweapons.entity.DragonEntity;
import net.mcreator.clashofclansweapons.client.model.ModelCoCDragon;

public class DragonRenderer extends MobRenderer<DragonEntity, ModelCoCDragon<DragonEntity>> {
	public DragonRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelCoCDragon(context.bakeLayer(ModelCoCDragon.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(DragonEntity entity) {
		return new ResourceLocation("clashofclansweapons:textures/dragolv1.png");
	}
}
