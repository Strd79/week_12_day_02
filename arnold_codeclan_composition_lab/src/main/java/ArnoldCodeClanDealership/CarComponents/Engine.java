package ArnoldCodeClanDealership.CarComponents;

public class Engine {

    private EngineType engineType;

    public Engine(EngineType engineType) {
        this.engineType = engineType;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public int getEnginePower() {
        return engineType.getPower();
    }
}
