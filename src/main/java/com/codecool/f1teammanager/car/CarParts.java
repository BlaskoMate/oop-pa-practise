package com.codecool.f1teammanager.car;

import java.math.BigDecimal;

public class CarParts {

    private int amount;
    public static BigDecimal price = BigDecimal.valueOf(10000);

    public CarParts(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount += amount;
    }
}
