package com.starfleet.model;

import com.starfleet.StarFleet;

import java.util.HashMap;
import java.util.Map;

public class CargoShip extends MobileCraft {
    private final int baseSpeed;
    private Map<Cargo, Integer> cargo = new HashMap<>();

    public CargoShip(long registrationCode, String name, int dateOfConstruction, StarFleet shipsFleet) {
        super(registrationCode, name, dateOfConstruction, shipsFleet);
        this.baseSpeed = 150;
        setSpeedC(dateOfConstruction, baseSpeed);
    }

    public void fillCargoBay() {
        cargo.put(Cargo.FOOD, random.nextInt(6));
        cargo.put(Cargo.WEAPONS, random.nextInt(6));
        cargo.put(Cargo.MEDICINE, random.nextInt(6));
    }

    public void emptyCargoBay() {
        cargo.clear();
    }

    public void announceCargo() {
        cargo.entrySet().forEach(System.out::println);
    }

    public void announceRegistrationCode() {
        System.out.println(this.getRegistrationCode());
    }
}
