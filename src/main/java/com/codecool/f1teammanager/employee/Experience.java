package com.codecool.f1teammanager.employee;

import java.math.BigDecimal;

public enum Experience {
    BEGINNER(BigDecimal.valueOf(20000)),
    MEDIUM(BigDecimal.valueOf(40000)),
    INTERMEDIATE(BigDecimal.valueOf(100000));

    private final BigDecimal paymentForRace;

    Experience(BigDecimal paymentForRace) {
        this.paymentForRace = paymentForRace;
    }

    public BigDecimal getPaymentForRace() {
        return paymentForRace;
    }
}
