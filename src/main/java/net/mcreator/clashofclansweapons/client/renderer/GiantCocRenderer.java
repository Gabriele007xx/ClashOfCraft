
package net.mcreator.clashofclansweapons.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.clashofclansweapons.entity.GiantCocEntity;
import net.mcreator.clashofclansweapons.client.model.Modelgiantlv1new;

public class GiantCocRenderer extends MobRenderer<GiantCocEntity, Modelgiantlv1new<GiantCocEntity>> {
	public GiantCocRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelgiantlv1new(context.bakeLayer(Modelgiantlv1new.LAYER_LOCATION)), 3f);
	}

	@Override
	public ResourceLocation getTextureLocation(GiantCocEntity entity) {
		return new ResourceLocation("clashofclansweapons:textures/entities/giant196.png");
	}
}
