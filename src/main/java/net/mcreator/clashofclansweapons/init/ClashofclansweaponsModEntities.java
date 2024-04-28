
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.clashofclansweapons.init;

import net.mcreator.clashofclansweapons.entity.*;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.clashofclansweapons.ClashofclansweaponsMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClashofclansweaponsModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITIES, ClashofclansweaponsMod.MODID);
	public static final RegistryObject<EntityType<WitchStickSkullEntity>> WITCH_STICK_SKULL = register("projectile_witch_stick_skull",
			EntityType.Builder.<WitchStickSkullEntity>of(WitchStickSkullEntity::new, MobCategory.MISC)
					.setCustomClientFactory(WitchStickSkullEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<Pekkalevel1Entity>> PEKKALEVEL_1 = register("pekkalevel_1",
			EntityType.Builder.<Pekkalevel1Entity>of(Pekkalevel1Entity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Pekkalevel1Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<Pekkalevel2Entity>> PEKKALEVEL_2 = register("pekkalevel_2",
			EntityType.Builder.<Pekkalevel2Entity>of(Pekkalevel2Entity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Pekkalevel2Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<XbowLv1Entity>> XBOW_LV_1 = register("xbow_lv_1",
			EntityType.Builder.<XbowLv1Entity>of(XbowLv1Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(XbowLv1Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<MortarLv10EEntity>> MORTAR_LV_10_E = register("mortar_lv_10_e",
			EntityType.Builder.<MortarLv10EEntity>of(MortarLv10EEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MortarLv10EEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ArcherQueenEntity>> ARCHER_QUEEN = register("archer_queen",
			EntityType.Builder.<ArcherQueenEntity>of(ArcherQueenEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ArcherQueenEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EagleArtilleryEntity>> EAGLE_ARTILLERY = register("eagle_artillery",
			EntityType.Builder.<EagleArtilleryEntity>of(EagleArtilleryEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EagleArtilleryEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BMachineEntity>> B_MACHINE = register("b_machine",
			EntityType.Builder.<BMachineEntity>of(BMachineEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(BMachineEntity::new).fireImmune().sized(0.6f, 3f));
	public static final RegistryObject<EntityType<BuilderEntity>> BUILDER = register("builder",
			EntityType.Builder.<BuilderEntity>of(BuilderEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(BuilderEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ScattershotEntity>> SCATTERSHOT = register("scattershot",
			EntityType.Builder.<ScattershotEntity>of(ScattershotEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ScattershotEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<HogRiderEntity>> HOG_RIDER = register("hog_rider",
			EntityType.Builder.<HogRiderEntity>of(HogRiderEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(HogRiderEntity::new)

					.sized(1f, 1f));
	public static final RegistryObject<EntityType<InfernoTowerEntity>> INFERNO_TOWER = register("inferno_tower",
			EntityType.Builder.<InfernoTowerEntity>of(InfernoTowerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(InfernoTowerEntity::new).fireImmune().sized(0.1f, 0.5f));
	public static final RegistryObject<EntityType<WizardEntity>> WIZARD = register("wizard",
			EntityType.Builder.<WizardEntity>of(WizardEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(WizardEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<CannonLv1Entity>> CANNON_LV_1 = register("cannon_lv_1",
			EntityType.Builder.<CannonLv1Entity>of(CannonLv1Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CannonLv1Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<UnicornEntity>> UNICORN = register("unicorn",
			EntityType.Builder.<UnicornEntity>of(UnicornEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(UnicornEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<LASSIEntity>> LASSI = register("lassi",
			EntityType.Builder.<LASSIEntity>of(LASSIEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(LASSIEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<WitchSkeletonEntity>> WITCH_SKELETON = register("witch_skeleton",
			EntityType.Builder.<WitchSkeletonEntity>of(WitchSkeletonEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(WitchSkeletonEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<WitchCocEntity>> WITCH_COC = register("witch_coc",
			EntityType.Builder.<WitchCocEntity>of(WitchCocEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(WitchCocEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BigBoyEntity>> BIG_BOY = register("big_boy",
			EntityType.Builder.<BigBoyEntity>of(BigBoyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(BigBoyEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<NightWitchEntity>> NIGHT_WITCH = register("night_witch",
			EntityType.Builder.<NightWitchEntity>of(NightWitchEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(NightWitchEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<NightWitchBatEntity>> NIGHT_WITCH_BAT = register("night_witch_bat",
			EntityType.Builder.<NightWitchBatEntity>of(NightWitchBatEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(NightWitchBatEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<GiantCocEntity>> GIANT_COC = register("giant_coc",
			EntityType.Builder.<GiantCocEntity>of(GiantCocEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(GiantCocEntity::new)

					.sized(1f, 5f));
	public static final RegistryObject<EntityType<DragonEntity>> DRAGON = register("dragon",
			EntityType.Builder.<DragonEntity>of(DragonEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(DragonEntity::new)

					.sized(3f, 1f));
	public static final RegistryObject<EntityType<ElectroOwlEntity>> ELECTRO_OWL = register("electro_owl",
			EntityType.Builder.<ElectroOwlEntity>of(ElectroOwlEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ElectroOwlEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BattleMachineLv10Entity>> BATTLE_MACHINE_LV_10 = register("battle_machine_lv_10",
			EntityType.Builder.<BattleMachineLv10Entity>of(BattleMachineLv10Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BattleMachineLv10Entity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BattleMachineLv20Entity>> BATTLE_MACHINE_LV_20 = register("battle_machine_lv_20",
			EntityType.Builder.<BattleMachineLv20Entity>of(BattleMachineLv20Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BattleMachineLv20Entity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<SuperWitchEntity>> SUPER_WITCH = register("super_witch",
			EntityType.Builder.<SuperWitchEntity>of(SuperWitchEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SuperWitchEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<CannonCartEntity>> CANNON_CART = register("cannon_cart",
			EntityType.Builder.<CannonCartEntity>of(CannonCartEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CannonCartEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<CannonCartStillEntity>> CANNON_CART_POSE = register("cannon_cart_pose",
			EntityType.Builder.<CannonCartStillEntity>of(CannonCartStillEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CannonCartStillEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<AirDefenceEntity>> AIR_DEFENCE = register("air_defence",
			EntityType.Builder.<AirDefenceEntity>of(AirDefenceEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AirDefenceEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BattleBuilderHutLeveltwoEntity>> BATTLE_BUILDER_HUT_LEVELTWO = register(
			"battle_builder_hut_leveltwo",
			EntityType.Builder.<BattleBuilderHutLeveltwoEntity>of(BattleBuilderHutLeveltwoEntity::new, MobCategory.MONSTER)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(BattleBuilderHutLeveltwoEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ValkiryeEntity>> VALKIRYE = register("valkirye",
			EntityType.Builder.<ValkiryeEntity>of(ValkiryeEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(ValkiryeEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<MortarLv14Entity>> MORTAR_LV_14 = register("mortar_lv_14",
			EntityType.Builder.<MortarLv14Entity>of(MortarLv14Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MortarLv14Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<WallWreckerEntity>> WALL_WRECKER = register("wall_wrecker",
			EntityType.Builder.<WallWreckerEntity>of(WallWreckerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(WallWreckerEntity::new)

					.sized(2.5f, 2f));
	public static final RegistryObject<EntityType<MortarLv1EntityEntity>> MORTAR_LV_1_ENTITY = register("mortar_lv_1_entity",
			EntityType.Builder.<MortarLv1EntityEntity>of(MortarLv1EntityEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MortarLv1EntityEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<SiegeBarracksEntity>> SIEGE_BARRACKS = register("siege_barracks",
			EntityType.Builder.<SiegeBarracksEntity>of(SiegeBarracksEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SiegeBarracksEntity::new)

					.sized(3f, 3f));
	public static final RegistryObject<EntityType<FireSpiritEntity>> FIRE_SPIRIT = register("fire_spirit",
			EntityType.Builder.<FireSpiritEntity>of(FireSpiritEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(FireSpiritEntity::new).fireImmune().sized(0.5f, 0.9f));
	public static final RegistryObject<EntityType<FlameFingerWeaponEntity>> FLAME_FINGER_WEAPON = register("flame_finger_weapon",
			EntityType.Builder.<FlameFingerWeaponEntity>of(FlameFingerWeaponEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(FlameFingerWeaponEntity::new)

					.sized(2.5f, 1.3f));
	public static final RegistryObject<EntityType<TownHallLv12Entity>> TOWN_HALL_LV_12 = register("town_hall_lv_12",
			EntityType.Builder.<TownHallLv12Entity>of(TownHallLv12Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TownHallLv12Entity::new)

					.sized(5.8f, 5.6f));
	public static final RegistryObject<EntityType<DoubleCannonShotgunEntity>> DOUBLE_CANNON_SHOTGUN = register("projectile_double_cannon_shotgun",
			EntityType.Builder.<DoubleCannonShotgunEntity>of(DoubleCannonShotgunEntity::new, MobCategory.MISC)
					.setCustomClientFactory(DoubleCannonShotgunEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<XbowEntity>> ICSBOW = register("projectile_icsbow",
			EntityType.Builder.<XbowEntity>of(XbowEntity::new, MobCategory.MISC).setCustomClientFactory(XbowEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<ScattershotLv1Entity>> SCATTERSHOT_LV_1 = register("projectile_scattershot_lv_1",
			EntityType.Builder.<ScattershotLv1Entity>of(ScattershotLv1Entity::new, MobCategory.MISC).setCustomClientFactory(ScattershotLv1Entity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<MortarLv1Entity>> MORTAR_LV_1 = register("projectile_mortar_lv_1",
			EntityType.Builder.<MortarLv1Entity>of(MortarLv1Entity::new, MobCategory.MISC).setCustomClientFactory(MortarLv1Entity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<LavaLauncherLv1Entity>> LAVA_LAUNCHER_LV_1 = register("projectile_lava_launcher_lv_1",
			EntityType.Builder.<LavaLauncherLv1Entity>of(LavaLauncherLv1Entity::new, MobCategory.MISC)
					.setCustomClientFactory(LavaLauncherLv1Entity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<MortarLv5Entity>> MORTAR_LV_5 = register("projectile_mortar_lv_5",
			EntityType.Builder.<MortarLv5Entity>of(MortarLv5Entity::new, MobCategory.MISC).setCustomClientFactory(MortarLv5Entity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<MortarLv8Entity>> MORTAR_LV_8 = register("projectile_mortar_lv_8",
			EntityType.Builder.<MortarLv8Entity>of(MortarLv8Entity::new, MobCategory.MISC).setCustomClientFactory(MortarLv8Entity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<MortarLv10Entity>> MORTAR_LV_10 = register("projectile_mortar_lv_10",
			EntityType.Builder.<MortarLv10Entity>of(MortarLv10Entity::new, MobCategory.MISC).setCustomClientFactory(MortarLv10Entity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<MortarLv12Entity>> MORTAR_LV_12 = register("projectile_mortar_lv_12",
			EntityType.Builder.<MortarLv12Entity>of(MortarLv12Entity::new, MobCategory.MISC).setCustomClientFactory(MortarLv12Entity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<MortarLv13Entity>> MORTAR_LV_13 = register("projectile_mortar_lv_13",
			EntityType.Builder.<MortarLv13Entity>of(MortarLv13Entity::new, MobCategory.MISC).setCustomClientFactory(MortarLv13Entity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<EaEntity>> EA = register("projectile_ea",
			EntityType.Builder.<EaEntity>of(EaEntity::new, MobCategory.MISC).setCustomClientFactory(EaEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<InfernoTowerLv1ItemEntity>> INFERNO_TOWER_LV_1_ITEM = register("projectile_inferno_tower_lv_1_item",
			EntityType.Builder.<InfernoTowerLv1ItemEntity>of(InfernoTowerLv1ItemEntity::new, MobCategory.MISC)
					.setCustomClientFactory(InfernoTowerLv1ItemEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<WizardProjectileEntity>> WIZARD_PROJECTILE = register("projectile_wizard_projectile",
			EntityType.Builder.<WizardProjectileEntity>of(WizardProjectileEntity::new, MobCategory.MISC)
					.setCustomClientFactory(WizardProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<CannonLv1ProjectileEntity>> CANNON_LV_1_PROJECTILE = register("projectile_cannon_lv_1_projectile",
			EntityType.Builder.<CannonLv1ProjectileEntity>of(CannonLv1ProjectileEntity::new, MobCategory.MISC)
					.setCustomClientFactory(CannonLv1ProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<UnicornHealEntity>> UNICORN_HEAL = register("projectile_unicorn_heal",
			EntityType.Builder.<UnicornHealEntity>of(UnicornHealEntity::new, MobCategory.MISC).setCustomClientFactory(UnicornHealEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<DragonWeaponEntity>> DRAGON_WEAPON = register("projectile_dragon_weapon",
			EntityType.Builder.<DragonWeaponEntity>of(DragonWeaponEntity::new, MobCategory.MISC).setCustomClientFactory(DragonWeaponEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<ElectroOwlRAGEDEntity>> ELECTRO_OWL_RAGED = register("projectile_electro_owl_raged",
			EntityType.Builder.<ElectroOwlRAGEDEntity>of(ElectroOwlRAGEDEntity::new, MobCategory.MISC)
					.setCustomClientFactory(ElectroOwlRAGEDEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<CannonCartLv1RangedItemEntity>> CANNON_CART_LV_1_RANGED_ITEM = register(
			"projectile_cannon_cart_lv_1_ranged_item",
			EntityType.Builder.<CannonCartLv1RangedItemEntity>of(CannonCartLv1RangedItemEntity::new, MobCategory.MISC)
					.setCustomClientFactory(CannonCartLv1RangedItemEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<AirdefenceRangedEntity>> AIRDEFENCE_RANGED = register("projectile_airdefence_ranged",
			EntityType.Builder.<AirdefenceRangedEntity>of(AirdefenceRangedEntity::new, MobCategory.MISC)
					.setCustomClientFactory(AirdefenceRangedEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<BattleBuilderHutRagedEntity>> BATTLE_BUILDER_HUT_RAGED = register(
			"projectile_battle_builder_hut_raged",
			EntityType.Builder.<BattleBuilderHutRagedEntity>of(BattleBuilderHutRagedEntity::new, MobCategory.MISC)
					.setCustomClientFactory(BattleBuilderHutRagedEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<MortarLv14RagedEntity>> MORTAR_LV_14_RAGED = register("projectile_mortar_lv_14_raged",
			EntityType.Builder.<MortarLv14RagedEntity>of(MortarLv14RagedEntity::new, MobCategory.MISC)
					.setCustomClientFactory(MortarLv14RagedEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<FFEntity>> FF = register("projectile_ff",
			EntityType.Builder.<FFEntity>of(FFEntity::new, MobCategory.MISC).setCustomClientFactory(FFEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<TownHall12RWEntity>> TOWN_HALL_12_RW = register("projectile_town_hall_12_rw",
			EntityType.Builder.<TownHall12RWEntity>of(TownHall12RWEntity::new, MobCategory.MISC).setCustomClientFactory(TownHall12RWEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<XbowLvTwoniEntity>> XBOW_LV_TWONI = register("xbow_lv_twoni",
			EntityType.Builder.<XbowLvTwoniEntity>of(XbowLvTwoniEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(XbowLvTwoniEntity::new)

					.sized(1.9f, 1.8f));
	public static final RegistryObject<EntityType<DCannonEntity>> D_CANNON = register("d_cannon",
			EntityType.Builder.<DCannonEntity>of(DCannonEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(DCannonEntity::new)

					.sized(1f, 0.6f));
	public static final RegistryObject<EntityType<MultiCannonEntity>> MULTI_CANNON = register("multi_cannon",
			EntityType.Builder.<MultiCannonEntity>of(MultiCannonEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MultiCannonEntity::new)

					.sized(1f, 1.3f));
	public static final RegistryObject<EntityType<RocketREntity>> ROCKET_R = register("projectile_rocket_r",
			EntityType.Builder.<RocketREntity>of(RocketREntity::new, MobCategory.MISC).setCustomClientFactory(RocketREntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<RocketArtileryEntity>> ROCKET_ARTILERY = register("rocket_artilery",
			EntityType.Builder.<RocketArtileryEntity>of(RocketArtileryEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RocketArtileryEntity::new)

					.sized(3.2f, 4f));
	public static final RegistryObject<EntityType<MountainGolemEntity>> MOUNTAIN_GOLEM = register("mountain_golem",
			EntityType.Builder.<MountainGolemEntity>of(MountainGolemEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MountainGolemEntity::new)

					.sized(5.7f, 9f));
	public static final RegistryObject<EntityType<BattleBuilderEntity>> BATTLE_BUILDER = register("battle_builder",
			EntityType.Builder.<BattleBuilderEntity>of(BattleBuilderEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BattleBuilderEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<CC1Entity>> CC_1 = register("projectile_cc_1",
			EntityType.Builder.<CC1Entity>of(CC1Entity::new, MobCategory.MISC).setCustomClientFactory(CC1Entity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<MegatroopEntity>> MEGATROOP = register("megatroop",
			EntityType.Builder.<MegatroopEntity>of(MegatroopEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MegatroopEntity::new)

					.sized(2f, 3f));
	public static final RegistryObject<EntityType<GiantBallsEntity>> GIANT_BALLS = register("projectile_giant_balls",
			EntityType.Builder.<GiantBallsEntity>of(GiantBallsEntity::new, MobCategory.MISC).setCustomClientFactory(GiantBallsEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(1f, 1f));
	public static final RegistryObject<EntityType<GiantCannonBBEntity>> GIANT_CANNON_BB = register("giant_cannon_bb",
			EntityType.Builder.<GiantCannonBBEntity>of(GiantCannonBBEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GiantCannonBBEntity::new)

					.sized(1f, 1f));
	public static final RegistryObject<EntityType<AirBBBEntity>> AIR_BBB = register("air_bbb",
			EntityType.Builder.<AirBBBEntity>of(AirBBBEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(AirBBBEntity::new)

					.sized(1.5f, 1.7f));
	public static final RegistryObject<EntityType<AirBBEntity>> AIR_BB = register("air_bb",
			EntityType.Builder.<AirBBEntity>of(AirBBEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(AirBBEntity::new)

					.sized(1f, 1.3f));
	public static final RegistryObject<EntityType<CCincantesimo0Entity>> C_CINCANTESIMO_0 = register("c_cincantesimo_0",
			EntityType.Builder.<CCincantesimo0Entity>of(CCincantesimo0Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CCincantesimo0Entity::new)

					.sized(4f, 0.1f));
	public static final RegistryObject<EntityType<CCHBEntity>> CCHB = register("cchb",
			EntityType.Builder.<CCHBEntity>of(CCHBEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(CCHBEntity::new)

					.sized(0.4f, 0.4f));
	public static final RegistryObject<EntityType<CCIncantesimo1Entity>> CC_INCANTESIMO_1 = register("cc_incantesimo_1",
			EntityType.Builder.<CCIncantesimo1Entity>of(CCIncantesimo1Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CCIncantesimo1Entity::new)

					.sized(8f, 0.1f));
	public static final RegistryObject<EntityType<CcfbEntity>> CCFB = register("ccfb",
			EntityType.Builder.<CcfbEntity>of(CcfbEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(CcfbEntity::new)

					.sized(0.4f, 0.4f));
	public static final RegistryObject<EntityType<CCIncantesimo2Entity>> CC_INCANTESIMO_2 = register("cc_incantesimo_2",
			EntityType.Builder.<CCIncantesimo2Entity>of(CCIncantesimo2Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CCIncantesimo2Entity::new)

					.sized(8f, 0.1f));
	public static final RegistryObject<EntityType<CCrageEntity>> C_CRAGE = register("c_crage",
			EntityType.Builder.<CCrageEntity>of(CCrageEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(CCrageEntity::new)

					.sized(0.4f, 0.4f));
	public static final RegistryObject<EntityType<JumpAreaEntity>> JUMP_AREA = register("jump_area",
			EntityType.Builder.<JumpAreaEntity>of(JumpAreaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(JumpAreaEntity::new)

					.sized(4f, 0.1f));
	public static final RegistryObject<EntityType<JumpEntityEntity>> JUMP_ENTITY = register("jump_entity",
			EntityType.Builder.<JumpEntityEntity>of(JumpEntityEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(JumpEntityEntity::new)

					.sized(0.4f, 0.4f));
	public static final RegistryObject<EntityType<EarthquakeDEntity>> EARTHQUAKE_D = register("earthquake_d",
			EntityType.Builder.<EarthquakeDEntity>of(EarthquakeDEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EarthquakeDEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<HealerEntity>> HEALER = register("healer",EntityType.Builder.<HealerEntity>of(HealerEntity::new, MobCategory.CREATURE)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3));
	public static final RegistryObject<EntityType<FireArrowEntity>> FIRE_ARROW = register("fire_arrow", EntityType.Builder.<FireArrowEntity>of(FireArrowEntity::new,MobCategory.MISC).clientTrackingRange(4).updateInterval(20).setCustomClientFactory(FireArrowEntity::new));

	public static final RegistryObject<EntityType<LogEntity>> LOG = register("log", EntityType.Builder.<LogEntity>of(LogEntity::new, MobCategory.MISC).sized(1,0.4f).clientTrackingRange(64).setShouldReceiveVelocityUpdates(true).setCustomClientFactory(LogEntity::new));

	public static final RegistryObject<EntityType<LogTrapEntity>> LOG_TRAP = register("log_trap", EntityType.Builder.<LogTrapEntity>of(LogTrapEntity::new,MobCategory.MISC).sized(1,0.4f).clientTrackingRange(64).setShouldReceiveVelocityUpdates(true).setCustomClientFactory(LogTrapEntity::new));

	public static final RegistryObject<EntityType<TH14PEntity>> TH14_P = register("th14p", EntityType.Builder.<TH14PEntity>of(TH14PEntity::new, MobCategory.MISC).sized(0.5f,0.5f).setUpdateInterval(20).setCustomClientFactory(TH14PEntity::new));

	public static final RegistryObject<EntityType<TownHall14Entity>> TH14 = register("th14", EntityType.Builder.<TownHall14Entity>of(TownHall14Entity::new,MobCategory.CREATURE).sized(3.8f,3.6f).clientTrackingRange(64).setShouldReceiveVelocityUpdates(true).setCustomClientFactory(TownHall14Entity::new));

	public static final RegistryObject<EntityType<HasteAreaEntity>> HASTE_AREA = register("invisibilty_area", EntityType.Builder.<HasteAreaEntity>of(HasteAreaEntity::new,MobCategory.MISC).sized(8f,0.1f).setShouldReceiveVelocityUpdates(true).setCustomClientFactory(HasteAreaEntity::new));

	public static final RegistryObject<EntityType<HasteEntity>> HASTE = register("haste", EntityType.Builder.<HasteEntity>of(HasteEntity::new,MobCategory.MISC).sized(0.5f,0.5f).setCustomClientFactory(HasteEntity::new).setShouldReceiveVelocityUpdates(true));

	public static final RegistryObject<EntityType<InfinityBottleThrowable>> INFINITY_BOTTLE = register("infinity_bottle", EntityType.Builder.<InfinityBottleThrowable>of(InfinityBottleThrowable::new, MobCategory.MISC).sized(0.5f,0.5f));

	public static final RegistryObject<EntityType<GraveyardBEntity>> GRAVEYARD_B = register("graveyard_b", EntityType.Builder.<GraveyardBEntity>of(GraveyardBEntity::new, MobCategory.MISC).sized(0.5f,0.5f));

	public static final RegistryObject<EntityType<GraveyardSpellEntity>> GRAVEYARD_SPELL = register("graveyard_s", EntityType.Builder.<GraveyardSpellEntity>of(GraveyardSpellEntity::new, MobCategory.MISC).sized(0.5f,0.5f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			Pekkalevel1Entity.init();
			Pekkalevel2Entity.init();
			XbowLv1Entity.init();
			MortarLv10EEntity.init();
			ArcherQueenEntity.init();
			EagleArtilleryEntity.init();
			BMachineEntity.init();
			BuilderEntity.init();
			ScattershotEntity.init();
			HogRiderEntity.init();
			InfernoTowerEntity.init();
			WizardEntity.init();
			CannonLv1Entity.init();
			UnicornEntity.init();
			LASSIEntity.init();
			WitchSkeletonEntity.init();
			WitchCocEntity.init();
			BigBoyEntity.init();
			NightWitchEntity.init();
			NightWitchBatEntity.init();
			GiantCocEntity.init();
			DragonEntity.init();
			ElectroOwlEntity.init();
			BattleMachineLv10Entity.init();
			BattleMachineLv20Entity.init();
			SuperWitchEntity.init();
			CannonCartEntity.init();
			CannonCartStillEntity.init();
			AirDefenceEntity.init();
			BattleBuilderHutLeveltwoEntity.init();
			ValkiryeEntity.init();
			MortarLv14Entity.init();
			WallWreckerEntity.init();
			MortarLv1EntityEntity.init();
			SiegeBarracksEntity.init();
			FireSpiritEntity.init();
			FlameFingerWeaponEntity.init();
			TownHallLv12Entity.init();
			XbowLvTwoniEntity.init();
			DCannonEntity.init();
			MultiCannonEntity.init();
			RocketArtileryEntity.init();
			MountainGolemEntity.init();
			BattleBuilderEntity.init();
			MegatroopEntity.init();
			GiantCannonBBEntity.init();
			AirBBBEntity.init();
			AirBBEntity.init();
			CCincantesimo0Entity.init();
			CCHBEntity.init();
			CCIncantesimo1Entity.init();
			CcfbEntity.init();
			CCIncantesimo2Entity.init();
			CCrageEntity.init();
			JumpAreaEntity.init();
			JumpEntityEntity.init();
			EarthquakeDEntity.init();
			HealerEntity.init();
			LogEntity.init();
			HasteAreaEntity.init();
			HasteEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(PEKKALEVEL_1.get(), Pekkalevel1Entity.createAttributes().build());
		event.put(PEKKALEVEL_2.get(), Pekkalevel2Entity.createAttributes().build());
		event.put(XBOW_LV_1.get(), XbowLv1Entity.createAttributes().build());
		event.put(MORTAR_LV_10_E.get(), MortarLv10EEntity.createAttributes().build());
		event.put(ARCHER_QUEEN.get(), ArcherQueenEntity.createAttributes().build());
		event.put(EAGLE_ARTILLERY.get(), EagleArtilleryEntity.createAttributes().build());
		event.put(B_MACHINE.get(), BMachineEntity.createAttributes().build());
		event.put(BUILDER.get(), BuilderEntity.createAttributes().build());
		event.put(SCATTERSHOT.get(), ScattershotEntity.createAttributes().build());
		event.put(HOG_RIDER.get(), HogRiderEntity.createAttributes().build());
		event.put(INFERNO_TOWER.get(), InfernoTowerEntity.createAttributes().build());
		event.put(WIZARD.get(), WizardEntity.createAttributes().build());
		event.put(CANNON_LV_1.get(), CannonLv1Entity.createAttributes().build());
		event.put(UNICORN.get(), UnicornEntity.createAttributes().build());
		event.put(LASSI.get(), LASSIEntity.createAttributes().build());
		event.put(WITCH_SKELETON.get(), WitchSkeletonEntity.createAttributes().build());
		event.put(WITCH_COC.get(), WitchCocEntity.createAttributes().build());
		event.put(BIG_BOY.get(), BigBoyEntity.createAttributes().build());
		event.put(NIGHT_WITCH.get(), NightWitchEntity.createAttributes().build());
		event.put(NIGHT_WITCH_BAT.get(), NightWitchBatEntity.createAttributes().build());
		event.put(GIANT_COC.get(), GiantCocEntity.createAttributes().build());
		event.put(DRAGON.get(), DragonEntity.createAttributes().build());
		event.put(ELECTRO_OWL.get(), ElectroOwlEntity.createAttributes().build());
		event.put(BATTLE_MACHINE_LV_10.get(), BattleMachineLv10Entity.createAttributes().build());
		event.put(BATTLE_MACHINE_LV_20.get(), BattleMachineLv20Entity.createAttributes().build());
		event.put(SUPER_WITCH.get(), SuperWitchEntity.createAttributes().build());
		event.put(CANNON_CART.get(), CannonCartEntity.createAttributes().build());
		event.put(CANNON_CART_POSE.get(), CannonCartStillEntity.createAttributes().build());
		event.put(AIR_DEFENCE.get(), AirDefenceEntity.createAttributes().build());
		event.put(BATTLE_BUILDER_HUT_LEVELTWO.get(), BattleBuilderHutLeveltwoEntity.createAttributes().build());
		event.put(VALKIRYE.get(), ValkiryeEntity.createAttributes().build());
		event.put(MORTAR_LV_14.get(), MortarLv14Entity.createAttributes().build());
		event.put(WALL_WRECKER.get(), WallWreckerEntity.createAttributes().build());
		event.put(MORTAR_LV_1_ENTITY.get(), MortarLv1EntityEntity.createAttributes().build());
		event.put(SIEGE_BARRACKS.get(), SiegeBarracksEntity.createAttributes().build());
		event.put(FIRE_SPIRIT.get(), FireSpiritEntity.createAttributes().build());
		event.put(FLAME_FINGER_WEAPON.get(), FlameFingerWeaponEntity.createAttributes().build());
		event.put(TOWN_HALL_LV_12.get(), TownHallLv12Entity.createAttributes().build());
		event.put(XBOW_LV_TWONI.get(), XbowLvTwoniEntity.createAttributes().build());
		event.put(D_CANNON.get(), DCannonEntity.createAttributes().build());
		event.put(MULTI_CANNON.get(), MultiCannonEntity.createAttributes().build());
		event.put(ROCKET_ARTILERY.get(), RocketArtileryEntity.createAttributes().build());
		event.put(MOUNTAIN_GOLEM.get(), MountainGolemEntity.createAttributes().build());
		event.put(BATTLE_BUILDER.get(), BattleBuilderEntity.createAttributes().build());
		event.put(MEGATROOP.get(), MegatroopEntity.createAttributes().build());
		event.put(GIANT_CANNON_BB.get(), GiantCannonBBEntity.createAttributes().build());
		event.put(AIR_BBB.get(), AirBBBEntity.createAttributes().build());
		event.put(AIR_BB.get(), AirBBEntity.createAttributes().build());
		event.put(C_CINCANTESIMO_0.get(), CCincantesimo0Entity.createAttributes().build());
		event.put(CCHB.get(), CCHBEntity.createAttributes().build());
		event.put(CC_INCANTESIMO_1.get(), CCIncantesimo1Entity.createAttributes().build());
		event.put(CCFB.get(), CcfbEntity.createAttributes().build());
		event.put(CC_INCANTESIMO_2.get(), CCIncantesimo2Entity.createAttributes().build());
		event.put(C_CRAGE.get(), CCrageEntity.createAttributes().build());
		event.put(JUMP_AREA.get(), JumpAreaEntity.createAttributes().build());
		event.put(JUMP_ENTITY.get(), JumpEntityEntity.createAttributes().build());
		event.put(EARTHQUAKE_D.get(), EarthquakeDEntity.createAttributes().build());
		event.put(HEALER.get(),HealerEntity.createAttributes().build());
		event.put(LOG.get(), LogEntity.createAttributes().build());
		event.put(LOG_TRAP.get(), LogTrapEntity.createAttributes().build());
		event.put(TH14.get(), TownHall14Entity.createAttributes().build());
		event.put(HASTE_AREA.get(), HasteAreaEntity.createAttributes().build());
		event.put(HASTE.get(),HasteEntity.createAttributes().build());
		event.put(GRAVEYARD_SPELL.get(), GraveyardSpellEntity.createAttributes().build());
		event.put(GRAVEYARD_B.get(), GraveyardBEntity.createAttributes().build());
	}
}
