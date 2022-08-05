
package net.mcreator.clashofclansweapons.client.gui;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.Minecraft;

import net.mcreator.clashofclansweapons.world.inventory.DrakElixirDrillGUIMenu;
import net.mcreator.clashofclansweapons.procedures.Bar75Procedure;
import net.mcreator.clashofclansweapons.procedures.Bar50Procedure;
import net.mcreator.clashofclansweapons.procedures.Bar25Procedure;
import net.mcreator.clashofclansweapons.procedures.Bar100Procedure;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class DrakElixirDrillGUIScreen extends AbstractContainerScreen<DrakElixirDrillGUIMenu> {
	private final static HashMap<String, Object> guistate = DrakElixirDrillGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public DrakElixirDrillGUIScreen(DrakElixirDrillGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 192;
	}

	private static final ResourceLocation texture = new ResourceLocation("clashofclansweapons:textures/screens/drak_elixir_drill_gui.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		RenderSystem.setShaderTexture(0, new ResourceLocation("clashofclansweapons:textures/screens/bar_empty.png"));
		this.blit(ms, this.leftPos + 6, this.topPos + 56, 0, 0, 64, 16, 64, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("clashofclansweapons:textures/screens/de_bar1.png"));
		this.blit(ms, this.leftPos + 6, this.topPos + 92, 0, 0, 64, 16, 64, 16);

		if (Bar25Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("clashofclansweapons:textures/screens/de_bar1.png"));
			this.blit(ms, this.leftPos + 6, this.topPos + 56, 0, 0, 64, 16, 64, 16);
		}
		if (Bar50Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("clashofclansweapons:textures/screens/de_bar2.png"));
			this.blit(ms, this.leftPos + 6, this.topPos + 56, 0, 0, 64, 16, 64, 16);
		}
		if (Bar75Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("clashofclansweapons:textures/screens/de_bar3.png"));
			this.blit(ms, this.leftPos + 6, this.topPos + 56, 0, 0, 64, 16, 64, 16);
		}
		if (Bar100Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("clashofclansweapons:textures/screens/de_bar4.png"));
			this.blit(ms, this.leftPos + 6, this.topPos + 56, 0, 0, 64, 16, 64, 16);
		}
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, "Dark Elixir Drill (Liv.1)", 33, 11, -12829636);
		this.font.draw(poseStack, "Production: 0.1 dark elixir/sec", 6, 83, -12829636);
		this.font.draw(poseStack, "Capacity:" + ((int) new Object() {
			public double getValue(BlockPos pos, String tag) {
				BlockEntity BlockEntity = world.getBlockEntity(pos);
				if (BlockEntity != null)
					return BlockEntity.getTileData().getDouble(tag);
				return 0;
			}
		}.getValue(new BlockPos((int) x, (int) y, (int) z), "capacity")) + "", 6, 47, -12829636);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardHandler.setSendRepeatsToGui(false);
	}

	@Override
	public void init() {
		super.init();
		this.minecraft.keyboardHandler.setSendRepeatsToGui(true);
	}
}
