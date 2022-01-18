package com.codecool.f1teammanager;

import com.codecool.f1teammanager.car.Car;
import com.codecool.f1teammanager.car.CarParts;
import com.codecool.f1teammanager.employee.CrewMember;
import com.codecool.f1teammanager.employee.Employee;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;

public class Team {

    private List<Car> cars = new LinkedList<>();
    private List<Employee> employees = new LinkedList<>();
    private BigDecimal totalRevenue = new BigDecimal(0);
    private final int REMOVED_PARTS_PER_RACE = -2;

    public void addRevenueByRacePosition(int position){
        if (position == 1){
            totalRevenue = totalRevenue.add(RacePosition.FIRST.getPaymentForRace());
        } else if (position == 2){
            totalRevenue = totalRevenue.add(RacePosition.SECOND.getPaymentForRace());
        }
    }

    public void handleAfterRaceParts(){
        cars.forEach(e -> e.removeParts(REMOVED_PARTS_PER_RACE));
    }


    public void calculateDailyRevenue(boolean isRace){
        if (isRace){
            cars.forEach(e -> totalRevenue = totalRevenue.subtract(e.getDriver().getDailyRevenue()));

        } else {
            employees.stream().filter(e -> e instanceof CrewMember).forEach(e -> totalRevenue = totalRevenue.subtract(e.getDailyRevenue()));
        }
    }

    public Car getCar(int carNum){
        return cars.get(carNum + 1);
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public BigDecimal getTotalRevenue() {
        return totalRevenue;
    }

    public void handleParts(int amountToBuy){
        cars.forEach(e -> {
            if (e.getCarParts().getAmount() < 2){
                e.buyCarParts(amountToBuy);
                totalRevenue = totalRevenue.subtract(CarParts.price.multiply(BigDecimal.valueOf(amountToBuy)));
            }
        });
    }
}
