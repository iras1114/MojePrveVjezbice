package Vjezba;

import java.util.Scanner;

public class Break {
    public static void main(String[] args) {
        int[] brojevi = {5, 6, 7};
        System.out.println("Unesi jedan broj");
        int unesenibroj = new Scanner(System.in).nextInt();
        boolean pronadjeni = false;
        for (int i = 0; i<brojevi.length; i ++){
            int broj = brojevi[i];
            if (unesenibroj == broj ){
                pronadjeni = true;
                break;
            }
        }
        String poruka = pronadjeni ? "Cestitam" : "Nije pronadjen probajte ponovo";
        System.out.println(poruka);
    }
}
