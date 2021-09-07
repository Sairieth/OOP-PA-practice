package com.company.model;

import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

public class Driver {
private String name;
private int age;
private int number;
private double Salary;
private Expirience expirience;
private Car car;
private Random random = new Random();

    public Driver(String name, int age, Car car) {
        this.name = name;
        this.age = age;
        this.car = car;
        this.number = generateNumber();
        this.Salary = getSalary();
        this.expirience = setExperience();
    }

    public Expirience getExperience() {
        return expirience;
    }

    private Expirience setExperience() {
        return Expirience.values()[random.nextInt(2)];
    }

    private double getSalary() {
        return car.getCost()+expirience.getNumberOfPassengers();
    }

    private int generateNumber() {
        int resultNumber = (int) ((Math.random()*(99999-10000))+10000);
        while (checkNumber(resultNumber)){
            resultNumber = (int) ((Math.random()*(99999-10000))+10000);
        }
        return resultNumber;
    }
    private boolean checkNumber(int number){
        return getNumbers().stream().anyMatch(n-> n == number);
    }

    public int getNumber() {
        return number;
    }

    private Set<Integer> getNumbers(){
        return car.getCompany().getCars().stream().filter(n->n instanceof CarWithDriver)
                .map(n->((CarWithDriver) n).getDriver())
                .map(Driver::getNumber)
                .collect(Collectors.toSet());
    }
}
