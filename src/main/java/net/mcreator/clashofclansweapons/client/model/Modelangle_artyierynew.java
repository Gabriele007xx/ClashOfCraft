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
public class Modelangle_artyierynew<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("clashofclansweapons", "modelangle_artyierynew"), "main");
	public final ModelPart bb_main;

	public Modelangle_artyierynew(ModelPart root) {
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(0, 0).addBox(-24.0F, -8.0F, -8.0F, 32.0F, 8.0F, 32.0F, new CubeDeformation(0.0F)).texOffs(12, 49)
						.addBox(5.0F, -8.0F, -9.0F, 3.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(2, 41)
						.addBox(5.0F, -8.0F, 24.0F, 3.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 46)
						.addBox(5.0F, -1.0F, -12.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(3, 52)
						.addBox(5.0F, -1.0F, 25.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(5, 46)
						.addBox(8.0F, -8.0F, -8.0F, 1.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(4, 46)
						.addBox(9.0F, -1.0F, -8.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(2, 56)
						.addBox(9.0F, -1.0F, 21.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(1, 41)
						.addBox(8.0F, -8.0F, 21.0F, 1.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 42)
						.addBox(-25.0F, -8.0F, 21.0F, 1.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(2, 44)
						.addBox(-24.0F, -1.0F, 25.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(2, 45)
						.addBox(-24.0F, -8.0F, 24.0F, 3.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 43)
						.addBox(-28.0F, -1.0F, 21.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 44)
						.addBox(-28.0F, -1.0F, -8.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 48)
						.addBox(-25.0F, -8.0F, -8.0F, 1.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(7, 50)
						.addBox(-24.0F, -8.0F, -9.0F, 3.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(1, 50)
						.addBox(-24.0F, -1.0F, -12.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(4, 50)
						.addBox(-9.0F, -8.0F, -9.0F, 2.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(1, 44)
						.addBox(-9.0F, -8.0F, 24.0F, 2.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(3, 42)
						.addBox(8.0F, -8.0F, 7.0F, 1.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 48)
						.addBox(-25.0F, -8.0F, 7.0F, 1.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 105)
						.addBox(-17.0F, -24.0F, 1.0F, 12.0F, 16.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(0, 133)
						.addBox(-5.0F, -17.0F, 2.0F, 14.0F, 8.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(18, 94)
						.addBox(9.0F, -14.0F, 5.0F, 6.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(14, 92)
						.addBox(12.0F, -10.0F, 5.0F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition cube_r1 = bb_main.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(41, 5).addBox(-5.0F, -22.0F, 15.0F, 2.0F, 4.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(48, 5)
						.addBox(-5.0F, -17.0F, 15.0F, 2.0F, 4.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(46, 6).addBox(-5.0F, -12.0F, 15.0F, 2.0F,
								4.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3491F, 0.0F));
		PartDefinition cube_r2 = bb_main.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(40, 12).addBox(-10.0F, -22.0F, -14.0F, 4.0F, 4.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(40, 8)
						.addBox(-10.0F, -17.0F, -14.0F, 4.0F, 4.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(42, 6).addBox(-8.0F, -12.0F, -14.0F,
								2.0F, 4.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3491F, 0.0F));
		return LayerDefinition.create(meshdefinition, 512, 512);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue,
			float alpha) {
		bb_main.render(poseStack, buffer, packedLight, packedOverlay);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
