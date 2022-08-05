// Made with Blockbench 3.9.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelAir_Defence extends EntityModel<Entity> {
	private final ModelRenderer bb_main;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;

	public ModelAir_Defence() {
		textureWidth = 64;
		textureHeight = 64;

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.setTextureOffset(30, 52).addBox(-8.0F, -1.0F, -8.0F, 16.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(32, 40).addBox(7.0F, -1.0F, -7.0F, 1.0F, 1.0F, 15.0F, 0.0F, false);
		bb_main.setTextureOffset(32, 52).addBox(-8.0F, -1.0F, 7.0F, 15.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(34, 39).addBox(-8.0F, -1.0F, -7.0F, 1.0F, 1.0F, 14.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 0).addBox(-8.0F, -9.0F, -0.5F, 16.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(16, 32).addBox(-3.0F, -16.0F, -2.5F, 7.0F, 14.0F, 7.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 0).addBox(0.0F, -18.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 24).addBox(-1.0F, -23.0F, -1.0F, 3.0F, 5.0F, 3.0F, 0.0F, false);
		bb_main.setTextureOffset(19, 1).addBox(0.0F, -26.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(23, 10).addBox(-2.0F, -24.0F, -2.0F, 5.0F, 1.0F, 5.0F, 0.0F, false);
		bb_main.setTextureOffset(1, 20).addBox(-1.0F, -25.0F, -1.0F, 3.0F, 1.0F, 3.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		bb_main.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.7418F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(0, 0).addBox(-7.0F, -6.0F, 6.0F, 1.0F, 11.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(0, 0).addBox(7.0F, -6.0F, 6.0F, 1.0F, 11.0F, 1.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		bb_main.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.7418F, 0.0F, 0.0F);
		cube_r2.setTextureOffset(0, 0).addBox(-8.0F, -6.0F, -7.0F, 1.0F, 11.0F, 1.0F, 0.0F, false);
		cube_r2.setTextureOffset(0, 0).addBox(7.0F, -6.0F, -7.0F, 1.0F, 11.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		bb_main.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
	}
}