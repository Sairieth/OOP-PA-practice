package com.company.workers;

public enum Role {
    ELECTRICIAN(80),
    GAS_FITTER(90),
    PLUMBER(65);

    private int chanceOfJob;

    public int getChanceOfJob() {
        return chanceOfJob;
    }

    Role(int chanceOfJob) {
        this.chanceOfJob = chanceOfJob;
    }
}
