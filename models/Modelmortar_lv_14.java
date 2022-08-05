// Made with Blockbench 4.0.4
// Exported for Minecraft version 1.14 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelmortar_lv_14 extends EntityModel {
	private final ModelRenderer bb_main;

	public Modelmortar_lv_14() {
		textureWidth = 128;
		textureHeight = 128;

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.cubeList.add(new ModelBox(bb_main, 41, 4, -8.0F, -8.0F, -13.0F, 16, 8, 1, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 56, -8.0F, -8.0F, -12.0F, 16, 8, 3, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 41, 4, -8.0F, -8.0F, -9.0F, 16, 8, 1, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 41, 4, -8.0F, -8.0F, 8.0F, 16, 8, 1, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 56, -8.0F, -8.0F, 9.0F, 16, 8, 3, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 41, 4, -8.0F, -8.0F, 12.0F, 16, 8, 1, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 64, 0, -8.0F, -2.0F, -8.0F, 16, 1, 16, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -7.0F, -22.0F, -6.0F, 1, 20, 13, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 7.0F, -22.0F, -6.0F, 1, 20, 13, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 33, -6.0F, -22.0F, -6.0F, 13, 20, 1, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 30, 103, -6.0F, -9.0F, 9.0F, 12, 1, 3, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 30, 103, -6.0F, -9.0F, -12.0F, 12, 1, 3, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 33, -6.0F, -22.0F, 6.0F, 13, 20, 1, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 116, 0, -2.0F, -10.0F, 9.0F, 3, 1, 3, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 45, 52, -2.0F, -10.0F, -12.0F, 3, 1, 3, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 27, 1, 7.0F, -1.0F, 7.0F, 2, 1, 1, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 43, 14, 7.0F, -1.0F, 13.0F, 2, 1, 1, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 85, 46, 8.0F, -1.0F, 8.0F, 1, 1, 5, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 28, 9, 8.0F, -1.0F, -13.0F, 1, 1, 6, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 28, 1, 7.0F, -1.0F, -14.0F, 2, 1, 1, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 32, 4, 6.0F, -1.0F, -8.0F, 2, 1, 1, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 120, 0, -8.0F, -1.0F, 13.0F, 3, 1, 1, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 120, 0, -8.0F, -1.0F, -8.0F, 3, 1, 1, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 120, 0, -8.0F, -1.0F, -14.0F, 3, 1, 1, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 120, 0, -8.0F, -1.0F, 7.0F, 3, 1, 1, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 33, 23, -9.0F, -1.0F, 7.0F, 1, 1, 7, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 33, 23, -9.0F, -1.0F, -14.0F, 1, 1, 7, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bb_main.render(f5);
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