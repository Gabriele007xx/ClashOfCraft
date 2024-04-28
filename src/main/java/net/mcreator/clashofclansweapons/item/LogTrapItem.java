package net.mcreator.clashofclansweapons.item;

import net.mcreator.clashofclansweapons.entity.LogTrapEntity;
import net.mcreator.clashofclansweapons.init.ClashofclansweaponsModEntities;
import net.mcreator.clashofclansweapons.init.ClashofclansweaponsModTabs;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;

public class LogTrapItem extends Item {
    public LogTrapItem() {
        super(new Item.Properties().tab(ClashofclansweaponsModTabs.TAB_BUILDINGS).stacksTo(1));
    }

    @Override
    public int getUseDuration(ItemStack p_41454_) {
        return 0;
    }

    @Override
    public InteractionResult useOn(UseOnContext p_41427_) {
            InteractionResult result = super.useOn(p_41427_);
            if(!p_41427_.getLevel().isClientSide())
            {
                LogTrapEntity logtrap = new LogTrapEntity(ClashofclansweaponsModEntities.LOG_TRAP.get(), p_41427_.getLevel());
                logtrap.moveTo(p_41427_.getClickedPos().getX(),p_41427_.getClickedPos().getY() + 1,p_41427_.getClickedPos().getZ(),p_41427_.getPlayer().getYRot(),p_41427_.getPlayer().getXRot());
                p_41427_.getLevel().addFreshEntity(logtrap);
            }
            p_41427_.getItemInHand().shrink(1);
            return result;
    }
}
