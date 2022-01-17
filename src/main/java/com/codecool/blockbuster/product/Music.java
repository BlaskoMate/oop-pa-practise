package com.codecool.blockbuster.product;

import com.codecool.blockbuster.product.enums.PlatformType;
import com.codecool.blockbuster.product.enums.ProductType;

import java.time.LocalDate;

public class Music extends Product{
    public Music(String title, LocalDate releaseDate, Long dailyRentalCost, Long originalRetailCost) {
        super(title, releaseDate, dailyRentalCost, originalRetailCost);
        productType = ProductType.MUSIC;
        platformType = PlatformType.CD;
    }
}
