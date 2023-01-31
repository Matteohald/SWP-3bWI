package at.loacker.structuredprogramming;
import java.util.Random;

class ArraysAufgabe2 {
    public static void main(String[] args) {

        int total = 0;
        int[] array = new int[50];
        int max = 100;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random()*max);
            total = total + array[i];
            System.out.println(array[i]);
        }
        System.out.println("Summe: " + total);
    }
}
