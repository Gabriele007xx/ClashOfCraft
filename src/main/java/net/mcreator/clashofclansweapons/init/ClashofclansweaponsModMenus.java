
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.clashofclansweapons.init;

import net.minecraftforge.network.IContainerFactory;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.inventory.AbstractContainerMenu;

import net.mcreator.clashofclansweapons.world.inventory.XbowGUIMenu;
import net.mcreator.clashofclansweapons.world.inventory.TownHallUpgradeUIMenu;
import net.mcreator.clashofclansweapons.world.inventory.SuperGUIMenu;
import net.mcreator.clashofclansweapons.world.inventory.SpellFactoryGUIMenu;
import net.mcreator.clashofclansweapons.world.inventory.ShopResourcesMenu;
import net.mcreator.clashofclansweapons.world.inventory.ShopMenu;
import net.mcreator.clashofclansweapons.world.inventory.ShopDefencesMenu;
import net.mcreator.clashofclansweapons.world.inventory.RageSpellFactoryMenu;
import net.mcreator.clashofclansweapons.world.inventory.NameGUIMenu;
import net.mcreator.clashofclansweapons.world.inventory.JumpSpellFactoryMenu;
import net.mcreator.clashofclansweapons.world.inventory.HealSpellFactoryMenu;
import net.mcreator.clashofclansweapons.world.inventory.GoldMineUpWindowMenu;
import net.mcreator.clashofclansweapons.world.inventory.GoldMineLv2PaneMenu;
import net.mcreator.clashofclansweapons.world.inventory.GoldMineLv1GUIMenu;
import net.mcreator.clashofclansweapons.world.inventory.FrostSpellFactoryMenu;
import net.mcreator.clashofclansweapons.world.inventory.ElixirUpGUIMenu;
import net.mcreator.clashofclansweapons.world.inventory.ElixirStorageUpUIMenu;
import net.mcreator.clashofclansweapons.world.inventory.ElixirStorageLv2GUIMenu;
import net.mcreator.clashofclansweapons.world.inventory.ElixirStorageLv1GUIMenu;
import net.mcreator.clashofclansweapons.world.inventory.ElixirDepositLevel3UIMenu;
import net.mcreator.clashofclansweapons.world.inventory.ElixirCollectorLevel5GUIMenu;
import net.mcreator.clashofclansweapons.world.inventory.ElixirCollectorLevel4GUIMenu;
import net.mcreator.clashofclansweapons.world.inventory.ElixirCollectorLevel3GUIMenu;
import net.mcreator.clashofclansweapons.world.inventory.ElixirCollectorLevel2GUIMenu;
import net.mcreator.clashofclansweapons.world.inventory.ElixirCollectorLevel1GUIMenu;
import net.mcreator.clashofclansweapons.world.inventory.DrillUpgradeStationMenu;
import net.mcreator.clashofclansweapons.world.inventory.DrakElixirDrillGUIMenu;
import net.mcreator.clashofclansweapons.world.inventory.DarkElxir7GUIMenu;
import net.mcreator.clashofclansweapons.world.inventory.DarkElxiirStorage6GUIMenu;
import net.mcreator.clashofclansweapons.world.inventory.DarkElixirLvTwoSlMenu;
import net.mcreator.clashofclansweapons.world.inventory.DarkElixirLevel3IMenu;
import net.mcreator.clashofclansweapons.world.inventory.DarkElixir9GUIMenu;
import net.mcreator.clashofclansweapons.world.inventory.DakElixir8GUIMenu;
import net.mcreator.clashofclansweapons.world.inventory.DElixirBarracksGUIMenu;
import net.mcreator.clashofclansweapons.world.inventory.CCUGUIMenu;
import net.mcreator.clashofclansweapons.world.inventory.BuilderGUIMenu;
import net.mcreator.clashofclansweapons.world.inventory.BarracksGUIMenu;
import net.mcreator.clashofclansweapons.world.inventory.BBuilderBarracksGUIMenu;
import net.mcreator.clashofclansweapons.world.inventory.BBElixirCollector1GUIMenu;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClashofclansweaponsModMenus {
	private static final List<MenuType<?>> REGISTRY = new ArrayList<>();
	public static final MenuType<ElixirCollectorLevel1GUIMenu> ELIXIR_COLLECTOR_LEVEL_1_GUI = register("elixir_collector_level_1_gui",
			(id, inv, extraData) -> new ElixirCollectorLevel1GUIMenu(id, inv, extraData));
	public static final MenuType<BuilderGUIMenu> BUILDER_GUI = register("builder_gui",
			(id, inv, extraData) -> new BuilderGUIMenu(id, inv, extraData));
	public static final MenuType<ElixirCollectorLevel2GUIMenu> ELIXIR_COLLECTOR_LEVEL_2_GUI = register("elixir_collector_level_2_gui",
			(id, inv, extraData) -> new ElixirCollectorLevel2GUIMenu(id, inv, extraData));
	public static final MenuType<BarracksGUIMenu> BARRACKS_GUI = register("barracks_gui",
			(id, inv, extraData) -> new BarracksGUIMenu(id, inv, extraData));
	public static final MenuType<DrakElixirDrillGUIMenu> DRAK_ELIXIR_DRILL_GUI = register("drak_elixir_drill_gui",
			(id, inv, extraData) -> new DrakElixirDrillGUIMenu(id, inv, extraData));
	public static final MenuType<DElixirBarracksGUIMenu> D_ELIXIR_BARRACKS_GUI = register("d_elixir_barracks_gui",
			(id, inv, extraData) -> new DElixirBarracksGUIMenu(id, inv, extraData));
	public static final MenuType<DarkElxiirStorage6GUIMenu> DARK_ELXIIR_STORAGE_6_GUI = register("dark_elxiir_storage_6_gui",
			(id, inv, extraData) -> new DarkElxiirStorage6GUIMenu(id, inv, extraData));
	public static final MenuType<DarkElxir7GUIMenu> DARK_ELXIR_7_GUI = register("dark_elxir_7_gui",
			(id, inv, extraData) -> new DarkElxir7GUIMenu(id, inv, extraData));
	public static final MenuType<DakElixir8GUIMenu> DAK_ELIXIR_8_GUI = register("dak_elixir_8_gui",
			(id, inv, extraData) -> new DakElixir8GUIMenu(id, inv, extraData));
	public static final MenuType<DarkElixir9GUIMenu> DARK_ELIXIR_9_GUI = register("dark_elixir_9_gui",
			(id, inv, extraData) -> new DarkElixir9GUIMenu(id, inv, extraData));
	public static final MenuType<BBElixirCollector1GUIMenu> BB_ELIXIR_COLLECTOR_1_GUI = register("bb_elixir_collector_1_gui",
			(id, inv, extraData) -> new BBElixirCollector1GUIMenu(id, inv, extraData));
	public static final MenuType<SuperGUIMenu> SUPER_GUI = register("super_gui", (id, inv, extraData) -> new SuperGUIMenu(id, inv, extraData));
	public static final MenuType<BBuilderBarracksGUIMenu> B_BUILDER_BARRACKS_GUI = register("b_builder_barracks_gui",
			(id, inv, extraData) -> new BBuilderBarracksGUIMenu(id, inv, extraData));
	public static final MenuType<ElixirCollectorLevel3GUIMenu> ELIXIR_COLLECTOR_LEVEL_3_GUI = register("elixir_collector_level_3_gui",
			(id, inv, extraData) -> new ElixirCollectorLevel3GUIMenu(id, inv, extraData));
	public static final MenuType<ElixirStorageLv1GUIMenu> ELIXIR_STORAGE_LV_1_GUI = register("elixir_storage_lv_1_gui",
			(id, inv, extraData) -> new ElixirStorageLv1GUIMenu(id, inv, extraData));
	public static final MenuType<ElixirCollectorLevel4GUIMenu> ELIXIR_COLLECTOR_LEVEL_4_GUI = register("elixir_collector_level_4_gui",
			(id, inv, extraData) -> new ElixirCollectorLevel4GUIMenu(id, inv, extraData));
	public static final MenuType<ElixirStorageLv2GUIMenu> ELIXIR_STORAGE_LV_2_GUI = register("elixir_storage_lv_2_gui",
			(id, inv, extraData) -> new ElixirStorageLv2GUIMenu(id, inv, extraData));
	public static final MenuType<ElixirCollectorLevel5GUIMenu> ELIXIR_COLLECTOR_LEVEL_5_GUI = register("elixir_collector_level_5_gui",
			(id, inv, extraData) -> new ElixirCollectorLevel5GUIMenu(id, inv, extraData));
	public static final MenuType<SpellFactoryGUIMenu> SPELL_FACTORY_GUI = register("spell_factory_gui",
			(id, inv, extraData) -> new SpellFactoryGUIMenu(id, inv, extraData));
	public static final MenuType<GoldMineLv1GUIMenu> GOLD_MINE_LV_1_GUI = register("gold_mine_lv_1_gui",
			(id, inv, extraData) -> new GoldMineLv1GUIMenu(id, inv, extraData));
	public static final MenuType<ElixirUpGUIMenu> ELIXIR_UP_GUI = register("elixir_up_gui",
			(id, inv, extraData) -> new ElixirUpGUIMenu(id, inv, extraData));
	public static final MenuType<NameGUIMenu> NAME_GUI = register("name_gui", (id, inv, extraData) -> new NameGUIMenu(id, inv, extraData));
	public static final MenuType<ElixirStorageUpUIMenu> ELIXIR_STORAGE_UP_UI = register("elixir_storage_up_ui",
			(id, inv, extraData) -> new ElixirStorageUpUIMenu(id, inv, extraData));
	public static final MenuType<CCUGUIMenu> CCUGUI = register("ccugui", (id, inv, extraData) -> new CCUGUIMenu(id, inv, extraData));
	public static final MenuType<ElixirDepositLevel3UIMenu> ELIXIR_DEPOSIT_LEVEL_3_UI = register("elixir_deposit_level_3_ui",
			(id, inv, extraData) -> new ElixirDepositLevel3UIMenu(id, inv, extraData));
	public static final MenuType<TownHallUpgradeUIMenu> TOWN_HALL_UPGRADE_UI = register("town_hall_upgrade_ui",
			(id, inv, extraData) -> new TownHallUpgradeUIMenu(id, inv, extraData));
	public static final MenuType<GoldMineLv2PaneMenu> GOLD_MINE_LV_2_PANE = register("gold_mine_lv_2_pane",
			(id, inv, extraData) -> new GoldMineLv2PaneMenu(id, inv, extraData));
	public static final MenuType<GoldMineUpWindowMenu> GOLD_MINE_UP_WINDOW = register("gold_mine_up_window",
			(id, inv, extraData) -> new GoldMineUpWindowMenu(id, inv, extraData));
	public static final MenuType<ShopMenu> SHOP = register("shop", (id, inv, extraData) -> new ShopMenu(id, inv, extraData));
	public static final MenuType<ShopResourcesMenu> SHOP_RESOURCES = register("shop_resources",
			(id, inv, extraData) -> new ShopResourcesMenu(id, inv, extraData));
	public static final MenuType<DarkElixirLvTwoSlMenu> DARK_ELIXIR_LV_TWO_SL = register("dark_elixir_lv_two_sl",
			(id, inv, extraData) -> new DarkElixirLvTwoSlMenu(id, inv, extraData));
	public static final MenuType<DarkElixirLevel3IMenu> DARK_ELIXIR_LEVEL_3_I = register("dark_elixir_level_3_i",
			(id, inv, extraData) -> new DarkElixirLevel3IMenu(id, inv, extraData));
	public static final MenuType<DrillUpgradeStationMenu> DRILL_UPGRADE_STATION = register("drill_upgrade_station",
			(id, inv, extraData) -> new DrillUpgradeStationMenu(id, inv, extraData));
	public static final MenuType<ShopDefencesMenu> SHOP_DEFENCES = register("shop_defences",
			(id, inv, extraData) -> new ShopDefencesMenu(id, inv, extraData));
	public static final MenuType<XbowGUIMenu> XBOW_GUI = register("xbow_gui", (id, inv, extraData) -> new XbowGUIMenu(id, inv, extraData));
	public static final MenuType<HealSpellFactoryMenu> HEAL_SPELL_FACTORY = register("heal_spell_factory",
			(id, inv, extraData) -> new HealSpellFactoryMenu(id, inv, extraData));
	public static final MenuType<RageSpellFactoryMenu> RAGE_SPELL_FACTORY = register("rage_spell_factory",
			(id, inv, extraData) -> new RageSpellFactoryMenu(id, inv, extraData));
	public static final MenuType<FrostSpellFactoryMenu> FROST_SPELL_FACTORY = register("frost_spell_factory",
			(id, inv, extraData) -> new FrostSpellFactoryMenu(id, inv, extraData));
	public static final MenuType<JumpSpellFactoryMenu> JUMP_SPELL_FACTORY = register("jump_spell_factory",
			(id, inv, extraData) -> new JumpSpellFactoryMenu(id, inv, extraData));

	private static <T extends AbstractContainerMenu> MenuType<T> register(String registryname, IContainerFactory<T> containerFactory) {
		MenuType<T> menuType = new MenuType<T>(containerFactory);
		menuType.setRegistryName(registryname);
		REGISTRY.add(menuType);
		return menuType;
	}

	@SubscribeEvent
	public static void registerContainers(RegistryEvent.Register<MenuType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new MenuType[0]));
	}
}
