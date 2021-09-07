package com.traincompany.trains;

public class PassengerTrain extends Train {
    protected double ticket;
    protected int numberOfCoaches;
    private int numberOfPassengers;

    public PassengerTrain(long serialNumber, int productionYear, int numberOfCoaches) {
        super(serialNumber, productionYear);
        this.numberOfCoaches = numberOfCoaches;
        this.ticket = 1.5;
    }

    @Override
    public double calculateRevenue() {
        int passengers = numberOfPassengers;
        double revenue = 0.0;
        revenue+= ((double) passengers/4)*2.0;
        passengers -= passengers/4;
        revenue+= passengers*ticket;
        return revenue;
    }
}
