package com.codecool.blockbuster.product;

import com.codecool.blockbuster.product.enums.PlatformType;
import com.codecool.blockbuster.product.enums.ProductType;

import java.time.LocalDate;

public class VideoGame extends Product{
    public VideoGame(String title, LocalDate releaseDate, Long dailyRentalCost, Long originalRetailCost) {
        super(title, releaseDate, dailyRentalCost, originalRetailCost);
        productType = ProductType.VIDEOGAME;
        platformType = PlatformType.DVD;
    }
}
