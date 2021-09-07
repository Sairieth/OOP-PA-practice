package com.network.devices;

import com.network.Network;

public abstract class DeviceWithScreen extends Device{
    protected ScreenType screenType;

    public DeviceWithScreen(int age, int originalBatteryLife, Network network, ScreenType screenType) {
        super(age, originalBatteryLife, network);
        this.screenType = screenType;
    }
}
