package at.loacker.structuredprogramming;

import java.util.Random;

class Dicegame {
    public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt(6) + 1;
        int b = random.nextInt(6) + 1;

        if (a == b) {
            System.out.println("Unentschieden, ihr habt beide eine " + a + " gewürfelt!");
        } else {
            if (a < b) {
                System.out.println("Dein Gegner würfelte eine " + b + ", du nur eine " + a + "! Schwache Leistung!");
            } else {
                if (a > b) {
                    System.out.println("Dein Gegner hat eine " + b + " gewürfelt, du hattest eine " + a + ", wenn meine Berechnungen stimmen hast du gewonnen!");
                }
            }
        }

    }
}
