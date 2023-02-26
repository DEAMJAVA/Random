package net.DEAMJAVA.random;

import net.DEAMJAVA.random.block.ModBlocks;
import net.DEAMJAVA.random.item.ModItems;
import net.DEAMJAVA.random.networking.ModMessages;
import net.DEAMJAVA.random.painting.ModPaintings;
import net.DEAMJAVA.random.util.ModLootTableModifiers;
import net.DEAMJAVA.random.villager.ModVillegers;
import net.DEAMJAVA.random.world.feature.ModConfiguredFeatures;
import net.DEAMJAVA.random.world.gen.ModOreGeneration;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class random implements ModInitializer {
	public static final String MOD_ID = "random";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModConfiguredFeatures.RegisterConfiguredFeatures();
		ModOreGeneration.generateOres();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModPaintings.registermodpaintings();

		//ModVillegers.registervillagers();

		//ModMessages.registerC2SPackets();
	}
}
