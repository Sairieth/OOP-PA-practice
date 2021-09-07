package com.company.model;

public enum BaseCost {
    GASOLINE(350.0),
    ELECTRIC(400.0),
    SELF_DRIVING(740.0);

    private double cost;

    BaseCost(double cost) {
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }
}
