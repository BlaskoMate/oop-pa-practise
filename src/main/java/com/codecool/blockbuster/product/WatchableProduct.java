package com.codecool.blockbuster.product;

import com.codecool.blockbuster.product.enums.PlatformType;

import java.time.LocalDate;

public class WatchableProduct extends Product{
    public WatchableProduct(String title, LocalDate releaseDate, Long dailyRentalCost, Long originalRetailCost) {
        super(title, releaseDate, dailyRentalCost, originalRetailCost);
    }

    protected PlatformType getPlatformType(LocalDate releaseDate){
        if (releaseDate.isBefore(LocalDate.of(2000, 1, 1))){
            return PlatformType.VHS;
        } else if (releaseDate.isAfter(LocalDate.of(2000, 1, 1)) &&
                releaseDate.isBefore(LocalDate.of(2010, 1, 1))){
            return PlatformType.DVD;
        } else {
            return PlatformType.BLUERAY;
        }
    }
}
