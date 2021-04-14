package tk.beatso.beatsos.additions.feature.features;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.tag.BlockTags;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import tk.beatso.beatsos.additions.BeatsosAdditions;
import tk.beatso.beatsos.additions.block.BeatsosAdditionsBlocks;

public class SoulStoneConfiguredFeature {

	private static ConfiguredFeature<?, ?> SOUL_STONE_CONFIGURED_FEATURE = Feature.ORE
		.configure(new OreFeatureConfig(
			(new TagMatchRuleTest(BlockTags.SOUL_FIRE_BASE_BLOCKS)),
			BeatsosAdditionsBlocks.SOUL_STONE.getDefaultState(),
			24
		))
		.decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
			0,
			0,
			127
		)))
		.spreadHorizontally()
		.repeat(60);
	
	public static void init() {
		RegistryKey<ConfiguredFeature<?, ?>> soulStoneConfiguredFeature = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier(BeatsosAdditions.MOD_ID, "soul_stone_configured_feature"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, soulStoneConfiguredFeature.getValue(), SOUL_STONE_CONFIGURED_FEATURE);
		BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES, soulStoneConfiguredFeature);
	}

}
