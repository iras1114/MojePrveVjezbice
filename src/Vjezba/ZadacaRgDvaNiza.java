package Vjezba;

import java.util.Random;
import java.util.Scanner;

public class ZadacaRgDvaNiza {
    public static void main(String[] args) {
        Random numberGenerator = new Random();
        int[][] numbers = new int[3][3];
        for (int i = 0; i<numbers.length; i++){
            for (int j = 0; j< numbers.length; j++){
            int slucajanBroj = numberGenerator.nextInt(100);
            numbers[i][j] = slucajanBroj;
            //System.out.print(slucajanBroj+ " ");
           }
       }
        System.out.println("Unesi broj od 1 do 99 i okušaj sreću");
        int uneseniBroj = new Scanner(System.in).nextInt();
        boolean nadjeni = false;
        for (int i = 0; i < numbers.length; i++) {
            int[] element = numbers[i];
            for (int j = 0; j < element.length; j++) {
               int broj = numbers[i][j];
       // for (int number : numbers){ //Sa ovim nisam uspio!
          if (uneseniBroj == broj){
            nadjeni = true;
            break;
          }


    }

}
        String poruka = nadjeni ? "Cestitamo" : "Nije dobitni, probajte ponovo";
        System.out.println(poruka);
}
}

