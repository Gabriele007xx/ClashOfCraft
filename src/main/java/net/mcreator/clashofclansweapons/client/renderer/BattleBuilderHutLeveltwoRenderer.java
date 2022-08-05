package net.mcreator.clashofclansweapons.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.clashofclansweapons.entity.BattleBuilderHutLeveltwoEntity;
import net.mcreator.clashofclansweapons.client.model.Modelbuilderhutlv2new;

public class BattleBuilderHutLeveltwoRenderer
		extends
			MobRenderer<BattleBuilderHutLeveltwoEntity, Modelbuilderhutlv2new<BattleBuilderHutLeveltwoEntity>> {
	public BattleBuilderHutLeveltwoRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelbuilderhutlv2new(context.bakeLayer(Modelbuilderhutlv2new.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(BattleBuilderHutLeveltwoEntity entity) {
		return new ResourceLocation("clashofclansweapons:textures/battlebuilderhutlv2.png");
	}
}
