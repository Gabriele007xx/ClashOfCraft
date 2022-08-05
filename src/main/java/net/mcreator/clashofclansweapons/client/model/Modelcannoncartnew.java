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
public class Modelcannoncartnew<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("clashofclansweapons", "modelcannoncartnew"),
			"main");
	public final ModelPart bb_main;

	public Modelcannoncartnew(ModelPart root) {
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition cube_r1 = bb_main.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 0).addBox(9.0F, -17.0F, -7.0F, 3.0F, 1.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(9.0F, -8.0F, -7.0F, 3.0F, 1.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(9.0F, -16.0F, 6.0F, 3.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(9.0F, -16.0F, -7.0F, 3.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 27)
						.addBox(-9.0F, -16.0F, -6.0F, 18.0F, 8.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(72, 0)
						.addBox(-6.0F, -8.0F, -8.0F, 12.0F, 3.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-8.0F, -5.0F, -8.0F, 16.0F, 1.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(88, 0)
						.addBox(8.0F, -5.0F, -8.0F, 4.0F, 1.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-10.0F, -3.0F, 8.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(88, 0)
						.addBox(-12.0F, -5.0F, -8.0F, 4.0F, 1.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(79, 23)
						.addBox(-10.0F, -3.0F, 8.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(79, 15)
						.addBox(7.0F, -3.0F, 8.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(97, 6)
						.addBox(7.0F, -3.0F, -9.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(83, 17)
						.addBox(-10.0F, -3.0F, -9.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 45).addBox(-12.0F, -4.0F, -8.0F, 24.0F,
								3.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue,
			float alpha) {
		bb_main.render(poseStack, buffer, packedLight, packedOverlay);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
