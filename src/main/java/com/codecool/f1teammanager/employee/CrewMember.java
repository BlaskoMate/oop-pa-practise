package com.codecool.f1teammanager.employee;

import java.math.BigDecimal;

public class CrewMember extends Employee{

    private CrewMemberType crewMemberType;
    private final BigDecimal dailySalary = BigDecimal.valueOf(1000);

    public CrewMemberType getCrewMemberType() {
        return crewMemberType;
    }

    public CrewMember(String name, int age, CrewMemberType crewMemberType) {
        super(name, age);
        this.crewMemberType = crewMemberType;
    }

    @Override
    public BigDecimal getDailyRevenue() {
        return dailySalary;
    }
}
