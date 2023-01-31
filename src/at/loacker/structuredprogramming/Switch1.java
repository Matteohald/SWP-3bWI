package at.loacker.structuredprogramming;
import java.util.Random;

class Switch1 {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = 5 + random.nextInt(10 - 5 + 1);
        System.out.println(randomNumber);

        switch (randomNumber) {
            case 10:
                System.out.println("Ten");
                break;
            case 9:
                System.out.println("Nine");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 5:
                System.out.println("Five");
                break;

        }

    }
}
