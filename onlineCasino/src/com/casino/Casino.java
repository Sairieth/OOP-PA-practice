package com.casino;

import com.casino.model.Dealer;
import com.casino.model.Game;
import com.casino.model.GameWithDealer;
import com.casino.model.SlotMachine;

import java.util.HashSet;
import java.util.Set;

public class Casino {
    private Set<Game> games = new HashSet<>();
    private Set<Dealer> dealers = new HashSet<>();
    private double casinoBank = 0.0;


    public void countProfit(){
        casinoBank += games.stream().mapToDouble(Game::getDAILY_PROFIT).sum();
        casinoBank -= games.stream()
                .filter(game -> game.getClass().getSimpleName().equals("BlackJack") || game.getClass().getSimpleName().equals("Roulette"))
                .mapToDouble(game -> ((GameWithDealer) game)
                        .getDealer().getSalary()).sum();
    }
    public double getTotalBalance(){
        return games.stream().mapToDouble(Game::getGameBank).sum()+casinoBank;
    }
}
