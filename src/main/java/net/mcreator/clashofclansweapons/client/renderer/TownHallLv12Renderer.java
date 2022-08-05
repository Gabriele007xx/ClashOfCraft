package net.mcreator.clashofclansweapons.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.clashofclansweapons.entity.TownHallLv12Entity;
import net.mcreator.clashofclansweapons.client.model.ModelTownHall12;

public class TownHallLv12Renderer extends MobRenderer<TownHallLv12Entity, ModelTownHall12<TownHallLv12Entity>> {
	public TownHallLv12Renderer(EntityRendererProvider.Context context) {
		super(context, new ModelTownHall12(context.bakeLayer(ModelTownHall12.LAYER_LOCATION)), 2f);
	}

	@Override
	public ResourceLocation getTextureLocation(TownHallLv12Entity entity) {
		return new ResourceLocation("clashofclansweapons:textures/townhall12.png");
	}
}
