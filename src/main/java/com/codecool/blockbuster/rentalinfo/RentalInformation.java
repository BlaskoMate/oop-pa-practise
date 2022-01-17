package com.codecool.blockbuster.rentalinfo;

import java.time.LocalDate;

public class RentalInformation {
    private String customerName;
    private int customerCardId;
    private LocalDate rentalDate;
    private int daysForRent;

    public RentalInformation(String customerName, int customerCardId, int daysForRent) {
        this.customerName = customerName;
        this.customerCardId = customerCardId;
        this.daysForRent = daysForRent;
        this.rentalDate = LocalDate.now();
    }

    public int getCustomerCardId() {
        return customerCardId;
    }

    public int getDaysForRent() {
        return daysForRent;
    }
}
