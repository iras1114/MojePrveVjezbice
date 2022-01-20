package Vjezba.ForPetljaZnanje;

public class org {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.print(i);
        }
        System.out.println();// pomocu ovoga ispisujem brojeve jedne ispod drugih, da mi ne bi pisalo sve u jednoj liniji!!!
        for (int i = 1; i <= 17; i++) {
            System.out.print(i + ",");
        }
        System.out.println();
        for (int i = 3; i <= 8; i++) {
            System.out.print(i);
        }
        System.out.println();
        for (int i = 8; i >= 3; i--) {
            System.out.print(i);
        }
        System.out.println();
        for (int i = 20; i >= 5; i--) {
            System.out.print(i + " ");
        }
        // Kvadrat prirodnih brojeva od 1 do 5
        System.out.println();
        for (int i = 1; i <= 5; i++) {
            System.out.print(i * i + " ");
        }
        //Parni prirodni brojevi od 1 do 5 i 1 do 17
        System.out.println();
        for (int i = 1; i <= 5; i++) {
            if (i % 2 == 0)
                System.out.print(i + ",");
        }
        //       System.out.println();
        //       for (int i = 1; i <= 17; i++) {
        //          if (i % 2 == 0) {
        //              System.out.print(i + ",");
        //          }
        //Neparni prirodni brojevi od 1 do 5 i 1 do 17
        // System.out.println();
        //    for (int i = 1; i <= 5; i++) {
        //        if (i % 2 != 0) {
        //            System.out.print(i);
        //        }
        System.out.println();
        for (int i = 1; i <= 17; i++) {
            if (i % 2 != 0) {
                System.out.print(i + ",");
            }
        }

    }
}


