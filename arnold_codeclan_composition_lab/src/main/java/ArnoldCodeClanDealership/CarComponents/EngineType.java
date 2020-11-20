package ArnoldCodeClanDealership.CarComponents;

public enum EngineType {

    ELECTRIC(100),
    PETROL(200),
    HYBRID(150);

    public final int power;

    EngineType(int power) {
        this.power = power;
    }

    public int getPower() {
        return power;
    }
}
