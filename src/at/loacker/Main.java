package at.loacker;
import at.loacker.Car;
class Main {
    public static void main(String[] args) {

        Car c1 = new Car();
        c1.setBrand("Audi");
        c1.setFuelConsumption(5);
        c1.setSerialNumber("A1234");
        c1.setFuelAmount(70);
        c1.setSuperboostConsumption(7);

        Car c2 = new Car();
        c2.setBrand("Mercedes");
        c2.setFuelConsumption(4);
        c2.setSerialNumber("B4321");
        c2.setFuelAmount(50);
        c2.setSuperboostConsumption(5);

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
