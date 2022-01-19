package com.codecool.concertorganiser.concert.band;

public class Band {

    private final String NAME;
    private final BandStyle STYLE;
    private Band warmUpBandIdea;

    public Band(String NAME, BandStyle STYLE) {
        this.NAME = NAME;
        this.STYLE = STYLE;
    }

    public void setWarmUpBandIdea(Band warmUpBandIdea) {
        this.warmUpBandIdea = warmUpBandIdea;
    }

    public Band getWarmUpBandIdea() {
        return warmUpBandIdea;
    }
}
