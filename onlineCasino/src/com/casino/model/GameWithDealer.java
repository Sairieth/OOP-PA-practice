package com.casino.model;

public class GameWithDealer extends Game{
    private Dealer dealer;

    public GameWithDealer(int id, Dealer dealer) {
        super(id);
        this.dealer = dealer;
    }

    public Dealer getDealer() {
        return dealer;
    }
}
