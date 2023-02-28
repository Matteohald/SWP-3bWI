package at.loacker.oo.car;

public class Engine {
    private enum FUEL {DIESEL, GAS}
    private int horsePower;
    private String engineType;
    private FUEL fuelType;

    public Engine(int horsePower, String engineType, FUEL fuelType) {
        this.horsePower = horsePower;
        this.engineType = engineType;
        this.fuelType = fuelType;
    }

    public void engineIsRunning (int amount){
        System.out.println("The engine is running with " + amount);
    }
    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public FUEL getFuelType() {
        return fuelType;
    }

    public void setFuelType(FUEL fuelType) {
        this.fuelType = fuelType;
    }
}