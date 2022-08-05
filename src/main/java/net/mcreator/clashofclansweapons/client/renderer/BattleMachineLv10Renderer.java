
package net.mcreator.clashofclansweapons.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.clashofclansweapons.entity.BattleMachineLv10Entity;
import net.mcreator.clashofclansweapons.client.model.Modelbmachcinelv10fnew;

public class BattleMachineLv10Renderer extends MobRenderer<BattleMachineLv10Entity, Modelbmachcinelv10fnew<BattleMachineLv10Entity>> {
	public BattleMachineLv10Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelbmachcinelv10fnew(context.bakeLayer(Modelbmachcinelv10fnew.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(BattleMachineLv10Entity entity) {
		return new ResourceLocation("clashofclansweapons:textures/entities/battle_m_5.png");
	}
}
