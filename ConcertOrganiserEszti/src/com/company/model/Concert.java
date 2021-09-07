package com.company.model;

public class Concert {
    private double price;
    private Style style;
    private Venue venue;
    private MainBand mainBand;
    private WarmupBand warmupBand;
    private int ticketsSold;
    private int numberOfBeerSold;

    public Concert(double price, Style style, Venue venue, MainBand mainBand, WarmupBand warmupBand) {
        this.price = price;
        this.style = style;
        this.venue = venue;
        this.mainBand = mainBand;
        this.warmupBand = warmupBand;
    }

    public void sellTicket(int ticketsToBePurchased){
        if (ticketsSold+ticketsToBePurchased <= venue.getCapacity()){
            ticketsSold+= ticketsToBePurchased;
        }else{
            System.out.println("Only " + (venue.getCapacity() - ticketsSold) + "remain, sorry for your inconvenience!");
        }
    }
    public void sellBeer(int numberOfBeer){
        numberOfBeerSold=+numberOfBeer;
    }

    public double getProfitFromTickets(){
        return ticketsSold*price;
    }
    public double valueOfBeerSold(){
        return venue.getBeerPrice()*numberOfBeerSold;
    }

    public double getPrice() {
        return price;
    }

    public Style getStyle() {
        return style;
    }

    public Venue getVenue() {
        return venue;
    }

    public int getTicketsSold() {
        return ticketsSold;
    }
}
