package com.codecool.concertorganiser.concert;

public class Bar {

    private int beersSold = 0;
    private final Long beerPrice;

    public Bar(Long beerPrice) {
        this.beerPrice = beerPrice;
    }

    public Long getIncome(){
        return beersSold * beerPrice;
    }

    public void buyBeer(int amount){
        beersSold += amount;
    }
}
