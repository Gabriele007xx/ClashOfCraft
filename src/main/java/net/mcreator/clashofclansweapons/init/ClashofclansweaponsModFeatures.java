
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.clashofclansweapons.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Holder;

import net.mcreator.clashofclansweapons.world.features.ores.ElixiroreFeature;
import net.mcreator.clashofclansweapons.world.features.ores.DeoreFeature;
import net.mcreator.clashofclansweapons.world.features.ores.BuilderElixirOreFeature;
import net.mcreator.clashofclansweapons.world.features.BuilderhutSSFeature;
import net.mcreator.clashofclansweapons.ClashofclansweaponsMod;

import java.util.function.Supplier;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber
public class ClashofclansweaponsModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, ClashofclansweaponsMod.MODID);
	private static final List<FeatureRegistration> FEATURE_REGISTRATIONS = new ArrayList<>();
	public static final RegistryObject<Feature<?>> ELIXIRORE = register("elixirore", ElixiroreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, ElixiroreFeature.GENERATE_BIOMES, ElixiroreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> DEORE = register("deore", DeoreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, DeoreFeature.GENERATE_BIOMES, DeoreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> BUILDER_ELIXIR_ORE = register("builder_elixir_ore", BuilderElixirOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, BuilderElixirOreFeature.GENERATE_BIOMES,
					BuilderElixirOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> BUILDERHUT_SS = register("builderhut_ss", BuilderhutSSFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.SURFACE_STRUCTURES, BuilderhutSSFeature.GENERATE_BIOMES, BuilderhutSSFeature::placedFeature));

	private static RegistryObject<Feature<?>> register(String registryname, Supplier<Feature<?>> feature, FeatureRegistration featureRegistration) {
		FEATURE_REGISTRATIONS.add(featureRegistration);
		return REGISTRY.register(registryname, feature);
	}

	@SubscribeEvent
	public static void addFeaturesToBiomes(BiomeLoadingEvent event) {
		for (FeatureRegistration registration : FEATURE_REGISTRATIONS) {
			if (registration.biomes() == null || registration.biomes().contains(event.getName()))
				event.getGeneration().getFeatures(registration.stage()).add(registration.placedFeature().get());
		}
	}

	private static record FeatureRegistration(GenerationStep.Decoration stage, Set<ResourceLocation> biomes,
			Supplier<Holder<PlacedFeature>> placedFeature) {
	}
}
