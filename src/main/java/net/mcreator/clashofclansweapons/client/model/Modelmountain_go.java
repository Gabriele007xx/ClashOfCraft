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

// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelmountain_go<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("clashofclansweapons", "modelmountain_go"),
			"main");
	public final ModelPart bb_main;

	public Modelmountain_go(ModelPart root) {
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(301, 258).addBox(-39.0F, -4.0F, -14.0F, 18.0F, 4.0F, 26.0F, new CubeDeformation(0.0F))
						.texOffs(0, 171).addBox(-26.0F, -4.0F, -22.0F, 5.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(116, 159)
						.addBox(-32.0F, -4.0F, -22.0F, 5.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(90, 159)
						.addBox(-38.0F, -4.0F, -22.0F, 5.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(298, 218)
						.addBox(22.0F, -4.0F, -14.0F, 18.0F, 4.0F, 26.0F, new CubeDeformation(0.0F)).texOffs(0, 159)
						.addBox(35.0F, -4.0F, -22.0F, 5.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(56, 72)
						.addBox(29.0F, -4.0F, -22.0F, 5.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(48, 0)
						.addBox(23.0F, -4.0F, -22.0F, 5.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(290, 305)
						.addBox(-39.0F, -30.0F, -11.0F, 18.0F, 26.0F, 23.0F, new CubeDeformation(0.0F)).texOffs(0, 289)
						.addBox(22.0F, -30.0F, -11.0F, 18.0F, 26.0F, 23.0F, new CubeDeformation(0.0F)).texOffs(246, 331)
						.addBox(-35.0F, -39.0F, -11.0F, 10.0F, 9.0F, 23.0F, new CubeDeformation(0.0F)).texOffs(215, 284)
						.addBox(15.0F, -51.0F, -11.0F, 26.0F, 21.0F, 23.0F, new CubeDeformation(0.0F)).texOffs(164, 328)
						.addBox(20.0F, -60.0F, -11.0F, 18.0F, 9.0F, 23.0F, new CubeDeformation(0.0F)).texOffs(82, 313)
						.addBox(-39.0F, -61.0F, -11.0F, 18.0F, 22.0F, 23.0F, new CubeDeformation(0.0F)).texOffs(0, 252)
						.addBox(-21.0F, -71.0F, -11.0F, 41.0F, 14.0F, 23.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-41.0F, -144.0F, -44.0F, 92.0F, 73.0F, 86.0F, new CubeDeformation(0.0F)).texOffs(236, 159)
						.addBox(-73.0F, -140.0F, -11.0F, 32.0F, 36.0F, 23.0F, new CubeDeformation(0.0F)).texOffs(105, 266)
						.addBox(51.0F, -140.0F, -11.0F, 32.0F, 24.0F, 23.0F, new CubeDeformation(0.0F)).texOffs(334, 34)
						.addBox(-89.0F, -122.0F, -10.0F, 16.0F, 18.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(334, 0)
						.addBox(83.0F, -134.0F, -10.0F, 16.0F, 18.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(118, 159)
						.addBox(-120.0F, -111.0F, -15.0F, 31.0F, 65.0F, 28.0F, new CubeDeformation(0.0F)).texOffs(0, 159)
						.addBox(91.0F, -116.0F, -15.0F, 31.0F, 65.0F, 28.0F, new CubeDeformation(0.0F)).texOffs(207, 223)
						.addBox(-10.0F, -135.0F, -73.0F, 31.0F, 32.0F, 29.0F, new CubeDeformation(0.0F)).texOffs(270, 0)
						.addBox(32.0F, -208.0F, -37.0F, 16.0F, 64.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-15.0F, -208.0F, -6.0F, 16.0F, 64.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(112, 358)
						.addBox(-15.0F, -224.0F, -6.0F, 16.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(48, 358)
						.addBox(-31.0F, -208.0F, -6.0F, 16.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(356, 338)
						.addBox(1.0F, -208.0F, -6.0F, 16.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(356, 100)
						.addBox(-15.0F, -208.0F, -22.0F, 16.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(356, 68)
						.addBox(-15.0F, -208.0F, 10.0F, 16.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(296, 354)
						.addBox(30.0F, -208.0F, -54.0F, 16.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(349, 288)
						.addBox(30.0F, -224.0F, -38.0F, 16.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(346, 175)
						.addBox(46.0F, -209.0F, -38.0F, 16.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(340, 143)
						.addBox(14.0F, -210.0F, -38.0F, 16.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 338)
						.addBox(32.0F, -208.0F, -22.0F, 16.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 512, 512);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
