package com.casino.model;

public enum Experience {
    NEWBIE(50000.0),
    MID_LEVEL(80000.0),
    PRO(120000.0);

    private double salary;

    Experience(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}
