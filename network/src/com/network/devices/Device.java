package com.network.devices;

import com.network.Network;

public abstract class Device {
    private int age;
    private final int originalBatteryLife;
    private int batteryLife;
    protected Network network;

    public Device(int age, int originalBatteryLife, Network network) {
        this.age = age;
        this.originalBatteryLife = originalBatteryLife;
        this.network=network;
    }

    public int getAge() {
        return age;
    }

    public int getOriginalBatteryLife() {
        return originalBatteryLife;
    }

    public void setBatteryLife(int batteryLife) {
        this.batteryLife = batteryLife;
    }
    public abstract void setRemainingPower();
}
