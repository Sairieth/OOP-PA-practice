package com.network.devices;

import com.network.Network;

import java.util.Set;
import java.util.stream.Collectors;

public class Smart extends DeviceWithScreen {
    private String name;

    public Smart(int age, int originalBatteryLife, Network network, ScreenType screenType, String name) {
        super(age, originalBatteryLife, network, screenType);
        this.name = name;
    }

    public Set<Normal> getNormalDevicesWithDifferentBatteryLife() {
        return network.getDevices().stream()
                .filter(n -> n instanceof Normal)
                .filter(n -> n.getOriginalBatteryLife() < this.getOriginalBatteryLife() || n.getOriginalBatteryLife() > this.getOriginalBatteryLife())
                .map(n -> ((Normal) n))
                .collect(Collectors.toSet());
    }

    @Override
    public void setRemainingPower() {
        this.setBatteryLife(this.getOriginalBatteryLife() - (getAge() * 15) - screenType.getExtraPowerConsumption());
    }
}
