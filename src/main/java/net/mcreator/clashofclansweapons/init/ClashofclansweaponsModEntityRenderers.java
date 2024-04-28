
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.clashofclansweapons.init;

import net.mcreator.clashofclansweapons.client.renderer.*;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

//import net.mcreator.clashofclansweapons.client.renderer.MountainGolemRenderer;


@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClashofclansweaponsModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(ClashofclansweaponsModEntities.WITCH_STICK_SKULL.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(ClashofclansweaponsModEntities.PEKKALEVEL_1.get(), Pekkalevel1Renderer::new);
		event.registerEntityRenderer(ClashofclansweaponsModEntities.PEKKALEVEL_2.get(), Pekkalevel2Renderer::new);
		event.registerEntityRenderer(ClashofclansweaponsModEntities.XBOW_LV_1.get(), XbowLv1Renderer::new);
		event.registerEntityRenderer(ClashofclansweaponsModEntities.MORTAR_LV_10_E.get(), MortarLv10ERenderer::new);
		event.registerEntityRenderer(ClashofclansweaponsModEntities.ARCHER_QUEEN.get(), ArcherQueenRenderer::new);
		event.registerEntityRenderer(ClashofclansweaponsModEntities.EAGLE_ARTILLERY.get(), EagleArtilleryRenderer::new);
		event.registerEntityRenderer(ClashofclansweaponsModEntities.B_MACHINE.get(), BMachineRenderer::new);
		event.registerEntityRenderer(ClashofclansweaponsModEntities.BUILDER.get(), BuilderRenderer::new);
		event.registerEntityRenderer(ClashofclansweaponsModEntities.SCATTERSHOT.get(), ScattershotRenderer::new);
		event.registerEntityRenderer(ClashofclansweaponsModEntities.HOG_RIDER.get(), HogRiderRenderer::new);
		event.registerEntityRenderer(ClashofclansweaponsModEntities.INFERNO_TOWER.get(), InfernoTowerRenderer::new);
		event.registerEntityRenderer(ClashofclansweaponsModEntities.WIZARD.get(), WizardRenderer::new);
		event.registerEntityRenderer(ClashofclansweaponsModEntities.CANNON_LV_1.get(), CannonLv1Renderer::new);
		event.registerEntityRenderer(ClashofclansweaponsModEntities.UNICORN.get(), UnicornRenderer::new);
		event.registerEntityRenderer(ClashofclansweaponsModEntities.LASSI.get(), LASSIRenderer::new);
		event.registerEntityRenderer(ClashofclansweaponsModEntities.WITCH_SKELETON.get(), WitchSkeletonRenderer::new);
		event.registerEntityRenderer(ClashofclansweaponsModEntities.WITCH_COC.get(), WitchCocRenderer::new);
		event.registerEntityRenderer(ClashofclansweaponsModEntities.BIG_BOY.get(), BigBoyRenderer::new);
		event.registerEntityRenderer(ClashofclansweaponsModEntities.NIGHT_WITCH.get(), NightWitchRenderer::new);
		event.registerEntityRenderer(ClashofclansweaponsModEntities.NIGHT_WITCH_BAT.get(), NightWitchBatRenderer::new);
		event.registerEntityRenderer(ClashofclansweaponsModEntities.GIANT_COC.get(), GiantCocRenderer::new);
		event.registerEntityRenderer(ClashofclansweaponsModEntities.DRAGON.get(), DragonRenderer::new);
		event.registerEntityRenderer(ClashofclansweaponsModEntities.ELECTRO_OWL.get(), ElectroOwlRenderer::new);
		event.registerEntityRenderer(ClashofclansweaponsModEntities.BATTLE_MACHINE_LV_10.get(), BattleMachineLv10Renderer::new);
		event.registerEntityRenderer(ClashofclansweaponsModEntities.BATTLE_MACHINE_LV_20.get(), BattleMachineLv20Renderer::new);
		event.registerEntityRenderer(ClashofclansweaponsModEntities.SUPER_WITCH.get(), SuperWitchRenderer::new);
		event.registerEntityRenderer(ClashofclansweaponsModEntities.CANNON_CART.get(), CannonCartRenderer::new);
		event.registerEntityRenderer(ClashofclansweaponsModEntities.CANNON_CART_POSE.get(), CannonCartStillRenderer::new);
		event.registerEntityRenderer(ClashofclansweaponsModEntities.AIR_DEFENCE.get(), AirDefenceRenderer::new);
		event.registerEntityRenderer(ClashofclansweaponsModEntities.BATTLE_BUILDER_HUT_LEVELTWO.get(), BattleBuilderHutLeveltwoRenderer::new);
		event.registerEntityRenderer(ClashofclansweaponsModEntities.VALKIRYE.get(), ValkiryeRenderer::new);
		event.registerEntityRenderer(ClashofclansweaponsModEntities.MORTAR_LV_14.get(), MortarLv14Renderer::new);
		event.registerEntityRenderer(ClashofclansweaponsModEntities.WALL_WRECKER.get(), WallWreckerRenderer::new);
		event.registerEntityRenderer(ClashofclansweaponsModEntities.MORTAR_LV_1_ENTITY.get(), MortarLv1EntityRenderer::new);
		event.registerEntityRenderer(ClashofclansweaponsModEntities.SIEGE_BARRACKS.get(), SiegeBarracksRenderer::new);
		event.registerEntityRenderer(ClashofclansweaponsModEntities.FIRE_SPIRIT.get(), FireSpiritRenderer::new);
		event.registerEntityRenderer(ClashofclansweaponsModEntities.FLAME_FINGER_WEAPON.get(), FlameFingerWeaponRenderer::new);
		event.registerEntityRenderer(ClashofclansweaponsModEntities.TOWN_HALL_LV_12.get(), TownHallLv12Renderer::new);
		event.registerEntityRenderer(ClashofclansweaponsModEntities.DOUBLE_CANNON_SHOTGUN.get(), DoubleCannonShotgunRenderer::new);
		event.registerEntityRenderer(ClashofclansweaponsModEntities.ICSBOW.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(ClashofclansweaponsModEntities.SCATTERSHOT_LV_1.get(), ScattershotLv1Renderer::new);
		event.registerEntityRenderer(ClashofclansweaponsModEntities.MORTAR_LV_1.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(ClashofclansweaponsModEntities.LAVA_LAUNCHER_LV_1.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(ClashofclansweaponsModEntities.MORTAR_LV_5.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(ClashofclansweaponsModEntities.MORTAR_LV_8.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(ClashofclansweaponsModEntities.MORTAR_LV_10.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(ClashofclansweaponsModEntities.MORTAR_LV_12.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(ClashofclansweaponsModEntities.MORTAR_LV_13.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(ClashofclansweaponsModEntities.EA.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(ClashofclansweaponsModEntities.INFERNO_TOWER_LV_1_ITEM.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(ClashofclansweaponsModEntities.WIZARD_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(ClashofclansweaponsModEntities.CANNON_LV_1_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(ClashofclansweaponsModEntities.UNICORN_HEAL.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(ClashofclansweaponsModEntities.DRAGON_WEAPON.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(ClashofclansweaponsModEntities.ELECTRO_OWL_RAGED.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(ClashofclansweaponsModEntities.CANNON_CART_LV_1_RANGED_ITEM.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(ClashofclansweaponsModEntities.AIRDEFENCE_RANGED.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(ClashofclansweaponsModEntities.BATTLE_BUILDER_HUT_RAGED.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(ClashofclansweaponsModEntities.MORTAR_LV_14_RAGED.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(ClashofclansweaponsModEntities.FF.get(), FFRenderer::new);
		event.registerEntityRenderer(ClashofclansweaponsModEntities.TOWN_HALL_12_RW.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(ClashofclansweaponsModEntities.XBOW_LV_TWONI.get(), XbowLvTwoniRenderer::new);
		event.registerEntityRenderer(ClashofclansweaponsModEntities.D_CANNON.get(), DCannonRenderer::new);
		event.registerEntityRenderer(ClashofclansweaponsModEntities.MULTI_CANNON.get(), MultiCannonRenderer::new);
		event.registerEntityRenderer(ClashofclansweaponsModEntities.ROCKET_R.get(), RocketRRenderer::new);
		event.registerEntityRenderer(ClashofclansweaponsModEntities.ROCKET_ARTILERY.get(), RocketArtileryRenderer::new);
		//event.registerEntityRenderer(ClashofclansweaponsModEntities.MOUNTAIN_GOLEM.get(), MountainGolemRenderer::new);
		event.registerEntityRenderer(ClashofclansweaponsModEntities.BATTLE_BUILDER.get(), BattleBuilderRenderer::new);
		event.registerEntityRenderer(ClashofclansweaponsModEntities.CC_1.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(ClashofclansweaponsModEntities.MEGATROOP.get(), MegatroopRenderer::new);
		event.registerEntityRenderer(ClashofclansweaponsModEntities.GIANT_BALLS.get(), GiantBallsRenderer::new);
		event.registerEntityRenderer(ClashofclansweaponsModEntities.GIANT_CANNON_BB.get(), GiantCannonBBRenderer::new);
		event.registerEntityRenderer(ClashofclansweaponsModEntities.AIR_BBB.get(), AirBBBRenderer::new);
		event.registerEntityRenderer(ClashofclansweaponsModEntities.AIR_BB.get(), AirBBRenderer::new);
		event.registerEntityRenderer(ClashofclansweaponsModEntities.C_CINCANTESIMO_0.get(), CCincantesimo0Renderer::new);
		event.registerEntityRenderer(ClashofclansweaponsModEntities.CCHB.get(), CCHBRenderer::new);
		event.registerEntityRenderer(ClashofclansweaponsModEntities.CC_INCANTESIMO_1.get(), CCIncantesimo1Renderer::new);
		event.registerEntityRenderer(ClashofclansweaponsModEntities.CCFB.get(), CcfbRenderer::new);
		//event.registerEntityRenderer(ClashofclansweaponsModEntities.CC_INCANTESIMO_2.get(), CCIncantesimo2Renderer::new);
		event.registerEntityRenderer(ClashofclansweaponsModEntities.C_CRAGE.get(), CCrageRenderer::new);
		event.registerEntityRenderer(ClashofclansweaponsModEntities.JUMP_AREA.get(), JumpAreaRenderer::new);
		event.registerEntityRenderer(ClashofclansweaponsModEntities.JUMP_ENTITY.get(), JumpEntityRenderer::new);
		event.registerEntityRenderer(ClashofclansweaponsModEntities.EARTHQUAKE_D.get(), EarthquakeDRenderer::new);
		event.registerEntityRenderer(ClashofclansweaponsModEntities.FIRE_ARROW.get(), FireArrowRenderer::new);
		//event.registerEntityRenderer(ClashofclansweaponsModEntities.LOG_TRAP.get(), LogTrapRenderer::new);
	}
}
