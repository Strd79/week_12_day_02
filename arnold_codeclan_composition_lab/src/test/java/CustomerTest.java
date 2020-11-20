import ArnoldCodeClanDealership.CarComponents.Engine;
import ArnoldCodeClanDealership.CarComponents.EngineType;
import ArnoldCodeClanDealership.CarComponents.Tyre;
import ArnoldCodeClanDealership.Cars.HybridVehicle;
import ArnoldCodeClanDealership.Cars.PetrolVehicle;
import ArnoldCodeClanDealership.Cars.Vehicle;
import ArnoldCodeClanDealership.customers.Customer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;
    HybridVehicle car1;
    PetrolVehicle car2;
    Engine engine1;
    Engine engine2;
    Tyre tyre;

    @Before
    public void before() {
        customer = new Customer("David", 10000);
        engine1 = new Engine(EngineType.HYBRID);
        engine2 = new Engine(EngineType.PETROL);
        tyre = new Tyre("Michelin", 18);
        car1 = new HybridVehicle(9999, "Green", engine1, tyre, 5, 4);
        car2 = new PetrolVehicle(7500, "Blue", engine2, tyre, 4);
    }

    @Test
    public void canAddCarsToCustomer() {
        customer.getCarsOwned().add(car1);
        customer.getCarsOwned().add(car2);
        assertEquals(2, customer.getCarsOwned().size());
    }

    @Test
    public void canBuyCar() {
        customer.buyCar(car2);
        assertEquals(1, customer.getCarsOwned().size());
        assertEquals(2500, customer.getWallet(), 0.01);
    }
}
