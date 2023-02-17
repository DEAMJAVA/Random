package net.DEAMJAVA.random.networking;

import net.DEAMJAVA.random.networking.packet.DrinkingC2SPacket;
import net.DEAMJAVA.random.networking.packet.ExampleC2Spacket;
import net.DEAMJAVA.random.random;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.Identifier;

public class ModMessages {
    public static final Identifier DRINING_ID = new Identifier(random.MOD_ID, "drinking");
    public static final Identifier THIRST_SYNC_ID = new Identifier(random.MOD_ID, "thirst_sync");
    public static final Identifier EXAMPLE_ID = new Identifier(random.MOD_ID, "example");


    public static void registerC2SPackets() {
        ServerPlayNetworking.registerGlobalReceiver(EXAMPLE_ID, ExampleC2Spacket::receive);
        ServerPlayNetworking.registerGlobalReceiver(DRINING_ID, DrinkingC2SPacket::receive);
    }
    public static void registerS2CPackets() {

    }
}
