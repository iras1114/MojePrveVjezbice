package Vjezba;

public class Vjezba2Slajd3 {
    public static void main(String[] args) {
        int x = 523134;
        int y = 325423;
        // u postavci sa brojevima ispod rezultat bude tačan
 //       int x = 23;
 //       int y = 7;
        int razlika = x / y;
        System.out.println("Rezultat dijeljenja je " + razlika);
        int ostatak = x % y;
        System.out.println("Ostatak je " + ostatak);
        if (ostatak> 1000){
            System.out.println("Ostatak je veci od 1000");
        }else {
            System.out.println("Ostatak je manji od 1000");
        }
        // Ovo nije dobar pokušaj
     //   if (razlika % 2 == 0) {
     //       System.out.println("Nema ostatka od dijeljenja");
     //   } else if (razlika % 2 != 0) {
     //       System.out.println("Ostatak od dijeljenja je " + razlika);
     //   } else if (razlika > 1000) {
     //       System.out.println("Ostatak je veća od 1000");

        }
    }

