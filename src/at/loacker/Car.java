package at.loacker;

import java.util.Scanner;

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

    public void honk(){
        System.out.println("How often should be honked?");
        Scanner scanner = new Scanner(System.in);
        int honkAmount = scanner.nextInt();

        for(int amountOfRepetitions = 0; amountOfRepetitions < honkAmount; amountOfRepetitions++){
            System.out.println("Tuuut");
        }
    }

    public void getRemainingRange(){
        int range = this.fuelAmount / this.fuelConsumption;
        System.out.println("You can still drive " + range + " times before you have to refuel");
    }
}
