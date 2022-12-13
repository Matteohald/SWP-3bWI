package at.loacker;
import at.loacker.Car;
class Main {
    public static void main(String[] args) {

        Car c1 = new Car();
        c1.brand = "Audi";
        c1.fuelConsumption = 5;
        c1.serialNumber = "A1234";
        c1.fuelAmount = 70;
        c1.superboostConsumption = 7;

        Car c2 = new Car();
        c2.brand = "Mercedes";
        c2.fuelConsumption = 4;
        c2.serialNumber = "B4321";
        c2.fuelAmount = 50;
        c2.superboostConsumption = 5;

        System.out.println(c2.fuelAmount);
        c2.drive();
        System.out.println(c2.fuelAmount);

        System.out.println(c1.fuelAmount);
        c1.drive();
        c1.brake();
        System.out.println(c1.fuelAmount);
        c1.turboBoost();
        System.out.println(c1.fuelAmount);
        c1.honk();
        c1.getRemainingRange();

    }
}
