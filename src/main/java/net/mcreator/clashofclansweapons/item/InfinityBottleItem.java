package net.mcreator.clashofclansweapons.item;

import net.mcreator.clashofclansweapons.entity.InfinityBottleThrowable;
import net.mcreator.clashofclansweapons.init.ClashofclansweaponsModEntities;
import net.mcreator.clashofclansweapons.init.ClashofclansweaponsModTabs;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class InfinityBottleItem extends Item {
    public InfinityBottleItem() {
        super(new Item.Properties().tab(ClashofclansweaponsModTabs.TAB_CUSTOM).stacksTo(64));
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level p_41432_, Player p_41433_, InteractionHand p_41434_) {
        if(!p_41432_.isClientSide()) {
            InfinityBottleThrowable bottle = new InfinityBottleThrowable(ClashofclansweaponsModEntities.INFINITY_BOTTLE.get(), p_41432_);
            bottle.shootFromRotation(p_41433_, p_41433_.getXRot(), p_41433_.getYRot(), 0.0f, 1.5f, 1.0f);
            p_41432_.addFreshEntity(bottle);
            if(!p_41433_.getAbilities().instabuild)
            {
                p_41433_.getItemInHand(p_41434_).shrink(1);
            }

        }
        return super.use(p_41432_, p_41433_, p_41434_);
    }
}
