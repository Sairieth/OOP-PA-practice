package com.traincompany.trains;

public class ICTrain extends PassengerTrain{
    public ICTrain(long serialNumber, int productionYear, int numberOfCoaches) {
        super(serialNumber, productionYear, numberOfCoaches);
        this.ticket = 2.0;
    }
}
