package net.DEAMJAVA.random.world.feature;

import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.placementmodifier.*;

import java.util.List;

public class ModPlacedFeatures {


    public static final RegistryEntry<PlacedFeature> ENRISIUM_ORE_PLACED = PlacedFeatures.register("enrisium_ore_placed", ModConfiguredFeatures.ENRISIUM_ORE, modifiersWithCount(11,
                    HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-80), YOffset.aboveBottom(80))));
    public static final RegistryEntry<PlacedFeature> NETHER_ENRISIUM_ORE_PLACED = PlacedFeatures.register(
            "nether_enrisium_ore_placed", ModConfiguredFeatures.NETHER_ENRISIUM_ORE, modifiersWithCount(11,
                    HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-80), YOffset.aboveBottom(80))));
    public static final RegistryEntry<PlacedFeature> END_ENRISIUM_ORE_PLACED = PlacedFeatures.register(
            "end_enrisium_ore_placed", ModConfiguredFeatures.END_ENRISIUM_ORE, modifiersWithCount(11,
                    HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-80), YOffset.aboveBottom(80))));



    private static List<PlacementModifier> modifiers(PlacementModifier countModifier, PlacementModifier heightModifier) {
        return List.of(countModifier, SquarePlacementModifier.of(), heightModifier, BiomePlacementModifier.of());
    }



    private static List<PlacementModifier> modifiersWithCount(int count, PlacementModifier heightModifier) {
        return modifiers(CountPlacementModifier.of(count), heightModifier);
    }

    private static List<PlacementModifier> modifiersWithRarity(int chance, PlacementModifier heightModifier) {
        return modifiers(RarityFilterPlacementModifier.of(chance), heightModifier);
    }
}
