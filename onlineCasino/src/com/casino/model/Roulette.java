package com.casino.model;

public class Roulette extends GameWithDealer {
    public Roulette(int id, Dealer dealer) {
        super(id, dealer);
        this.PLAYER_CAPACITY = 8;
        this.DAILY_PROFIT= 2000000.0;
    }
}
