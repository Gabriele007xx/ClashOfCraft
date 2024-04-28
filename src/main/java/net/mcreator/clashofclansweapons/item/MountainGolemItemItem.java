package net.mcreator.clashofclansweapons.item;

import net.mcreator.clashofclansweapons.entity.MountainGolemEntity;
import net.mcreator.clashofclansweapons.init.ClashofclansweaponsModEntities;
import net.mcreator.clashofclansweapons.init.ClashofclansweaponsModTabs;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.context.UseOnContext;

public class MountainGolemItemItem extends Item{
    public MountainGolemItemItem() {
        super(new Item.Properties().tab(ClashofclansweaponsModTabs.TAB_TROOPS).stacksTo(1).rarity(Rarity.COMMON));
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
            MountainGolemEntity entity = new MountainGolemEntity(ClashofclansweaponsModEntities.MOUNTAIN_GOLEM.get(), context.getLevel());
            entity.moveTo(context.getClickedPos().getX(),context.getClickedPos().getY() + 1,context.getClickedPos().getZ());
            context.getLevel().addFreshEntity(entity);
        }
        context.getItemInHand().shrink(1);
        return retval;
    }
}
