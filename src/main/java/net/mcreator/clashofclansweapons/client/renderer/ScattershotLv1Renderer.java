package net.mcreator.clashofclansweapons.client.renderer;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.clashofclansweapons.entity.ScattershotLv1Entity;
import net.mcreator.clashofclansweapons.client.model.Modelscattershot_bulletsnew;

import com.mojang.math.Vector3f;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class ScattershotLv1Renderer extends EntityRenderer<ScattershotLv1Entity> {
	private static final ResourceLocation texture = new ResourceLocation("clashofclansweapons:textures/entities/scattershot_rockz.png");
	private final Modelscattershot_bulletsnew model;

	public ScattershotLv1Renderer(EntityRendererProvider.Context context) {
		super(context);
		model = new Modelscattershot_bulletsnew(context.bakeLayer(Modelscattershot_bulletsnew.LAYER_LOCATION));
	}

	@Override
	public void render(ScattershotLv1Entity entityIn, float entityYaw, float partialTicks, PoseStack poseStack, MultiBufferSource bufferIn,
			int packedLightIn) {
		VertexConsumer vb = bufferIn.getBuffer(RenderType.entityCutout(this.getTextureLocation(entityIn)));
		poseStack.pushPose();
		poseStack.mulPose(Vector3f.YP.rotationDegrees(Mth.lerp(partialTicks, entityIn.yRotO, entityIn.getYRot()) - 90));
		poseStack.mulPose(Vector3f.ZP.rotationDegrees(90 + Mth.lerp(partialTicks, entityIn.xRotO, entityIn.getXRot())));
		model.renderToBuffer(poseStack, vb, packedLightIn, OverlayTexture.NO_OVERLAY, 1, 1, 1, 0.0625f);
		poseStack.popPose();
		super.render(entityIn, entityYaw, partialTicks, poseStack, bufferIn, packedLightIn);
	}

	@Override
	public ResourceLocation getTextureLocation(ScattershotLv1Entity entity) {
		return texture;
	}
}
