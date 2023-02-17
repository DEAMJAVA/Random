package net.DEAMJAVA.random.event;

import net.DEAMJAVA.random.networking.ModMessages;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.networking.v1.PacketByteBufs;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.text.Text;
import org.lwjgl.glfw.GLFW;

public class KeyInputHandler {

    public static final String KEY_RANDOM_CATEGORY = "key.category.random";
    public static final String KEY_DRINK_WATER = "key.random.drink_water";
    public static final String KEY_EFFECT = "key.random.effect";





    public static KeyBinding DrinkWaterKey;
    public static KeyBinding EFFECT_KEY;
    public static void registerKeyInput() {
        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            if(DrinkWaterKey.wasPressed()) {
                // This happens when our custom key is pressed
                //ClientPlayNetworking.send(ModMessages.EXAMPLE_ID, PacketByteBufs.create());
                ClientPlayNetworking.send(ModMessages.DRINING_ID, PacketByteBufs.create());

        }
            if(EFFECT_KEY.wasPressed()) {
                 //This happens when our custom key is pressed
                client.player.addStatusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 3600, 10));
                client.player.addStatusEffect(new StatusEffectInstance(StatusEffects.CONDUIT_POWER, 3600, 10));
                client.player.addStatusEffect(new StatusEffectInstance(StatusEffects.DOLPHINS_GRACE, 3600, 10));
                client.player.addStatusEffect(new StatusEffectInstance(StatusEffects.SPEED, 3600, 5));
                client.player.addStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 3600, 2));
                client.player.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 3600, 2));
                client.player.addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 3600, 4));
        }
     });
    }
    public static void register() {
        EFFECT_KEY = KeyBindingHelper.registerKeyBinding(new KeyBinding(
            KEY_EFFECT,
                InputUtil.Type.KEYSYM,
                GLFW.GLFW_KEY_UNKNOWN,
                KEY_RANDOM_CATEGORY


        ));
        DrinkWaterKey = KeyBindingHelper.registerKeyBinding(new KeyBinding(
            KEY_DRINK_WATER,
                InputUtil.Type.KEYSYM,
                GLFW.GLFW_KEY_UNKNOWN,
                KEY_RANDOM_CATEGORY

        ));
        registerKeyInput();
    }

}