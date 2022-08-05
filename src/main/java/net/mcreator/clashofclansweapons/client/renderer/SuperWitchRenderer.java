package net.mcreator.clashofclansweapons.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.clashofclansweapons.entity.SuperWitchEntity;
import net.mcreator.clashofclansweapons.client.model.Modelsuperwitchnew;

public class SuperWitchRenderer extends MobRenderer<SuperWitchEntity, Modelsuperwitchnew<SuperWitchEntity>> {
	public SuperWitchRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsuperwitchnew(context.bakeLayer(Modelsuperwitchnew.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SuperWitchEntity entity) {
		return new ResourceLocation("clashofclansweapons:textures/1supewitch.png");
	}
}
