package at.loacker.oo.car;

import java.util.Scanner;

public class Car {
    private int fuelConsumption;
    private Engine engine;
    private int fuelAmount;
    private int superboostConsumption;
    private String brand;
    private String serialNumber;

    private String color;

    public Car(int fuelConsumption, String brand, String serialNumber){
        this.fuelConsumption = fuelConsumption;
        this.brand = brand;
        this.serialNumber = serialNumber;
        this.engine = engine;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFuelAmount(int fuelAmount) {
        this.fuelAmount = fuelAmount;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setSuperboostConsumption(int superboostConsumption) {
        this.superboostConsumption = superboostConsumption;
    }

    public void drive() {
        this.fuelAmount = this.fuelAmount - fuelConsumption;
        System.out.println("Ich fahre");
    }

    public void brake() {
        System.out.println("Ich bremse aus");
    }

    public void turboBoost() {
        if (this.fuelAmount >= fuelAmount * 0.1) {
            this.fuelAmount = this.fuelAmount - superboostConsumption;
            System.out.println("SuperBoostMode");
        } else {
            System.out.println("Not enough fuel for SuperBoostMode");
        }
    }

    public void honk() {
        System.out.println("How often should be honked?");
        Scanner scanner = new Scanner(System.in);
        int honkAmount = scanner.nextInt();

        for (int amountOfRepetitions = 0; amountOfRepetitions < honkAmount; amountOfRepetitions++) {
            System.out.println("Tuuut");
        }
    }

    public void getRemainingRange() {
        int range = this.fuelAmount / this.fuelConsumption;
        System.out.println("You can still drive " + range + " times before you have to refuel");
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public int getFuelAmount() {
        return fuelAmount;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public int getSuperboostConsumption() {
        return superboostConsumption;
    }

    public String getColor() {
        return color;
    }

    public String getBrand() {
        return brand;
    }
}
