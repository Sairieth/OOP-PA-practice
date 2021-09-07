package com.starfleet.model;

import com.starfleet.StarFleet;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DiscoveryShip extends MobileCraft {
    private final int baseSpeed;
    private List<String> shipLog = new ArrayList<>();
    private Date date = new Date();

    public DiscoveryShip(long registrationCode, String name, int dateOfConstruction, StarFleet shipsFleet) {
        super(registrationCode, name, dateOfConstruction, shipsFleet);
        this.baseSpeed = 450;
        setSpeedC(dateOfConstruction,baseSpeed);
    }
    public void log(SpaceStation station){
        shipLog.add(String.valueOf(date.getTime())+" "+ station.getRegistrationCode());
    }
}
