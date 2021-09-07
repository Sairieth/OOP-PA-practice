package com.company.model;

import java.util.HashSet;
import java.util.Set;

public class ConcertOrganiser {
    private Set<Concert> concerts = new HashSet<>();
    private Set<MainBand> mainBands = new HashSet<>();
    private Set<WarmupBand> WarmupBands = new HashSet<>();
    private double revenue;
    private boolean isRaining= false;

    public void rainCheck(){
        concerts.removeIf(concert -> concert.getVenue().name().equals("FESTIVAL"));
    }
    public void calculateRevenue(){
        double revenue = 0.0;
        for (Concert concert : concerts) {
            revenue += concert.getProfitFromTickets()*0.4+concert.valueOfBeerSold();
        }
        this.revenue = revenue;
    }

    public Set<Concert> getConcerts() {
        return concerts;
    }

    public void addConcerts(Concert concert) {
        this.concerts.add(concert);
    }

    public Set<MainBand> getMainBands() {
        return mainBands;
    }

    public void setMainBands(Set<MainBand> mainBands) {
        this.mainBands = mainBands;
    }

    public Set<WarmupBand> getWarmupBands() {
        return WarmupBands;
    }

    public void setWarmupBands(Set<WarmupBand> warmupBands) {
        WarmupBands = warmupBands;
    }

    public double getRevenue() {
        return revenue;
    }

    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }

    public boolean isRaining() {
        return isRaining;
    }

    public void setRaining(boolean raining) {
        isRaining = raining;
    }
}
