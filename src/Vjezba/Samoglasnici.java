package Vjezba;

import java.util.Scanner;

public class Samoglasnici {
    public static void main(String[] args) {
        System.out.println("Upišite samoglasnik");
        String slovo = new Scanner(System.in).nextLine();
       //char br = 0;
        switch (slovo){
            case "A", "a": // može se uraditi i na ovaj način kako bi printao i veliko i malo slovo
                System.out.println("1");
                break;
            case "E":
                System.out.println("5");
                break;
            case "I":
                System.out.println("9");
                break;
            case "O":
                System.out.println("15");
                break;
            case "U":
                System.out.println("20");
                break;
            default:
                System.out.println("Ne postoji samoglasnik");


        }
    }
}
