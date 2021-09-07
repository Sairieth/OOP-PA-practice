package com.farm.plants;

public class Almond extends Plant implements SpecialAttribute{
    public Almond(String name) {
        super(name);
        this.production =  50;
    }
public void lastStand(){
        if (this.production<40){
            this.production *= 2;
        }
}
    @Override
    public void IncreaseProduction() {
        production+=4;
    }

    @Override
    public void growShroom() {
        int chance = random.nextInt(101);
    if (chance<=8){
        production+= 10;
    }
    }

    @Override
    public void rot() {
        int chance = random.nextInt(101);
        if (chance<=13){
            this.production-= 18;
        }
     lastStand();
    }
}
