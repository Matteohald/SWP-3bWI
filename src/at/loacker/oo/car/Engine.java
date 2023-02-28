package at.loacker.oo.car;

public class Engine {
    private enum FUEL {DIESEL, GASOLINE}
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