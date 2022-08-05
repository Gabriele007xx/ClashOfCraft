
package net.mcreator.clashofclansweapons.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.clashofclansweapons.entity.XbowLvTwoniEntity;
import net.mcreator.clashofclansweapons.client.model.Modelxbowlv2;

public class XbowLvTwoniRenderer extends MobRenderer<XbowLvTwoniEntity, Modelxbowlv2<XbowLvTwoniEntity>> {
	public XbowLvTwoniRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelxbowlv2(context.bakeLayer(Modelxbowlv2.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(XbowLvTwoniEntity entity) {
		return new ResourceLocation("clashofclansweapons:textures/xbowleveltwo.png");
	}
}
