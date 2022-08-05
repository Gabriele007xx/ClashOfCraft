package coc.buidings.defence;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import coc.type.ModMob;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.Level;

public class Building extends PathfinderMob {
	public Building(EntityType<? extends Building> type,Level level)
	{
		super(type,level);
	}
	@Override
	public MobType getMobType() {
		return ModMob.BUILDING;
	}

	@Override
	public boolean removeWhenFarAway(double distanceToClosestPlayer) {
		return false;
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.death"));
	}
}
