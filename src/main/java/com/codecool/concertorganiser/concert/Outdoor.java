package com.codecool.concertorganiser.concert;

import java.time.LocalTime;

public class Outdoor extends Concert{
    public Outdoor() {
        super(5000, LocalTime.of(2,0,0), 800L, "Outdoor");
    }

    public String cancelFestival(boolean isRaining){
        return "Festival cancelled";
    }
}
