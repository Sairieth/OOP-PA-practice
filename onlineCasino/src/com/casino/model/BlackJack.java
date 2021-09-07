package com.casino.model;

public class BlackJack extends GameWithDealer {
    private BlackJack(int id, Dealer dealer) {
        super(id, dealer);
        this.PLAYER_CAPACITY = 6;
        this.DAILY_PROFIT= 1500000.0;
    }

    public static BlackJack setupGame(int id, Dealer dealer){
        if (dealer.getExperience().name().equals("PRO")){
            return new BlackJack(id,dealer);
        }else{
            throw new DealerNotQualifiedException("Dealer assigned not qualified to facilitate game.");
        }
    }
}
