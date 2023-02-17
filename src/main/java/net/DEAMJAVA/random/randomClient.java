package net.DEAMJAVA.random;

import net.DEAMJAVA.random.block.ModBlocks;
import net.DEAMJAVA.random.event.KeyInputHandler;
import net.DEAMJAVA.random.networking.ModMessages;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class randomClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GAPPLE_CROP, RenderLayer.getCutout());

        KeyInputHandler.register();
        ModMessages.registerS2CPackets();

    }
}
