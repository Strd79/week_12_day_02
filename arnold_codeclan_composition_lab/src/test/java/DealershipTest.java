import ArnoldCodeClanDealership.CarComponents.Engine;
import ArnoldCodeClanDealership.CarComponents.EngineType;
import ArnoldCodeClanDealership.CarComponents.Tyre;
import ArnoldCodeClanDealership.Cars.ElectricVehicle;
import ArnoldCodeClanDealership.Cars.HybridVehicle;
import ArnoldCodeClanDealership.Cars.PetrolVehicle;
import ArnoldCodeClanDealership.Dealership;
import ArnoldCodeClanDealership.customers.Customer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    Customer customer1;
    Customer customer2;
    Dealership dealership;
    HybridVehicle car1;
    PetrolVehicle car2;
    ElectricVehicle car3;
    Engine engine1;
    Engine engine2;
    Engine engine3;
    Tyre tyre1;
    Tyre tyre2;


    @Before
    public void before() {
        customer1 = new Customer("Kyle", 15000);
        customer2 = new Customer("David", 9000);
        dealership = new Dealership(25000);
        engine1 = new Engine(EngineType.HYBRID);
        engine2 = new Engine(EngineType.PETROL);
        engine3 = new Engine(EngineType.ELECTRIC);
        tyre1 = new Tyre("Michelin", 18);
        tyre2 = new Tyre("Pirelli", 16);
        car1 = new HybridVehicle(9999, "Green", engine1, tyre2, 5, 4);
        car2 = new PetrolVehicle(7500, "Blue", engine2, tyre1, 4);
        car3 = new ElectricVehicle(12800, "Black", engine3, tyre2, 3, 8);
    }

    @Test
    public void canAddCarsToDealership() {
        dealership.getCarsInStock().add(car1);
        dealership.getCarsInStock().add(car2);
        dealership.getCarsInStock().add(car3);
        assertEquals(3, dealership.getCarsInStock().size());
    }

    @Test
    public void canBuyCar() {
        dealership.buyCar(car1);
        assertEquals(1, dealership.getCarsInStock().size());
        assertEquals(15001, dealership.getTill(), 0.01);
    }

    @Test
    public void canSellCarToCustomer() {
        dealership.getCarsInStock().add(car3);
        dealership.getCarsInStock().add(car1);
        dealership.sellCar(car3, customer1);
        assertEquals(1, dealership.getCarsInStock().size());
        assertEquals(37800, dealership.getTill(), 0.01);
        assertEquals(1, customer1.getCarsOwned().size());
        assertEquals(2200, customer1.getWallet(), 0.01);
    }

    @Test
    public void cannotSellCarToCustomer() {
        dealership.getCarsInStock().add(car3);
        dealership.getCarsInStock().add(car1);
        dealership.sellCar(car1, customer2);
        assertEquals(2, dealership.getCarsInStock().size());
        assertEquals(25000, dealership.getTill(), 0.01);
        assertEquals(0, customer2.getCarsOwned().size());
        assertEquals(9000, customer2.getWallet(), 0.01);
    }
}
