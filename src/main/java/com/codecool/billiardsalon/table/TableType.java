package com.codecool.billiardsalon.table;

import java.time.LocalTime;

public enum TableType {
    POOL(1200, null),
    SNOOKER(1600, LocalTime.of(18, 0, 0)),
    REX(800, LocalTime.of(18, 0, 0));

    private int price;
    private LocalTime time;

    TableType(int price, LocalTime time) {
        this.price = price;
        this.time = time;
    }

    public int getPrice() {
        return price;
    }

    public LocalTime getTime() {
        return time;
    }
}
