
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.clashofclansweapons.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class ClashofclansweaponsModTabs {
	public static CreativeModeTab TAB_BUILDINGS;
	public static CreativeModeTab TAB_ITEMS;
	public static CreativeModeTab TAB_WEAPONS;
	public static CreativeModeTab TAB_TROOPS;
	public static CreativeModeTab TAB_SPELLS;
	public static CreativeModeTab TAB_UPGRADERS;

	public static CreativeModeTab TAB_CUSTOM;

	public static void load() {
		TAB_BUILDINGS = new CreativeModeTab("tabbuildings") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(ClashofclansweaponsModBlocks.BUILDERHUT.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
		TAB_ITEMS = new CreativeModeTab("tabitems") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(ClashofclansweaponsModItems.BOOK_OF_BUILDING.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
		TAB_WEAPONS = new CreativeModeTab("tabweapons") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(ClashofclansweaponsModItems.PEKKASWORD_LV_1.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
		TAB_TROOPS = new CreativeModeTab("tabtroops") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(ClashofclansweaponsModItems.GIANT_ITEM.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
		TAB_SPELLS = new CreativeModeTab("tabspells") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(ClashofclansweaponsModItems.LIGHTING_SPELL.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_UPGRADERS = new CreativeModeTab("tabupgraders") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(ClashofclansweaponsModBlocks.ELIXIR_UP.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_CUSTOM = new CreativeModeTab("tabcustom") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(ClashofclansweaponsModItems.HASTE_ITEM.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
