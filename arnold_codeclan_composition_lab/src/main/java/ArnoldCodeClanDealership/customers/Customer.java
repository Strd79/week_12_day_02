package ArnoldCodeClanDealership.customers;

import ArnoldCodeClanDealership.Cars.PetrolVehicle;
import ArnoldCodeClanDealership.Cars.Vehicle;

import java.util.ArrayList;

public class Customer {

    private String name;
    private double wallet;
    private ArrayList<Vehicle> carsOwned;

    public Customer(String name, double wallet) {
        this.name = name;
        this.wallet = wallet;
        this.carsOwned = new ArrayList<Vehicle>();
    }

    public String getName() {
        return name;
    }

    public double getWallet() {
        return wallet;
    }

    public void setWallet(double wallet) {
        this.wallet = wallet;
    }

    public ArrayList<Vehicle> getCarsOwned() {
        return carsOwned;
    }

    public void buyCar(Vehicle car) {
        this.getCarsOwned().add(car);
        this.wallet -= car.getPrice();
    }
}
