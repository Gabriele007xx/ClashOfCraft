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
public class Modelrocketartilyery<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("clashofclansweapons", "modelrocketartilyery"), "main");
	public final ModelPart bb_main;

	public Modelrocketartilyery(ModelPart root) {
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(0, 0).addBox(-16.0F, -1.0F, -16.0F, 32.0F, 1.0F, 32.0F, new CubeDeformation(0.0F)).texOffs(0, 33)
						.addBox(-14.0F, -6.0F, -14.0F, 28.0F, 5.0F, 28.0F, new CubeDeformation(0.0F)).texOffs(96, 0)
						.addBox(-11.0F, -11.0F, -13.0F, 5.0F, 5.0F, 24.0F, new CubeDeformation(0.0F)).texOffs(88, 42)
						.addBox(7.0F, -11.0F, -13.0F, 5.0F, 5.0F, 24.0F, new CubeDeformation(0.0F)).texOffs(15, 0)
						.addBox(-2.0F, -14.0F, -9.0F, 5.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition cube_r1 = bb_main.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -31.0F, -15.0F, 2.0F, 7.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(58, 66)
						.addBox(5.0F, -21.0F, -13.0F, 7.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(0, 103)
						.addBox(-15.0F, -21.0F, -13.0F, 7.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(0, 18)
						.addBox(-7.0F, -23.0F, -25.0F, 11.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(67, 80)
						.addBox(-8.0F, -24.0F, -23.0F, 13.0F, 11.0F, 23.0F, new CubeDeformation(0.0F)).texOffs(0, 66).addBox(-8.0F, -13.0F, -24.0F,
								13.0F, 5.0F, 32.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, 0.0F, -3.0F, -0.6109F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
