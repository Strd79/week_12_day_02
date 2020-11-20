package ArnoldCodeClanDealership.Cars;

import ArnoldCodeClanDealership.CarComponents.Engine;
import ArnoldCodeClanDealership.CarComponents.Tyre;

public class PetrolVehicle extends Vehicle {

    public PetrolVehicle(double price, String colour, Engine engine, Tyre tyres, int numOfDoors) {
        super(price, colour, engine, tyres, numOfDoors);
    }
}
