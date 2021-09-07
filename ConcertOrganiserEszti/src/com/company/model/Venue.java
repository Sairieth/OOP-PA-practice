package com.company.model;

public enum Venue {
    INDOOR(3000,1.5,600.0),
    OUTDOOR(5000,2,800.0),
    FESTIVAL(8000,6,1000.0);

    private final int capacity;
    private final double duration;
    private final double beerPrice;

    Venue(int capacity, double duration, double beerPrice) {
        this.capacity = capacity;
        this.duration = duration;
        this.beerPrice = beerPrice;
    }

    public int getCapacity() {
        return capacity;
    }

    public double getDuration() {
        return duration;
    }

    public double getBeerPrice() {
        return beerPrice;
    }
}