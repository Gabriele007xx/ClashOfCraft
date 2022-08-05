
package net.mcreator.clashofclansweapons.entity;

import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.chat.TextComponent;

import net.mcreator.clashofclansweapons.init.ClashofclansweaponsModEntities;

import coc.buidings.defence.MortarBase;

public class MortarLv1EntityEntity extends MortarBase {
	public MortarLv1EntityEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(ClashofclansweaponsModEntities.MORTAR_LV_1_ENTITY.get(), world);
	}

	public MortarLv1EntityEntity(EntityType<MortarLv1EntityEntity> type, Level world) {
		super(type, world);
		xpReward = 0;
		setNoAi(false);
		setCustomName(new TextComponent("Mortar (Lv.1)"));
		setCustomNameVisible(true);
		setPersistenceRequired();
	}

	@Override
	public void performRangedAttack(LivingEntity target, float flval) {
		MortarLv1Entity.shoot(this, target);
	}

	@Override
	public Packet<?> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}
}
