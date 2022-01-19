package com.codecool.concertorganiser.concert;

public class TicketInformation {

    private final Long MAXIMUM_PRICE;
    private final Long MINIMUM_PRICE;
    private Long totalIncome = 0L;
    private int ticketsSold = 0;

    public TicketInformation(Long MINIMUM_PRICE, Long MAXIMUM_PRICE) {
        this.MAXIMUM_PRICE = MAXIMUM_PRICE;
        this.MINIMUM_PRICE = MINIMUM_PRICE;
    }

    public Long getTotalIncome() {
        return totalIncome;
    }

    public String buyTickets(Long price, int amountToSell, int capacity){
        if (isCapacityFull(capacity, amountToSell)){
            if (isValidPrice(price)){
                ticketsSold += amountToSell;
                totalIncome += amountToSell * price;
                return "yep";
            }
        }
        return "nope";
    }

    private boolean isValidPrice(Long price){
        return price >= MINIMUM_PRICE && price <= MAXIMUM_PRICE;
    }

    private boolean isCapacityFull(int capacity, int amountToSell){
        return capacity > ticketsSold + amountToSell;
    }
}
