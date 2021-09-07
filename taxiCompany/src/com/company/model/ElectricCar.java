package com.company.model;

import com.company.TaxiCompany;

public class ElectricCar extends CarWithDriver{
    public ElectricCar(long id, TaxiCompany company) {
        super(id, company);
        setBaseCost(BaseCost.ELECTRIC);
    }

    @Override
    public Driver getRandomDriver() {
        return new Driver("Driver "+getCompany().getRandom().nextLong(),50,this);
    }
}
