package com.billiardsaloon.model;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Table {
    private TableType tableType;
    private List<Consumable> orders = new ArrayList<>();
    private boolean isFree = true;
    private LocalTime startOfReservation;

    public int getConsumableSum(){
        return orders.stream().map(Consumable::getPrice).reduce(0,Integer::sum);
    }
    public void setFree(boolean free) {
        isFree = free;
    }

    public TableType getTableType() {
        return tableType;
    }


    public boolean isFree() {
        return isFree;
    }

    public LocalTime getStartOfReservation() {
        return startOfReservation;
    }

    public void setStartOfReservation(LocalTime startOfReservation) {
        this.startOfReservation = startOfReservation;
    }
}
