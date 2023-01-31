package at.loacker.structuredprogramming;

import java.util.Random;

class WhileLoop1 {
    public static void main(String[] args) {
        boolean finished = false;
        int result = 0;

        while (!finished){
            Random random = new Random();
            int randomNumber1 = 10 + random.nextInt(30 - 10 + 1);
            int randomNumber2 = 10 + random.nextInt(30 - 10 + 1);

            var summ = randomNumber1 + randomNumber2;
                System.out.println(randomNumber1 + " & " + randomNumber2);
                result += summ;

            if (randomNumber1 == 15 || randomNumber2 == 15 ){
                finished = true;
                System.out.println("15");
            }
            else if (randomNumber1 == 25 || randomNumber2 == 25){
                finished = true;
                System.out.println("25");
            }

        }
        System.out.println("Summe: " + result);
    }
}
