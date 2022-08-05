
package net.mcreator.clashofclansweapons.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.clashofclansweapons.entity.AirDefenceEntity;
import net.mcreator.clashofclansweapons.client.model.ModelAir_Defencenew;

public class AirDefenceRenderer extends MobRenderer<AirDefenceEntity, ModelAir_Defencenew<AirDefenceEntity>> {
	public AirDefenceRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelAir_Defencenew(context.bakeLayer(ModelAir_Defencenew.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(AirDefenceEntity entity) {
		return new ResourceLocation("clashofclansweapons:textures/entities/air_defence.png");
	}
}
