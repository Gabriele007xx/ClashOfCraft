package net.mcreator.clashofclansweapons.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.TextComponent;

import net.mcreator.clashofclansweapons.network.ClashofclansweaponsModVariables;
import net.mcreator.clashofclansweapons.init.ClashofclansweaponsModItems;

public class MortarOCProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(ClashofclansweaponsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new ClashofclansweaponsModVariables.PlayerVariables())).townhalllevel >= 3) {
			if (entity instanceof Player _playerHasItem
					? _playerHasItem.getInventory().contains(new ItemStack(ClashofclansweaponsModItems.GOLD_COIN.get()))
					: false) {
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(ClashofclansweaponsModItems.GOLD_COIN.get());
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
							_player.inventoryMenu.getCraftSlots());
				}
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(ClashofclansweaponsModItems.MORTAR_LV_1_ITEM.get());
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
			} else {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(new TextComponent("Not enough resources"), (false));
			}
		} else {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(new TextComponent("Requires Town Hall level 3 or up"), (false));
		}
	}
}
