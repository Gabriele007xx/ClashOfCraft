
package net.mcreator.clashofclansweapons.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.clashofclansweapons.entity.FireSpiritEntity;
import net.mcreator.clashofclansweapons.client.model.Modelfirespirit;

public class FireSpiritRenderer extends MobRenderer<FireSpiritEntity, Modelfirespirit<FireSpiritEntity>> {
	public FireSpiritRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelfirespirit(context.bakeLayer(Modelfirespirit.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(FireSpiritEntity entity) {
		return new ResourceLocation("clashofclansweapons:textures/entities/firespirit.png");
	}
}
