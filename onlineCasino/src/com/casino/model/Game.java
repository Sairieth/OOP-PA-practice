package com.casino.model;

public class Game {
    private int id;
    protected int PLAYER_CAPACITY;
    protected double DAILY_PROFIT;
    private double gameBank;

    public Game(int id) {
        this.id = id;
        this.gameBank= 0.0;
    }

    public double getDAILY_PROFIT() {
        return DAILY_PROFIT;
    }

    public double getGameBank() {
        return gameBank;
    }
}
