package ArnoldCodeClanDealership.Cars;

import ArnoldCodeClanDealership.CarComponents.Engine;
import ArnoldCodeClanDealership.CarComponents.Tyre;

public abstract class Vehicle {

    private double price;
    private String colour;
    private Engine engine;
    private Tyre tyres;
    private int numOfDoors;

    public Vehicle(double price, String colour, Engine engine, Tyre tyres, int numOfDoors) {
        this.price = price;
        this.colour = colour;
        this.engine = engine;
        this.tyres = tyres;
        this.numOfDoors = numOfDoors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColour() {
        return colour;
    }

    public Engine getEngine() {
        return engine;
    }

    public Tyre getTyres() {
        return tyres;
    }
}
