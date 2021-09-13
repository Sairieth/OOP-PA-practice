package com.billiardsaloon;

import com.billiardsaloon.model.Table;
import com.billiardsaloon.model.TableType;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class ReceptionDesk {
    private Set<Table> tables = new HashSet<>();

    public  Set<Table> getAvailableTablesByType(TableType type){
        return tables.stream().filter(n->n.getTableType().equals(type)).collect(Collectors.toSet());
    }

    public int getHighestConsumingTable(){
        return tables.stream().map(Table::getConsumableSum).max(Integer::compareTo).orElse(0);
    };

    public void reserveTable(){};
}
