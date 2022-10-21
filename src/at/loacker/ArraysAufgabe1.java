package at.loacker;

class ArraysAufgabe1 {
    public static void main(String[] args) {
        int[] array = {20, 5, 3, 2, 27, 1, 3, 4, 3, 1};
        int total = 0;
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " - ");
            total = total + array[i];

        }
        System.out.println("Summe: " + total);
    }
}
