package net.DEAMJAVA.random.item;

import net.DEAMJAVA.random.block.ModBlocks;
import net.DEAMJAVA.random.item.custom.*;
import net.DEAMJAVA.random.random;
import net.fabricmc.fabric.api.item.v1.EquipmentSlotProvider;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item ENRISIUM_INGOT = registerItem("enrisium_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.RANDOM_ITEMS)));
    public static final Item RAW_ENRISIUM = registerItem("raw_enrisium",
            new Item(new FabricItemSettings().group(ModItemGroup.RANDOM_ITEMS)));
    //public static final Item EIGHT_BALL = registerItem("eight_ball",
      //      new EightBallItem(new FabricItemSettings().group(ModItemGroup.RANDOM_ITEMS).maxCount(1)));
    public static final Item SAVE_ME = registerItem("save_me",
            new SaverItem(new FabricItemSettings().group(ModItemGroup.RANDOM_ITEMS).maxCount(1)));
    public static final Item GAPPLE_SEEDS = registerItem("gapple_seeds",
            new AliasedBlockItem(ModBlocks.GAPPLE_CROP,
                    new FabricItemSettings().group(ModItemGroup.RANDOM_SEEDS)));
    public static final Item GAPPLE = registerItem("gapple",
            new Item(new FabricItemSettings().group(ModItemGroup.RANDOM_FOODS).maxCount(16).food(
                    new FoodComponent.Builder().hunger(6).saturationModifier(6.9f).statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 12000, 4 ), 1.0f).statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 12000, 4 ), 1.0f).statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 12000, 4 ), 1.0f).statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 12000, 4 ), 1.0f).statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 12000, 4 ), 1.0f).statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 12000, 4 ), 1.0f).statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 12000, 20 ), 1.0f).statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 12000, 3 ), 1.0f).alwaysEdible()
                            .build())));
    public static final Item ENRISIUM_SWORD = registerItem("enrisium_sword",
            new SwordItem(ModToolMateriel.ENRISIUM, 5, 10f,
                    new FabricItemSettings().group(ModItemGroup.RANDOM_TOOLS).maxCount(1)));
    public static final Item ENRISIUM_AXE = registerItem("enrisium_axe",
            new ModAxeItem(ModToolMateriel.ENRISIUM, 12, 5f,
                    new FabricItemSettings().group(ModItemGroup.RANDOM_TOOLS).maxCount(1)));
    public static final Item ENRISIUM_PICKAXE = registerItem("enrisium_pickaxe",
            new ModPickaxeItem(ModToolMateriel.ENRISIUM, 2, 12f,
                    new FabricItemSettings().group(ModItemGroup.RANDOM_TOOLS).maxCount(1)));
    public static final Item ENRISIUM_SHOVEL = registerItem("enrisium_shovel",
            new ShovelItem(ModToolMateriel.ENRISIUM, 5, 11f,
                    new FabricItemSettings().group(ModItemGroup.RANDOM_TOOLS).maxCount(1)));
    public static final Item ENRISIUM_HOE = registerItem("enrisium_hoe",
            new ModHoeItem(ModToolMateriel.ENRISIUM, 5, 11f,
                    new FabricItemSettings().group(ModItemGroup.RANDOM_TOOLS).maxCount(1)));
    public static final Item ENRISIUM_HELMET = registerItem("enrisium_helmet",
            new ArmorItem(ModArmorMateriel.ENRISIUM, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ModItemGroup.RANDOM_TOOLS).maxCount(1)));
    public static final Item ENRISIUM_CHESTPLATE = registerItem("enrisium_chestplate",
            new ArmorItem(ModArmorMateriel.ENRISIUM, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ModItemGroup.RANDOM_TOOLS).maxCount(1)));
    public static final Item ENRISIUM_LEGGINGS = registerItem("enrisium_leggings",
            new ArmorItem(ModArmorMateriel.ENRISIUM, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ModItemGroup.RANDOM_TOOLS).maxCount(1)));
    public static final Item ENRISIUM_BOOTS = registerItem("enrisium_boots",
            new ArmorItem(ModArmorMateriel.ENRISIUM, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ModItemGroup.RANDOM_TOOLS).maxCount(1)));
    public static final Item CROWN = registerItem("crown",
            new CrownItem(new FabricItemSettings().equipmentSlot(new EquipmentSlotProvider() {
                @Override
                public EquipmentSlot getPreferredEquipmentSlot(ItemStack stack) {

                    return EquipmentSlot.HEAD;
                }
            }).maxCount(1).group(ModItemGroup.RANDOM_ITEMS).fireproof()));
    public static final Item ENRISIUM_CROWN = registerItem("enrisium_crown",
            new EnrisiumCrownItem(ModArmorMateriel.ENRISIUM , EquipmentSlot.HEAD,
                    new FabricItemSettings(), 35));
    public static final Item WITHERITE_SWORD = registerItem("witherite_sword",
            new SwordItem(ModToolMateriel.ENRISIUM, 13, 7f,
                    new FabricItemSettings().group(ModItemGroup.RANDOM_TOOLS).maxCount(1)));
    public static final Item WITHERITE_AXE = registerItem("witherite_axe",
            new ModAxeItem(ModToolMateriel.ENRISIUM, 16, -3.6f,
                    new FabricItemSettings().group(ModItemGroup.RANDOM_TOOLS).maxCount(1)));
    public static final Item WITHERITE_PICKAXE = registerItem("witherite_pickaxe",
            new ModPickaxeItem(ModToolMateriel.ENRISIUM, 2, 13f,
                    new FabricItemSettings().group(ModItemGroup.RANDOM_TOOLS).maxCount(1)));
    public static final Item WITHERITE_SHOVEL = registerItem("witherite_shovel",
            new ShovelItem(ModToolMateriel.ENRISIUM, 5, 13f,
                    new FabricItemSettings().group(ModItemGroup.RANDOM_TOOLS).maxCount(1)));
    public static final Item WITHERITE_HOE = registerItem("witherite_hoe",
            new ModHoeItem(ModToolMateriel.ENRISIUM, 5, 13f,
                    new FabricItemSettings().group(ModItemGroup.RANDOM_TOOLS).maxCount(1)));
    public static final Item WITHERITE_INGOT = registerItem("witherite_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.RANDOM_ITEMS).fireproof().maxCount(32).food(new FoodComponent.Builder().hunger(6).saturationModifier(6.9f).statusEffect(new StatusEffectInstance(StatusEffects.BLINDNESS,
                    1200,
                    0 ),
                    1.0f).statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA,
                    1200, 4 ), 1.0f).alwaysEdible().build())));
    public static final Item WITHERITE_HELMET = registerItem("witherite_helmet",
            new ArmorItem(ModArmorMateriel.WITHERITE, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ModItemGroup.RANDOM_TOOLS).maxCount(1)));
    public static final Item WITHERITE_CHESTPLATE = registerItem("witherite_chestplate",
            new ArmorItem(ModArmorMateriel.WITHERITE, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ModItemGroup.RANDOM_TOOLS).maxCount(1)));
    public static final Item WITHERITE_LEGGINGS = registerItem("witherite_leggings",
            new ArmorItem(ModArmorMateriel.WITHERITE, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ModItemGroup.RANDOM_TOOLS).maxCount(1)));
    public static final Item WITHERITE_BOOTS = registerItem("witherite_boots",
            new ArmorItem(ModArmorMateriel.WITHERITE, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ModItemGroup.RANDOM_TOOLS).maxCount(1)));
    public static final Item SCYTH = registerItem("scyth",
            new SwordItem(ModToolMateriel.SCYTH, 18, 2f,
                    new FabricItemSettings().group(ModItemGroup.RANDOM_TOOLS).maxCount(1)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(random.MOD_ID, name), item);
    }
    public static void registerModItems() {
        random.LOGGER.debug("Registering Mod Items for " + random.MOD_ID);
    }
}
