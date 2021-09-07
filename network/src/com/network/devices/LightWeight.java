package com.network.devices;

import com.network.Network;

public class LightWeight extends Device{

    public LightWeight(int age, int originalBatteryLife, Network network) {
        super(age, originalBatteryLife, network);
    }

    private int getNumberOfLightWeightDevicesOnNetwork(){
        return (int)network.getDevices().stream().filter(n-> n instanceof LightWeight).count();
    }

    @Override
    public void setRemainingPower() {
        int powerLossByAge = this.getAge()*7;
        int powerGainFromOtherDevices = 20*getNumberOfLightWeightDevicesOnNetwork();
        this.setBatteryLife(this.getOriginalBatteryLife()-powerLossByAge+powerGainFromOtherDevices);
    }
}
