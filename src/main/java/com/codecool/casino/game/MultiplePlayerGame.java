package com.codecool.casino.game;

import com.codecool.casino.game.dealer.Dealer;

public abstract class MultiplePlayerGame extends Game{

    private Dealer dealer;

    public MultiplePlayerGame(Long bank, int GAME_ID, int PLAYER_LIMIT, Long DAILY_PROFIT) {
        super(bank, GAME_ID, PLAYER_LIMIT, DAILY_PROFIT);
    }

    public void setDealer(Dealer dealer) {
        this.dealer = dealer;
    }

    @Override
    public Long getDailyProfit() {
        return super.getDailyProfit() - dealer.getDailySalary();
    }

    public String assignDealer(Dealer dealer){
        this.dealer = dealer;
        return "Dealer assigned";
    }

    public Dealer getDealer() {
        return dealer;
    }
}
