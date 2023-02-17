package net.DEAMJAVA.random.world.feature;

import net.DEAMJAVA.random.block.ModBlocks;
import net.DEAMJAVA.random.random;
import net.minecraft.block.Blocks;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;

import java.util.List;

public class ModConfiguredFeatures {
    public static final List<OreFeatureConfig.Target> OVERWORLD_ENRISIUM_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.ENRISIUM_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.ENRISIUM_DEEPSLATE_ORE.getDefaultState()));
    public static final List<OreFeatureConfig.Target> NETHER_ENRISIUM_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.BASE_STONE_NETHER, ModBlocks.ENRISIUM_NETHER_ORE.getDefaultState()));
    public static final List<OreFeatureConfig.Target> END_ENRISIUM_ORES = List.of(
            OreFeatureConfig.createTarget(new BlockMatchRuleTest(Blocks.END_STONE), ModBlocks.ENRISIUM_END_ORE.getDefaultState()));



    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> ENRISIUM_ORE =
            ConfiguredFeatures.register("enrisium_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_ENRISIUM_ORES,9));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> NETHER_ENRISIUM_ORE =
            ConfiguredFeatures.register("nether_enrisium_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_ENRISIUM_ORES,12));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> END_ENRISIUM_ORE =
            ConfiguredFeatures.register("end_enrisium_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_ENRISIUM_ORES,12));



    public static void RegisterConfiguredFeatures() {
        random.LOGGER.debug("Registering Mod Config Features for " + random.MOD_ID);
    }
}
