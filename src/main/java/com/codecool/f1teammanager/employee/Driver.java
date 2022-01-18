package com.codecool.f1teammanager.employee;

import java.math.BigDecimal;

public class Driver extends Employee{

    private Experience experience;

    public Driver(String name, int age, Experience experience) {
        super(name, age);
        this.experience = experience;
    }


    @Override
    public BigDecimal getDailyRevenue() {
        return experience.getPaymentForRace();
    }
}
