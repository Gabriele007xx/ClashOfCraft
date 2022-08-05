
package net.mcreator.clashofclansweapons.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.clashofclansweapons.entity.BigBoyEntity;
import net.mcreator.clashofclansweapons.client.model.Modelbigboynew;

public class BigBoyRenderer extends MobRenderer<BigBoyEntity, Modelbigboynew<BigBoyEntity>> {
	public BigBoyRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelbigboynew(context.bakeLayer(Modelbigboynew.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(BigBoyEntity entity) {
		return new ResourceLocation("clashofclansweapons:textures/entities/bigboy.png");
	}
}
