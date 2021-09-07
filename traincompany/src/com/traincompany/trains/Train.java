package com.traincompany.trains;

import java.math.BigDecimal;

public abstract class Train {
    private long SerialNumber;
    private int productionYear;
    protected double cost;

    public Train(long serialNumber, int productionYear) {
        SerialNumber = serialNumber;
        this.productionYear = productionYear;
    }

    public abstract double calculateRevenue();
}
