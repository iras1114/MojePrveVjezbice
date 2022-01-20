package Vjezba;


import java.util.Scanner;

public class OcjeneUcenika {
    public static void main(String[] args) {
       // Scanner input = new Scanner(System.in);  // Može na ovaj nacin da prvo pozovem skener,a u nastavku definišem: int ocjena = nextInt()
        System.out.println("Unesite ocjenu");
        int ocjena = new Scanner(System.in).nextInt(); // A može i na ovaj nacin u jednoj liniji da nefinišem i skeniram input.
        switch (ocjena){
            case 1:
                System.out.println("Nedovoljan");
                break;
            case 2:
                System.out.println("Dovoljan");
                break;
            case 3:
                System.out.println("Dobar");
                break;
            case 4:
                System.out.println("Vrlodobar");
                break;
            case 5:
                System.out.println("Odličan");
                break;
            default:
                System.out.println("Ocjena nije validna");
                break;  //Može i bez ovoga break;
        }
    }
}
