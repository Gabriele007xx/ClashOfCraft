
package net.mcreator.clashofclansweapons.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.clashofclansweapons.entity.JumpEntityEntity;
import net.mcreator.clashofclansweapons.client.model.Modelcchealbottle;

public class JumpEntityRenderer extends MobRenderer<JumpEntityEntity, Modelcchealbottle<JumpEntityEntity>> {
	public JumpEntityRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcchealbottle(context.bakeLayer(Modelcchealbottle.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(JumpEntityEntity entity) {
		return new ResourceLocation("clashofclansweapons:textures/entities/jump_spell_bottle.png");
	}
}
