// Made with Blockbench 4.2.3
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelxbowlv2<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "xbowlv2"), "main");
	private final ModelPart bb_main;

	public Modelxbowlv2(ModelPart root) {
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-14.0F, -4.0F, -14.0F, 28.0F, 4.0F, 28.0F, new CubeDeformation(0.0F)).texOffs(15, 35)
						.addBox(-8.0F, -6.0F, -8.0F, 16.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(99, 94)
						.addBox(-15.0F, -5.0F, 12.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(99, 94)
						.addBox(-16.0F, -5.0F, -16.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(99, 94)
						.addBox(12.0F, -5.0F, 11.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(99, 94)
						.addBox(12.0F, -5.0F, -16.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 55)
						.addBox(-2.0F, -18.0F, -8.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 75)
						.addBox(-3.0F, -24.0F, -10.0F, 6.0F, 6.0F, 15.0F, new CubeDeformation(0.0F)).texOffs(100, 68)
						.addBox(-11.0F, -24.0F, -10.0F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(100, 68)
						.addBox(3.0F, -24.0F, -10.0F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(26, 55)
						.addBox(-3.0F, -26.0F, -9.0F, 1.0F, 2.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(26, 55)
						.addBox(2.0F, -26.0F, -9.0F, 1.0F, 2.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(96, 67)
						.addBox(-3.0F, -28.0F, -1.0F, 6.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = bb_main.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 98).addBox(4.0F, -24.0F, -10.0F, 1.0F, 1.0F, 14.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -1.0F, 0.0F, -0.4363F, 0.0F));

		PartDefinition cube_r2 = bb_main
				.addOrReplaceChild("cube_r2",
						CubeListBuilder.create().texOffs(0, 98).addBox(-5.0F, -24.0F, -10.0F, 1.0F, 1.0F, 14.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, -1.0F, 0.0F, 0.4363F, 0.0F));

		PartDefinition cube_r3 = bb_main.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(100, 68).addBox(1.0F, -24.0F, -14.0F, 8.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -1.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition cube_r4 = bb_main
				.addOrReplaceChild("cube_r4",
						CubeListBuilder.create().texOffs(100, 68).addBox(-9.0F, -24.0F, -14.0F, 8.0F, 2.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, -1.0F, 0.0F, 0.7854F, 0.0F));

		return LayerDefinition.create(meshdefinition, 256, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}