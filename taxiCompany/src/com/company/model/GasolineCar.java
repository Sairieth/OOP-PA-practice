package com.company.model;

import com.company.TaxiCompany;

public class GasolineCar extends CarWithDriver{
    private double maintenanceCost= 20.0;
    public GasolineCar(long id, TaxiCompany company) {
        super(id, company);
        setBaseCost(BaseCost.GASOLINE);
    }

    public void maintenance(){
        maintenanceCost*=0.1;
    }
    @Override
    public Driver getRandomDriver() {
        return new Driver("Driver "+getCompany().getRandom().nextLong(),50,this);
    }
}
