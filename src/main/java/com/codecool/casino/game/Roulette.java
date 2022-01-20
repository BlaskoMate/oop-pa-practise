package com.codecool.casino.game;

import com.codecool.casino.game.dealer.Dealer;
import com.codecool.casino.game.dealer.Experience;

public class Roulette extends MultiplePlayerGame{

    public Roulette(Long bank, int GAME_ID) {
        super(bank, GAME_ID, 8, 2000000L);
    }

    public boolean isValidDealer(Experience experience){
        return experience == Experience.PRO;
    }

    @Override
    public String assignDealer(Dealer dealer){
        if (isValidDealer(dealer.getExperience())){
            setDealer(dealer);
            return "Dealer assigned";
        }
        return "Dealer not experienced enough.";
    }
}
