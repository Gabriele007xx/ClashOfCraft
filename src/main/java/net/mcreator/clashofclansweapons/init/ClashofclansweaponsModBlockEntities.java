
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.clashofclansweapons.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.clashofclansweapons.block.entity.TownHallUpgraderBlockEntity;
import net.mcreator.clashofclansweapons.block.entity.TownHallLv1BlockEntity;
import net.mcreator.clashofclansweapons.block.entity.SpellFactoryBlockEntity;
import net.mcreator.clashofclansweapons.block.entity.RageSpellFactoryBlockBlockEntity;
import net.mcreator.clashofclansweapons.block.entity.JumpSpellFactoryIBlockEntity;
import net.mcreator.clashofclansweapons.block.entity.HSFactoryBlockEntity;
import net.mcreator.clashofclansweapons.block.entity.GrandWardenLv5BlockEntity;
import net.mcreator.clashofclansweapons.block.entity.GrandWardenBlockEntity;
import net.mcreator.clashofclansweapons.block.entity.GoldMineUpBlockEntity;
import net.mcreator.clashofclansweapons.block.entity.GoldMineLv2BlockEntity;
import net.mcreator.clashofclansweapons.block.entity.GoldMineLv275BlockEntity;
import net.mcreator.clashofclansweapons.block.entity.GoldMineLv250BlockEntity;
import net.mcreator.clashofclansweapons.block.entity.GoldMineLv225BlockEntity;
import net.mcreator.clashofclansweapons.block.entity.GoldMineLv2100BlockEntity;
import net.mcreator.clashofclansweapons.block.entity.GoldMineLv1BlockEntity;
import net.mcreator.clashofclansweapons.block.entity.GoldMineLv175BlockEntity;
import net.mcreator.clashofclansweapons.block.entity.GoldMineLv150BlockEntity;
import net.mcreator.clashofclansweapons.block.entity.GoldMineLv125BlockEntity;
import net.mcreator.clashofclansweapons.block.entity.GoldMineLv1100BlockEntity;
import net.mcreator.clashofclansweapons.block.entity.FrostSpellFactoryBuildingBlockEntity;
import net.mcreator.clashofclansweapons.block.entity.ElxiirStorageUpgradeBlockEntity;
import net.mcreator.clashofclansweapons.block.entity.ElixirUpBlockEntity;
import net.mcreator.clashofclansweapons.block.entity.ElixirStorageLv2BlockEntity;
import net.mcreator.clashofclansweapons.block.entity.ElixirStorageLiv3BlockEntity;
import net.mcreator.clashofclansweapons.block.entity.ElixirColletorLevel125BlockEntity;
import net.mcreator.clashofclansweapons.block.entity.ElixirCollectorLevel5BlockEntity;
import net.mcreator.clashofclansweapons.block.entity.ElixirCollectorLevel575BlockEntity;
import net.mcreator.clashofclansweapons.block.entity.ElixirCollectorLevel550BlockEntity;
import net.mcreator.clashofclansweapons.block.entity.ElixirCollectorLevel525BlockEntity;
import net.mcreator.clashofclansweapons.block.entity.ElixirCollectorLevel5100BlockEntity;
import net.mcreator.clashofclansweapons.block.entity.ElixirCollectorLevel4BlockEntity;
import net.mcreator.clashofclansweapons.block.entity.ElixirCollectorLevel475BlockEntity;
import net.mcreator.clashofclansweapons.block.entity.ElixirCollectorLevel425BlockEntity;
import net.mcreator.clashofclansweapons.block.entity.ElixirCollectorLevel4100BlockEntity;
import net.mcreator.clashofclansweapons.block.entity.ElixirCollectorLevel3BlockEntity;
import net.mcreator.clashofclansweapons.block.entity.ElixirCollectorLevel375BlockEntity;
import net.mcreator.clashofclansweapons.block.entity.ElixirCollectorLevel350BlockEntity;
import net.mcreator.clashofclansweapons.block.entity.ElixirCollectorLevel325BlockEntity;
import net.mcreator.clashofclansweapons.block.entity.ElixirCollectorLevel3100BlockEntity;
import net.mcreator.clashofclansweapons.block.entity.ElixirCollectorLevel2BlockEntity;
import net.mcreator.clashofclansweapons.block.entity.ElixirCollectorLevel275BlockEntity;
import net.mcreator.clashofclansweapons.block.entity.ElixirCollectorLevel250BlockEntity;
import net.mcreator.clashofclansweapons.block.entity.ElixirCollectorLevel225BlockEntity;
import net.mcreator.clashofclansweapons.block.entity.ElixirCollectorLevel2100BlockEntity;
import net.mcreator.clashofclansweapons.block.entity.ElixirCollectorLevel1BlockEntity;
import net.mcreator.clashofclansweapons.block.entity.ElixirCollectorLevel175BlockEntity;
import net.mcreator.clashofclansweapons.block.entity.ElixirCollectorLevel150BlockEntity;
import net.mcreator.clashofclansweapons.block.entity.ElixirCollectorLevel1100BlockEntity;
import net.mcreator.clashofclansweapons.block.entity.ElixirCollecotrLevel450BlockEntity;
import net.mcreator.clashofclansweapons.block.entity.DarkElxirDrillLv225BlockEntity;
import net.mcreator.clashofclansweapons.block.entity.DarkElixirStorageLv9BlockEntity;
import net.mcreator.clashofclansweapons.block.entity.DarkElixirStorageLv8BlockEntity;
import net.mcreator.clashofclansweapons.block.entity.DarkElixirStorageLv7BlockEntity;
import net.mcreator.clashofclansweapons.block.entity.DarkElixirStorageLevel6BlockEntity;
import net.mcreator.clashofclansweapons.block.entity.DarkElixirDrillUpgraderBlockEntity;
import net.mcreator.clashofclansweapons.block.entity.DarkElixirDrillLv3BlockEntity;
import net.mcreator.clashofclansweapons.block.entity.DarkElixirDrillLv375BlockEntity;
import net.mcreator.clashofclansweapons.block.entity.DarkElixirDrillLv350BlockEntity;
import net.mcreator.clashofclansweapons.block.entity.DarkElixirDrillLv325BlockEntity;
import net.mcreator.clashofclansweapons.block.entity.DarkElixirDrillLv2BlockEntity;
import net.mcreator.clashofclansweapons.block.entity.DarkElixirDrillLv275BlockEntity;
import net.mcreator.clashofclansweapons.block.entity.DarkElixirDrillLv250BlockEntity;
import net.mcreator.clashofclansweapons.block.entity.DarkElixirDrillLv2100BlockEntity;
import net.mcreator.clashofclansweapons.block.entity.DarkElixirDrillLv1BlockEntity;
import net.mcreator.clashofclansweapons.block.entity.DarkElixirDrillLv150BlockEntity;
import net.mcreator.clashofclansweapons.block.entity.DarkElixirDrillLv125BlockEntity;
import net.mcreator.clashofclansweapons.block.entity.DarkElixirDrill175BlockEntity;
import net.mcreator.clashofclansweapons.block.entity.DarkElixirDrill1100BlockEntity;
import net.mcreator.clashofclansweapons.block.entity.DarkBarracksBlockEntity;
import net.mcreator.clashofclansweapons.block.entity.DakElixirDrillLv3100BlockEntity;
import net.mcreator.clashofclansweapons.block.entity.ClancUpBlockEntity;
import net.mcreator.clashofclansweapons.block.entity.ClanCastleLv1BlockEntity;
import net.mcreator.clashofclansweapons.block.entity.ClanCastleLevel2BlockEntity;
import net.mcreator.clashofclansweapons.block.entity.BarracksBlockEntity;
import net.mcreator.clashofclansweapons.block.entity.BBElixircollectorBlockEntity;
import net.mcreator.clashofclansweapons.block.entity.BBElixircollector75BlockEntity;
import net.mcreator.clashofclansweapons.block.entity.BBElixircollector50BlockEntity;
import net.mcreator.clashofclansweapons.block.entity.BBElixircollector25BlockEntity;
import net.mcreator.clashofclansweapons.block.entity.BBElixircollctor100BlockEntity;
import net.mcreator.clashofclansweapons.block.entity.BBBaracksBlockEntity;
import net.mcreator.clashofclansweapons.ClashofclansweaponsMod;

