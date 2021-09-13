package com.billiardsaloon.model;

public enum TableType {
    POOL(1200,false),
    SNOOKER(1600,true),
    REX(800,true);

    private int price;
    private boolean onlyAfter6;

    TableType(int price, boolean onlyAfter6) {
        this.price = price;
        this.onlyAfter6 = onlyAfter6;
    }

    public int getPrice() {
        return price;
    }

    public boolean isOnlyAfter6() {
        return onlyAfter6;
    }
}
