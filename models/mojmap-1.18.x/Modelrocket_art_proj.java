// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelrocket_art_proj<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "rocket_art_proj"), "main");
	private final ModelPart bb_main;

	public Modelrocket_art_proj(ModelPart root) {
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-7.0F, -11.0F, -11.0F, 13.0F, 11.0F, 23.0F, new CubeDeformation(0.0F)).texOffs(49, 0)
						.addBox(-6.0F, -10.0F, -13.0F, 11.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(25, 36)
						.addBox(-14.0F, -6.0F, -5.0F, 7.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(0, 34)
						.addBox(6.0F, -6.0F, -5.0F, 7.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(0, 47)
						.addBox(-1.0F, -18.0F, -6.0F, 2.0F, 7.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
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