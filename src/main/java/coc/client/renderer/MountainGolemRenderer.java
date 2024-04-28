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
package coc.client.renderer;

import net.mcreator.clashofclansweapons.ModID;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.clashofclansweapons.entity.MountainGolemEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import com.mojang.blaze3d.vertex.VertexConsumer;

public class MountainGolemRenderer extends GeoEntityRenderer<MountainGolemEntity> {
	public MountainGolemRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new MountainGolemModel());
	}
		@Override
	public ResourceLocation getTextureLocation(MountainGolemEntity entity) {
		return new ResourceLocation(ModID.MOD_ID, "textures/mountain_go.png");
	}
	@Override
	public RenderType getRenderType(MountainGolemEntity entity,float ticks, PoseStack pose,MultiBufferSource render,VertexConsumer vertex, int light, ResourceLocation tex)
	{
		pose.scale(0.8f,0.8f,0.8f);
		return super.getRenderType(entity,ticks,pose,render,vertex,light,tex);
	}

}
