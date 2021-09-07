package com.farm.plants;

public abstract class Plant {
    private String name;
    protected int production;

    public Plant(String name) {
        this.name = name;
    }

    public int getProduction() {
        return production;
    }

    public String getName() {
        return name;
    }

    public abstract void IncreaseProduction();
}
