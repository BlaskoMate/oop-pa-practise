package com.codecool.concertorganiser.concert;

import java.time.LocalTime;

public class Indoor extends Concert{
    public Indoor() {
        super(3000, LocalTime.of(1, 30,0), 600L, "Indoor");
    }
}
