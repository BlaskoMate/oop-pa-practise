package com.codecool.casino.game;

public class BlackJack extends MultiplePlayerGame{

    public BlackJack(Long bank, int GAME_ID) {
        super(bank, GAME_ID, 6, 1000000L);
    }
}
