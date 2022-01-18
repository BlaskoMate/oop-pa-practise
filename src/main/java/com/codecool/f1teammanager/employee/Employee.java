package com.codecool.f1teammanager.employee;

import java.math.BigDecimal;

public abstract class Employee {

    private final String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract BigDecimal getDailyRevenue();
}
