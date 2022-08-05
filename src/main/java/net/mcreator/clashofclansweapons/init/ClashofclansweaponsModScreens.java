
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.clashofclansweapons.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.clashofclansweapons.client.gui.XbowGUIScreen;
import net.mcreator.clashofclansweapons.client.gui.TownHallUpgradeUIScreen;
import net.mcreator.clashofclansweapons.client.gui.SuperGUIScreen;
import net.mcreator.clashofclansweapons.client.gui.SpellFactoryGUIScreen;
import net.mcreator.clashofclansweapons.client.gui.ShopScreen;
import net.mcreator.clashofclansweapons.client.gui.ShopResourcesScreen;
import net.mcreator.clashofclansweapons.client.gui.ShopDefencesScreen;
import net.mcreator.clashofclansweapons.client.gui.RageSpellFactoryScreen;
import net.mcreator.clashofclansweapons.client.gui.NameGUIScreen;
import net.mcreator.clashofclansweapons.client.gui.JumpSpellFactoryScreen;
import net.mcreator.clashofclansweapons.client.gui.HealSpellFactoryScreen;
import net.mcreator.clashofclansweapons.client.gui.GoldMineUpWindowScreen;
import net.mcreator.clashofclansweapons.client.gui.GoldMineLv2PaneScreen;
import net.mcreator.clashofclansweapons.client.gui.GoldMineLv1GUIScreen;
import net.mcreator.clashofclansweapons.client.gui.FrostSpellFactoryScreen;
import net.mcreator.clashofclansweapons.client.gui.ElixirUpGUIScreen;
import net.mcreator.clashofclansweapons.client.gui.ElixirStorageUpUIScreen;
import net.mcreator.clashofclansweapons.client.gui.ElixirStorageLv2GUIScreen;
import net.mcreator.clashofclansweapons.client.gui.ElixirStorageLv1GUIScreen;
import net.mcreator.clashofclansweapons.client.gui.ElixirDepositLevel3UIScreen;
import net.mcreator.clashofclansweapons.client.gui.ElixirCollectorLevel5GUIScreen;
import net.mcreator.clashofclansweapons.client.gui.ElixirCollectorLevel4GUIScreen;
import net.mcreator.clashofclansweapons.client.gui.ElixirCollectorLevel3GUIScreen;
import net.mcreator.clashofclansweapons.client.gui.ElixirCollectorLevel2GUIScreen;
import net.mcreator.clashofclansweapons.client.gui.ElixirCollectorLevel1GUIScreen;
import net.mcreator.clashofclansweapons.client.gui.DrillUpgradeStationScreen;
import net.mcreator.clashofclansweapons.client.gui.DrakElixirDrillGUIScreen;
import net.mcreator.clashofclansweapons.client.gui.DarkElxir7GUIScreen;
import net.mcreator.clashofclansweapons.client.gui.DarkElxiirStorage6GUIScreen;
import net.mcreator.clashofclansweapons.client.gui.DarkElixirLvTwoSlScreen;
import net.mcreator.clashofclansweapons.client.gui.DarkElixirLevel3IScreen;
import net.mcreator.clashofclansweapons.client.gui.DarkElixir9GUIScreen;
import net.mcreator.clashofclansweapons.client.gui.DakElixir8GUIScreen;
import net.mcreator.clashofclansweapons.client.gui.DElixirBarracksGUIScreen;
import net.mcreator.clashofclansweapons.client.gui.CCUGUIScreen;
import net.mcreator.clashofclansweapons.client.gui.BuilderGUIScreen;
import net.mcreator.clashofclansweapons.client.gui.BarracksGUIScreen;
import net.mcreator.clashofclansweapons.client.gui.BBuilderBarracksGUIScreen;
import net.mcreator.clashofclansweapons.client.gui.BBElixirCollector1GUIScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClashofclansweaponsModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(ClashofclansweaponsModMenus.ELIXIR_COLLECTOR_LEVEL_1_GUI, ElixirCollectorLevel1GUIScreen::new);
			MenuScreens.register(ClashofclansweaponsModMenus.BUILDER_GUI, BuilderGUIScreen::new);
			MenuScreens.register(ClashofclansweaponsModMenus.ELIXIR_COLLECTOR_LEVEL_2_GUI, ElixirCollectorLevel2GUIScreen::new);
			MenuScreens.register(ClashofclansweaponsModMenus.BARRACKS_GUI, BarracksGUIScreen::new);
			MenuScreens.register(ClashofclansweaponsModMenus.DRAK_ELIXIR_DRILL_GUI, DrakElixirDrillGUIScreen::new);
			MenuScreens.register(ClashofclansweaponsModMenus.D_ELIXIR_BARRACKS_GUI, DElixirBarracksGUIScreen::new);
			MenuScreens.register(ClashofclansweaponsModMenus.DARK_ELXIIR_STORAGE_6_GUI, DarkElxiirStorage6GUIScreen::new);
			MenuScreens.register(ClashofclansweaponsModMenus.DARK_ELXIR_7_GUI, DarkElxir7GUIScreen::new);
			MenuScreens.register(ClashofclansweaponsModMenus.DAK_ELIXIR_8_GUI, DakElixir8GUIScreen::new);
			MenuScreens.register(ClashofclansweaponsModMenus.DARK_ELIXIR_9_GUI, DarkElixir9GUIScreen::new);
			MenuScreens.register(ClashofclansweaponsModMenus.BB_ELIXIR_COLLECTOR_1_GUI, BBElixirCollector1GUIScreen::new);
			MenuScreens.register(ClashofclansweaponsModMenus.SUPER_GUI, SuperGUIScreen::new);
			MenuScreens.register(ClashofclansweaponsModMenus.B_BUILDER_BARRACKS_GUI, BBuilderBarracksGUIScreen::new);
			MenuScreens.register(ClashofclansweaponsModMenus.ELIXIR_COLLECTOR_LEVEL_3_GUI, ElixirCollectorLevel3GUIScreen::new);
			MenuScreens.register(ClashofclansweaponsModMenus.ELIXIR_STORAGE_LV_1_GUI, ElixirStorageLv1GUIScreen::new);
			MenuScreens.register(ClashofclansweaponsModMenus.ELIXIR_COLLECTOR_LEVEL_4_GUI, ElixirCollectorLevel4GUIScreen::new);
			MenuScreens.register(ClashofclansweaponsModMenus.ELIXIR_STORAGE_LV_2_GUI, ElixirStorageLv2GUIScreen::new);
			MenuScreens.register(ClashofclansweaponsModMenus.ELIXIR_COLLECTOR_LEVEL_5_GUI, ElixirCollectorLevel5GUIScreen::new);
			MenuScreens.register(ClashofclansweaponsModMenus.SPELL_FACTORY_GUI, SpellFactoryGUIScreen::new);
			MenuScreens.register(ClashofclansweaponsModMenus.GOLD_MINE_LV_1_GUI, GoldMineLv1GUIScreen::new);
			MenuScreens.register(ClashofclansweaponsModMenus.ELIXIR_UP_GUI, ElixirUpGUIScreen::new);
			MenuScreens.register(ClashofclansweaponsModMenus.NAME_GUI, NameGUIScreen::new);
			MenuScreens.register(ClashofclansweaponsModMenus.ELIXIR_STORAGE_UP_UI, ElixirStorageUpUIScreen::new);
			MenuScreens.register(ClashofclansweaponsModMenus.CCUGUI, CCUGUIScreen::new);
			MenuScreens.register(ClashofclansweaponsModMenus.ELIXIR_DEPOSIT_LEVEL_3_UI, ElixirDepositLevel3UIScreen::new);
			MenuScreens.register(ClashofclansweaponsModMenus.TOWN_HALL_UPGRADE_UI, TownHallUpgradeUIScreen::new);
			MenuScreens.register(ClashofclansweaponsModMenus.GOLD_MINE_LV_2_PANE, GoldMineLv2PaneScreen::new);
			MenuScreens.register(ClashofclansweaponsModMenus.GOLD_MINE_UP_WINDOW, GoldMineUpWindowScreen::new);
			MenuScreens.register(ClashofclansweaponsModMenus.SHOP, ShopScreen::new);
			MenuScreens.register(ClashofclansweaponsModMenus.SHOP_RESOURCES, ShopResourcesScreen::new);
			MenuScreens.register(ClashofclansweaponsModMenus.DARK_ELIXIR_LV_TWO_SL, DarkElixirLvTwoSlScreen::new);
			MenuScreens.register(ClashofclansweaponsModMenus.DARK_ELIXIR_LEVEL_3_I, DarkElixirLevel3IScreen::new);
			MenuScreens.register(ClashofclansweaponsModMenus.DRILL_UPGRADE_STATION, DrillUpgradeStationScreen::new);
			MenuScreens.register(ClashofclansweaponsModMenus.SHOP_DEFENCES, ShopDefencesScreen::new);
			MenuScreens.register(ClashofclansweaponsModMenus.XBOW_GUI, XbowGUIScreen::new);
			MenuScreens.register(ClashofclansweaponsModMenus.HEAL_SPELL_FACTORY, HealSpellFactoryScreen::new);
			MenuScreens.register(ClashofclansweaponsModMenus.RAGE_SPELL_FACTORY, RageSpellFactoryScreen::new);
			MenuScreens.register(ClashofclansweaponsModMenus.FROST_SPELL_FACTORY, FrostSpellFactoryScreen::new);
			MenuScreens.register(ClashofclansweaponsModMenus.JUMP_SPELL_FACTORY, JumpSpellFactoryScreen::new);
		});
	}
}
