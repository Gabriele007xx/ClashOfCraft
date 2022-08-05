
package net.mcreator.clashofclansweapons.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.clashofclansweapons.entity.BMachineEntity;
import net.mcreator.clashofclansweapons.client.model.Modelbmnew;

public class BMachineRenderer extends MobRenderer<BMachineEntity, Modelbmnew<BMachineEntity>> {
	public BMachineRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelbmnew(context.bakeLayer(Modelbmnew.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(BMachineEntity entity) {
		return new ResourceLocation("clashofclansweapons:textures/entities/battle_m.png");
	}
}
