package com.codecool.billiardsalon.order;

import java.util.HashMap;

public class CurrentOrder {

    private HashMap<String, Integer> currentOrder = new HashMap<String, Integer>();

    public void addToCurrentOrder(String name, int amount){
        currentOrder.merge(name, amount, Integer::sum);
    }

    public void removeFromCurrentOrder(String name, int amount){
        if (currentOrder.get(name) - amount < 1){
            currentOrder.remove(name);
        } else {
            currentOrder.merge(name, amount, (oldValue, newValue) -> oldValue - newValue);
        }
    }

    public void clearCurrentOrder(){
        currentOrder = new HashMap<String, Integer>();
    }
}
