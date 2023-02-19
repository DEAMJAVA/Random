package net.DEAMJAVA.random.item;

import net.DEAMJAVA.random.block.ModBlocks;
import net.DEAMJAVA.random.random;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup RANDOM_ITEMS = FabricItemGroupBuilder.build(
            new Identifier(random.MOD_ID, "random_items"), () -> new ItemStack(ModItems.ENRISIUM));
    public static final ItemGroup RANDOM_BLOCKS = FabricItemGroupBuilder.build(
            new Identifier(random.MOD_ID, "random_blocks"), () -> new ItemStack(ModBlocks.ENRISIUM_ORE));
    public static final ItemGroup RANDOM_TOOLS = FabricItemGroupBuilder.build(
            new Identifier(random.MOD_ID, "random_tools"), () -> new ItemStack(ModItems.ENRISIUM_SWORD));

}
