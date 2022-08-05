
package net.mcreator.clashofclansweapons.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import net.mcreator.clashofclansweapons.world.inventory.NameGUIMenu;
import net.mcreator.clashofclansweapons.network.NameGUIButtonMessage;
import net.mcreator.clashofclansweapons.ClashofclansweaponsMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class NameGUIScreen extends AbstractContainerScreen<NameGUIMenu> {
	private final static HashMap<String, Object> guistate = NameGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	EditBox name;

	public NameGUIScreen(NameGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 89;
	}

	private static final ResourceLocation texture = new ResourceLocation("clashofclansweapons:textures/screens/name_gui.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
		name.render(ms, mouseX, mouseY, partialTicks);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		if (name.isFocused())
			return name.keyPressed(key, b, c);
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
		name.tick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, "Welcome Chief!", 51, 4, -12829636);
		this.font.draw(poseStack, "My name is...", 51, 13, -12829636);
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
		name = new EditBox(this.font, this.leftPos + 33, this.topPos + 22, 120, 20, new TextComponent("Name")) {
			{
				setSuggestion("Name");
			}

			@Override
			public void insertText(String text) {
				super.insertText(text);
				if (getValue().isEmpty())
					setSuggestion("Name");
				else
					setSuggestion(null);
			}

			@Override
			public void moveCursorTo(int pos) {
				super.moveCursorTo(pos);
				if (getValue().isEmpty())
					setSuggestion("Name");
				else
					setSuggestion(null);
			}
		};
		guistate.put("text:name", name);
		name.setMaxLength(32767);
		this.addWidget(this.name);
		this.addRenderableWidget(new Button(this.leftPos + 69, this.topPos + 46, 46, 20, new TextComponent("Done"), e -> {
			if (true) {
				ClashofclansweaponsMod.PACKET_HANDLER.sendToServer(new NameGUIButtonMessage(0, x, y, z));
				NameGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}));
	}
}
