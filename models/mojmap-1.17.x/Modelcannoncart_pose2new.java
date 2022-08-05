// Made with Blockbench 4.1.3
// Exported for Minecraft version 1.17 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelcannoncart_pose2new<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "cannoncart_pose2new"), "main");
	private final ModelPart bb_main;

	public Modelcannoncart_pose2new(ModelPart root) {
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(84, 15)
						.addBox(-5.0F, -5.0F, 6.0F, 8.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(67, 15)
						.addBox(-5.0F, -5.0F, -8.0F, 8.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = bb_main.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(110, 34)
						.addBox(7.0F, -3.0F, 1.0F, 2.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(110, 34)
						.addBox(7.0F, -3.0F, -6.0F, 2.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2618F));

		PartDefinition cube_r2 = bb_main.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(85, 34).addBox(-18.0F, -9.0F, 0.0F, 12.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.6109F, -0.4363F));

		PartDefinition cube_r3 = bb_main.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(85, 34).addBox(-17.0F, -8.0F, -3.0F, 12.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5672F, -0.3927F));

		PartDefinition cube_r4 = bb_main.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(85, 34)
						.addBox(-17.0F, -8.0F, -3.0F, 12.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(85, 34)
						.addBox(-17.0F, -8.0F, 0.0F, 12.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition cube_r5 = bb_main.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(9.0F, -17.0F, -7.0F, 3.0F, 1.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(9.0F, -8.0F, -7.0F, 3.0F, 1.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(9.0F, -16.0F, 6.0F, 3.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(9.0F, -16.0F, -7.0F, 3.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 27)
						.addBox(-9.0F, -16.0F, -6.0F, 18.0F, 8.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(72, 0)
						.addBox(-6.0F, -8.0F, -8.0F, 12.0F, 3.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		bb_main.render(poseStack, buffer, packedLight, packedOverlay);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}