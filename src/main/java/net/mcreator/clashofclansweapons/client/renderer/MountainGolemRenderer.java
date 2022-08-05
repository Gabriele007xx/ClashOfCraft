
package net.mcreator.clashofclansweapons.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.clashofclansweapons.entity.MountainGolemEntity;
import net.mcreator.clashofclansweapons.client.model.Modelmountain_go;

public class MountainGolemRenderer extends MobRenderer<MountainGolemEntity, Modelmountain_go<MountainGolemEntity>> {
	public MountainGolemRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmountain_go(context.bakeLayer(Modelmountain_go.LAYER_LOCATION)), 2f);
	}

	@Override
	public ResourceLocation getTextureLocation(MountainGolemEntity entity) {
		return new ResourceLocation("clashofclansweapons:textures/mountain_go.png");
	}
}
