package com.starfleet.model;

import com.starfleet.StarFleet;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public abstract class MobileCraft extends SpaceCraft{
    protected int speedC;
    private boolean isDocked = false;
    private SpaceStation dockedAt;

    public void land(SpaceStation station) {
        if (station.isAvailablePort()) {
            station.addShip(this);
            dockedAt = station;
            this.isDocked = true;
            if (station.getLandingBay().size()==2){
                station.setAvailablePort(false);
            }
        }else {
            System.out.println("The landing bay is full!");
        }
    }
    public void takeOff(SpaceStation station){
        station.removeShip(this);
        station.setAvailablePort(true);
    }

    public Set<SpaceStation> getAvailableSpaceStations(){
        Set<SpaceStation> available = new HashSet<>();
        for (SpaceCraft spaceCraft : shipsFleet.getFleet()) {
            if (spaceCraft instanceof SpaceStation && ((SpaceStation) spaceCraft).isAvailablePort()){
                available.add((SpaceStation) spaceCraft);
            }
        }
        return available;
    }

    public void setSpeedC(int dateOfConstruction,int baseSpeed) {
        if (dateOfConstruction < 2150) {
            this.speedC = baseSpeed-30;
        }else if (dateOfConstruction>2200){
            this.speedC = baseSpeed+15;
        }
    }

    public boolean isDocked() {
        return isDocked;
    }

    public void setDocked(boolean docked) {
        isDocked = docked;
    }

    public MobileCraft(long registrationCode, String name, int dateOfConstruction, StarFleet shipsFleet) {
        super(registrationCode, name, dateOfConstruction, shipsFleet);
    }
}
