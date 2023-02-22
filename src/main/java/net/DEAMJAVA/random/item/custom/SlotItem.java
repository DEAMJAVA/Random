package net.DEAMJAVA.random.item.custom;

import net.fabricmc.fabric.api.item.v1.EquipmentSlotProvider;
import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.Item;

public class SlotItem extends Item {
    public SlotItem(FabricItemSettings settings, EquipmentSlot slot, EquipmentSlotProvider equipmentSlotProvider) {
        super(settings.equipmentSlot(equipmentSlotProvider));
    }
}
