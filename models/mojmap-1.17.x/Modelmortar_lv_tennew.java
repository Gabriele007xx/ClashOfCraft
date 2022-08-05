// Made with Blockbench 4.1.3
// Exported for Minecraft version 1.17 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelmortar_lv_tennew<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "mortar_lv_tennew"), "main");
	private final ModelPart bb_main;

	public Modelmortar_lv_tennew(ModelPart root) {
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(41, 4)
						.addBox(-8.0F, -5.0F, -13.0F, 16.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 56)
						.addBox(-8.0F, -8.0F, -12.0F, 16.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(41, 4)
						.addBox(-8.0F, -5.0F, -9.0F, 16.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(41, 4)
						.addBox(-8.0F, -5.0F, 8.0F, 16.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 56)
						.addBox(-8.0F, -8.0F, 9.0F, 16.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(41, 4)
						.addBox(-8.0F, -5.0F, 12.0F, 16.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(64, 0)
						.addBox(-8.0F, -2.0F, -8.0F, 16.0F, 1.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-7.0F, -22.0F, -6.0F, 1.0F, 20.0F, 13.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(7.0F, -22.0F, -6.0F, 1.0F, 20.0F, 13.0F, new CubeDeformation(0.0F)).texOffs(0, 33)
						.addBox(-6.0F, -22.0F, -6.0F, 13.0F, 20.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 103)
						.addBox(-6.0F, -9.0F, 9.0F, 12.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(30, 103)
						.addBox(-6.0F, -9.0F, -12.0F, 12.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 33)
						.addBox(-6.0F, -22.0F, 6.0F, 13.0F, 20.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(124, 0)
						.addBox(8.0F, -6.0F, 10.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(124, 0)
						.addBox(-9.0F, -6.0F, 10.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(116, 0)
						.addBox(-2.0F, -10.0F, 9.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(124, 0)
						.addBox(-1.0F, -11.0F, 10.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(45, 52)
						.addBox(-2.0F, -10.0F, -12.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(50, 46)
						.addBox(-1.0F, -11.0F, -11.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 31)
						.addBox(-9.0F, -6.0F, -11.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(41, 21)
						.addBox(8.0F, -6.0F, -11.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(27, 1)
						.addBox(8.0F, -1.0F, 8.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(43, 14)
						.addBox(8.0F, -1.0F, 12.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(85, 46)
						.addBox(9.0F, -1.0F, 9.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(28, 9)
						.addBox(9.0F, -1.0F, -12.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(28, 1)
						.addBox(8.0F, -1.0F, -13.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 4)
						.addBox(8.0F, -1.0F, -9.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(120, 0)
						.addBox(-2.0F, -4.0F, 13.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 23)
						.addBox(-1.0F, -3.0F, -15.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(49, 34)
						.addBox(-2.0F, -4.0F, -14.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 23)
						.addBox(-1.0F, -3.0F, 14.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
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