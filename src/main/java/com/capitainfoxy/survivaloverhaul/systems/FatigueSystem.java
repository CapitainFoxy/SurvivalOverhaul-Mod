package com.capitainfoxy.survivaloverhaul.systems;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraftforge.event.TickEvent;
import com.capitainfoxy.survivaloverhaul.util.PlayerData;

public class FatigueSystem {

    public static void handle(TickEvent.PlayerTickEvent event) {
        PlayerEntity player = event.player;

        if (PlayerData.getFatigue(player) > 80) {
            applyFatigueEffects(player);
        }
    }

    private static void applyFatigueEffects(PlayerEntity player) {
        player.addPotionEffect(new EffectInstance(Effects.SLOWNESS, 100, 1));
        player.addPotionEffect(new EffectInstance(Effects.MINING_FATIGUE, 100, 1));
    }
}
