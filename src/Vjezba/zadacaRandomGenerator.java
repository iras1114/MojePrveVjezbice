package Vjezba;

import java.util.Random;
import java.util.Scanner;


public class zadacaRandomGenerator {
    public static void main(String[] args) {
        Random numberGenerator = new Random();
        int[] numbers = new int[3];
        for (int i = 0; i < numbers.length; i++) {
            int slucajanBroj = numberGenerator.nextInt(100);
            numbers[i] = slucajanBroj;
        }
        System.out.println("Upišite broj od 0 do 99");
        int uneseniBroj = new Scanner(System.in).nextInt();
        boolean foundIt = false;
        for (int number : numbers){
            if (uneseniBroj == number){
                foundIt = true;
                break;
            }
        }
        String message = foundIt ? "Cestitamo": "Probajte unijeti drugi broj";
        System.out.println(message);


            // System.out.println("Upišite broj od 1 do 99");
            //int UpišiBroj = new Scanner(System.in).nextInt();


            //for (int i = 55; i < randomGenerator.nextInt(); i++){
            // System.out.println("Unesi jedan broj");
            // int UnesiBroj = new Scanner(System.in).nextInt();


    }
}


