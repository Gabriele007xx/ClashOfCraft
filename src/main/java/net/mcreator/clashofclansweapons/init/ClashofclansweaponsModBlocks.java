
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.clashofclansweapons.init;

import net.mcreator.clashofclansweapons.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.clashofclansweapons.ClashofclansweaponsMod;

public class ClashofclansweaponsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, ClashofclansweaponsMod.MODID);
	public static final RegistryObject<Block> BUILDERHUT = REGISTRY.register("builderhut", () -> new BuilderhutBlock());
	public static final RegistryObject<Block> ELIXIR_COLLECTOR_LEVEL_1 = REGISTRY.register("elixir_collector_level_1",
			() -> new ElixirCollectorLevel1Block());
	public static final RegistryObject<Block> ELIXIR_COLLECTOR_LEVEL_2 = REGISTRY.register("elixir_collector_level_2",
			() -> new ElixirCollectorLevel2Block());
	public static final RegistryObject<Block> ELIXIR_COLLECTOR_LEVEL_3 = REGISTRY.register("elixir_collector_level_3",
			() -> new ElixirCollectorLevel3Block());
	public static final RegistryObject<Block> ELIXIR_COLLECTOR_LEVEL_4 = REGISTRY.register("elixir_collector_level_4",
			() -> new ElixirCollectorLevel4Block());
	public static final RegistryObject<Block> ELIXIR_COLLECTOR_LEVEL_5 = REGISTRY.register("elixir_collector_level_5",
			() -> new ElixirCollectorLevel5Block());
	public static final RegistryObject<Block> DARK_ELIXIR_DRILL_LV_1 = REGISTRY.register("dark_elixir_drill_lv_1",
			() -> new DarkElixirDrillLv1Block());
	public static final RegistryObject<Block> DARK_ELIXIR_DRILL_LV_2 = REGISTRY.register("dark_elixir_drill_lv_2",
			() -> new DarkElixirDrillLv2Block());
	public static final RegistryObject<Block> DARK_ELIXIR_DRILL_LV_3 = REGISTRY.register("dark_elixir_drill_lv_3",
			() -> new DarkElixirDrillLv3Block());
	public static final RegistryObject<Block> DARK_ELIXIR_STORAGE_LEVEL_6 = REGISTRY.register("dark_elixir_storage_level_6",
			() -> new DarkElixirStorageLevel6Block());
	public static final RegistryObject<Block> DARK_ELIXIR_STORAGE_LV_7 = REGISTRY.register("dark_elixir_storage_lv_7",
			() -> new DarkElixirStorageLv7Block());
	public static final RegistryObject<Block> DARK_ELIXIR_STORAGE_LV_8 = REGISTRY.register("dark_elixir_storage_lv_8",
			() -> new DarkElixirStorageLv8Block());
	public static final RegistryObject<Block> DARK_ELIXIR_STORAGE_LV_9 = REGISTRY.register("dark_elixir_storage_lv_9",
			() -> new DarkElixirStorageLv9Block());
	public static final RegistryObject<Block> GOLD_MINE_LV_1 = REGISTRY.register("gold_mine_lv_1", () -> new GoldMineLv1Block());
	public static final RegistryObject<Block> GOLD_MINE_LV_2 = REGISTRY.register("gold_mine_lv_2", () -> new GoldMineLv2Block());
	public static final RegistryObject<Block> BARRACKS = REGISTRY.register("barracks", () -> new BarracksBlock());
	public static final RegistryObject<Block> DARK_BARRACKS = REGISTRY.register("dark_barracks", () -> new DarkBarracksBlock());
	public static final RegistryObject<Block> BB_BARACKS = REGISTRY.register("bb_baracks", () -> new BBBaracksBlock());
	public static final RegistryObject<Block> SPELL_FACTORY = REGISTRY.register("spell_factory", () -> new SpellFactoryBlock());
	public static final RegistryObject<Block> GRAND_WARDEN = REGISTRY.register("grand_warden", () -> new GrandWardenBlock());
	public static final RegistryObject<Block> ARCHERQUEENALTAR = REGISTRY.register("archerqueenaltar", () -> new ArcherqueenaltarBlock());
	public static final RegistryObject<Block> SUPER_BARREL = REGISTRY.register("super_barrel", () -> new SuperBarrelBlock());
	public static final RegistryObject<Block> CLAN_CASTLE_LV_1 = REGISTRY.register("clan_castle_lv_1", () -> new ClanCastleLv1Block());
	public static final RegistryObject<Block> CLAN_CASTLE_LEVEL_2 = REGISTRY.register("clan_castle_level_2", () -> new ClanCastleLevel2Block());
	public static final RegistryObject<Block> ELIXIR_STORAGE_LV_1 = REGISTRY.register("elixir_storage_lv_1", () -> new ElixirStorageLv1Block());
	public static final RegistryObject<Block> ELIXIR_STORAGE_LV_2 = REGISTRY.register("elixir_storage_lv_2", () -> new ElixirStorageLv2Block());
	public static final RegistryObject<Block> ELIXIR_STORAGE_LIV_3 = REGISTRY.register("elixir_storage_liv_3", () -> new ElixirStorageLiv3Block());
	public static final RegistryObject<Block> BOMB = REGISTRY.register("bomb", () -> new BombBlock());
	public static final RegistryObject<Block> SPRING_TRAP = REGISTRY.register("spring_trap", () -> new SpringTrapBlock());
	public static final RegistryObject<Block> GIANT_BOMB = REGISTRY.register("giant_bomb", () -> new GiantBombBlock());
	public static final RegistryObject<Block> TOWN_HALL_LV_1 = REGISTRY.register("town_hall_lv_1", () -> new TownHallLv1Block());
	public static final RegistryObject<Block> TOWN_HALL_LV_2 = REGISTRY.register("town_hall_lv_2", () -> new TownHallLv2Block());
	public static final RegistryObject<Block> TOWN_HALL_LE_3 = REGISTRY.register("town_hall_le_3", () -> new TownHallLe3Block());
	public static final RegistryObject<Block> TOWN_HALL_LV_4 = REGISTRY.register("town_hall_lv_4", () -> new TownHallLv4Block());
	public static final RegistryObject<Block> TOWN_HALL_LV_5 = REGISTRY.register("town_hall_lv_5", () -> new TownHallLv5Block());
	public static final RegistryObject<Block> BB_ELIXIRCOLLECTOR = REGISTRY.register("bb_elixircollector", () -> new BBElixircollectorBlock());
	public static final RegistryObject<Block> GRAND_WARDEN_LV_5 = REGISTRY.register("grand_warden_lv_5", () -> new GrandWardenLv5Block());
	public static final RegistryObject<Block> COC_GRASS = REGISTRY.register("coc_grass", () -> new CocGrassBlock());
	public static final RegistryObject<Block> GRASS_BLOCK_BUILDER_BASE = REGISTRY.register("grass_block_builder_base",
			() -> new GrassBlockBuilderBaseBlock());
	public static final RegistryObject<Block> ELIXIRORE = REGISTRY.register("elixirore", () -> new ElixiroreBlock());
	public static final RegistryObject<Block> DEORE = REGISTRY.register("deore", () -> new DeoreBlock());
	public static final RegistryObject<Block> BUILDER_ELIXIR_ORE = REGISTRY.register("builder_elixir_ore", () -> new BuilderElixirOreBlock());
	public static final RegistryObject<Block> ELIXIR_UP = REGISTRY.register("elixir_up", () -> new ElixirUpBlock());
	public static final RegistryObject<Block> ELXIIR_STORAGE_UPGRADE = REGISTRY.register("elxiir_storage_upgrade",
			() -> new ElxiirStorageUpgradeBlock());
	public static final RegistryObject<Block> CLANC_UP = REGISTRY.register("clanc_up", () -> new ClancUpBlock());
	public static final RegistryObject<Block> TOWN_HALL_UPGRADER = REGISTRY.register("town_hall_upgrader", () -> new TownHallUpgraderBlock());
	public static final RegistryObject<Block> GOLD_MINE_UP = REGISTRY.register("gold_mine_up", () -> new GoldMineUpBlock());
	public static final RegistryObject<Block> DARK_ELIXIR_DRILL_UPGRADER = REGISTRY.register("dark_elixir_drill_upgrader",
			() -> new DarkElixirDrillUpgraderBlock());
	public static final RegistryObject<Block> ELIXIR_COLLETOR_LEVEL_125 = REGISTRY.register("elixir_colletor_level_125",
			() -> new ElixirColletorLevel125Block());
	public static final RegistryObject<Block> ELIXIR_COLLECTOR_LEVEL_150 = REGISTRY.register("elixir_collector_level_150",
			() -> new ElixirCollectorLevel150Block());
	public static final RegistryObject<Block> ELIXIR_COLLECTOR_LEVEL_175 = REGISTRY.register("elixir_collector_level_175",
			() -> new ElixirCollectorLevel175Block());
	public static final RegistryObject<Block> ELIXIR_COLLECTOR_LEVEL_1100 = REGISTRY.register("elixir_collector_level_1100",
			() -> new ElixirCollectorLevel1100Block());
	public static final RegistryObject<Block> ELIXIR_COLLECTOR_LEVEL_225 = REGISTRY.register("elixir_collector_level_225",
			() -> new ElixirCollectorLevel225Block());
	public static final RegistryObject<Block> ELIXIR_COLLECTOR_LEVEL_250 = REGISTRY.register("elixir_collector_level_250",
			() -> new ElixirCollectorLevel250Block());
	public static final RegistryObject<Block> ELIXIR_COLLECTOR_LEVEL_275 = REGISTRY.register("elixir_collector_level_275",
			() -> new ElixirCollectorLevel275Block());
	public static final RegistryObject<Block> ELIXIR_COLLECTOR_LEVEL_2100 = REGISTRY.register("elixir_collector_level_2100",
			() -> new ElixirCollectorLevel2100Block());
	public static final RegistryObject<Block> DARK_ELIXIR_DRILL_LV_125 = REGISTRY.register("dark_elixir_drill_lv_125",
			() -> new DarkElixirDrillLv125Block());
	public static final RegistryObject<Block> DARK_ELIXIR_DRILL_LV_150 = REGISTRY.register("dark_elixir_drill_lv_150",
			() -> new DarkElixirDrillLv150Block());
	public static final RegistryObject<Block> DARK_ELIXIR_DRILL_175 = REGISTRY.register("dark_elixir_drill_175", () -> new DarkElixirDrill175Block());
	public static final RegistryObject<Block> DARK_ELIXIR_DRILL_1100 = REGISTRY.register("dark_elixir_drill_1100",
			() -> new DarkElixirDrill1100Block());
	public static final RegistryObject<Block> BB_ELIXIRCOLLECTOR_25 = REGISTRY.register("bb_elixircollector_25",
			() -> new BBElixircollector25Block());
	public static final RegistryObject<Block> BB_ELIXIRCOLLECTOR_50 = REGISTRY.register("bb_elixircollector_50",
			() -> new BBElixircollector50Block());
	public static final RegistryObject<Block> BB_ELIXIRCOLLECTOR_75 = REGISTRY.register("bb_elixircollector_75",
			() -> new BBElixircollector75Block());
	public static final RegistryObject<Block> BB_ELIXIRCOLLCTOR_100 = REGISTRY.register("bb_elixircollctor_100",
			() -> new BBElixircollctor100Block());
	public static final RegistryObject<Block> ELIXIR_COLLECTOR_LEVEL_325 = REGISTRY.register("elixir_collector_level_325",
			() -> new ElixirCollectorLevel325Block());
	public static final RegistryObject<Block> ELIXIR_COLLECTOR_LEVEL_350 = REGISTRY.register("elixir_collector_level_350",
			() -> new ElixirCollectorLevel350Block());
	public static final RegistryObject<Block> ELIXIR_COLLECTOR_LEVEL_375 = REGISTRY.register("elixir_collector_level_375",
			() -> new ElixirCollectorLevel375Block());
	public static final RegistryObject<Block> ELIXIR_COLLECTOR_LEVEL_3100 = REGISTRY.register("elixir_collector_level_3100",
			() -> new ElixirCollectorLevel3100Block());
	public static final RegistryObject<Block> ELIXIR_COLLECTOR_LEVEL_425 = REGISTRY.register("elixir_collector_level_425",
			() -> new ElixirCollectorLevel425Block());
	public static final RegistryObject<Block> ELIXIR_COLLECOTR_LEVEL_450 = REGISTRY.register("elixir_collecotr_level_450",
			() -> new ElixirCollecotrLevel450Block());
	public static final RegistryObject<Block> ELIXIR_COLLECTOR_LEVEL_475 = REGISTRY.register("elixir_collector_level_475",
			() -> new ElixirCollectorLevel475Block());
	public static final RegistryObject<Block> ELIXIR_COLLECTOR_LEVEL_4100 = REGISTRY.register("elixir_collector_level_4100",
			() -> new ElixirCollectorLevel4100Block());
	public static final RegistryObject<Block> ELIXIR_COLLECTOR_LEVEL_525 = REGISTRY.register("elixir_collector_level_525",
			() -> new ElixirCollectorLevel525Block());
	public static final RegistryObject<Block> ELIXIR_COLLECTOR_LEVEL_550 = REGISTRY.register("elixir_collector_level_550",
			() -> new ElixirCollectorLevel550Block());
	public static final RegistryObject<Block> ELIXIR_COLLECTOR_LEVEL_575 = REGISTRY.register("elixir_collector_level_575",
			() -> new ElixirCollectorLevel575Block());
	public static final RegistryObject<Block> ELIXIR_COLLECTOR_LEVEL_5100 = REGISTRY.register("elixir_collector_level_5100",
			() -> new ElixirCollectorLevel5100Block());
	public static final RegistryObject<Block> GOLD_MINE_LV_125 = REGISTRY.register("gold_mine_lv_125", () -> new GoldMineLv125Block());
	public static final RegistryObject<Block> GOLD_MINE_LV_150 = REGISTRY.register("gold_mine_lv_150", () -> new GoldMineLv150Block());
	public static final RegistryObject<Block> GOLD_MINE_LV_175 = REGISTRY.register("gold_mine_lv_175", () -> new GoldMineLv175Block());
	public static final RegistryObject<Block> GOLD_MINE_LV_1100 = REGISTRY.register("gold_mine_lv_1100", () -> new GoldMineLv1100Block());
	public static final RegistryObject<Block> GOLD_MINE_LV_225 = REGISTRY.register("gold_mine_lv_225", () -> new GoldMineLv225Block());
	public static final RegistryObject<Block> GOLD_MINE_LV_250 = REGISTRY.register("gold_mine_lv_250", () -> new GoldMineLv250Block());
	public static final RegistryObject<Block> GOLD_MINE_LV_275 = REGISTRY.register("gold_mine_lv_275", () -> new GoldMineLv275Block());
	public static final RegistryObject<Block> GOLD_MINE_LV_2100 = REGISTRY.register("gold_mine_lv_2100", () -> new GoldMineLv2100Block());
	public static final RegistryObject<Block> DARK_ELXIR_DRILL_LV_225 = REGISTRY.register("dark_elxir_drill_lv_225",
			() -> new DarkElxirDrillLv225Block());
	public static final RegistryObject<Block> DARK_ELIXIR_DRILL_LV_250 = REGISTRY.register("dark_elixir_drill_lv_250",
			() -> new DarkElixirDrillLv250Block());
	public static final RegistryObject<Block> DARK_ELIXIR_DRILL_LV_275 = REGISTRY.register("dark_elixir_drill_lv_275",
			() -> new DarkElixirDrillLv275Block());
	public static final RegistryObject<Block> DARK_ELIXIR_DRILL_LV_2100 = REGISTRY.register("dark_elixir_drill_lv_2100",
			() -> new DarkElixirDrillLv2100Block());
	public static final RegistryObject<Block> DARK_ELIXIR_DRILL_LV_325 = REGISTRY.register("dark_elixir_drill_lv_325",
			() -> new DarkElixirDrillLv325Block());
	public static final RegistryObject<Block> DARK_ELIXIR_DRILL_LV_350 = REGISTRY.register("dark_elixir_drill_lv_350",
			() -> new DarkElixirDrillLv350Block());
	public static final RegistryObject<Block> DARK_ELIXIR_DRILL_LV_375 = REGISTRY.register("dark_elixir_drill_lv_375",
			() -> new DarkElixirDrillLv375Block());
	public static final RegistryObject<Block> DAK_ELIXIR_DRILL_LV_3100 = REGISTRY.register("dak_elixir_drill_lv_3100",
			() -> new DakElixirDrillLv3100Block());
	public static final RegistryObject<Block> HS_FACTORY = REGISTRY.register("hs_factory", () -> new HSFactoryBlock());
	public static final RegistryObject<Block> RAGE_SPELL_FACTORY_BLOCK = REGISTRY.register("rage_spell_factory_block",
			() -> new RageSpellFactoryBlockBlock());
	public static final RegistryObject<Block> FROST_SPELL_FACTORY_BUILDING = REGISTRY.register("frost_spell_factory_building",
			() -> new FrostSpellFactoryBuildingBlock());
	public static final RegistryObject<Block> JUMP_SPELL_FACTORY_I = REGISTRY.register("jump_spell_factory_i", () -> new JumpSpellFactoryIBlock());

	public static final RegistryObject<Block> CLAN_DECORATION = REGISTRY.register("clan_badge", ()->new DecorationClanBlock());
	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			BuilderhutBlock.registerRenderLayer();
			ElixirCollectorLevel1Block.registerRenderLayer();
			ElixirCollectorLevel2Block.registerRenderLayer();
			ElixirCollectorLevel3Block.registerRenderLayer();
			ElixirCollectorLevel4Block.registerRenderLayer();
			ElixirCollectorLevel5Block.registerRenderLayer();
			DarkElixirDrillLv1Block.registerRenderLayer();
			DarkElixirDrillLv2Block.registerRenderLayer();
			DarkElixirDrillLv3Block.registerRenderLayer();
			DarkElixirStorageLevel6Block.registerRenderLayer();
			DarkElixirStorageLv7Block.registerRenderLayer();
			DarkElixirStorageLv8Block.registerRenderLayer();
			DarkElixirStorageLv9Block.registerRenderLayer();
			GoldMineLv1Block.registerRenderLayer();
			GoldMineLv2Block.registerRenderLayer();
			BarracksBlock.registerRenderLayer();
			DarkBarracksBlock.registerRenderLayer();
			BBBaracksBlock.registerRenderLayer();
			SpellFactoryBlock.registerRenderLayer();
			GrandWardenBlock.registerRenderLayer();
			ArcherqueenaltarBlock.registerRenderLayer();
			SuperBarrelBlock.registerRenderLayer();
			ClanCastleLv1Block.registerRenderLayer();
			ClanCastleLevel2Block.registerRenderLayer();
			ElixirStorageLv1Block.registerRenderLayer();
			ElixirStorageLv2Block.registerRenderLayer();
			ElixirStorageLiv3Block.registerRenderLayer();
			BombBlock.registerRenderLayer();
			SpringTrapBlock.registerRenderLayer();
			GiantBombBlock.registerRenderLayer();
			TownHallLv1Block.registerRenderLayer();
			TownHallLv2Block.registerRenderLayer();
			TownHallLe3Block.registerRenderLayer();
			TownHallLv4Block.registerRenderLayer();
			TownHallLv5Block.registerRenderLayer();
			BBElixircollectorBlock.registerRenderLayer();
			GrandWardenLv5Block.registerRenderLayer();
			ElixirUpBlock.registerRenderLayer();
			ElxiirStorageUpgradeBlock.registerRenderLayer();
			ClancUpBlock.registerRenderLayer();
			TownHallUpgraderBlock.registerRenderLayer();
			GoldMineUpBlock.registerRenderLayer();
			DarkElixirDrillUpgraderBlock.registerRenderLayer();
			ElixirColletorLevel125Block.registerRenderLayer();
			ElixirCollectorLevel150Block.registerRenderLayer();
			ElixirCollectorLevel175Block.registerRenderLayer();
			ElixirCollectorLevel1100Block.registerRenderLayer();
			ElixirCollectorLevel225Block.registerRenderLayer();
			ElixirCollectorLevel250Block.registerRenderLayer();
			ElixirCollectorLevel275Block.registerRenderLayer();
			ElixirCollectorLevel2100Block.registerRenderLayer();
			DarkElixirDrillLv125Block.registerRenderLayer();
			DarkElixirDrillLv150Block.registerRenderLayer();
			DarkElixirDrill175Block.registerRenderLayer();
			DarkElixirDrill1100Block.registerRenderLayer();
			BBElixircollector25Block.registerRenderLayer();
			BBElixircollector50Block.registerRenderLayer();
			BBElixircollector75Block.registerRenderLayer();
			BBElixircollctor100Block.registerRenderLayer();
			ElixirCollectorLevel325Block.registerRenderLayer();
			ElixirCollectorLevel350Block.registerRenderLayer();
			ElixirCollectorLevel375Block.registerRenderLayer();
			ElixirCollectorLevel3100Block.registerRenderLayer();
			ElixirCollectorLevel425Block.registerRenderLayer();
			ElixirCollecotrLevel450Block.registerRenderLayer();
			ElixirCollectorLevel475Block.registerRenderLayer();
			ElixirCollectorLevel4100Block.registerRenderLayer();
			ElixirCollectorLevel525Block.registerRenderLayer();
			ElixirCollectorLevel550Block.registerRenderLayer();
			ElixirCollectorLevel575Block.registerRenderLayer();
			ElixirCollectorLevel5100Block.registerRenderLayer();
			GoldMineLv125Block.registerRenderLayer();
			GoldMineLv150Block.registerRenderLayer();
			GoldMineLv175Block.registerRenderLayer();
			GoldMineLv1100Block.registerRenderLayer();
			GoldMineLv225Block.registerRenderLayer();
			GoldMineLv250Block.registerRenderLayer();
			GoldMineLv275Block.registerRenderLayer();
			GoldMineLv2100Block.registerRenderLayer();
			DarkElxirDrillLv225Block.registerRenderLayer();
			DarkElixirDrillLv250Block.registerRenderLayer();
			DarkElixirDrillLv275Block.registerRenderLayer();
			DarkElixirDrillLv2100Block.registerRenderLayer();
			DarkElixirDrillLv325Block.registerRenderLayer();
			DarkElixirDrillLv350Block.registerRenderLayer();
			DarkElixirDrillLv375Block.registerRenderLayer();
			DakElixirDrillLv3100Block.registerRenderLayer();
			HSFactoryBlock.registerRenderLayer();
			RageSpellFactoryBlockBlock.registerRenderLayer();
			FrostSpellFactoryBuildingBlock.registerRenderLayer();
			JumpSpellFactoryIBlock.registerRenderLayer();
			DecorationClanBlock.registerRenderLayer();
		}
	}
}
