package com.codecool.concertorganiser.concert;

import java.time.LocalTime;

public class Festival extends Concert{
    public Festival() {
        super(8000, LocalTime.of(5,0,0), 1000L, "Festival");
    }
}
