package net.mcreator.clashofclansweapons.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.1.3
// Exported for Minecraft version 1.17 with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelbuilderhutlv2new<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("clashofclansweapons", "modelbuilderhutlv_2new"), "main");
	public final ModelPart bone;
	public final ModelPart bb_main;

	public Modelbuilderhutlv2new(ModelPart root) {
		this.bone = root.getChild("bone");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bone = partdefinition.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(0, 11).addBox(-4.0F, -11.0F, 1.0F, 1.0F, 11.0F, 19.0F, new CubeDeformation(0.0F)).texOffs(0, 11)
						.addBox(-27.0F, -11.0F, 20.0F, 23.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 16)
						.addBox(-28.0F, -11.0F, 1.0F, 1.0F, 11.0F, 19.0F, new CubeDeformation(0.0F)).texOffs(1, 75)
						.addBox(-28.0F, -30.0F, 20.0F, 1.0F, 30.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(13, 75)
						.addBox(-28.0F, -30.0F, 0.0F, 1.0F, 30.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 73)
						.addBox(-4.0F, -30.0F, 0.0F, 1.0F, 30.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 72)
						.addBox(-4.0F, -30.0F, 20.0F, 1.0F, 30.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 16)
						.addBox(-27.0F, -30.0F, 20.0F, 23.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 16)
						.addBox(-4.0F, -30.0F, 1.0F, 1.0F, 19.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 16)
						.addBox(-28.0F, -30.0F, 1.0F, 1.0F, 19.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 16)
						.addBox(-4.0F, -30.0F, 13.0F, 1.0F, 19.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 16)
						.addBox(-28.0F, -30.0F, 13.0F, 1.0F, 19.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 75)
						.addBox(-29.0F, -45.0F, -1.0F, 27.0F, 1.0F, 23.0F, new CubeDeformation(0.0F)).texOffs(36, 10)
						.addBox(-28.0F, -31.0F, 0.0F, 25.0F, 1.0F, 21.0F, new CubeDeformation(0.0F)),
				PartPose.offset(15.0F, 24.0F, -11.0F));
		PartDefinition cube_r1 = bone.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 5).addBox(-19.0F, -46.0F, 3.0F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(9, 74)
						.addBox(-16.0F, -46.0F, 5.0F, 9.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));
		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(27, 20).addBox(-4.0F, -13.0F, -10.0F, 3.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 128)
						.addBox(-11.0F, -13.0F, -11.0F, 17.0F, 0.0F, 17.0F, new CubeDeformation(0.0F)).texOffs(80, 209)
						.addBox(-4.0F, -5.0F, -10.0F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(80, 209)
						.addBox(-1.0F, -5.0F, -10.0F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(114, 250)
						.addBox(-4.0F, -15.0F, 0.0F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(3.0F, -5.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 256);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue,
			float alpha) {
		bone.render(poseStack, buffer, packedLight, packedOverlay);
		bb_main.render(poseStack, buffer, packedLight, packedOverlay);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
