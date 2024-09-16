package com.capitainfoxy.survivaloverhaul.systems;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.event.TickEvent;

public class TemperatureSystem {

    public static void handle(TickEvent.PlayerTickEvent event) {
        PlayerEntity player = event.player;
        Biome biome = player.world.getBiome(player.getPosition());
        float temperature = biome.getTemperature(player.getPosition());

        if (temperature < 0.2F) {
            applyColdEffects(player);
        } else if (temperature > 1.0F) {
            applyHeatEffects(player);
        }
    }

    private static void applyColdEffects(PlayerEntity player) {
        player.addPotionEffect(new EffectInstance(Effects.SLOWNESS, 100, 1));
        player.addPotionEffect(new EffectInstance(Effects.MINING_FATIGUE, 100, 1));
        player.sendStatusMessage(new StringTextComponent("You are freezing!"), true);
    }

    private static void applyHeatEffects(PlayerEntity player) {
        player.addPotionEffect(new EffectInstance(Effects.NAUSEA, 100, 1));
        player.addPotionEffect(new EffectInstance(Effects.WEAKNESS, 100, 1));
        player.sendStatusMessage(new StringTextComponent("You are overheating!"), true);
    }
}
