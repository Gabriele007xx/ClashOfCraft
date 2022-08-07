/**
 * The code of this mod element is always locked.
 *
 * You can register new events in this class too.
 *
 * If you want to make a plain independent class, create it using
 * Project Browser -> New... and make sure to make the class
 * outside net.mcreator.clashofclansweapons as this package is managed by MCreator.
 *
 * If you change workspace package, modid or prefix, you will need
 * to manually adapt this file to these changes or remake it.
 *
 * This class will be added in the mod root package.
*/
package net.mcreator.clashofclansweapons;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.clashofclansweapons.entity.MountainGolemEntity;

public class MountainGolemModel extends AnimatedGeoModel<MountainGolemEntity> {
	@Override
	public ResourceLocation getModelLocation(MountainGolemEntity entiity) {
		return new ResourceLocation(ModID.MOD_ID, "geo/mountain_go.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(MountainGolemEntity entity) {
		return new ResourceLocation(ModID.MOD_ID, "textures/mountain_go.png");
	}

	@Override
	public ResourceLocation getAnimationFileLocation(MountainGolemEntity entity) {
		return new ResourceLocation(ModID.MOD_ID, "animations/mountain_go.animation.json");
	}
}
