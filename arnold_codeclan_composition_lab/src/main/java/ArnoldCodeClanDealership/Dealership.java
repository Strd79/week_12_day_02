package ArnoldCodeClanDealership;

import ArnoldCodeClanDealership.Cars.ElectricVehicle;
import ArnoldCodeClanDealership.Cars.HybridVehicle;
import ArnoldCodeClanDealership.Cars.Vehicle;
import ArnoldCodeClanDealership.customers.Customer;

import java.util.ArrayList;

public class Dealership {

    private ArrayList<Vehicle> carsInStock;
    private double till;

    public Dealership(double till) {
        this.till = till;
        this.carsInStock = new ArrayList<Vehicle>();
    }

    public double getTill() {
        return till;
    }

    public void setTill(double till) {
        this.till = till;
    }

    public ArrayList<Vehicle> getCarsInStock() {
        return carsInStock;
    }

    public void buyCar(Vehicle car) {
        this.carsInStock.add(car);
        this.till -= car.getPrice();
    }

    public void sellCar(Vehicle car, Customer customer) {
        if(customer.getWallet() > car.getPrice()) {
            customer.buyCar(car);
            this.getCarsInStock().remove(car);
            this.till += car.getPrice();
        }
    }
}
