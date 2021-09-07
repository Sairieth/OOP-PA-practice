package com.starfleet.model;

import com.starfleet.StarFleet;

import java.util.Random;

public abstract class SpaceCraft {
    private final long registrationCode;
    private final String name;
    protected final int dateOfConstruction;
    protected StarFleet shipsFleet;
    protected Random random = new Random();

    public SpaceCraft(long registrationCode, String name, int dateOfConstruction, StarFleet shipsFleet) {
        this.registrationCode = registrationCode;
        this.name = name;
        this.dateOfConstruction = dateOfConstruction;
        this.shipsFleet = shipsFleet;
    }

    public long generateRegistrationCode() {
        long regCode = random.nextLong();
        while (shipsFleet.registrationCodeExists(regCode)) {
            regCode = random.nextLong();
        }
        return regCode;
    }

    public long getRegistrationCode() {
        return registrationCode;
    }

    public String getType() {
        return this.getClass().getSimpleName();
    }
}
