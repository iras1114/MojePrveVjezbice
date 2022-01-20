package Vjezba;

import java.util.Random;
import java.util.Scanner;

public class ZadatakRgDvaNiza2 {
    public static void main(String[] args) {
        Random numberGenerator = new Random();
        int numbers[][] = new int[2][2];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                int slucajniBroj = numberGenerator.nextInt(100);
                numbers[i][j] = slucajniBroj;
            }
        }
        System.out.println("unesite jedan broj od 0 do 99");
        int uneseniBroj = new Scanner(System.in).nextInt();
        boolean foundIt = false;
        for (int i = 0; i < numbers.length; i++) {
            int[] element = numbers[i];
            for (int j = 0; j < numbers.length; j++) {
                int number = numbers[i][j];
                if (uneseniBroj == number) {
                    foundIt = true;
                    break;
                }

            }

        }
        String poruka = foundIt ? "Čestitamo" : "Pokušajte ponovo";
        System.out.println(poruka);

    }
}