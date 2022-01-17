package com.codecool.blockbuster.product;

import com.codecool.blockbuster.product.enums.ProductType;

import java.time.LocalDate;

public class Movie extends WatchableProduct{
    public Movie(String title, LocalDate releaseDate, Long dailyRentalCost, Long originalRetailCost) {
        super(title, releaseDate, dailyRentalCost, originalRetailCost);
        productType = ProductType.MOVIE;
        platformType = getPlatformType(releaseDate);
    }

}
