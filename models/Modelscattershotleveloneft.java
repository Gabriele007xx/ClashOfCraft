// Made with Blockbench 4.0.4
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelscattershotleveloneft extends EntityModel<Entity> {
	private final ModelRenderer bb_main;

	public Modelscattershotleveloneft() {
		textureWidth = 128;
		textureHeight = 128;

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.setTextureOffset(0, 50).addBox(-18.0F, -4.0F, -17.0F, 36.0F, 2.0F, 36.0F, 0.0F, false);
		bb_main.setTextureOffset(28, 118).addBox(-18.0F, -5.0F, -19.0F, 6.0F, 5.0F, 2.0F, 0.0F, false);
		bb_main.setTextureOffset(24, 100).addBox(18.0F, -5.0F, -20.0F, 2.0F, 5.0F, 8.0F, 0.0F, false);
		bb_main.setTextureOffset(25, 108).addBox(-20.0F, -5.0F, -19.0F, 2.0F, 5.0F, 8.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 107).addBox(-12.0F, -5.0F, -11.0F, 20.0F, 1.0F, 18.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 97).addBox(-12.0F, -8.0F, -12.0F, 6.0F, 3.0F, 28.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 97).addBox(2.0F, -8.0F, -12.0F, 6.0F, 3.0F, 28.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 0).addBox(-6.0F, -8.0F, -6.0F, 8.0F, 3.0F, 22.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 0).addBox(-8.0F, -8.0F, 16.0F, 12.0F, 1.0F, 16.0F, 0.0F, false);
		bb_main.setTextureOffset(23, 52).addBox(-8.0F, -9.0F, 30.0F, 12.0F, 1.0F, 2.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 0).addBox(-8.0F, -9.0F, 16.0F, 12.0F, 1.0F, 2.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 0).addBox(2.0F, -9.0F, 18.0F, 2.0F, 1.0F, 12.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 0).addBox(-8.0F, -9.0F, 18.0F, 2.0F, 1.0F, 12.0F, 0.0F, false);
		bb_main.setTextureOffset(107, 7).addBox(-4.0F, -12.0F, 21.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		bb_main.setTextureOffset(24, 100).addBox(18.0F, -5.0F, 13.0F, 2.0F, 5.0F, 8.0F, 0.0F, false);
		bb_main.setTextureOffset(24, 100).addBox(-20.0F, -5.0F, 13.0F, 2.0F, 5.0F, 8.0F, 0.0F, false);
		bb_main.setTextureOffset(28, 118).addBox(-18.0F, -5.0F, 19.0F, 6.0F, 5.0F, 2.0F, 0.0F, false);
		bb_main.setTextureOffset(28, 118).addBox(12.0F, -5.0F, 19.0F, 6.0F, 5.0F, 2.0F, 0.0F, false);
		bb_main.setTextureOffset(28, 118).addBox(12.0F, -5.0F, -20.0F, 6.0F, 5.0F, 2.0F, 0.0F, false);
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