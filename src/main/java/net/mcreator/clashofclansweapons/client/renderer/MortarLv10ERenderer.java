package net.mcreator.clashofclansweapons.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.clashofclansweapons.entity.MortarLv10EEntity;
import net.mcreator.clashofclansweapons.client.model.Modelmortar_lv_tennew;

public class MortarLv10ERenderer extends MobRenderer<MortarLv10EEntity, Modelmortar_lv_tennew<MortarLv10EEntity>> {
	public MortarLv10ERenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmortar_lv_tennew(context.bakeLayer(Modelmortar_lv_tennew.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(MortarLv10EEntity entity) {
		return new ResourceLocation("clashofclansweapons:textures/mortar_lv_ten.png");
	}
}
