package com.codecool.concertorganiser;

import com.codecool.concertorganiser.concert.Concert;

public class Company {

    public Long calculateProfit(Concert concert){
        return concert.getBarIncome() + concert.getIncomeFromTickets();
    }
}
