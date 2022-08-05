
package net.mcreator.clashofclansweapons.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.clashofclansweapons.entity.UnicornEntity;
import net.mcreator.clashofclansweapons.client.model.Modelunicornpetbnew;

public class UnicornRenderer extends MobRenderer<UnicornEntity, Modelunicornpetbnew<UnicornEntity>> {
	public UnicornRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelunicornpetbnew(context.bakeLayer(Modelunicornpetbnew.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(UnicornEntity entity) {
		return new ResourceLocation("clashofclansweapons:textures/entities/unicorn.png");
	}
}
