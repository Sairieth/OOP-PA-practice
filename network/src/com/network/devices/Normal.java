package com.network.devices;

import com.network.Network;

public class Normal extends DeviceWithScreen {
    private int yearOfManufacture;

    public Normal(int age, int originalBatteryLife, Network network, ScreenType screenType, int yearOfManufacture) {
        super(age, originalBatteryLife, network, screenType);
        this.yearOfManufacture = yearOfManufacture;
    }

    @Override
    public void setRemainingPower() {
        int currentBatteryLife = this.getOriginalBatteryLife();
        int result = currentBatteryLife - (3 * this.getAge());
        if (yearOfManufacture < 2000) {
            this.setBatteryLife(result/2);
        }else{
            this.setBatteryLife(result*2);
        }
    }
}
