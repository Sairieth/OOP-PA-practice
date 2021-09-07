package com.farm.plants;

public abstract class Evergreen extends Plant {
    private int maxProduction;
    private int monthCounter = 0;

    public Evergreen(String name) {
        super(name);
        this.maxProduction = 70;
    }

    public void announceAtFullProduction() {
            System.out.println(this.getName() + " At full production!");
    }

    @Override
    public void IncreaseProduction() {
        monthCounter++;
        if (monthCounter % 5 == 0) {
            IncreaseProduction(8);
        } else {
            if (production + 4 > maxProduction) {
                production = maxProduction;
                announceAtFullProduction();
            } else {
                production += 4;
            }
        }
    }

    public void IncreaseProduction(int amount) {
        if (production + amount > maxProduction) {
            production = maxProduction;
            announceAtFullProduction();
        } else {
            production += amount;
        }
    }
}
