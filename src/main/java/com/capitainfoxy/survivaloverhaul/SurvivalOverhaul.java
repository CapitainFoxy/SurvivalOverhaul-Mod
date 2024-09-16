package com.capitainfoxy.survivaloverhaul;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import com.capitainfoxy.survivaloverhaul.systems.TemperatureSystem;
import com.capitainfoxy.survivaloverhaul.systems.FoodSystem;
import com.capitainfoxy.survivaloverhaul.systems.HydrationSystem;
import com.capitainfoxy.survivaloverhaul.systems.FatigueSystem;
import com.capitainfoxy.survivaloverhaul.systems.DiseaseSystem;
import com.capitainfoxy.survivaloverhaul.systems.InjurySystem;

@Mod("survivaloverhaul")
public class SurvivalOverhaul {

    public SurvivalOverhaul() {
        MinecraftForge.EVENT_BUS.register(this);
        MinecraftForge.EVENT_BUS.register(new TemperatureSystem());
        MinecraftForge.EVENT_BUS.register(new FoodSystem());
        MinecraftForge.EVENT_BUS.register(new HydrationSystem());
        MinecraftForge.EVENT_BUS.register(new FatigueSystem());
        MinecraftForge.EVENT_BUS.register(new DiseaseSystem());
        MinecraftForge.EVENT_BUS.register(new InjurySystem());
    }

    @SubscribeEvent
    public void onPlayerTick(TickEvent.PlayerTickEvent event) {
        TemperatureSystem.handle(event);
        FoodSystem.handle(event);
        HydrationSystem.handle(event);
        FatigueSystem.handle(event);
        DiseaseSystem.handle(event);
        InjurySystem.handle(event);
    }
}
