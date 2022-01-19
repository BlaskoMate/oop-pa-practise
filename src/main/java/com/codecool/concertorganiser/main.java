package com.codecool.concertorganiser;

import com.codecool.concertorganiser.concert.Festival;

public class main {
    public static void main(String[] args) {
        Company company = new Company();
        Festival festival = new Festival();
        festival.buyBeer(24000);
        festival.buyTicket(13000L, 8000);
        System.out.println(company.calculateProfit(festival));
    }
}
