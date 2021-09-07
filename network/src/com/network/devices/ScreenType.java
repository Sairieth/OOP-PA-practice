package com.network.devices;

public enum ScreenType {
    EDTV(5),
    HD(10),
    FULL_HD(15),
    UHD(20);

    ScreenType(int extraPowerConsumption) {
        this.extraPowerConsumption = extraPowerConsumption;
    }

    public int getExtraPowerConsumption() {
        return extraPowerConsumption;
    }

    private final int extraPowerConsumption;
}
