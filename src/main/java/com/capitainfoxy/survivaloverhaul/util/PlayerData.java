package com.capitainfoxy.survivaloverhaul.util;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.CompoundNBT;

public class PlayerData {

    private static final String HYDRATION_KEY = "Hydration";
    private static final String FATIGUE_KEY = "Fatigue";

    public static int getHydration(PlayerEntity player) {
        CompoundNBT nbt = player.getPersistentData();
        if (nbt.contains(HYDRATION_KEY)) {
            return nbt.getInt(HYDRATION_KEY);
        }
        return 100; // Default hydration value
    }

    public static void setHydration(PlayerEntity player, int hydration) {
        CompoundNBT nbt = player.getPersistentData();
        nbt.putInt(HYDRATION_KEY, hydration);
    }

    public static int getFatigue(PlayerEntity player) {
        CompoundNBT nbt = player.getPersistentData();
        if (nbt.contains(FATIGUE_KEY)) {
            return nbt.getInt(FATIGUE_KEY);
        }
        return 50; // Default fatigue value
    }

    public static void setFatigue(PlayerEntity player, int fatigue) {
        CompoundNBT nbt = player.getPersistentData();
        nbt.putInt(FATIGUE_KEY, fatigue);
    }
}
