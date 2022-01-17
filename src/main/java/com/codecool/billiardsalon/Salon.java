package com.codecool.billiardsalon;

import com.codecool.billiardsalon.order.CurrentOrder;
import com.codecool.billiardsalon.table.Table;
import com.codecool.billiardsalon.table.TableType;

import java.time.LocalTime;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Salon {

    private List<Table> tables = new LinkedList<Table>();
    private CurrentOrder currentOrder = new CurrentOrder();

    public String addTable(TableType tableType){
        System.out.println(tableType.getTime().compareTo(LocalTime.of(23, 59, 59)));
        if (tableType.getTime().compareTo(LocalTime.of(23, 59, 59)) > 0){
            tables.add(new Table(tables.size() + 1, LocalTime.now(), tableType ));
            return "table added successfully";
        }
        return "Table unavailable at this time";
    }

    public StringBuilder ListAllTables(){
        StringBuilder string = new StringBuilder();
        tables.forEach(e -> string.append(String.format("Type: %s / hasPaid: %s / endPrice: %s / calculatedPrice: %s /\n", e.getTableType(), e.hasPaid(), e.getEndPrice(), e.calculatePriceFromStayDuration())));
        return string;
    }

    public Table getHighestUnpaidConsumptionTable(){
        return tables.stream().filter(e -> !e.hasPaid()).max(Comparator.comparingInt(Table::calculatePriceFromStayDuration)).orElse(null);
    }

}
