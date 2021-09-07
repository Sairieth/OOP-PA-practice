package com.company.model;

import com.company.TaxiCompany;

public abstract class Car {
    private long id;
    private TaxiCompany company;
    protected double cost;
    protected int amountOfPassengers;
    private BaseCost baseCost;

    public Car(long id, TaxiCompany company) {
        this.id = id;
        this.company = company;
    }

    public void setBaseCost(BaseCost baseCost) {
        this.baseCost = baseCost;
    }

    public BaseCost getBaseCost() {
        return baseCost;
    }

    private boolean checkId(long id) {
        return company.getCars().stream().map(Car::getId).anyMatch(aLong -> aLong == id);
    }

    private long generateUniqueId() {
        long generatedId = company.getRandom().nextLong();
        while (checkId(generatedId)) {
            generatedId = company.getRandom().nextLong();
        }
        return generatedId;
    }

    public long getId() {
        return id;
    }

    public double getCost() {
        return cost;
    }

    public TaxiCompany getCompany() {
        return company;
    }

    public abstract int calculateNumberOfPassengers();

    public abstract double calculateCost();
}
