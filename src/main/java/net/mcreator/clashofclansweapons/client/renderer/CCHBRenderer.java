
package net.mcreator.clashofclansweapons.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.clashofclansweapons.entity.CCHBEntity;
import net.mcreator.clashofclansweapons.client.model.Modelcchealbottle;

public class CCHBRenderer extends MobRenderer<CCHBEntity, Modelcchealbottle<CCHBEntity>> {
	public CCHBRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcchealbottle(context.bakeLayer(Modelcchealbottle.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CCHBEntity entity) {
		return new ResourceLocation("clashofclansweapons:textures/entities/cchealb.png");
	}
}
