package com.traincompany;

import com.traincompany.trains.FreightTrain;
import com.traincompany.trains.Train;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class TrainCompany {
    private Set<Train> trains = new HashSet<>();

    private double calculateProfit() {
        return trains.stream().map(Train::calculateRevenue).reduce(0.0, Double::sum);
    }

    private Set<FreightTrain> getFreightTrainsWithHazardousCargo() {
        return trains.stream().filter(train -> train instanceof FreightTrain)
                .map(train -> ((FreightTrain) train))
                .filter(freightTrain -> freightTrain.getCargo().name().equals("HAZARDOUS"))
                .collect(Collectors.toSet());
    }
}
