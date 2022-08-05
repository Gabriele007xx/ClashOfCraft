// Made with Blockbench 4.1.3
// Exported for Minecraft version 1.17 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelAir_Defencenew<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "air_defencenew"), "main");
	private final ModelPart bb_main;

	public ModelAir_Defencenew(ModelPart root) {
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(30, 52)
						.addBox(-8.0F, -1.0F, -8.0F, 16.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 40)
						.addBox(7.0F, -1.0F, -7.0F, 1.0F, 1.0F, 15.0F, new CubeDeformation(0.0F)).texOffs(32, 52)
						.addBox(-8.0F, -1.0F, 7.0F, 15.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(34, 39)
						.addBox(-8.0F, -1.0F, -7.0F, 1.0F, 1.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-8.0F, -9.0F, -0.5F, 16.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 32)
						.addBox(-3.0F, -16.0F, -2.5F, 7.0F, 14.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(0.0F, -18.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 24)
						.addBox(-1.0F, -23.0F, -1.0F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(19, 1)
						.addBox(0.0F, -26.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(23, 10)
						.addBox(-2.0F, -24.0F, -2.0F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(1, 20)
						.addBox(-1.0F, -25.0F, -1.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = bb_main.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-7.0F, -6.0F, 6.0F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(7.0F, -6.0F, 6.0F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r2 = bb_main.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-8.0F, -6.0F, -7.0F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(7.0F, -6.0F, -7.0F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.7418F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
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