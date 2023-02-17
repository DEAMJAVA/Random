package net.DEAMJAVA.random.block;

import net.DEAMJAVA.random.block.custom.GappleCropBlock;
import net.DEAMJAVA.random.block.custom.JumberBlock;
import net.DEAMJAVA.random.item.ModItemGroup;
import net.DEAMJAVA.random.random;
import net.fabricmc.fabric.api.block.v1.FabricBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.block.OreBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block ENRISIUM_BLOCK = registerBlock("enrisium_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool()),
            ModItemGroup.RANDOM_BLOCKS);
    public static final Block ENRISIUM_ORE = registerBlock("enrisium_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool(),
                    UniformIntProvider.create(10, 100)), ModItemGroup.RANDOM_BLOCKS);
    public static final Block ENRISIUM_DEEPSLATE_ORE = registerBlock("enrisium_deepslate_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool(),
                    UniformIntProvider.create(10, 100)), ModItemGroup.RANDOM_BLOCKS);
    public static final Block ENRISIUM_NETHER_ORE = registerBlock("enrisium_nether_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool(),
                    UniformIntProvider.create(10, 100)), ModItemGroup.RANDOM_BLOCKS);
    public static final Block ENRISIUM_END_ORE = registerBlock("enrisium_end_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool(),
                    UniformIntProvider.create(10, 100)), ModItemGroup.RANDOM_BLOCKS);
    public static final Block JUMPER_BLOCK = registerBlock("jumper_block",
            new JumberBlock(FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool()
                    .luminance(state -> state.get(JumberBlock.LIT) ? 15 : 3)),
            ModItemGroup.RANDOM_BLOCKS);
    public static final Block GAPPLE_CROP = registerBlockNoItem("gapple_crop",
            new GappleCropBlock(FabricBlockSettings.copy(Blocks.WHEAT)));





    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(random.MOD_ID, name), block);

    }
    private static Block registerBlockNoItem(String name, Block block) {
        return Registry.register(Registry.BLOCK, new Identifier(random.MOD_ID, name), block);

    }
    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        return Registry.register(Registry.ITEM, new Identifier(random.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }
    public static void registerModBlocks() {
        random.LOGGER.debug("Registering Mod BLocks for " + random.MOD_ID);
    }
}
