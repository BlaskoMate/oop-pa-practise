package com.codecool.casino.game.dealer;

public class Dealer {

    private final String name;
    private Experience experience;

    public Dealer(String name, Experience experience) {
        this.name = name;
        this.experience = experience;
    }

    public Experience getExperience() {
        return experience;
    }

    public Long getDailySalary(){
        return experience.getDailySalary();
    }
}
