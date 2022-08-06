
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.clashofclansweapons.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.clashofclansweapons.client.model.Modelxbowlv2;
import net.mcreator.clashofclansweapons.client.model.Modelxbowlv1new;
import net.mcreator.clashofclansweapons.client.model.Modelwallwrecker;
import net.mcreator.clashofclansweapons.client.model.Modelvalkiryenew;
import net.mcreator.clashofclansweapons.client.model.Modelunicornpetbnew;
import net.mcreator.clashofclansweapons.client.model.Modelsuperwitchnew;
import net.mcreator.clashofclansweapons.client.model.Modelsiegebarracks;
import net.mcreator.clashofclansweapons.client.model.Modelscattershotleveloneftnew;
import net.mcreator.clashofclansweapons.client.model.Modelscattershot_bulletsnew;
import net.mcreator.clashofclansweapons.client.model.Modelrocketartilyery;
import net.mcreator.clashofclansweapons.client.model.Modelrocket_art_proj;
import net.mcreator.clashofclansweapons.client.model.Modelpekkahelmet;
import net.mcreator.clashofclansweapons.client.model.Modelmulticannonlvone;
import net.mcreator.clashofclansweapons.client.model.Modelmountain_go;
import net.mcreator.clashofclansweapons.client.model.Modelmortarlv1;
import net.mcreator.clashofclansweapons.client.model.Modelmortar_lv_tennew;
import net.mcreator.clashofclansweapons.client.model.Modelmortar_lv_14new;
import net.mcreator.clashofclansweapons.client.model.Modellassinew;
import net.mcreator.clashofclansweapons.client.model.Modelinfernotowerlv1new;
import net.mcreator.clashofclansweapons.client.model.Modelhogridernew;
import net.mcreator.clashofclansweapons.client.model.Modelgiantlv1new;
import net.mcreator.clashofclansweapons.client.model.Modelgiant_cannon;
import net.mcreator.clashofclansweapons.client.model.Modelgiant_armor_petto;
import net.mcreator.clashofclansweapons.client.model.Modelflyingf;
import net.mcreator.clashofclansweapons.client.model.Modelflamefinger;
import net.mcreator.clashofclansweapons.client.model.Modelfirespirit;
import net.mcreator.clashofclansweapons.client.model.Modelelectrohoownew;
import net.mcreator.clashofclansweapons.client.model.Modelearthquake_model;
import net.mcreator.clashofclansweapons.client.model.Modeldragonnew;
import net.mcreator.clashofclansweapons.client.model.Modeldoublecannonlvone;
import net.mcreator.clashofclansweapons.client.model.Modelcchealbottle;
import net.mcreator.clashofclansweapons.client.model.Modelccfrostspell;
import net.mcreator.clashofclansweapons.client.model.Modelccapitalh;
import net.mcreator.clashofclansweapons.client.model.Modelcannonlv1new;
import net.mcreator.clashofclansweapons.client.model.Modelcannoncartnew;
import net.mcreator.clashofclansweapons.client.model.Modelcannoncart_pose2new;
import net.mcreator.clashofclansweapons.client.model.Modelcannonball;
import net.mcreator.clashofclansweapons.client.model.Modelbuilderhutlv2new;
import net.mcreator.clashofclansweapons.client.model.Modelbmnew;
import net.mcreator.clashofclansweapons.client.model.Modelbmachcinelv10fnew;
import net.mcreator.clashofclansweapons.client.model.Modelbigboynew;
import net.mcreator.clashofclansweapons.client.model.Modelbatnew;
import net.mcreator.clashofclansweapons.client.model.Modelangle_artyierynew;
import net.mcreator.clashofclansweapons.client.model.Modelair_dinamite;
import net.mcreator.clashofclansweapons.client.model.Modelair_bo;
import net.mcreator.clashofclansweapons.client.model.ModelTownHall12;
import net.mcreator.clashofclansweapons.client.model.ModelCoCDragon;
import net.mcreator.clashofclansweapons.client.model.ModelAir_Defencenew;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class ClashofclansweaponsModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelccfrostspell.LAYER_LOCATION, Modelccfrostspell::createBodyLayer);
		event.registerLayerDefinition(Modelwallwrecker.LAYER_LOCATION, Modelwallwrecker::createBodyLayer);
		event.registerLayerDefinition(Modelbmnew.LAYER_LOCATION, Modelbmnew::createBodyLayer);
		event.registerLayerDefinition(Modelsiegebarracks.LAYER_LOCATION, Modelsiegebarracks::createBodyLayer);
		event.registerLayerDefinition(Modelmulticannonlvone.LAYER_LOCATION, Modelmulticannonlvone::createBodyLayer);
		event.registerLayerDefinition(Modelxbowlv1new.LAYER_LOCATION, Modelxbowlv1new::createBodyLayer);
		event.registerLayerDefinition(Modelgiant_cannon.LAYER_LOCATION, Modelgiant_cannon::createBodyLayer);
		event.registerLayerDefinition(Modelrocketartilyery.LAYER_LOCATION, Modelrocketartilyery::createBodyLayer);
		event.registerLayerDefinition(Modelscattershotleveloneftnew.LAYER_LOCATION, Modelscattershotleveloneftnew::createBodyLayer);
		event.registerLayerDefinition(Modelinfernotowerlv1new.LAYER_LOCATION, Modelinfernotowerlv1new::createBodyLayer);
		event.registerLayerDefinition(Modelxbowlv2.LAYER_LOCATION, Modelxbowlv2::createBodyLayer);
		event.registerLayerDefinition(Modelelectrohoownew.LAYER_LOCATION, Modelelectrohoownew::createBodyLayer);
		event.registerLayerDefinition(Modelbatnew.LAYER_LOCATION, Modelbatnew::createBodyLayer);
		event.registerLayerDefinition(Modelvalkiryenew.LAYER_LOCATION, Modelvalkiryenew::createBodyLayer);
		event.registerLayerDefinition(Modellassinew.LAYER_LOCATION, Modellassinew::createBodyLayer);
		event.registerLayerDefinition(Modelpekkahelmet.LAYER_LOCATION, Modelpekkahelmet::createBodyLayer);
		event.registerLayerDefinition(Modelair_bo.LAYER_LOCATION, Modelair_bo::createBodyLayer);
		event.registerLayerDefinition(Modelrocket_art_proj.LAYER_LOCATION, Modelrocket_art_proj::createBodyLayer);
		event.registerLayerDefinition(Modelunicornpetbnew.LAYER_LOCATION, Modelunicornpetbnew::createBodyLayer);
		event.registerLayerDefinition(Modelflyingf.LAYER_LOCATION, Modelflyingf::createBodyLayer);
		event.registerLayerDefinition(ModelCoCDragon.LAYER_LOCATION, ModelCoCDragon::createBodyLayer);
		event.registerLayerDefinition(Modelcannonlv1new.LAYER_LOCATION, Modelcannonlv1new::createBodyLayer);
		event.registerLayerDefinition(Modelair_dinamite.LAYER_LOCATION, Modelair_dinamite::createBodyLayer);
		event.registerLayerDefinition(Modelsuperwitchnew.LAYER_LOCATION, Modelsuperwitchnew::createBodyLayer);
		event.registerLayerDefinition(Modelflamefinger.LAYER_LOCATION, Modelflamefinger::createBodyLayer);
		event.registerLayerDefinition(ModelTownHall12.LAYER_LOCATION, ModelTownHall12::createBodyLayer);
		event.registerLayerDefinition(Modelmountain_go.LAYER_LOCATION, Modelmountain_go::createBodyLayer);
		event.registerLayerDefinition(Modelscattershot_bulletsnew.LAYER_LOCATION, Modelscattershot_bulletsnew::createBodyLayer);
		event.registerLayerDefinition(Modelearthquake_model.LAYER_LOCATION, Modelearthquake_model::createBodyLayer);
		event.registerLayerDefinition(Modelbigboynew.LAYER_LOCATION, Modelbigboynew::createBodyLayer);
		event.registerLayerDefinition(Modelccapitalh.LAYER_LOCATION, Modelccapitalh::createBodyLayer);
		event.registerLayerDefinition(Modelcchealbottle.LAYER_LOCATION, Modelcchealbottle::createBodyLayer);
		event.registerLayerDefinition(Modelmortar_lv_14new.LAYER_LOCATION, Modelmortar_lv_14new::createBodyLayer);
		event.registerLayerDefinition(Modelgiantlv1new.LAYER_LOCATION, Modelgiantlv1new::createBodyLayer);
		event.registerLayerDefinition(Modelmortar_lv_tennew.LAYER_LOCATION, Modelmortar_lv_tennew::createBodyLayer);
		event.registerLayerDefinition(Modelgiant_armor_petto.LAYER_LOCATION, Modelgiant_armor_petto::createBodyLayer);
		event.registerLayerDefinition(Modeldragonnew.LAYER_LOCATION, Modeldragonnew::createBodyLayer);
		event.registerLayerDefinition(Modeldoublecannonlvone.LAYER_LOCATION, Modeldoublecannonlvone::createBodyLayer);
		event.registerLayerDefinition(Modelcannonball.LAYER_LOCATION, Modelcannonball::createBodyLayer);
		event.registerLayerDefinition(Modelbuilderhutlv2new.LAYER_LOCATION, Modelbuilderhutlv2new::createBodyLayer);
		event.registerLayerDefinition(Modelhogridernew.LAYER_LOCATION, Modelhogridernew::createBodyLayer);
		event.registerLayerDefinition(Modelcannoncartnew.LAYER_LOCATION, Modelcannoncartnew::createBodyLayer);
		event.registerLayerDefinition(Modelmortarlv1.LAYER_LOCATION, Modelmortarlv1::createBodyLayer);
		event.registerLayerDefinition(Modelcannoncart_pose2new.LAYER_LOCATION, Modelcannoncart_pose2new::createBodyLayer);
		event.registerLayerDefinition(Modelangle_artyierynew.LAYER_LOCATION, Modelangle_artyierynew::createBodyLayer);
		event.registerLayerDefinition(Modelbmachcinelv10fnew.LAYER_LOCATION, Modelbmachcinelv10fnew::createBodyLayer);
		event.registerLayerDefinition(ModelAir_Defencenew.LAYER_LOCATION, ModelAir_Defencenew::createBodyLayer);
		event.registerLayerDefinition(Modelfirespirit.LAYER_LOCATION, Modelfirespirit::createBodyLayer);
	}
}
