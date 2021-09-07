package com.starfleet;

import com.starfleet.model.SpaceCraft;

import java.util.HashSet;
import java.util.Set;

public class StarFleet {
    private Set<SpaceCraft> fleet = new HashSet<>();

    public boolean registrationCodeExists(long regCode){
        return fleet.stream().map(SpaceCraft::getRegistrationCode).anyMatch(aLong -> aLong == regCode);
    }

    public Set<SpaceCraft> getFleet() {
        return fleet;
    }
}
