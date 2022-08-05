
package net.mcreator.clashofclansweapons.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.clashofclansweapons.entity.NightWitchBatEntity;
import net.mcreator.clashofclansweapons.client.model.Modelbatnew;

public class NightWitchBatRenderer extends MobRenderer<NightWitchBatEntity, Modelbatnew<NightWitchBatEntity>> {
	public NightWitchBatRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelbatnew(context.bakeLayer(Modelbatnew.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(NightWitchBatEntity entity) {
		return new ResourceLocation("clashofclansweapons:textures/entities/bat.png");
	}
}