public class ClashofclansweaponsModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES,
			ClashofclansweaponsMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> ELIXIR_COLLECTOR_LEVEL_1 = register("elixir_collector_level_1",
			ClashofclansweaponsModBlocks.ELIXIR_COLLECTOR_LEVEL_1, ElixirCollectorLevel1BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> ELIXIR_COLLECTOR_LEVEL_2 = register("elixir_collector_level_2",
			ClashofclansweaponsModBlocks.ELIXIR_COLLECTOR_LEVEL_2, ElixirCollectorLevel2BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> ELIXIR_COLLECTOR_LEVEL_3 = register("elixir_collector_level_3",
			ClashofclansweaponsModBlocks.ELIXIR_COLLECTOR_LEVEL_3, ElixirCollectorLevel3BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> ELIXIR_COLLECTOR_LEVEL_4 = register("elixir_collector_level_4",
			ClashofclansweaponsModBlocks.ELIXIR_COLLECTOR_LEVEL_4, ElixirCollectorLevel4BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> ELIXIR_COLLECTOR_LEVEL_5 = register("elixir_collector_level_5",
			ClashofclansweaponsModBlocks.ELIXIR_COLLECTOR_LEVEL_5, ElixirCollectorLevel5BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> DARK_ELIXIR_DRILL_LV_1 = register("dark_elixir_drill_lv_1",
			ClashofclansweaponsModBlocks.DARK_ELIXIR_DRILL_LV_1, DarkElixirDrillLv1BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> DARK_ELIXIR_DRILL_LV_2 = register("dark_elixir_drill_lv_2",
			ClashofclansweaponsModBlocks.DARK_ELIXIR_DRILL_LV_2, DarkElixirDrillLv2BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> DARK_ELIXIR_DRILL_LV_3 = register("dark_elixir_drill_lv_3",
			ClashofclansweaponsModBlocks.DARK_ELIXIR_DRILL_LV_3, DarkElixirDrillLv3BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> DARK_ELIXIR_STORAGE_LEVEL_6 = register("dark_elixir_storage_level_6",
			ClashofclansweaponsModBlocks.DARK_ELIXIR_STORAGE_LEVEL_6, DarkElixirStorageLevel6BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> DARK_ELIXIR_STORAGE_LV_7 = register("dark_elixir_storage_lv_7",
			ClashofclansweaponsModBlocks.DARK_ELIXIR_STORAGE_LV_7, DarkElixirStorageLv7BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> DARK_ELIXIR_STORAGE_LV_8 = register("dark_elixir_storage_lv_8",
			ClashofclansweaponsModBlocks.DARK_ELIXIR_STORAGE_LV_8, DarkElixirStorageLv8BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> DARK_ELIXIR_STORAGE_LV_9 = register("dark_elixir_storage_lv_9",
			ClashofclansweaponsModBlocks.DARK_ELIXIR_STORAGE_LV_9, DarkElixirStorageLv9BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> GOLD_MINE_LV_1 = register("gold_mine_lv_1", ClashofclansweaponsModBlocks.GOLD_MINE_LV_1,
			GoldMineLv1BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> GOLD_MINE_LV_2 = register("gold_mine_lv_2", ClashofclansweaponsModBlocks.GOLD_MINE_LV_2,
			GoldMineLv2BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BARRACKS = register("barracks", ClashofclansweaponsModBlocks.BARRACKS,
			BarracksBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> DARK_BARRACKS = register("dark_barracks", ClashofclansweaponsModBlocks.DARK_BARRACKS,
			DarkBarracksBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BB_BARACKS = register("bb_baracks", ClashofclansweaponsModBlocks.BB_BARACKS,
			BBBaracksBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> SPELL_FACTORY = register("spell_factory", ClashofclansweaponsModBlocks.SPELL_FACTORY,
			SpellFactoryBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> GRAND_WARDEN = register("grand_warden", ClashofclansweaponsModBlocks.GRAND_WARDEN,
			GrandWardenBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CLAN_CASTLE_LV_1 = register("clan_castle_lv_1",
			ClashofclansweaponsModBlocks.CLAN_CASTLE_LV_1, ClanCastleLv1BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CLAN_CASTLE_LEVEL_2 = register("clan_castle_level_2",
			ClashofclansweaponsModBlocks.CLAN_CASTLE_LEVEL_2, ClanCastleLevel2BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> ELIXIR_STORAGE_LV_2 = register("elixir_storage_lv_2",
			ClashofclansweaponsModBlocks.ELIXIR_STORAGE_LV_2, ElixirStorageLv2BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> ELIXIR_STORAGE_LIV_3 = register("elixir_storage_liv_3",
			ClashofclansweaponsModBlocks.ELIXIR_STORAGE_LIV_3, ElixirStorageLiv3BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> TOWN_HALL_LV_1 = register("town_hall_lv_1", ClashofclansweaponsModBlocks.TOWN_HALL_LV_1,
			TownHallLv1BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BB_ELIXIRCOLLECTOR = register("bb_elixircollector",
			ClashofclansweaponsModBlocks.BB_ELIXIRCOLLECTOR, BBElixircollectorBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> GRAND_WARDEN_LV_5 = register("grand_warden_lv_5",
			ClashofclansweaponsModBlocks.GRAND_WARDEN_LV_5, GrandWardenLv5BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> ELIXIR_UP = register("elixir_up", ClashofclansweaponsModBlocks.ELIXIR_UP,
			ElixirUpBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> ELXIIR_STORAGE_UPGRADE = register("elxiir_storage_upgrade",
			ClashofclansweaponsModBlocks.ELXIIR_STORAGE_UPGRADE, ElxiirStorageUpgradeBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CLANC_UP = register("clanc_up", ClashofclansweaponsModBlocks.CLANC_UP,
			ClancUpBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> TOWN_HALL_UPGRADER = register("town_hall_upgrader",
			ClashofclansweaponsModBlocks.TOWN_HALL_UPGRADER, TownHallUpgraderBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> GOLD_MINE_UP = register("gold_mine_up", ClashofclansweaponsModBlocks.GOLD_MINE_UP,
			GoldMineUpBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> DARK_ELIXIR_DRILL_UPGRADER = register("dark_elixir_drill_upgrader",
			ClashofclansweaponsModBlocks.DARK_ELIXIR_DRILL_UPGRADER, DarkElixirDrillUpgraderBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> ELIXIR_COLLETOR_LEVEL_125 = register("elixir_colletor_level_125",
			ClashofclansweaponsModBlocks.ELIXIR_COLLETOR_LEVEL_125, ElixirColletorLevel125BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> ELIXIR_COLLECTOR_LEVEL_150 = register("elixir_collector_level_150",
			ClashofclansweaponsModBlocks.ELIXIR_COLLECTOR_LEVEL_150, ElixirCollectorLevel150BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> ELIXIR_COLLECTOR_LEVEL_175 = register("elixir_collector_level_175",
			ClashofclansweaponsModBlocks.ELIXIR_COLLECTOR_LEVEL_175, ElixirCollectorLevel175BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> ELIXIR_COLLECTOR_LEVEL_1100 = register("elixir_collector_level_1100",
			ClashofclansweaponsModBlocks.ELIXIR_COLLECTOR_LEVEL_1100, ElixirCollectorLevel1100BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> ELIXIR_COLLECTOR_LEVEL_225 = register("elixir_collector_level_225",
			ClashofclansweaponsModBlocks.ELIXIR_COLLECTOR_LEVEL_225, ElixirCollectorLevel225BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> ELIXIR_COLLECTOR_LEVEL_250 = register("elixir_collector_level_250",
			ClashofclansweaponsModBlocks.ELIXIR_COLLECTOR_LEVEL_250, ElixirCollectorLevel250BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> ELIXIR_COLLECTOR_LEVEL_275 = register("elixir_collector_level_275",
			ClashofclansweaponsModBlocks.ELIXIR_COLLECTOR_LEVEL_275, ElixirCollectorLevel275BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> ELIXIR_COLLECTOR_LEVEL_2100 = register("elixir_collector_level_2100",
			ClashofclansweaponsModBlocks.ELIXIR_COLLECTOR_LEVEL_2100, ElixirCollectorLevel2100BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> DARK_ELIXIR_DRILL_LV_125 = register("dark_elixir_drill_lv_125",
			ClashofclansweaponsModBlocks.DARK_ELIXIR_DRILL_LV_125, DarkElixirDrillLv125BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> DARK_ELIXIR_DRILL_LV_150 = register("dark_elixir_drill_lv_150",
			ClashofclansweaponsModBlocks.DARK_ELIXIR_DRILL_LV_150, DarkElixirDrillLv150BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> DARK_ELIXIR_DRILL_175 = register("dark_elixir_drill_175",
			ClashofclansweaponsModBlocks.DARK_ELIXIR_DRILL_175, DarkElixirDrill175BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> DARK_ELIXIR_DRILL_1100 = register("dark_elixir_drill_1100",
			ClashofclansweaponsModBlocks.DARK_ELIXIR_DRILL_1100, DarkElixirDrill1100BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BB_ELIXIRCOLLECTOR_25 = register("bb_elixircollector_25",
			ClashofclansweaponsModBlocks.BB_ELIXIRCOLLECTOR_25, BBElixircollector25BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BB_ELIXIRCOLLECTOR_50 = register("bb_elixircollector_50",
			ClashofclansweaponsModBlocks.BB_ELIXIRCOLLECTOR_50, BBElixircollector50BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BB_ELIXIRCOLLECTOR_75 = register("bb_elixircollector_75",
			ClashofclansweaponsModBlocks.BB_ELIXIRCOLLECTOR_75, BBElixircollector75BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BB_ELIXIRCOLLCTOR_100 = register("bb_elixircollctor_100",
			ClashofclansweaponsModBlocks.BB_ELIXIRCOLLCTOR_100, BBElixircollctor100BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> ELIXIR_COLLECTOR_LEVEL_325 = register("elixir_collector_level_325",
			ClashofclansweaponsModBlocks.ELIXIR_COLLECTOR_LEVEL_325, ElixirCollectorLevel325BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> ELIXIR_COLLECTOR_LEVEL_350 = register("elixir_collector_level_350",
			ClashofclansweaponsModBlocks.ELIXIR_COLLECTOR_LEVEL_350, ElixirCollectorLevel350BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> ELIXIR_COLLECTOR_LEVEL_375 = register("elixir_collector_level_375",
			ClashofclansweaponsModBlocks.ELIXIR_COLLECTOR_LEVEL_375, ElixirCollectorLevel375BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> ELIXIR_COLLECTOR_LEVEL_3100 = register("elixir_collector_level_3100",
			ClashofclansweaponsModBlocks.ELIXIR_COLLECTOR_LEVEL_3100, ElixirCollectorLevel3100BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> ELIXIR_COLLECTOR_LEVEL_425 = register("elixir_collector_level_425",
			ClashofclansweaponsModBlocks.ELIXIR_COLLECTOR_LEVEL_425, ElixirCollectorLevel425BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> ELIXIR_COLLECOTR_LEVEL_450 = register("elixir_collecotr_level_450",
			ClashofclansweaponsModBlocks.ELIXIR_COLLECOTR_LEVEL_450, ElixirCollecotrLevel450BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> ELIXIR_COLLECTOR_LEVEL_475 = register("elixir_collector_level_475",
			ClashofclansweaponsModBlocks.ELIXIR_COLLECTOR_LEVEL_475, ElixirCollectorLevel475BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> ELIXIR_COLLECTOR_LEVEL_4100 = register("elixir_collector_level_4100",
			ClashofclansweaponsModBlocks.ELIXIR_COLLECTOR_LEVEL_4100, ElixirCollectorLevel4100BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> ELIXIR_COLLECTOR_LEVEL_525 = register("elixir_collector_level_525",
			ClashofclansweaponsModBlocks.ELIXIR_COLLECTOR_LEVEL_525, ElixirCollectorLevel525BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> ELIXIR_COLLECTOR_LEVEL_550 = register("elixir_collector_level_550",
			ClashofclansweaponsModBlocks.ELIXIR_COLLECTOR_LEVEL_550, ElixirCollectorLevel550BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> ELIXIR_COLLECTOR_LEVEL_575 = register("elixir_collector_level_575",
			ClashofclansweaponsModBlocks.ELIXIR_COLLECTOR_LEVEL_575, ElixirCollectorLevel575BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> ELIXIR_COLLECTOR_LEVEL_5100 = register("elixir_collector_level_5100",
			ClashofclansweaponsModBlocks.ELIXIR_COLLECTOR_LEVEL_5100, ElixirCollectorLevel5100BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> GOLD_MINE_LV_125 = register("gold_mine_lv_125",
			ClashofclansweaponsModBlocks.GOLD_MINE_LV_125, GoldMineLv125BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> GOLD_MINE_LV_150 = register("gold_mine_lv_150",
			ClashofclansweaponsModBlocks.GOLD_MINE_LV_150, GoldMineLv150BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> GOLD_MINE_LV_175 = register("gold_mine_lv_175",
			ClashofclansweaponsModBlocks.GOLD_MINE_LV_175, GoldMineLv175BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> GOLD_MINE_LV_1100 = register("gold_mine_lv_1100",
			ClashofclansweaponsModBlocks.GOLD_MINE_LV_1100, GoldMineLv1100BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> GOLD_MINE_LV_225 = register("gold_mine_lv_225",
			ClashofclansweaponsModBlocks.GOLD_MINE_LV_225, GoldMineLv225BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> GOLD_MINE_LV_250 = register("gold_mine_lv_250",
			ClashofclansweaponsModBlocks.GOLD_MINE_LV_250, GoldMineLv250BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> GOLD_MINE_LV_275 = register("gold_mine_lv_275",
			ClashofclansweaponsModBlocks.GOLD_MINE_LV_275, GoldMineLv275BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> GOLD_MINE_LV_2100 = register("gold_mine_lv_2100",
			ClashofclansweaponsModBlocks.GOLD_MINE_LV_2100, GoldMineLv2100BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> DARK_ELXIR_DRILL_LV_225 = register("dark_elxir_drill_lv_225",
			ClashofclansweaponsModBlocks.DARK_ELXIR_DRILL_LV_225, DarkElxirDrillLv225BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> DARK_ELIXIR_DRILL_LV_250 = register("dark_elixir_drill_lv_250",
			ClashofclansweaponsModBlocks.DARK_ELIXIR_DRILL_LV_250, DarkElixirDrillLv250BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> DARK_ELIXIR_DRILL_LV_275 = register("dark_elixir_drill_lv_275",
			ClashofclansweaponsModBlocks.DARK_ELIXIR_DRILL_LV_275, DarkElixirDrillLv275BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> DARK_ELIXIR_DRILL_LV_2100 = register("dark_elixir_drill_lv_2100",
			ClashofclansweaponsModBlocks.DARK_ELIXIR_DRILL_LV_2100, DarkElixirDrillLv2100BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> DARK_ELIXIR_DRILL_LV_325 = register("dark_elixir_drill_lv_325",
			ClashofclansweaponsModBlocks.DARK_ELIXIR_DRILL_LV_325, DarkElixirDrillLv325BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> DARK_ELIXIR_DRILL_LV_350 = register("dark_elixir_drill_lv_350",
			ClashofclansweaponsModBlocks.DARK_ELIXIR_DRILL_LV_350, DarkElixirDrillLv350BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> DARK_ELIXIR_DRILL_LV_375 = register("dark_elixir_drill_lv_375",
			ClashofclansweaponsModBlocks.DARK_ELIXIR_DRILL_LV_375, DarkElixirDrillLv375BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> DAK_ELIXIR_DRILL_LV_3100 = register("dak_elixir_drill_lv_3100",
			ClashofclansweaponsModBlocks.DAK_ELIXIR_DRILL_LV_3100, DakElixirDrillLv3100BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> HS_FACTORY = register("hs_factory", ClashofclansweaponsModBlocks.HS_FACTORY,
			HSFactoryBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> RAGE_SPELL_FACTORY_BLOCK = register("rage_spell_factory_block",
			ClashofclansweaponsModBlocks.RAGE_SPELL_FACTORY_BLOCK, RageSpellFactoryBlockBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> FROST_SPELL_FACTORY_BUILDING = register("frost_spell_factory_building",
			ClashofclansweaponsModBlocks.FROST_SPELL_FACTORY_BUILDING, FrostSpellFactoryBuildingBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> JUMP_SPELL_FACTORY_I = register("jump_spell_factory_i",
			ClashofclansweaponsModBlocks.JUMP_SPELL_FACTORY_I, JumpSpellFactoryIBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block,
			BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
