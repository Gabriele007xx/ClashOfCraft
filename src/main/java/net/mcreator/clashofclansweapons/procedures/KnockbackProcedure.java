package net.mcreator.clashofclansweapons.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;

import net.mcreator.clashofclansweapons.init.ClashofclansweaponsModItems;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class KnockbackProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player);
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY)
				.getItem() == ClashofclansweaponsModItems.GIANT_ARMOR_CHESTPLATE.get()) {
			((LivingEntity) entity).getAttribute(Attributes.ATTACK_KNOCKBACK).setBaseValue(1.5f);
			((LivingEntity) entity).getAttribute(Attributes.ATTACK_DAMAGE).setBaseValue(3f);
		} else {
			((LivingEntity) entity).getAttribute(Attributes.ATTACK_KNOCKBACK).setBaseValue(0);
			((LivingEntity) entity).getAttribute(Attributes.ATTACK_DAMAGE).setBaseValue(1);
		}
	}
}
