package net.mcreator.clashofclansweapons.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.clashofclansweapons.entity.CannonCartEntity;
import net.mcreator.clashofclansweapons.client.model.Modelcannoncartnew;

public class CannonCartRenderer extends MobRenderer<CannonCartEntity, Modelcannoncartnew<CannonCartEntity>> {
	public CannonCartRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcannoncartnew(context.bakeLayer(Modelcannoncartnew.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CannonCartEntity entity) {
		return new ResourceLocation("clashofclansweapons:textures/cannon_cart.png");
	}
}
