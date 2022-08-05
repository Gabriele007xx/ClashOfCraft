package net.mcreator.clashofclansweapons.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.clashofclansweapons.entity.DCannonEntity;
import net.mcreator.clashofclansweapons.client.model.Modeldoublecannonlvone;

public class DCannonRenderer extends MobRenderer<DCannonEntity, Modeldoublecannonlvone<DCannonEntity>> {
	public DCannonRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeldoublecannonlvone(context.bakeLayer(Modeldoublecannonlvone.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(DCannonEntity entity) {
		return new ResourceLocation("clashofclansweapons:textures/doublecannonlvone.png");
	}
}
