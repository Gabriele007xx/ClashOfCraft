
package net.mcreator.clashofclansweapons.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.clashofclansweapons.entity.LASSIEntity;
import net.mcreator.clashofclansweapons.client.model.Modellassinew;

public class LASSIRenderer extends MobRenderer<LASSIEntity, Modellassinew<LASSIEntity>> {
	public LASSIRenderer(EntityRendererProvider.Context context) {
		super(context, new Modellassinew(context.bakeLayer(Modellassinew.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(LASSIEntity entity) {
		return new ResourceLocation("clashofclansweapons:textures/entities/lassi.png");
	}
}
