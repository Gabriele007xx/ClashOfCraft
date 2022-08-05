
package net.mcreator.clashofclansweapons.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.clashofclansweapons.entity.XbowLv1Entity;
import net.mcreator.clashofclansweapons.client.model.Modelxbowlv1new;

public class XbowLv1Renderer extends MobRenderer<XbowLv1Entity, Modelxbowlv1new<XbowLv1Entity>> {
	public XbowLv1Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelxbowlv1new(context.bakeLayer(Modelxbowlv1new.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(XbowLv1Entity entity) {
		return new ResourceLocation("clashofclansweapons:textures/xbow1.png");
	}
}
