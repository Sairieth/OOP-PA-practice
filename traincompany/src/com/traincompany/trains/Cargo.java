package com.traincompany.trains;

public enum Cargo {
        NORMAL(0.0),
    NON_SOLID(150.0),
    HAZARDOUS(300.0);

        private final double revenueModifier;

    public double getRevenueModifier() {
        return revenueModifier;
    }

    Cargo(double revenueModifier) {
        this.revenueModifier = revenueModifier;
    }
}
