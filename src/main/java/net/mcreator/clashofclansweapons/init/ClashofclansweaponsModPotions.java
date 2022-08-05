
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.clashofclansweapons.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.clashofclansweapons.ClashofclansweaponsMod;

public class ClashofclansweaponsModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(ForgeRegistries.POTIONS, ClashofclansweaponsMod.MODID);
	public static final RegistryObject<Potion> RAGE_SPELL = REGISTRY.register("rage_spell",
			() -> new Potion(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 200, 0, false, true),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 200, 0, false, true)));
}
