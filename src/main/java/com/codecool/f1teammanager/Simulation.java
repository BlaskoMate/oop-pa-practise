package com.codecool.f1teammanager;

import com.codecool.f1teammanager.car.Car;
import com.codecool.f1teammanager.employee.CrewMember;
import com.codecool.f1teammanager.employee.CrewMemberType;
import com.codecool.f1teammanager.employee.Driver;
import com.codecool.f1teammanager.employee.Experience;

import java.util.HashMap;

public class Simulation {

    public static void main(String[] args) {
        Team codecoolTeam = setupTeam(Experience.INTERMEDIATE, Experience.MEDIUM);
        simulateYear(codecoolTeam, 365 / 7 * 5, 22, 2, 5);
        System.out.println(codecoolTeam.getTotalRevenue());
    }

    private static void simulateYear(Team codecoolTeam, int workDays, int raceDays, int first, int second){

        for (int i = 0; i < workDays - raceDays; i++){
            codecoolTeam.calculateDailyRevenue(false);
        }

        for (int j = 0; j < raceDays; j++){
            codecoolTeam.calculateDailyRevenue(true);
            codecoolTeam.handleAfterRaceParts();
            codecoolTeam.handleParts(2);
        }

        for (int k = 0; k < first; k++){
            codecoolTeam.addRevenueByRacePosition(1);
        }

        for (int k = 0; k < second; k++){
            codecoolTeam.addRevenueByRacePosition(2);
        }
    }

    private static Team setupTeam(Experience driverExperience1, Experience driverExperience2){
        Team team = new Team();

        Car car1 = new Car(4);
        Car car2 = new Car(4);

        Driver driver1 = new Driver("Driver2", 24, driverExperience1);
        Driver driver2 = new Driver("Driver3", 29, driverExperience2);

        car1.setDriver(driver1);
        car2.setDriver(driver2);

        team.addCar(car1);
        team.addCar(car2);

        team.addEmployee(driver1);
        team.addEmployee(driver2);

        team.addEmployee(new CrewMember("Pit Member1", 25, CrewMemberType.PITMEMBER));
        team.addEmployee(new CrewMember("Pit Member2", 25, CrewMemberType.PITMEMBER));
        team.addEmployee(new CrewMember("Pit Member3", 25, CrewMemberType.PITMEMBER));
        team.addEmployee(new CrewMember("Pit Member4", 25, CrewMemberType.PITMEMBER));

        team.addEmployee(new CrewMember("Engineer1", 25, CrewMemberType.ENGINEER));
        team.addEmployee(new CrewMember("Engineer2", 25, CrewMemberType.ENGINEER));
        return team;
    }
}
