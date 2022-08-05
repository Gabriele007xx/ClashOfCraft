
package net.mcreator.clashofclansweapons.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.clashofclansweapons.entity.FlameFingerWeaponEntity;
import net.mcreator.clashofclansweapons.client.model.Modelflamefinger;

public class FlameFingerWeaponRenderer extends MobRenderer<FlameFingerWeaponEntity, Modelflamefinger<FlameFingerWeaponEntity>> {
	public FlameFingerWeaponRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelflamefinger(context.bakeLayer(Modelflamefinger.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(FlameFingerWeaponEntity entity) {
		return new ResourceLocation("clashofclansweapons:textures/entities/flamefinger.png");
	}
}
