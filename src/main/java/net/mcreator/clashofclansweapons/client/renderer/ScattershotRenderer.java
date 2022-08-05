package net.mcreator.clashofclansweapons.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.clashofclansweapons.entity.ScattershotEntity;
import net.mcreator.clashofclansweapons.client.model.Modelscattershotleveloneftnew;

public class ScattershotRenderer extends MobRenderer<ScattershotEntity, Modelscattershotleveloneftnew<ScattershotEntity>> {
	public ScattershotRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelscattershotleveloneftnew(context.bakeLayer(Modelscattershotleveloneftnew.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(ScattershotEntity entity) {
		return new ResourceLocation("clashofclansweapons:textures/scattershotf.png");
	}
}
