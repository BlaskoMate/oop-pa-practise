package com.codecool.concertorganiser.concert;

import com.codecool.concertorganiser.concert.band.Band;

import java.time.LocalTime;

public abstract class Concert {

    private Band mainBand = null;
    private Band warmUpBand = null;
    private final int CAPACITY;
    private final LocalTime DURATION;
    private final TicketInformation ticketInformation = new TicketInformation(12000L, 15000L);
    private final Bar bar;
    private final String STYLE;

    public Concert(int CAPACITY, LocalTime DURATION, Long beerPrice, String style) {
        this.CAPACITY = CAPACITY;
        this.DURATION = DURATION;
        this.bar = new Bar(beerPrice);
        this.STYLE = style;
    }

    public Band getMainBand() {
        return mainBand;
    }

    public Band getWarmUpBand() {
        return warmUpBand;
    }

    public void setMainBand(Band mainBand) {
        this.mainBand = mainBand;
    }

    public void setWarmUpBand(Band warmUpBand) {
        this.warmUpBand = warmUpBand;
    }

    public Long getBarIncome(){
        return bar.getIncome();
    }

    public Long getIncomeFromTickets(){
        return ticketInformation.getTotalIncome();
    }

    public void buyBeer(int amount){
        bar.buyBeer(amount);
    }

    public String buyTicket(Long price, int amount){
        return ticketInformation.buyTickets(price, amount, CAPACITY);
    }
}
