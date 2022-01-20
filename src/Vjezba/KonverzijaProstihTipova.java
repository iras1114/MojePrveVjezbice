package Vjezba;

public class KonverzijaProstihTipova {
    public static void main(String[] args) {
        double x = 6.3;
        int y = (int) x;
        System.out.println(y);

        // samo vježba sa slajdova nema veze sa prethodnim primjerom
        int years = 42;
        double loan = 1587.90;
        System.out.print("Godine zaposlenika"+ " " + years + " "+"Plata zaposlenika" + " " + loan);

        int a = 2, b = 3, c = 4;
        int result = a * b + c - a; //ne izbacuje nikakvu vrijednost u konzoli vjerovatno zbog nepravilne postavke zadatka
        System.out.println(result);
        result = a * (b + c -a); // normalno izbacije vrijednost 10
        System.out.println(result);
    }
}
