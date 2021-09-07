package com.casino.model;public class Dealer {
    private String name;
    private Experience experience;

    public Dealer(String name, Experience experience) {
        this.name = name;
        this.experience = experience;
    }
    public double getSalary(){
        return experience.getSalary();
    }

    public Experience getExperience() {
        return experience;
    }
}
