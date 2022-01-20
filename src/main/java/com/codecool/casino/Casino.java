package com.codecool.casino;

import com.codecool.casino.game.Game;

import java.util.LinkedList;
import java.util.List;

public class Casino {

    private Long bank;
    private final List<Game> games = new LinkedList<>();

    public Casino(Long bank) {
        this.bank = bank;
    }

    public Long calculateDailyProfit(){
        return games.stream().mapToLong(Game::getDailyProfit).sum();
    }

    public Long calculateTotalBalance(){
        return bank + games.stream().mapToLong(Game::getBalance).sum();
    }

    public void updateAllGameBalance(){
        games.forEach(Game::updateBalance);
    }
}
