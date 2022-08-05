// Made with Blockbench 3.9.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelxbowlv1 extends EntityModel<Entity> {
	private final ModelRenderer bb_main;

	public Modelxbowlv1() {
		textureWidth = 128;
		textureHeight = 128;

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.setTextureOffset(0, 33).addBox(-10.0F, -2.0F, -10.0F, 20.0F, 2.0F, 20.0F, 0.0F, false);
		bb_main.setTextureOffset(35, 85).addBox(-10.0F, -2.0F, 10.0F, 3.0F, 2.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(33, 92).addBox(-10.0F, -2.0F, -11.0F, 3.0F, 2.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(31, 83).addBox(7.0F, -2.0F, -11.0F, 3.0F, 2.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(30, 86).addBox(7.0F, -2.0F, 10.0F, 3.0F, 2.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(36, 88).addBox(-11.0F, -2.0F, -11.0F, 1.0F, 2.0F, 3.0F, 0.0F, false);
		bb_main.setTextureOffset(28, 86).addBox(10.0F, -2.0F, 8.0F, 1.0F, 2.0F, 3.0F, 0.0F, false);
		bb_main.setTextureOffset(30, 80).addBox(10.0F, -2.0F, -11.0F, 1.0F, 2.0F, 3.0F, 0.0F, false);
		bb_main.setTextureOffset(27, 94).addBox(-11.0F, -2.0F, 8.0F, 1.0F, 2.0F, 3.0F, 0.0F, false);
		bb_main.setTextureOffset(26, 82).addBox(-1.0F, -13.0F, -10.0F, 3.0F, 11.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 0).addBox(-8.0F, -13.0F, -11.0F, 17.0F, 0.0F, 17.0F, 0.0F, false);
		bb_main.setTextureOffset(80, 81).addBox(-1.0F, -5.0F, -10.0F, 0.0F, 3.0F, 3.0F, 0.0F, false);
		bb_main.setTextureOffset(97, 33).addBox(2.0F, -5.0F, -10.0F, 0.0F, 3.0F, 3.0F, 0.0F, false);
		bb_main.setTextureOffset(115, 123).addBox(-1.0F, -15.0F, 0.0F, 3.0F, 2.0F, 4.0F, 0.0F, false);
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