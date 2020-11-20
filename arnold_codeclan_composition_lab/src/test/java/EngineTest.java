import ArnoldCodeClanDealership.CarComponents.Engine;
import ArnoldCodeClanDealership.CarComponents.EngineType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EngineTest {

    Engine engine;

    @Before
    public void before() {
        engine = new Engine(EngineType.HYBRID);
    }

    @Test
    public void canGetEnginePower() {
        assertEquals(150, engine.getEnginePower());
    }
}
