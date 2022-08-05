// Made with Blockbench 3.9.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelangle_artyiery extends EntityModel<Entity> {
	private final ModelRenderer bb_main;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;

	public Modelangle_artyiery() {
		textureWidth = 512;
		textureHeight = 512;

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.setTextureOffset(0, 0).addBox(-24.0F, -8.0F, -8.0F, 32.0F, 8.0F, 32.0F, 0.0F, false);
		bb_main.setTextureOffset(12, 49).addBox(5.0F, -8.0F, -9.0F, 3.0F, 8.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(2, 41).addBox(5.0F, -8.0F, 24.0F, 3.0F, 8.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(6, 46).addBox(5.0F, -1.0F, -12.0F, 3.0F, 1.0F, 3.0F, 0.0F, false);
		bb_main.setTextureOffset(3, 52).addBox(5.0F, -1.0F, 25.0F, 3.0F, 1.0F, 3.0F, 0.0F, false);
		bb_main.setTextureOffset(5, 46).addBox(8.0F, -8.0F, -8.0F, 1.0F, 8.0F, 3.0F, 0.0F, false);
		bb_main.setTextureOffset(4, 46).addBox(9.0F, -1.0F, -8.0F, 3.0F, 1.0F, 3.0F, 0.0F, false);
		bb_main.setTextureOffset(2, 56).addBox(9.0F, -1.0F, 21.0F, 3.0F, 1.0F, 3.0F, 0.0F, false);
		bb_main.setTextureOffset(1, 41).addBox(8.0F, -8.0F, 21.0F, 1.0F, 8.0F, 3.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 42).addBox(-25.0F, -8.0F, 21.0F, 1.0F, 8.0F, 3.0F, 0.0F, false);
		bb_main.setTextureOffset(2, 44).addBox(-24.0F, -1.0F, 25.0F, 3.0F, 1.0F, 3.0F, 0.0F, false);
		bb_main.setTextureOffset(2, 45).addBox(-24.0F, -8.0F, 24.0F, 3.0F, 8.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 43).addBox(-28.0F, -1.0F, 21.0F, 3.0F, 1.0F, 3.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 44).addBox(-28.0F, -1.0F, -8.0F, 3.0F, 1.0F, 3.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 48).addBox(-25.0F, -8.0F, -8.0F, 1.0F, 8.0F, 3.0F, 0.0F, false);
		bb_main.setTextureOffset(7, 50).addBox(-24.0F, -8.0F, -9.0F, 3.0F, 8.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(1, 50).addBox(-24.0F, -1.0F, -12.0F, 3.0F, 1.0F, 3.0F, 0.0F, false);
		bb_main.setTextureOffset(4, 50).addBox(-9.0F, -8.0F, -9.0F, 2.0F, 8.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(1, 44).addBox(-9.0F, -8.0F, 24.0F, 2.0F, 8.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(3, 42).addBox(8.0F, -8.0F, 7.0F, 1.0F, 8.0F, 2.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 48).addBox(-25.0F, -8.0F, 7.0F, 1.0F, 8.0F, 2.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 105).addBox(-17.0F, -24.0F, 1.0F, 12.0F, 16.0F, 12.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 133).addBox(-5.0F, -17.0F, 2.0F, 14.0F, 8.0F, 10.0F, 0.0F, false);
		bb_main.setTextureOffset(18, 94).addBox(9.0F, -14.0F, 5.0F, 6.0F, 4.0F, 4.0F, 0.0F, false);
		bb_main.setTextureOffset(14, 92).addBox(12.0F, -10.0F, 5.0F, 3.0F, 2.0F, 4.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		bb_main.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, -0.3491F, 0.0F);
		cube_r1.setTextureOffset(41, 5).addBox(-5.0F, -22.0F, 15.0F, 2.0F, 4.0F, 12.0F, 0.0F, false);
		cube_r1.setTextureOffset(48, 5).addBox(-5.0F, -17.0F, 15.0F, 2.0F, 4.0F, 12.0F, 0.0F, false);
		cube_r1.setTextureOffset(46, 6).addBox(-5.0F, -12.0F, 15.0F, 2.0F, 4.0F, 12.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		bb_main.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.3491F, 0.0F);
		cube_r2.setTextureOffset(40, 12).addBox(-10.0F, -22.0F, -14.0F, 4.0F, 4.0F, 12.0F, 0.0F, false);
		cube_r2.setTextureOffset(40, 8).addBox(-10.0F, -17.0F, -14.0F, 4.0F, 4.0F, 12.0F, 0.0F, false);
		cube_r2.setTextureOffset(42, 6).addBox(-8.0F, -12.0F, -14.0F, 2.0F, 4.0F, 12.0F, 0.0F, false);
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