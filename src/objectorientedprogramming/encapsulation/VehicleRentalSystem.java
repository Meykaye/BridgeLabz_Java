package objectorientedprogramming.encapsulation;
/*
 * Vehicle Rental System
 *
 * Features:
 * - Abstract Vehicle class
 * - Interface Insurable
 * - Subclasses Car, Bike, Truck
 * - Encapsulation
 * - Polymorphism demonstrated via Vehicle list
 */

import java.util.ArrayList;
import java.util.List;

interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    public String getVehicleNumber() { return vehicleNumber; }
    public String getType() { return type; }
    public double getRentalRate() { return rentalRate; }

    public void displayVehicle() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Type: " + type);
        System.out.println("Rental Rate per Day: " + rentalRate);
    }

    public abstract double calculateRentalCost(int days);
}

class Car extends Vehicle implements Insurable {
    private double insuranceRate;

    public Car(String vehicleNumber, double rentalRate, double insuranceRate) {
        super(vehicleNumber, "Car", rentalRate);
        this.insuranceRate = insuranceRate;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return insuranceRate;
    }

    @Override
    public String getInsuranceDetails() {
        return "Car Insurance: " + insuranceRate;
    }
}

class Bike extends Vehicle {
    public Bike(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Bike", rentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }
}

class Truck extends Vehicle implements Insurable {
    private double insuranceRate;

    public Truck(String vehicleNumber, double rentalRate, double insuranceRate) {
        super(vehicleNumber, "Truck", rentalRate);
        this.insuranceRate = insuranceRate;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return insuranceRate;
    }

    @Override
    public String getInsuranceDetails() {
        return "Truck Insurance: " + insuranceRate;
    }
}

public class VehicleRentalSystem {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();

        Car car = new Car("CAR123", 2000, 5000);
        Bike bike = new Bike("BIKE456", 500);
        Truck truck = new Truck("TRK789", 5000, 10000);

        vehicles.add(car);
        vehicles.add(bike);
        vehicles.add(truck);

        for (Vehicle v : vehicles) {
            v.displayVehicle();
            System.out.println("Rental Cost for 5 days: " + v.calculateRentalCost(5));
            if (v instanceof Insurable) System.out.println(((Insurable)v).getInsuranceDetails());
            System.out.println("---------------------------------");
        }
    }
}
