package com.farm;

import com.farm.plants.Almond;
import com.farm.plants.Plant;
import com.farm.plants.Spruce;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Farm {
    private Set<Plant> plants = new HashSet<>();
    private int food = 0;

    public void addPlant(Plant plant) {
        plants.add(plant);
    }

    public void calculateAmountOfFood() {
        for (Plant plant : plants) {
            food += plant.getProduction();
        }
    }

    public int getFood() {
        return food;
    }

    public void executeChanges() {
        for (Plant plant : plants) {
            plant.IncreaseProduction();
            if (plant instanceof Almond) {
                ((Almond) plant).growShroom();
                ((Almond) plant).rot();
            } else if (plant instanceof Spruce) {
                ((Spruce) plant).growShroom();
                ((Spruce) plant).rot();
            }
        }
    }

    ;

    public boolean checkMinimumNumberOfEachPlant(String type) {
        int plant = (int) plants.stream().filter(plant1 -> plant1.getClass().getSimpleName().equals(type)).count();
        if (plant < 2) {
            System.out.println("Farm doesn't reach min number of " + type + " plants.");
        }
        return plant >= 2;
        //        int almond = 0;
//        int juniper = 0;
//        int spruce = 0;
//        for (Plant plant : plants) {
//            switch (plant.getClass().getSimpleName()){
//                case "Almond":
//                    almond++;
//                    break;
//                case "Juniper":
//                    juniper++;
//                    break;
//                case "Spruce":
//                    spruce++;
//                    break;
//            }
//        }
//        return almond>=2 && juniper>=2 && spruce>=2;
    }

}
