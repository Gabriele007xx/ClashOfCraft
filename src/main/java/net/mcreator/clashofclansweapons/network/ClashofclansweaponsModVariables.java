package net.mcreator.clashofclansweapons.network;

import net.minecraftforge.network.PacketDistributor;
import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.common.util.FakePlayer;
import net.minecraftforge.common.capabilities.RegisterCapabilitiesEvent;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;
import net.minecraftforge.common.capabilities.CapabilityToken;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.common.capabilities.Capability;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.nbt.Tag;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.Direction;
import net.minecraft.client.Minecraft;

import net.mcreator.clashofclansweapons.ClashofclansweaponsMod;

import java.util.function.Supplier;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClashofclansweaponsModVariables {
	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		ClashofclansweaponsMod.addNetworkMessage(PlayerVariablesSyncMessage.class, PlayerVariablesSyncMessage::buffer,
				PlayerVariablesSyncMessage::new, PlayerVariablesSyncMessage::handler);
	}

	@SubscribeEvent
	public static void init(RegisterCapabilitiesEvent event) {
		event.register(PlayerVariables.class);
	}

	@Mod.EventBusSubscriber
	public static class EventBusVariableHandlers {
		@SubscribeEvent
		public static void onPlayerLoggedInSyncPlayerVariables(PlayerEvent.PlayerLoggedInEvent event) {
			if (!event.getPlayer().level.isClientSide())
				((PlayerVariables) event.getPlayer().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()))
						.syncPlayerVariables(event.getPlayer());
		}

		@SubscribeEvent
		public static void onPlayerRespawnedSyncPlayerVariables(PlayerEvent.PlayerRespawnEvent event) {
			if (!event.getPlayer().level.isClientSide())
				((PlayerVariables) event.getPlayer().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()))
						.syncPlayerVariables(event.getPlayer());
		}

		@SubscribeEvent
		public static void onPlayerChangedDimensionSyncPlayerVariables(PlayerEvent.PlayerChangedDimensionEvent event) {
			if (!event.getPlayer().level.isClientSide())
				((PlayerVariables) event.getPlayer().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()))
						.syncPlayerVariables(event.getPlayer());
		}

		@SubscribeEvent
		public static void clonePlayer(PlayerEvent.Clone event) {
			event.getOriginal().revive();
			PlayerVariables original = ((PlayerVariables) event.getOriginal().getCapability(PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new PlayerVariables()));
			PlayerVariables clone = ((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new PlayerVariables()));
			clone.aq = original.aq;
			clone.bmh = original.bmh;
			clone.bmmh = original.bmmh;
			clone.elixir = original.elixir;
			clone.gold = original.gold;
			clone.darkelixir = original.darkelixir;
			clone.name = original.name;
			clone.hasname = original.hasname;
			clone.esp = original.esp;
			clone.maxe = original.maxe;
			clone.level = original.level;
			clone.hasvillage = original.hasvillage;
			clone.townhalllevel = original.townhalllevel;
			if (!event.isWasDeath()) {
			}
		}
	}

	public static final Capability<PlayerVariables> PLAYER_VARIABLES_CAPABILITY = CapabilityManager.get(new CapabilityToken<PlayerVariables>() {
	});

	@Mod.EventBusSubscriber
	private static class PlayerVariablesProvider implements ICapabilitySerializable<Tag> {
		@SubscribeEvent
		public static void onAttachCapabilities(AttachCapabilitiesEvent<Entity> event) {
			if (event.getObject() instanceof Player && !(event.getObject() instanceof FakePlayer))
				event.addCapability(new ResourceLocation("clashofclansweapons", "player_variables"), new PlayerVariablesProvider());
		}

		private final PlayerVariables playerVariables = new PlayerVariables();
		private final LazyOptional<PlayerVariables> instance = LazyOptional.of(() -> playerVariables);

		@Override
		public <T> LazyOptional<T> getCapability(Capability<T> cap, Direction side) {
			return cap == PLAYER_VARIABLES_CAPABILITY ? instance.cast() : LazyOptional.empty();
		}

		@Override
		public Tag serializeNBT() {
			return playerVariables.writeNBT();
		}

		@Override
		public void deserializeNBT(Tag nbt) {
			playerVariables.readNBT(nbt);
		}
	}

	public static class PlayerVariables {
		public boolean aq = false;
		public double bmh = 0;
		public double bmmh = 30.0;
		public double elixir = 0;
		public double gold = 0;
		public double darkelixir = 0;
		public String name = "\"\"";
		public boolean hasname = false;
		public double esp = 0;
		public double maxe = 30.0;
		public double level = 0.0;
		public boolean hasvillage = false;
		public double townhalllevel = 1.0;

		public void syncPlayerVariables(Entity entity) {
			if (entity instanceof ServerPlayer serverPlayer)
				ClashofclansweaponsMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> serverPlayer), new PlayerVariablesSyncMessage(this));
		}

		public Tag writeNBT() {
			CompoundTag nbt = new CompoundTag();
			nbt.putBoolean("aq", aq);
			nbt.putDouble("bmh", bmh);
			nbt.putDouble("bmmh", bmmh);
			nbt.putDouble("elixir", elixir);
			nbt.putDouble("gold", gold);
			nbt.putDouble("darkelixir", darkelixir);
			nbt.putString("name", name);
			nbt.putBoolean("hasname", hasname);
			nbt.putDouble("esp", esp);
			nbt.putDouble("maxe", maxe);
			nbt.putDouble("level", level);
			nbt.putBoolean("hasvillage", hasvillage);
			nbt.putDouble("townhalllevel", townhalllevel);
			return nbt;
		}

		public void readNBT(Tag Tag) {
			CompoundTag nbt = (CompoundTag) Tag;
			aq = nbt.getBoolean("aq");
			bmh = nbt.getDouble("bmh");
			bmmh = nbt.getDouble("bmmh");
			elixir = nbt.getDouble("elixir");
			gold = nbt.getDouble("gold");
			darkelixir = nbt.getDouble("darkelixir");
			name = nbt.getString("name");
			hasname = nbt.getBoolean("hasname");
			esp = nbt.getDouble("esp");
			maxe = nbt.getDouble("maxe");
			level = nbt.getDouble("level");
			hasvillage = nbt.getBoolean("hasvillage");
			townhalllevel = nbt.getDouble("townhalllevel");
		}
	}

	public static class PlayerVariablesSyncMessage {
		public PlayerVariables data;

		public PlayerVariablesSyncMessage(FriendlyByteBuf buffer) {
			this.data = new PlayerVariables();
			this.data.readNBT(buffer.readNbt());
		}

		public PlayerVariablesSyncMessage(PlayerVariables data) {
			this.data = data;
		}

		public static void buffer(PlayerVariablesSyncMessage message, FriendlyByteBuf buffer) {
			buffer.writeNbt((CompoundTag) message.data.writeNBT());
		}

		public static void handler(PlayerVariablesSyncMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				if (!context.getDirection().getReceptionSide().isServer()) {
					PlayerVariables variables = ((PlayerVariables) Minecraft.getInstance().player.getCapability(PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new PlayerVariables()));
					variables.aq = message.data.aq;
					variables.bmh = message.data.bmh;
					variables.bmmh = message.data.bmmh;
					variables.elixir = message.data.elixir;
					variables.gold = message.data.gold;
					variables.darkelixir = message.data.darkelixir;
					variables.name = message.data.name;
					variables.hasname = message.data.hasname;
					variables.esp = message.data.esp;
					variables.maxe = message.data.maxe;
					variables.level = message.data.level;
					variables.hasvillage = message.data.hasvillage;
					variables.townhalllevel = message.data.townhalllevel;
				}
			});
			context.setPacketHandled(true);
		}
	}
}
