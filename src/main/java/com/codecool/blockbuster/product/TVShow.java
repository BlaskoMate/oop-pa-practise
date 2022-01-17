package com.codecool.blockbuster.product;

import com.codecool.blockbuster.product.enums.ProductType;

import java.time.LocalDate;

public class TVShow extends WatchableProduct{
    public TVShow(String title, LocalDate releaseDate, Long dailyRentalCost, Long originalRetailCost) {
        super(title, releaseDate, dailyRentalCost, originalRetailCost);
        productType = ProductType.TVSHOW;
        platformType = getPlatformType(releaseDate);
    }

}
