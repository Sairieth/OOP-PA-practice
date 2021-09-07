package com.farm.plants;

public class Spruce extends Evergreen implements SpecialAttribute {

    public Spruce(String name) {
        super(name);
        production = 26;
    }

    @Override
    public void growShroom() {
        int chance = random.nextInt(101);
        if (chance<=5){
            this.IncreaseProduction(15);
        }
    }

    @Override
    public void rot() {
        int chance = random.nextInt(101);
        if (chance<=4){
            if (this.production-20<=0){
                production=0;
            }else {
                this.production-= 20;
            }
        }
    }
}
