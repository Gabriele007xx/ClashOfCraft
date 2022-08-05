
package net.mcreator.clashofclansweapons.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.clashofclansweapons.entity.BattleMachineLv20Entity;
import net.mcreator.clashofclansweapons.client.model.Modelbmachcinelv10fnew;

public class BattleMachineLv20Renderer extends MobRenderer<BattleMachineLv20Entity, Modelbmachcinelv10fnew<BattleMachineLv20Entity>> {
	public BattleMachineLv20Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelbmachcinelv10fnew(context.bakeLayer(Modelbmachcinelv10fnew.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(BattleMachineLv20Entity entity) {
		return new ResourceLocation("clashofclansweapons:textures/entities/battle_m_20.png");
	}
}
