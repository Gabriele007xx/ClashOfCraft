
package net.mcreator.clashofclansweapons.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.clashofclansweapons.procedures.Entityhittedbarbaianswordlv7Procedure;
import net.mcreator.clashofclansweapons.init.ClashofclansweaponsModTabs;

public class BarbarianSwordLv7Item extends SwordItem {
	public BarbarianSwordLv7Item() {
		super(new Tier() {
			public int getUses() {
				return 600;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 5f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 15;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}
		}, 3, -3f, new Item.Properties().tab(ClashofclansweaponsModTabs.TAB_WEAPONS));
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		Entityhittedbarbaianswordlv7Procedure.execute(entity);
		return retval;
	}
}
