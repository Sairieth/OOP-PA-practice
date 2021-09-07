package com.company.model;

import com.company.TaxiCompany;

public abstract class CarWithDriver extends Car {
    protected Driver driver;

    public CarWithDriver(long id, TaxiCompany company) {
        super(id, company);
        this.driver = getRandomDriver();
    }

    public Driver getDriver() {
        return driver;
    }

    public abstract Driver getRandomDriver();

    @Override
    public int calculateNumberOfPassengers() {
        return this.driver.getExperience().getNumberOfPassengers();
    }

    @Override
    public double calculateCost() {
        return getDriver().getExperience().getNumberOfPassengers()+getBaseCost().getCost();
    }
}
