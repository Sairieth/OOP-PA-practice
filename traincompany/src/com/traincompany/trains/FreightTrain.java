package com.traincompany.trains;

public class FreightTrain extends Train{
    private Cargo cargo;

    public FreightTrain(long serialNumber, int productionYear, Cargo cargo) {
        super(serialNumber, productionYear);
        this.cargo = cargo;
        this.cost = 1000.0;
    }

    public Cargo getCargo() {
        return cargo;
    }

    @Override
    public double calculateRevenue() {
        return 550.0 + cargo.getRevenueModifier();
    }
}
