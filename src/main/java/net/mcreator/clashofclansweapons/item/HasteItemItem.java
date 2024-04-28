
package net.mcreator.clashofclansweapons.item;

import net.mcreator.clashofclansweapons.entity.HasteEntity;
import net.mcreator.clashofclansweapons.init.ClashofclansweaponsModEntities;
import net.mcreator.clashofclansweapons.init.ClashofclansweaponsModTabs;
import net.mcreator.clashofclansweapons.procedures.AirDefenceItemRightClickedOnBlockProcedure;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.context.UseOnContext;

public class HasteItemItem extends Item {
	public HasteItemItem() {
		super(new Properties().tab(ClashofclansweaponsModTabs.TAB_CUSTOM).stacksTo(1).rarity(Rarity.COMMON));
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
		if(!context.getLevel().isClientSide())
		{
			Entity entity =  new HasteEntity(ClashofclansweaponsModEntities.HASTE.get(), context.getLevel());
			entity.moveTo(context.getClickedPos().getX(),context.getClickedPos().getY() + 2,context.getClickedPos().getZ());
			context.getLevel().addFreshEntity(entity);
		}
		return retval;
	}
}
