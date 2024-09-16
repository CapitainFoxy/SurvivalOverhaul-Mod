package com.capitainfoxy.survivaloverhaul.systems;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraftforge.event.TickEvent;
import com.capitainfoxy.survivaloverhaul.util.PlayerData;

public class HydrationSystem {

    public static void handle(TickEvent.PlayerTickEvent event) {
        PlayerEntity player = event.player;

        int hydration = PlayerData.getHydration(player);

        if (hydration < 20) {
            applyDehydrationEffects(player);
        }

        PlayerData.setHydration(player, Math.max(hydration - 1, 0)); // Decrease hydration over time
    }

    private static void applyDehydrationEffects(PlayerEntity player) {
        player.addPotionEffect(new EffectInstance(Effects.NAUSEA, 100, 1));
        player.addPotionEffect(new EffectInstance(Effects.SLOWNESS, 100, 2));
    }
}
