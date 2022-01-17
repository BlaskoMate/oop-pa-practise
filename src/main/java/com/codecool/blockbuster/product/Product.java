package com.codecool.blockbuster.product;

import com.codecool.blockbuster.product.enums.PlatformType;
import com.codecool.blockbuster.product.enums.ProductType;
import com.codecool.blockbuster.rentalinfo.RentalInformation;

import java.time.LocalDate;

public abstract class Product {

    private String title;
    private LocalDate releaseDate;
    private Long dailyRentalCost;
    private Long originalRetailCost;
    private RentalInformation rentalInformation = null;
    private boolean isFavorite = false;
    protected ProductType productType;
    protected PlatformType platformType;
    private final int MAX_DAYS_FOR_RENTAL = 14;

    public Product(String title, LocalDate releaseDate, Long dailyRentalCost, Long originalRetailCost) {
        this.title = title;
        this.releaseDate = releaseDate;
        this.dailyRentalCost = dailyRentalCost;
        this.originalRetailCost = originalRetailCost;
    }

    public String getTitle() {
        return title;
    }

    public Long getDailyRentalCost() {
        return dailyRentalCost;
    }

    public Long getOriginalRetailCost() {
        return originalRetailCost;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public int getCustomerCurrentlyRenting(){
        return rentalInformation.getCustomerCardId();
    }

    public String rent(RentalInformation rentalInformation){
        if (rentalInformation.getDaysForRent() > MAX_DAYS_FOR_RENTAL){
            return "Rental process was stopped because the maximum days for rental is " + MAX_DAYS_FOR_RENTAL;
        }
        this.rentalInformation = rentalInformation;
        return "Rental process for " + getTitle() + " for " + rentalInformation.getDaysForRent() + " days was successful";
    }

    public boolean isRented() {
        return rentalInformation != null;
    }

    public int getDaysForRent(){
        return rentalInformation.getDaysForRent();
    }
}
