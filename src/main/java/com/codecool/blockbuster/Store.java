package com.codecool.blockbuster;

import com.codecool.blockbuster.product.Product;
import com.codecool.blockbuster.rentalinfo.RentalInformation;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Store {
    private int monthlyRevenue =  0;
    private List<Product> products = new LinkedList<>();

    public void rentProduct(String customerName, int customerId, int days, String productTitle){

    }

    public String getProductPrice(String productTitle){
        Product product = products.stream().filter(e -> e.getTitle().equals(productTitle)).findFirst().orElse(null);
        if (product != null){
            if (!product.isFavorite()){
                return productTitle + " is not available for sell";
            }
            return productTitle + " costs: " + product.getOriginalRetailCost() + "Ft.";
        }
        return "No products found";
    }

    public void sellProduct(String productTitle){
        products.removeIf(e -> e.getTitle().equals(productTitle) && e.isFavorite());
    }

    public String isProductAlreadyRented(String productTitle){
        return "";
    }

    public String rentProduct(String productTitle, String customerName, int customerCardId, int daysForRent){
        if (products.stream().anyMatch(e -> e.getCustomerCurrentlyRenting() == customerCardId)){
            return "already renting" + Objects.requireNonNull(products.stream().filter(e -> e.getCustomerCurrentlyRenting() == (customerCardId)).findFirst().orElse(null)).getTitle();
        }
        Product product = products.stream().filter(e -> e.getTitle().equals(productTitle)).findFirst().orElse(null);
        if (product != null){
            if (product.isRented()){
                return productTitle + " is already rented";
            }
            return product.rent(new RentalInformation(customerName, customerCardId, daysForRent));
        }
        return productTitle + " not found";
    }

    public String payForRental(int customerCardId){
        Product product = products.stream().filter(e -> e.getCustomerCurrentlyRenting() == customerCardId).findFirst().orElse(null);
        if (product == null){
            return "no product rented using this cardId";
        }
        return String.format("For %s for %s days it costs %s", product.getTitle(), product.getDaysForRent(), product.getDailyRentalCost() * product.getDailyRentalCost());
    }
}
