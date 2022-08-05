
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.clashofclansweapons.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.clashofclansweapons.potion.InvicibilityMobEffect;
import net.mcreator.clashofclansweapons.ClashofclansweaponsMod;

public class ClashofclansweaponsModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, ClashofclansweaponsMod.MODID);
	public static final RegistryObject<MobEffect> INVICIBILITY = REGISTRY.register("invicibility", () -> new InvicibilityMobEffect());
}
