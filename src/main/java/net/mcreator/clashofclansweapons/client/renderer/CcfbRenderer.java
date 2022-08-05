
package net.mcreator.clashofclansweapons.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.clashofclansweapons.entity.CcfbEntity;
import net.mcreator.clashofclansweapons.client.model.Modelcchealbottle;

public class CcfbRenderer extends MobRenderer<CcfbEntity, Modelcchealbottle<CcfbEntity>> {
	public CcfbRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcchealbottle(context.bakeLayer(Modelcchealbottle.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CcfbEntity entity) {
		return new ResourceLocation("clashofclansweapons:textures/entities/frosts_btt.png");
	}
}
