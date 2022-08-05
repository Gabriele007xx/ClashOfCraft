
package net.mcreator.clashofclansweapons.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.clashofclansweapons.entity.CCIncantesimo1Entity;
import net.mcreator.clashofclansweapons.client.model.Modelccfrostspell;

public class CCIncantesimo1Renderer extends MobRenderer<CCIncantesimo1Entity, Modelccfrostspell<CCIncantesimo1Entity>> {
	public CCIncantesimo1Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelccfrostspell(context.bakeLayer(Modelccfrostspell.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CCIncantesimo1Entity entity) {
		return new ResourceLocation("clashofclansweapons:textures/entities/frostspell_btt_.png");
	}
}
