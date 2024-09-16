package com.capitainfoxy.survivaloverhaul.systems;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraftforge.event.entity.living.LivingFallEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class InjurySystem {

    @SubscribeEvent
    public void onPlayerFall(LivingFallEvent event) {
        if (event.getEntity() instanceof PlayerEntity) {
            PlayerEntity player = (PlayerEntity) event.getEntity();

            if (event.getDistance() > 3.0) {
                applyInjuryEffects(player);
            }
        }
    }

    private void applyInjuryEffects(PlayerEntity player) {
        player.addPotionEffect(new EffectInstance(Effects.SLOWNESS, 200, 1));
        player.addPotionEffect(new EffectInstance(Effects.MINING_FATIGUE, 200, 1));
    }
}
