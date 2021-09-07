package com.farm;

import com.farm.plants.Almond;
import com.farm.plants.Juniper;
import com.farm.plants.Spruce;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        Farm farm = new Farm();
        generatePlants(random, farm);
        for (int i = 0; i < 81; i++) {
            farm.calculateAmountOfFood();
            farm.executeChanges();
        }
        System.out.println(farm.getFood());
    }

    private static void generatePlants(Random random, Farm farm) {
        while (!farm.checkMinimumNumberOfEachPlant("Almond") ||
                !farm.checkMinimumNumberOfEachPlant("Spruce") ||
                !farm.checkMinimumNumberOfEachPlant("Juniper")) {
            if (!farm.checkMinimumNumberOfEachPlant("Almond")) {
                farm.addPlant(new Almond("Alm" + random.nextLong()));
            } else if (!farm.checkMinimumNumberOfEachPlant("Juniper")) {
                farm.addPlant(new Juniper("Jun" + random.nextLong()));
            } else if (!farm.checkMinimumNumberOfEachPlant("Spruce")) {
                farm.addPlant(new Spruce("Bruce" + random.nextLong()));
            }
        }
    }
}