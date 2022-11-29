package at.loacker;

class Car {
    public int fuelConsumption;
    public int fuelAmount;
    public int superboostConsumption;
    public String brand;
    public String serialNumber;
    private String color;

    public void drive(){
        this.fuelAmount = this.fuelAmount - fuelConsumption;
        System.out.println("Ich fahre");
    }
    public void brake(){
        System.out.println("Ich bremse aus");
    }
    public void turboBoost(){
        if (this.fuelAmount >= fuelAmount * 0.1){
            this.fuelAmount = this.fuelAmount - superboostConsumption;
            System.out.println("SuperBoostMode");
        }else{
            System.out.println("Not enough fuel for SuperBoostMode");
        }
    }
}
