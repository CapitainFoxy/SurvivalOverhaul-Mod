package com.capitainfoxy.survivaloverhaul.systems;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraftforge.event.TickEvent;

public class FoodSystem {

    public static void handle(TickEvent.PlayerTickEvent event) {
        PlayerEntity player = event.player;

        if (player.getFoodStats().getFoodLevel() < 6) {
            applyHungerEffects(player);
        }
    }

    private static void applyHungerEffects(PlayerEntity player) {
        player.addPotionEffect(new EffectInstance(Effects.WEAKNESS, 100, 1));
        player.addPotionEffect(new EffectInstance(Effects.SLOWNESS, 100, 1));
    }
}
