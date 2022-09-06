package com.tube.hosting.java.tube.objects.server;

import com.tube.hosting.java.tube.objects.ResponsableObject;
import org.jetbrains.annotations.NotNull;

public class CPU extends ResponsableObject {

    private final int id;
    private final int coreCount;
    private final int threadsPerCore;
    private final int baseClock;
    private final int turboClock;
    private final @NotNull String model;
    private final @NotNull String brand;

    public CPU(int id, int coreCount, int threadsPerCore, int baseClock, int turboClock, @NotNull String model, @NotNull String brand) {
        this.id = id;
        this.coreCount = coreCount;
        this.threadsPerCore = threadsPerCore;
        this.baseClock = baseClock;
        this.turboClock = turboClock;
        this.model = model;
        this.brand = brand;
    }

    public int getId() {
        return id;
    }

    public int getCoreCount() {
        return coreCount;
    }

    public int getThreadsPerCore() {
        return threadsPerCore;
    }

    public int getBaseClock() {
        return baseClock;
    }

    public int getTurboClock() {
        return turboClock;
    }

    @NotNull
    public String getModel() {
        return model;
    }

    @NotNull
    public String getBrand() {
        return brand;
    }
}
