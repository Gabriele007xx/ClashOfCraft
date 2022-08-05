package net.mcreator.clashofclansweapons.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.clashofclansweapons.entity.CannonLv1Entity;
import net.mcreator.clashofclansweapons.client.model.Modelcannonlv1new;

public class CannonLv1Renderer extends MobRenderer<CannonLv1Entity, Modelcannonlv1new<CannonLv1Entity>> {
	public CannonLv1Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelcannonlv1new(context.bakeLayer(Modelcannonlv1new.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CannonLv1Entity entity) {
		return new ResourceLocation("clashofclansweapons:textures/cannonlv1.png");
	}
}
