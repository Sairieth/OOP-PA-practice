package com.company.workers;

public enum Experience {
    BEGINNER(0.4,50000.0),
    ADVANCED(0.3,35000.0),
    EXPERT(0.2,25000.0);

    private double percentageToCompany;
private double toolCost;
    public double getPercentageToCompany() {
        return percentageToCompany;
    }

    public double getToolCost() {
        return toolCost;
    }

    Experience(double percentageToCompany, double toolCost) {
        this.percentageToCompany = percentageToCompany;
        this.toolCost = toolCost;
    }
}
