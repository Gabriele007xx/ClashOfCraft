
package net.mcreator.clashofclansweapons.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.clashofclansweapons.entity.JumpAreaEntity;
import net.mcreator.clashofclansweapons.client.model.Modelccapitalh;

public class JumpAreaRenderer extends MobRenderer<JumpAreaEntity, Modelccapitalh<JumpAreaEntity>> {
	public JumpAreaRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelccapitalh(context.bakeLayer(Modelccapitalh.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(JumpAreaEntity entity) {
		return new ResourceLocation("clashofclansweapons:textures/entities/jump_area.png");
	}
}
