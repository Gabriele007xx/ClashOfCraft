
package net.mcreator.clashofclansweapons.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.clashofclansweapons.entity.ElectroOwlEntity;
import net.mcreator.clashofclansweapons.client.model.Modelelectrohoownew;

public class ElectroOwlRenderer extends MobRenderer<ElectroOwlEntity, Modelelectrohoownew<ElectroOwlEntity>> {
	public ElectroOwlRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelelectrohoownew(context.bakeLayer(Modelelectrohoownew.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(ElectroOwlEntity entity) {
		return new ResourceLocation("clashofclansweapons:textures/entities/electrohoowl.png");
	}
}
