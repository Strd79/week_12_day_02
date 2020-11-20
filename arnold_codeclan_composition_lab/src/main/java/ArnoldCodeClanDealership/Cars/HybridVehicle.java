package ArnoldCodeClanDealership.Cars;

import ArnoldCodeClanDealership.CarComponents.Engine;
import ArnoldCodeClanDealership.CarComponents.Tyre;

public class HybridVehicle extends Vehicle {

    private int numOfBatteryPacks;

    public HybridVehicle(double price, String colour, Engine engine, Tyre tyres, int numOfDoors, int numOfBatteryPacks) {
        super(price, colour, engine, tyres, numOfDoors);
        this.numOfBatteryPacks = numOfBatteryPacks;
    }

    public int getNumOfBatteryPacks() {
        return numOfBatteryPacks;
    }
}
