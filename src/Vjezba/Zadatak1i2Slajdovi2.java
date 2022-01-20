package Vjezba;

import javax.swing.*;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Zadatak1i2Slajdovi2<regular> {
    public static void main(String[] args) {
        System.out.println("Unesi jedan broj");
        int number = new Scanner(System.in).nextInt();
        int broj = 1;
     //   int broj1 = 2;
        boolean paran = number != broj;
        switch (number) {
            case 1:
                if (paran) {
                    System.out.println("Entered variable is" + number);
                } else {
                    System.out.println("Varible is false");


                        //      int regular = 1;
                        //      int admin = 2;
                        //      int superadmin = 4;
                        //       2System.out.println("Unesi broj nivoa korisnika");
                        //      int unos = new Scanner(System.in).nextInt();
                        //      // boolean uslov = false;
                        //      if (unos == 1) {
                        //          System.out.print("User level is" + " " + unos + " " + "Regular user level: true;" + " " + "Admin user level: false;" + " " + "Superadmin user level: false");
                        //      } else if (unos == 2) {
                        //          System.out.print("User level is" + " " + unos + " " + "Regular user level: false;" + " " + "Admin user level: true;" + " " + "Superadmin user level: false");
                        //      } else if (unos == 4) {
                        //          System.out.print("User level is" + " " + unos + " " + "Regular user level: false;" + " " + "Admin user level: false;" + " " + "Superadmin user level: true");
                        //      }
                        // ZADATAK 1 SA PREDAVNJA 2: Došao sam do željenog ispisa koristeci if else if strukturu


                        //      boolean broj = false;
                        //     while (!broj){
                        //      System.out.println("Unesite broj korisnika da provjerite nivo pristupa");
                        //       int uneseniBroj = new Scanner(System.in).nextInt();
                        //     if ((uneseniBroj==1)||(uneseniBroj==2)||(uneseniBroj==4)){
                        //         broj=true;
                        //      }
                        //     String message = broj? "User level is " + uneseniBroj : "User level false";
                        //           System.out.println(message);;
                        // ZADATAK 1 SA PREDAVANJA BR.2: ovaj zadatak je isto uspio ali je drugi ispis kao i druga struktura postavke a to je WHILE IF
                }
        }
    }
}







