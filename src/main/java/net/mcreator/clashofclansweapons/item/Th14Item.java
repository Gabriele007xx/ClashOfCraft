package net.mcreator.clashofclansweapons.item;

import net.mcreator.clashofclansweapons.entity.TownHall14Entity;
import net.mcreator.clashofclansweapons.init.ClashofclansweaponsModEntities;
import net.mcreator.clashofclansweapons.init.ClashofclansweaponsModTabs;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;

public class Th14Item extends Item {
    public Th14Item() {
        super(new Item.Properties().tab(ClashofclansweaponsModTabs.TAB_BUILDINGS).stacksTo(1));
    }

    @Override
    public int getUseDuration(ItemStack p_41454_) {
        return 0;
    }

    @Override
    public InteractionResult useOn(UseOnContext p_41427_) {
        InteractionResult use = super.useOn(p_41427_);
        if(!p_41427_.getLevel().isClientSide())
        {
            TownHall14Entity th = new TownHall14Entity(ClashofclansweaponsModEntities.TH14.get(), p_41427_.getLevel());
            th.moveTo(p_41427_.getClickedPos().getX(),p_41427_.getClickedPos().getY() + 1,p_41427_.getClickedPos().getZ());
            p_41427_.getLevel().addFreshEntity(th);
            p_41427_.getItemInHand().shrink(1);
        }
        return use;
    }
}
