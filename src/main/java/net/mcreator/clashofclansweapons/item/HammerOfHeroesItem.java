
package net.mcreator.clashofclansweapons.item;

import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.clashofclansweapons.init.ClashofclansweaponsModTabs;

public class HammerOfHeroesItem extends Item {
	public HammerOfHeroesItem() {
		super(new Item.Properties().tab(ClashofclansweaponsModTabs.TAB_ITEMS).stacksTo(1).rarity(Rarity.EPIC));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
