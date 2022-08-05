
package net.mcreator.clashofclansweapons.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.clashofclansweapons.entity.CCIncantesimo2Entity;
import net.mcreator.clashofclansweapons.client.model.Modelccfrostspell;

public class CCIncantesimo2Renderer extends MobRenderer<CCIncantesimo2Entity, Modelccfrostspell<CCIncantesimo2Entity>> {
	public CCIncantesimo2Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelccfrostspell(context.bakeLayer(Modelccfrostspell.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CCIncantesimo2Entity entity) {
		return new ResourceLocation("clashofclansweapons:textures/entities/rage_spell_circle.png");
	}
}
