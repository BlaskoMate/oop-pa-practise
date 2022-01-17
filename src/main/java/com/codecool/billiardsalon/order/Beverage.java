package com.codecool.billiardsalon.order;

public class Beverage {

    private int price;
    private String name;
    private BeverageType beverageType;

    public Beverage(int price, String name, BeverageType beverageType) {
        this.price = price;
        this.name = name;
        this.beverageType = beverageType;
    }
}
