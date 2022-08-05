package net.mcreator.clashofclansweapons.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.clashofclansweapons.entity.CannonCartStillEntity;
import net.mcreator.clashofclansweapons.client.model.Modelcannoncart_pose2new;

public class CannonCartStillRenderer extends MobRenderer<CannonCartStillEntity, Modelcannoncart_pose2new<CannonCartStillEntity>> {
	public CannonCartStillRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcannoncart_pose2new(context.bakeLayer(Modelcannoncart_pose2new.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CannonCartStillEntity entity) {
		return new ResourceLocation("clashofclansweapons:textures/cannon_cart.png");
	}
}
