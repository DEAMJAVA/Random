package net.DEAMJAVA.random.item;

import net.DEAMJAVA.random.block.ModBlocks;
import net.DEAMJAVA.random.item.custom.*;
import net.DEAMJAVA.random.random;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item RAW_ENRISIUM = registerItem("raw_enrisium",
            new Item(new FabricItemSettings().group(ModItemGroup.RANDOM_ITEMS)));
    public static final Item ENRISIUM = registerItem("enrisium",
            new Item(new FabricItemSettings().group(ModItemGroup.RANDOM_ITEMS)));
    public static final Item EIGHT_BALL = registerItem("eight_ball",
            new EightBallItem(new FabricItemSettings().group(ModItemGroup.RANDOM_ITEMS).maxCount(1)));
    public static final Item SAVE_ME = registerItem("save_me",
            new SaverItem(new FabricItemSettings().group(ModItemGroup.RANDOM_ITEMS).maxCount(1)));
    public static final Item GAPPLE_SEEDS = registerItem("gapple_seeds",
            new AliasedBlockItem(ModBlocks.GAPPLE_CROP,
                    new FabricItemSettings().group(ModItemGroup.RANDOM_ITEMS)));
    public static final Item GAPPLE = registerItem("gapple",
            new Item(new FabricItemSettings().group(ModItemGroup.RANDOM_ITEMS).food(
                    new FoodComponent.Builder().hunger(10).saturationModifier(10f).alwaysEdible()
                            .build())));
    public static final Item ENRISIUM_SWORD = registerItem("enrisium_sword",
            new SwordItem(ModToolMateriel.ENRISIUM, 10, 11f,
                    new FabricItemSettings().group(ModItemGroup.RANDOM_TOOLS).maxCount(1)));
    public static final Item ENRISIUM_PICKAXE = registerItem("enrisium_pickaxe",
            new ModPickaxeItem(ModToolMateriel.ENRISIUM, 10, 11f,
                    new FabricItemSettings().group(ModItemGroup.RANDOM_TOOLS).maxCount(1)));
    public static final Item ENRISIUM_AXE = registerItem("enrisium_axe",
            new ModAxeItem(ModToolMateriel.ENRISIUM, 10, 11f,
                    new FabricItemSettings().group(ModItemGroup.RANDOM_TOOLS).maxCount(1)));
    public static final Item ENRISIUM_SHOVEL = registerItem("enrisium_shovel",
            new ShovelItem(ModToolMateriel.ENRISIUM, 10, 11f,
                    new FabricItemSettings().group(ModItemGroup.RANDOM_TOOLS).maxCount(1)));
    public static final Item ENRISIUM_HOE = registerItem("enrisium_hoe",
            new ModHoeItem(ModToolMateriel.ENRISIUM, 10, -1f,
                    new FabricItemSettings().group(ModItemGroup.RANDOM_TOOLS).maxCount(1)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(random.MOD_ID, name), item);
    }
    public static void registerModItems() {
        random.LOGGER.debug("Registering Mod Items for " + random.MOD_ID);
    }
}
