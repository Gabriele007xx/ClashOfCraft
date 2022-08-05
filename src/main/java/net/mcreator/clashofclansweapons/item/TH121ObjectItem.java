
package net.mcreator.clashofclansweapons.item;

import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.InteractionResult;

import net.mcreator.clashofclansweapons.procedures.TH121ObjectRightClickedOnBlockProcedure;
import net.mcreator.clashofclansweapons.init.ClashofclansweaponsModTabs;

public class TH121ObjectItem extends Item {
	public TH121ObjectItem() {
		super(new Item.Properties().tab(ClashofclansweaponsModTabs.TAB_BUILDINGS).stacksTo(1).rarity(Rarity.COMMON));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		InteractionResult retval = super.useOn(context);
		TH121ObjectRightClickedOnBlockProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(),
				context.getClickedPos().getZ(), context.getPlayer());
		return retval;
	}
}
