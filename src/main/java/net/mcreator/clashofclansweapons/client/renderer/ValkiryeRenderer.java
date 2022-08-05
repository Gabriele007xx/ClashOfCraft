
package net.mcreator.clashofclansweapons.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.clashofclansweapons.entity.ValkiryeEntity;
import net.mcreator.clashofclansweapons.client.model.Modelvalkiryenew;

public class ValkiryeRenderer extends MobRenderer<ValkiryeEntity, Modelvalkiryenew<ValkiryeEntity>> {
	public ValkiryeRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelvalkiryenew(context.bakeLayer(Modelvalkiryenew.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(ValkiryeEntity entity) {
		return new ResourceLocation("clashofclansweapons:textures/entities/valkyrie.png");
	}
}
