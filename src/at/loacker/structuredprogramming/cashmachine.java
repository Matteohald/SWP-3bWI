package at.loacker.structuredprogramming;
import java.util.Scanner;

class cashmachine {
    public static void main(String[] args) {
        int total = 0;
        boolean Finished = false;
        while (!Finished) {
            System.out.println("1. Einzahlen");
            System.out.println("2. Abheben");
            System.out.println("3. Kontostand");
            System.out.println("4. Beenden");
            Scanner scanner = new Scanner(System.in);
            int pressed = scanner.nextInt();
            if (pressed == 1) {
                Scanner scanner1 = new Scanner(System.in);
                System.out.println("Wie viel wollen sie einzahlen?");
                double deposit = scanner1.nextDouble();
                double plus = deposit;
                System.out.println("Es wurden " + deposit + "€ eingezahlt");
                total += plus;
            } else if (pressed == 2) {
                Scanner scanner2 = new Scanner(System.in);
                System.out.println("Wie viel wollen sie abheben?");
                double abheben = scanner2.nextInt();
                var minus = abheben;
                System.out.println("Es wurden " + abheben + "€ abgehoben");
                total -= minus;
            }else if (pressed == 3) {
                System.out.println("Ihr Kontostand: " + total + "€");
            }else if (pressed == 4) {
                Finished = true;
                System.out.println("Auf Wiedersehen");
            }
        }
    }
}
