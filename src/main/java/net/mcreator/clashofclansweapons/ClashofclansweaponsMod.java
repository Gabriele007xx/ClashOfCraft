/*
 *    MCreator note:
 *
 *    If you lock base mod element files, you can edit this file and it won't get overwritten.
 *    If you change your modid or package, you need to apply these changes to this file MANUALLY.
 *
 *    Settings in @Mod annotation WON'T be changed in case of the base mod element
 *    files lock too, so you need to set them manually here in such case.
 *
 *    If you do not lock base mod element files in Workspace settings, this file
 *    will be REGENERATED on each build.
 *
 */
package net.mcreator.clashofclansweapons;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.minecraftforge.network.simple.SimpleChannel;
import net.minecraftforge.network.NetworkRegistry;
import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.IEventBus;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.FriendlyByteBuf;

import net.mcreator.clashofclansweapons.init.ClashofclansweaponsModTabs;
import net.mcreator.clashofclansweapons.init.ClashofclansweaponsModPotions;
import net.mcreator.clashofclansweapons.init.ClashofclansweaponsModParticleTypes;
import net.mcreator.clashofclansweapons.init.ClashofclansweaponsModMobEffects;
import net.mcreator.clashofclansweapons.init.ClashofclansweaponsModItems;
import net.mcreator.clashofclansweapons.init.ClashofclansweaponsModFeatures;
import net.mcreator.clashofclansweapons.init.ClashofclansweaponsModEntities;
import net.mcreator.clashofclansweapons.init.ClashofclansweaponsModBlocks;
import net.mcreator.clashofclansweapons.init.ClashofclansweaponsModBlockEntities;
import net.mcreator.clashofclansweapons.init.ClashofclansweaponsModBiomes;

import java.util.function.Supplier;
import java.util.function.Function;
import java.util.function.BiConsumer;

@Mod("clashofclansweapons")
public class ClashofclansweaponsMod {
	public static final Logger LOGGER = LogManager.getLogger(ClashofclansweaponsMod.class);
	public static final String MODID = "clashofclansweapons";
	private static final String PROTOCOL_VERSION = "1";
	public static final SimpleChannel PACKET_HANDLER = NetworkRegistry.newSimpleChannel(new ResourceLocation(MODID, MODID), () -> PROTOCOL_VERSION,
			PROTOCOL_VERSION::equals, PROTOCOL_VERSION::equals);
	private static int messageID = 0;

	public ClashofclansweaponsMod() {
		ClashofclansweaponsModTabs.load();
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		ClashofclansweaponsModBlocks.REGISTRY.register(bus);
		ClashofclansweaponsModItems.REGISTRY.register(bus);
		ClashofclansweaponsModEntities.REGISTRY.register(bus);
		ClashofclansweaponsModBlockEntities.REGISTRY.register(bus);
		ClashofclansweaponsModFeatures.REGISTRY.register(bus);

		ClashofclansweaponsModMobEffects.REGISTRY.register(bus);
		ClashofclansweaponsModPotions.REGISTRY.register(bus);
		ClashofclansweaponsModBiomes.REGISTRY.register(bus);
		ClashofclansweaponsModParticleTypes.REGISTRY.register(bus);
	}

	public static <T> void addNetworkMessage(Class<T> messageType, BiConsumer<T, FriendlyByteBuf> encoder, Function<FriendlyByteBuf, T> decoder,
			BiConsumer<T, Supplier<NetworkEvent.Context>> messageConsumer) {
		PACKET_HANDLER.registerMessage(messageID, messageType, encoder, decoder, messageConsumer);
		messageID++;
	}
}
