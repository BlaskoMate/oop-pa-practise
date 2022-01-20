package com.codecool.casino.game;

public class SlotMachine extends Game{

    private int rollsSinceWin = 0;

    public SlotMachine(Long bank, int GAME_ID) {
        super(bank, GAME_ID, 1, 500000L);
    }
}
