// Made with Blockbench 4.0.4
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelsuperwitch extends EntityModel<Entity> {
	private final ModelRenderer bb_main;
	private final ModelRenderer cube_r1;

	public Modelsuperwitch() {
		textureWidth = 64;
		textureHeight = 32;

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.setTextureOffset(0, 0).addBox(-4.0F, -32.0F, -3.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
		bb_main.setTextureOffset(48, 16).addBox(4.0F, -24.0F, -1.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
		bb_main.setTextureOffset(16, 16).addBox(-4.0F, -24.0F, -1.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 16).addBox(-4.0F, -12.0F, -1.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 16).addBox(0.0F, -12.0F, -1.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
		bb_main.setTextureOffset(40, 9).addBox(-6.0F, -27.0F, -7.0F, 1.0F, 22.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(32, 0).addBox(-10.0F, -35.0F, -12.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		bb_main.addChild(cube_r1);
		setRotationAngle(cube_r1, -1.5708F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(48, 16).addBox(-8.0F, -3.0F, -24.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
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