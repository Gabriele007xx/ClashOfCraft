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

// Made with Blockbench 4.1.5
// Exported for Minecraft version 1.17 with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelsiegebarracks<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("clashofclansweapons", "modelsiegebarracks"),
			"main");
	public final ModelPart bb_main;

	public Modelsiegebarracks(ModelPart root) {
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(0, 0).addBox(-24.0F, -49.0F, -26.0F, 48.0F, 48.0F, 48.0F, new CubeDeformation(0.0F)).texOffs(0, 148)
						.addBox(-25.0F, -4.0F, -26.0F, 1.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(144, 34)
						.addBox(24.0F, -4.0F, -26.0F, 1.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(144, 23)
						.addBox(24.0F, -4.0F, 14.0F, 1.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(144, 12)
						.addBox(-25.0F, -4.0F, 14.0F, 1.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(96, 150)
						.addBox(-25.0F, -4.0F, -27.0F, 8.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(10, 148)
						.addBox(-25.0F, -4.0F, 22.0F, 8.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(96, 122)
						.addBox(17.0F, -4.0F, 22.0F, 8.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 122)
						.addBox(17.0F, -4.0F, -27.0F, 8.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(144, 0)
						.addBox(-26.0F, -1.0F, 13.0F, 10.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(0, 24)
						.addBox(16.0F, -1.0F, -28.0F, 10.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-26.0F, -1.0F, -28.0F, 10.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(96, 141)
						.addBox(-24.0F, -54.0F, 18.0F, 10.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 139)
						.addBox(14.0F, -54.0F, 18.0F, 10.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(96, 132)
						.addBox(14.0F, -54.0F, -26.0F, 10.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 130)
						.addBox(-24.0F, -54.0F, -26.0F, 10.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(96, 109)
						.addBox(-24.0F, -54.0F, 10.0F, 4.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 109)
						.addBox(-24.0F, -54.0F, -22.0F, 4.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(96, 96)
						.addBox(20.0F, -54.0F, -22.0F, 4.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 96)
						.addBox(20.0F, -54.0F, 10.0F, 4.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 24)
						.addBox(16.0F, -1.0F, 13.0F, 10.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition cube_r1 = bb_main.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 96).addBox(-16.0F, -28.0F, 27.0F, 32.0F, 2.0F, 32.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -15.0F, -0.48F, 0.0F, 0.0F));
		PartDefinition cube_r2 = bb_main.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(96, 98).addBox(-16.0F, -16.0F, -36.0F, 32.0F, 2.0F, 32.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -15.0F, 0.48F, 0.0F, 0.0F));
		PartDefinition cube_r3 = bb_main.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(0, 130).addBox(16.0F, -21.0F, -3.0F, 32.0F, 2.0F, 32.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -15.0F, 0.0F, 0.0F, 0.48F));
		PartDefinition cube_r4 = bb_main.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(96, 132).addBox(-47.0F, -21.0F, -3.0F, 32.0F, 2.0F, 32.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -15.0F, 0.0F, 0.0F, -0.48F));
		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue,
			float alpha) {
		bb_main.render(poseStack, buffer, packedLight, packedOverlay);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
