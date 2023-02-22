package net.DEAMJAVA.random.item.custom;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class SaverItem extends Item {
    public SaverItem(Item.Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack itemStack = user.getStackInHand(hand);
        if (!world.isClient() && hand == Hand.MAIN_HAND) {
            user.addStatusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 3600, 10));
            user.addStatusEffect(new StatusEffectInstance(StatusEffects.CONDUIT_POWER, 3600, 10));
            user.addStatusEffect(new StatusEffectInstance(StatusEffects.DOLPHINS_GRACE, 3600, 10));
            user.addStatusEffect(new StatusEffectInstance(StatusEffects.SPEED, 3600, 5));
            user.addStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 3600, 2));
            user.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 3600, 2));
            user.addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 3600, 4));
            user.getItemCooldownManager().set(this, 4200);
        }
        return super.use(world, user, hand);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world,
                              List<Text> tooltip, TooltipContext context) {
        if (Screen.hasShiftDown()) {
            tooltip.add(Text.literal("Right Click me to get OP effects. " +
                    "CoolDown 17 Seconds").formatted(Formatting.DARK_PURPLE));
        } else {
            tooltip.add(Text.literal("Press Shift For Info!").formatted(Formatting.AQUA));
        }
        super.appendTooltip(stack, world, tooltip, context);
    }
}
