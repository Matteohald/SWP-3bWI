package at.loacker;

class Car {
    public int fuelConsumption;
    public int fuelAmount;
    public String brand;
    public String serialNumber;
    private String color;

    public void drive(){
        this.fuelAmount = this.fuelAmount - fuelConsumption;
        System.out.println("The car's driving");
    }
    public void brake(){
        System.out.println("The car stopped");
    }
}
