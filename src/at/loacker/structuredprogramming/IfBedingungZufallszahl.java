package at.loacker.structuredprogramming;

import java.util.Random;

 class ifBedingungZufallszahl {
    public static void main(String[] args) {
        Random zufallszahl = new Random();

        int randomNumber = zufallszahl.nextInt()*100;


        if(randomNumber < 20){
            System.out.println("Mini");
        }
        else{
            if(randomNumber>=20 && randomNumber<=50){
                System.out.println("Medium");

            }
            else{
                if(randomNumber>50){
                    System.out.println("Large");
                }
            }

        }


    }
}
