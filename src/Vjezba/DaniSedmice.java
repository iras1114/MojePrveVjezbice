package Vjezba;

import java.util.Scanner;

public class DaniSedmice {
    public static void main(String[] args) {
        System.out.println("Unesite broj dana u sedmici");
        int dani = new Scanner(System.in).nextInt();
        switch (dani) {
            case 1:
                System.out.println("Montag");
                break;
            case 2:
                System.out.println("Dienstag");
                break;
            case 3:
                System.out.println("Mittvoch");
                break;
            case 4:
                System.out.println("Donerstag");
                break;
            case 5:
                System.out.println("Freitag");
                break;
            case 6:
                System.out.println("Samstag");
                break;
            case 7:
                System.out.println("Sontag");
                break;
            default:
                System.out.println("No tag");
                break;
        }
    }
}
