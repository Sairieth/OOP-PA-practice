package com.network;

import com.network.devices.*;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Network {
    private Set<Device> devices = new HashSet<>();
    private Random random = new Random();

    public void generateDevices(int numberOfDevices) {
        devices.addAll(Stream.generate(() -> new LightWeight(random.nextInt(10), 100, this))
                .limit(numberOfDevices)
                .collect(Collectors.toSet()));
        devices.addAll(Stream.generate(() -> new Smart(random.nextInt(10), 100, this, ScreenType.values()[random.nextInt(3)],"Smart "+random.nextLong()))
                .limit(numberOfDevices)
                .collect(Collectors.toSet()));
        devices.addAll(Stream.generate(() -> new Normal(random.nextInt(10), 100, this,ScreenType.values()[random.nextInt(3)],generateDateOfManufacture()))
                .limit(numberOfDevices)
                .collect(Collectors.toSet()));
    }

    private int generateDateOfManufacture(){
        return (int)((Math.random()*(2021-1990))+1990);
    }

    public void addDevice(Device device) {
        devices.add(device);
    }

    ;

    public Set<Device> getDevices() {
        return devices;
    }
}
