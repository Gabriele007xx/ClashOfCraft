// Made with Blockbench 4.1.3
// Exported for Minecraft version 1.17 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelxbowlv1new<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "xbowlv1new"), "main");
	private final ModelPart bb_main;

	public Modelxbowlv1new(ModelPart root) {
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(0, 33)
						.addBox(-10.0F, -2.0F, -10.0F, 20.0F, 2.0F, 20.0F, new CubeDeformation(0.0F)).texOffs(35, 85)
						.addBox(-10.0F, -2.0F, 10.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 92)
						.addBox(-10.0F, -2.0F, -11.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(31, 83)
						.addBox(7.0F, -2.0F, -11.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 86)
						.addBox(7.0F, -2.0F, 10.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 88)
						.addBox(-11.0F, -2.0F, -11.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(28, 86)
						.addBox(10.0F, -2.0F, 8.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(30, 80)
						.addBox(10.0F, -2.0F, -11.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(27, 94)
						.addBox(-11.0F, -2.0F, 8.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(26, 82)
						.addBox(-1.0F, -13.0F, -10.0F, 3.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-8.0F, -13.0F, -11.0F, 17.0F, 0.0F, 17.0F, new CubeDeformation(0.0F)).texOffs(80, 81)
						.addBox(-1.0F, -5.0F, -10.0F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(97, 33)
						.addBox(2.0F, -5.0F, -10.0F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(115, 123)
						.addBox(-1.0F, -15.0F, 0.0F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
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