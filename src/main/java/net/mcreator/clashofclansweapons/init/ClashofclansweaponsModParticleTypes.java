
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.clashofclansweapons.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.mcreator.clashofclansweapons.ClashofclansweaponsMod;

public class ClashofclansweaponsModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES,
			ClashofclansweaponsMod.MODID);
	public static final RegistryObject<ParticleType<?>> WITCH_PROJECTILE = REGISTRY.register("witch_projectile", () -> new SimpleParticleType(false));
}
