package com.capitainfoxy.survivaloverhaul.systems;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraftforge.event.TickEvent;

public class DiseaseSystem {

    public static void handle(TickEvent.PlayerTickEvent event) {
        PlayerEntity player = event.player;

        if (player.isInWater() && player.world.isRaining()) {
            applyDiseaseEffects(player);
        }
    }

    private static void applyDiseaseEffects(PlayerEntity player) {
        player.addPotionEffect(new EffectInstance(Effects.POISON, 200, 1));
    }
}
package com.capitainfoxy.survivaloverhaul.systems;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraftforge.event.TickEvent;

public class DiseaseSystem {

    public static void handle(TickEvent.PlayerTickEvent event) {
        PlayerEntity player = event.player;

        if (player.isInWater() && player.world.isRaining()) {
            applyDiseaseEffects(player);
        }
    }

    private static void applyDiseaseEffects(PlayerEntity player) {
        player.addPotionEffect(new EffectInstance(Effects.POISON, 200, 1));
    }
}
