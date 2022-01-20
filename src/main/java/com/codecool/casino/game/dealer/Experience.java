package com.codecool.casino.game.dealer;

public enum Experience {
    NEWBIE(50000L),
    MIDLEVEL(80000L),
    PRO(120000L);

    private final Long dailySalary;

    Experience(Long dailySalary) {
        this.dailySalary = dailySalary;
    }

    public Long getDailySalary() {
        return dailySalary;
    }
}
