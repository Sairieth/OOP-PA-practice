package com.company.model;

public enum Expirience {
    BEGGINER(15),
    ADVANCED(25),
    PROFFESIONAL(40);

    private int numberOfPassengers;

    Expirience(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }
}
