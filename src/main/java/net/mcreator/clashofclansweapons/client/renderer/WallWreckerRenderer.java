
package net.mcreator.clashofclansweapons.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.clashofclansweapons.entity.WallWreckerEntity;
import net.mcreator.clashofclansweapons.client.model.Modelwallwrecker;

public class WallWreckerRenderer extends MobRenderer<WallWreckerEntity, Modelwallwrecker<WallWreckerEntity>> {
	public WallWreckerRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelwallwrecker(context.bakeLayer(Modelwallwrecker.LAYER_LOCATION)), 2f);
	}

	@Override
	public ResourceLocation getTextureLocation(WallWreckerEntity entity) {
		return new ResourceLocation("clashofclansweapons:textures/entities/wallw.png");
	}
}
