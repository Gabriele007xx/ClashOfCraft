
package net.mcreator.clashofclansweapons.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.clashofclansweapons.entity.MultiCannonEntity;
import net.mcreator.clashofclansweapons.client.model.Modelmulticannonlvone;

public class MultiCannonRenderer extends MobRenderer<MultiCannonEntity, Modelmulticannonlvone<MultiCannonEntity>> {
	public MultiCannonRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmulticannonlvone(context.bakeLayer(Modelmulticannonlvone.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(MultiCannonEntity entity) {
		return new ResourceLocation("clashofclansweapons:textures/multicannonlvone.png");
	}
}
