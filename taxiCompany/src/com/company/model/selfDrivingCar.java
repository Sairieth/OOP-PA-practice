package com.company.model;

import com.company.TaxiCompany;

public class selfDrivingCar extends Car{

    public selfDrivingCar(long id, TaxiCompany company, double cost, int amountOfPassengers) {
        super(id, company);
        this.amountOfPassengers= calculateNumberOfPassengers();
        setBaseCost(BaseCost.SELF_DRIVING);
        this.cost = calculateCost();

    }




    @Override
    public int calculateNumberOfPassengers() {
        return 70;
    }

    @Override
    public double calculateCost() {
        return amountOfPassengers+getBaseCost().getCost();
    }
}
