package net.DEAMJAVA.random.villager;

import com.google.common.collect.ImmutableSet;
import net.DEAMJAVA.random.random;
import net.fabricmc.fabric.api.object.builder.v1.villager.VillagerProfessionBuilder;
import net.fabricmc.fabric.api.object.builder.v1.world.poi.PointOfInterestHelper;
import net.minecraft.block.Block;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.village.VillagerProfession;
import net.minecraft.world.poi.PointOfInterest;
import net.minecraft.world.poi.PointOfInterestType;
import oshi.annotation.concurrent.Immutable;

public class ModVillegers {
    public static VillagerProfession registerPorfes(String name, RegistryKey<PointOfInterestType> type) {
        return Registry.register(Registry.VILLAGER_PROFESSION, new Identifier(random.MOD_ID, name),
                VillagerProfessionBuilder.create().id(new Identifier(random.MOD_ID,
                        name)).workstation(type).workSound(SoundEvents.ENTITY_VILLAGER_WORK_ARMORER).build());

    }
    public static PointOfInterestType registerPOI(String name, Block block) {
        return PointOfInterestHelper.register(new Identifier(random.MOD_ID, name),
                1, 1, ImmutableSet.copyOf(block.getStateManager().getStates()));
    }
    public static void registervillagers() {
        random.LOGGER.debug("Registering Villagers foe "+random.MOD_ID);
    }
}
