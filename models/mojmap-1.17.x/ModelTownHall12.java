// Made with Blockbench 4.1.5
// Exported for Minecraft version 1.17 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelTownHall12<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "townhall12"), "main");
	private final ModelPart bb_main;

	public ModelTownHall12(ModelPart root) {
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(225, 242)
						.addBox(-45.0F, -8.0F, -39.0F, 5.0F, 8.0F, 20.0F, new CubeDeformation(0.0F)).texOffs(38, 73)
						.addBox(-45.0F, -8.0F, -42.0F, 16.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-40.0F, -50.0F, -39.0F, 81.0F, 50.0F, 86.0F, new CubeDeformation(0.0F)).texOffs(0, 34)
						.addBox(-21.0F, -7.0F, -66.0F, 8.0F, 7.0F, 27.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(12.0F, -7.0F, -66.0F, 8.0F, 7.0F, 27.0F, new CubeDeformation(0.0F)).texOffs(248, 46)
						.addBox(-13.0F, -3.0F, -62.0F, 25.0F, 3.0F, 23.0F, new CubeDeformation(0.0F)).texOffs(0, 68)
						.addBox(-13.0F, -1.0F, -66.0F, 25.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 136)
						.addBox(-43.0F, -63.0F, -42.0F, 88.0F, 13.0F, 93.0F, new CubeDeformation(0.0F)).texOffs(0, 242)
						.addBox(41.0F, -8.0F, -42.0F, 5.0F, 8.0F, 20.0F, new CubeDeformation(0.0F)).texOffs(0, 73)
						.addBox(25.0F, -8.0F, -42.0F, 16.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(232, 262)
						.addBox(-31.0F, -76.0F, -36.0F, 66.0F, 13.0F, 76.0F, new CubeDeformation(0.0F)).texOffs(0, 242)
						.addBox(-34.0F, -89.0F, -39.0F, 71.0F, 13.0F, 83.0F, new CubeDeformation(0.0F)).texOffs(50, 136)
						.addBox(-4.0F, -121.0F, 0.0F, 10.0F, 32.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(43, 0)
						.addBox(-3.0F, -131.0F, 1.0F, 8.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 136)
						.addBox(-45.0F, -43.0F, -5.0F, 5.0F, 20.0F, 20.0F, new CubeDeformation(0.0F)).texOffs(43, 45)
						.addBox(-45.0F, -8.0F, 47.0F, 16.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(30, 184)
						.addBox(-45.0F, -8.0F, 27.0F, 5.0F, 8.0F, 20.0F, new CubeDeformation(0.0F)).texOffs(43, 34)
						.addBox(26.0F, -8.0F, 47.0F, 16.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 176)
						.addBox(41.0F, -8.0F, 30.0F, 5.0F, 8.0F, 20.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = bb_main.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(248, 0).addBox(67.0F, -59.0F, 17.0F, 10.0F, 5.0F, 41.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, 0.0F, -31.0F, 0.0F, 0.0F, -0.7854F));

		PartDefinition cube_r2 = bb_main.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(269, 136).addBox(-80.0F, -58.0F, 17.0F, 10.0F, 5.0F, 41.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, 0.0F, -31.0F, 0.0F, 0.0F, 0.7854F));

		return LayerDefinition.create(meshdefinition, 1024, 1024);
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