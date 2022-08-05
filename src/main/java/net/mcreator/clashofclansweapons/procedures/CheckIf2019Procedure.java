package net.mcreator.clashofclansweapons.procedures;

import net.minecraftforge.items.CapabilityItemHandler;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;

import net.mcreator.clashofclansweapons.init.ClashofclansweaponsModItems;
import net.mcreator.clashofclansweapons.init.ClashofclansweaponsModGameRules;

import java.util.concurrent.atomic.AtomicReference;

public class CheckIf2019Procedure {
	public static boolean execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return false;
		if (world.getLevelData().getGameRules().getBoolean(ClashofclansweaponsModGameRules.MODE2018)) {
			if ((new Object() {
				public ItemStack getItemStack(int sltid, Entity entity) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).copy());
					});
					return _retval.get();
				}
			}.getItemStack(0, entity)).getItem() == ClashofclansweaponsModItems.ELIXIR.get() || (new Object() {
				public ItemStack getItemStack(int sltid, Entity entity) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).copy());
					});
					return _retval.get();
				}
			}.getItemStack(0, entity)).getItem() == ClashofclansweaponsModItems.DARK_ELIXIR.get()) {
				return true;
			}
			return false;
		}
		return true;
	}
}
