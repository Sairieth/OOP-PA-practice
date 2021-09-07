package com.casino.model;

public class SlotMachine extends Game{
    private int numberOfRollsSinceLastWin = 0;
    public SlotMachine(int id) {
        super(id);
        this.PLAYER_CAPACITY = 1;
        this.DAILY_PROFIT= 500000.0;
    }
    public void countRolls(boolean isWin){
        if (isWin) {
            numberOfRollsSinceLastWin = 0;
        } else {
            numberOfRollsSinceLastWin++;
        }
    }
}
