package com.codecool.billiardsalon.table;

import com.codecool.billiardsalon.order.Beverage;
import com.codecool.billiardsalon.order.CurrentOrder;

import java.time.LocalTime;
import java.util.List;

public class Table {

    private int id;
    private LocalTime tableStartTime;
    private TableType tableType;
    private List<Beverage> beverageList;
    private boolean hasPaid = false;
    private Integer endPrice = null;

    public int getId() {
        return id;
    }

    public LocalTime getTableStartTime() {
        return tableStartTime;
    }

    public TableType getTableType() {
        return tableType;
    }

    public List<Beverage> getBeverageList() {
        return beverageList;
    }

    public int getEndPrice() {
        return endPrice;
    }

    public boolean hasPaid() {
        return hasPaid;
    }

    public Table(int id, LocalTime tableStartTime, TableType tableType) {
        this.id = id;
        this.tableStartTime = tableStartTime;
        this.tableType = tableType;
    }

    public int calculatePriceFromStayDuration(){
        return 2;
    }

    public void StopTime(){
        endPrice = 2;
    }

    public void payForTable(){
        hasPaid = true;
    }

    public void removeFromOrder(String name, int amount){}

    public void addToOrder(String name, int amount){}

    public void payForBev(CurrentOrder currentOrder){}

    public int getPriceForBeverages(CurrentOrder currentOrder){
        return 2;
    }

    public String listAllOrders(){
        return "2";
    }
}
