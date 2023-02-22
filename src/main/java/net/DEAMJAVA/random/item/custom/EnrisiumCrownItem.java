package net.DEAMJAVA.random.item.custom;

import net.DEAMJAVA.random.item.ModArmorMateriel;
import net.DEAMJAVA.random.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.EquipmentSlotProvider;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Wearable;
import net.minecraft.stat.Stats;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class EnrisiumCrownItem extends Item implements Wearable {
    private final int protection;
    public EnrisiumCrownItem(ModArmorMateriel materiel, EquipmentSlot slot, FabricItemSettings settings, int protection) {
        super(settings.equipmentSlot(new EquipmentSlotProvider() {
            @Override
            public EquipmentSlot getPreferredEquipmentSlot(ItemStack stack) {
                return EquipmentSlot.HEAD;
            }
        }));
        this.protection = materiel.getProtectionAmount(slot);
    }
    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack itemStack = user.getStackInHand(hand);
        EquipmentSlot equipmentSlot = MobEntity.getPreferredEquipmentSlot(itemStack);
        ItemStack itemStack2 = user.getEquippedStack(equipmentSlot);
        if (itemStack2.isEmpty()) {
            user.equipStack(equipmentSlot, itemStack.copy());
            if (!world.isClient()) {
                user.incrementStat(Stats.USED.getOrCreateStat(this));
            }

            itemStack.setCount(0);
            return TypedActionResult.success(itemStack, world.isClient());
        } else {
            return TypedActionResult.fail(itemStack);
        }

    }
    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world,
                              List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.literal("A Crown for The King").formatted(Formatting.GOLD));

        super.appendTooltip(stack, world, tooltip, context);
    }

}
