
package net.mcreator.clashofclansweapons.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.clashofclansweapons.entity.CCincantesimo0Entity;
import net.mcreator.clashofclansweapons.client.model.Modelccapitalh;

public class CCincantesimo0Renderer extends MobRenderer<CCincantesimo0Entity, Modelccapitalh<CCincantesimo0Entity>> {
	public CCincantesimo0Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelccapitalh(context.bakeLayer(Modelccapitalh.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CCincantesimo0Entity entity) {
		return new ResourceLocation("clashofclansweapons:textures/entities/ccheal_t.png");
	}
}
