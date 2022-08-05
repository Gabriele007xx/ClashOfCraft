
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.clashofclansweapons.init;

import org.lwjgl.glfw.GLFW;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.client.ClientRegistry;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.mcreator.clashofclansweapons.network.SummonSkeletonMessage;
import net.mcreator.clashofclansweapons.network.ShopVINGMessage;
import net.mcreator.clashofclansweapons.network.JumpMessage;
import net.mcreator.clashofclansweapons.network.BmlIGHTINGMessage;
import net.mcreator.clashofclansweapons.ClashofclansweaponsMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class ClashofclansweaponsModKeyMappings {
	public static final KeyMapping BML_IGHTING = new KeyMapping("key.clashofclansweapons.bml_ighting", GLFW.GLFW_KEY_F,
			"key.categories.battlemachinecontrols");
	public static final KeyMapping JUMP = new KeyMapping("key.clashofclansweapons.jump", GLFW.GLFW_KEY_SPACE, "key.categories.battlemachinecontrols");
	public static final KeyMapping SUMMON_SKELETON = new KeyMapping("key.clashofclansweapons.summon_skeleton", GLFW.GLFW_KEY_H,
			"key.categories.items");
	public static final KeyMapping SHOP_VING = new KeyMapping("key.clashofclansweapons.shop_ving", GLFW.GLFW_KEY_I, "key.categories.misc");

	@SubscribeEvent
	public static void registerKeyBindings(FMLClientSetupEvent event) {
		ClientRegistry.registerKeyBinding(BML_IGHTING);
		ClientRegistry.registerKeyBinding(JUMP);
		ClientRegistry.registerKeyBinding(SUMMON_SKELETON);
		ClientRegistry.registerKeyBinding(SHOP_VING);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onKeyInput(InputEvent.KeyInputEvent event) {
			if (Minecraft.getInstance().screen == null) {
				if (event.getKey() == BML_IGHTING.getKey().getValue()) {
					if (event.getAction() == GLFW.GLFW_PRESS) {
						ClashofclansweaponsMod.PACKET_HANDLER.sendToServer(new BmlIGHTINGMessage(0, 0));
						BmlIGHTINGMessage.pressAction(Minecraft.getInstance().player, 0, 0);
					}
				}
				if (event.getKey() == JUMP.getKey().getValue()) {
					if (event.getAction() == GLFW.GLFW_PRESS) {
						ClashofclansweaponsMod.PACKET_HANDLER.sendToServer(new JumpMessage(0, 0));
						JumpMessage.pressAction(Minecraft.getInstance().player, 0, 0);
					}
				}
				if (event.getKey() == SUMMON_SKELETON.getKey().getValue()) {
					if (event.getAction() == GLFW.GLFW_PRESS) {
						ClashofclansweaponsMod.PACKET_HANDLER.sendToServer(new SummonSkeletonMessage(0, 0));
						SummonSkeletonMessage.pressAction(Minecraft.getInstance().player, 0, 0);
					}
				}
				if (event.getKey() == SHOP_VING.getKey().getValue()) {
					if (event.getAction() == GLFW.GLFW_PRESS) {
						ClashofclansweaponsMod.PACKET_HANDLER.sendToServer(new ShopVINGMessage(0, 0));
						ShopVINGMessage.pressAction(Minecraft.getInstance().player, 0, 0);
					}
				}
			}
		}
	}
}
