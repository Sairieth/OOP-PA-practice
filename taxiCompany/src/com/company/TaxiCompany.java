package com.company;

import com.company.model.Car;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class TaxiCompany {

private Set<Car> cars = new HashSet<>();
private Random random = new Random();

    public Random getRandom() {
        return random;
    }

    public Set<Car> getCars() {
        return cars;
    }
}
