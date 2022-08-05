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
public class Modelbmnew<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("clashofclansweapons", "modelbmnew"), "main");
	public final ModelPart leftarm;
	public final ModelPart rightarm;
	public final ModelPart rightleg;
	public final ModelPart leftleg;
	public final ModelPart bbmain;

	public Modelbmnew(ModelPart root) {
		this.leftarm = root.getChild("leftarm");
		this.rightarm = root.getChild("rightarm");
		this.rightleg = root.getChild("rightleg");
		this.leftleg = root.getChild("leftleg");
		this.bbmain = root.getChild("bbmain");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition leftarm = partdefinition.addOrReplaceChild("leftarm",
				CubeListBuilder.create().texOffs(32, 8).addBox(12.0F, -46.0F, -1.0F, 9.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(5, 42)
						.addBox(10.0F, -45.0F, -1.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(5, 42)
						.addBox(15.0F, -42.0F, -1.0F, 3.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(33, 28)
						.addBox(15.0F, -34.0F, -1.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(9, 42)
						.addBox(15.0F, -32.0F, -2.0F, 3.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(47, 11)
						.addBox(17.0F, -24.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(37, 8)
						.addBox(15.0F, -24.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition rightarm = partdefinition.addOrReplaceChild("rightarm",
				CubeListBuilder.create().texOffs(8, 44).addBox(-16.0F, -23.0F, -14.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 5)
						.addBox(-20.0F, -46.0F, -1.0F, 9.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(5, 42)
						.addBox(-11.0F, -45.0F, -1.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(8, 43)
						.addBox(-17.0F, -42.0F, -1.0F, 3.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(32, 16)
						.addBox(-17.0F, -34.0F, -1.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 44)
						.addBox(-17.0F, -32.0F, -2.0F, 3.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(33, 10)
						.addBox(-15.0F, -24.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 15)
						.addBox(-17.0F, -24.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 45)
						.addBox(-16.0F, -23.0F, -10.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition cube_r1 = rightarm.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(35, 11).addBox(-27.0F, 13.0F, -13.0F, 9.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5708F));
		PartDefinition rightleg = partdefinition.addOrReplaceChild("rightleg",
				CubeListBuilder.create().texOffs(32, 12).addBox(12.0F, -1.0F, -8.0F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(38, 8)
						.addBox(12.0F, -3.0F, -1.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 41)
						.addBox(12.0F, -21.0F, -2.0F, 3.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(44, 5)
						.addBox(12.0F, -13.0F, -1.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 40)
						.addBox(12.0F, -11.0F, -2.0F, 3.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition leftleg = partdefinition.addOrReplaceChild("leftleg",
				CubeListBuilder.create().texOffs(5, 43).addBox(-15.0F, -21.0F, -2.0F, 3.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(45, 14)
						.addBox(-15.0F, -13.0F, -1.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(2, 43)
						.addBox(-15.0F, -11.0F, -2.0F, 3.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(32, 12)
						.addBox(-15.0F, -1.0F, -8.0F, 3.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(47, 12)
						.addBox(-15.0F, -3.0F, -1.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition bbmain = partdefinition.addOrReplaceChild("bbmain",
				CubeListBuilder.create().texOffs(34, 9).addBox(-14.0F, -23.0F, -1.0F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(92, 0)
						.addBox(-8.0F, -44.0F, 6.0F, 17.0F, 20.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(39, 13)
						.addBox(9.0F, -23.0F, -1.0F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(78, 12)
						.addBox(-8.0F, -25.0F, -1.0F, 17.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(26, 1)
						.addBox(-8.0F, -23.0F, -2.0F, 17.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 105)
						.addBox(-9.0F, -24.0F, -9.0F, 19.0F, 1.0F, 17.0F, new CubeDeformation(0.0F)).texOffs(0, 105)
						.addBox(-9.0F, -46.0F, 7.0F, 19.0F, 22.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 110)
						.addBox(-9.0F, -41.0F, -9.0F, 19.0F, 17.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(96, 96)
						.addBox(-9.0F, -41.0F, -8.0F, 1.0F, 17.0F, 15.0F, new CubeDeformation(0.0F)).texOffs(96, 96)
						.addBox(9.0F, -41.0F, -8.0F, 1.0F, 17.0F, 15.0F, new CubeDeformation(0.0F)).texOffs(9, 41)
						.addBox(9.0F, -45.0F, -1.0F, 1.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(12, 41)
						.addBox(-9.0F, -45.0F, -1.0F, 1.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue,
			float alpha) {
		leftarm.render(poseStack, buffer, packedLight, packedOverlay);
		rightarm.render(poseStack, buffer, packedLight, packedOverlay);
		rightleg.render(poseStack, buffer, packedLight, packedOverlay);
		leftleg.render(poseStack, buffer, packedLight, packedOverlay);
		bbmain.render(poseStack, buffer, packedLight, packedOverlay);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
