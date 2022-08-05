// Made with Blockbench 4.3.1
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelflyingf<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "flyingf"), "main");
	private final ModelPart bb_main;

	public Modelflyingf(ModelPart root) {
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-17.0F, -20.0F, -30.0F, 32.0F, 20.0F, 60.0F, new CubeDeformation(0.0F)).texOffs(68, 106)
						.addBox(-9.0F, -44.0F, -23.0F, 18.0F, 24.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 80)
						.addBox(-14.0F, -33.0F, -4.0F, 25.0F, 13.0F, 17.0F, new CubeDeformation(0.0F)).texOffs(84, 80)
						.addBox(-14.0F, -29.0F, 13.0F, 25.0F, 9.0F, 17.0F, new CubeDeformation(0.0F)).texOffs(67, 80)
						.addBox(-4.0F, -38.0F, 21.0F, 5.0F, 9.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(64, 110)
						.addBox(-3.0F, -48.0F, -23.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(48, 110)
						.addBox(5.0F, -48.0F, -23.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 110)
						.addBox(5.0F, -48.0F, -17.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(16, 110)
						.addBox(5.0F, -48.0F, -11.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 110)
						.addBox(-3.0F, -48.0F, -11.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 88)
						.addBox(-9.0F, -48.0F, -11.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 80)
						.addBox(-9.0F, -48.0F, -17.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(42, 52)
						.addBox(-9.0F, -48.0F, -23.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 28)
						.addBox(15.0F, -28.0F, -4.0F, 23.0F, 28.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-40.0F, -28.0F, -4.0F, 23.0F, 28.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(140, 0)
						.addBox(-4.0F, -37.0F, -32.0F, 6.0F, 6.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 256, 256);
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