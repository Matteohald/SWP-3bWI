package at.loacker;

import java.util.Scanner;
class Ceasar {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ihr Lieblingswort: ");
        String word = scanner.nextLine();
        System.out.println("Wie stark soll ihr Wort von 1-10 verschoben werden? ");
        int encrypt = scanner.nextInt();
    }
}
