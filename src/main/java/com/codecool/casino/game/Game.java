package com.codecool.casino.game;

public abstract class Game {

    private Long bank;
    private final int GAME_ID;
    private final int PLAYER_LIMIT;
    private final Long DAILY_PROFIT;

    public Game(Long bank, int GAME_ID, int PLAYER_LIMIT, Long DAILY_PROFIT) {
        this.bank = bank;
        this.GAME_ID = GAME_ID;
        this.PLAYER_LIMIT = PLAYER_LIMIT;
        this.DAILY_PROFIT = DAILY_PROFIT;
    }

    public Long getDailyProfit(){
        return DAILY_PROFIT;
    }

    public Long getBalance(){
        return bank;
    }

    public String updateBalance(){
        bank += DAILY_PROFIT;
        return "game id:" + GAME_ID + "'s balance updated";
    }
}
