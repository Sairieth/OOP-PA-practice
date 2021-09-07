package com.starfleet.model;

import com.starfleet.StarFleet;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SpaceStation extends SpaceCraft {
    private Set<MobileCraft> landingBay = new HashSet<>();
    private boolean availablePort = true;

    public boolean isAvailablePort() {
        return availablePort;
    }

    public void addShip(MobileCraft craft) {
        landingBay.add(craft);
    }

    public void removeShip(MobileCraft craft) {
        landingBay.remove(craft);
    }

    public Set<MobileCraft> getLandingBay() {
        return landingBay;
    }

    public void setAvailablePort(boolean availablePort) {
        this.availablePort = availablePort;
    }


    public Set<SpaceCraft> getListOfShipsInSpace(String type) {
        Set<SpaceCraft> craftsInSpace = new HashSet<>();
        for (SpaceCraft spaceCraft : shipsFleet.getFleet()) {
            if (type.equals("SpaceStation")
                    || (spaceCraft.getType().equals(type) && !((MobileCraft) spaceCraft).isDocked())) {
                craftsInSpace.add(spaceCraft);
            }
        }
        return craftsInSpace;
    }

    public SpaceStation(long registrationCode, String name, int dateOfConstruction, StarFleet shipsFleet) {
        super(registrationCode, name, dateOfConstruction, shipsFleet);
    }
}
