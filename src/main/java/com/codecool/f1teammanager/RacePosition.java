package com.codecool.f1teammanager;

import java.math.BigDecimal;

public enum RacePosition {

    FIRST(BigDecimal.valueOf(10000000)),
    SECOND(BigDecimal.valueOf(1000000));

    private final BigDecimal paymentForRace;

    RacePosition(BigDecimal paymentForRace) {
        this.paymentForRace = paymentForRace;
    }

    public BigDecimal getPaymentForRace() {
        return paymentForRace;
    }
}
