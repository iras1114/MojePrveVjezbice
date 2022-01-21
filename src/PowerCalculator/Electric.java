package PowerCalculator;

import java.util.Scanner;

public class Electric {
    public static void main(String[] args) {

//      MWh velika tarifa
        System.out.println("Unesite prethodno stanje VT");
        int VT = new Scanner(System.in).nextInt();
        System.out.println("Unesite novo stanje VT");
        int VT1 = new Scanner(System.in).nextInt();
        int kWhV = VT1 - VT;
 //       System.out.println("Broj potrošenih kWh velike tarife je:" + " " + kWhV);  Može bez ovoga...

//      Cijena velika tarifa
        double cijenaVT = 0.0829;
        double iznosVT = cijenaVT * kWhV;
        System.out.println("Za uplatu VT" + " " + iznosVT +" " + "KM");

//      MWh mala tarifa
        System.out.println();
        System.out.println("Unesite prethodno stanje MT");
        int MT = new Scanner(System.in).nextInt();
        System.out.println("Unesite novo stanje MT");
        int MT1 = new Scanner(System.in).nextInt();
        int kWhM = MT1 - MT;
//        System.out.println("Broj potrošenih kilovata MT je: " + " " + kWhM); ... i ovoga

//      Cijena mala tarifa
        double cijenaMT = 0.0415;
        double iznosMT = cijenaMT * kWhM;
        System.out.println("Za uplatu MT " + " " + iznosMT);
        double iznosU = iznosMT + iznosVT;

//      Naknada za obnovljive izvore
        double obnovljivi = (kWhM + kWhV) * 0.0042;

//      Mrežarina
        double mrezarinaM = kWhV * 0.0853;
        double mrezarinaV = kWhM * 0.0426;
        double mrezarinaU = mrezarinaM + mrezarinaV;

//      Mjerno mjesto
        double mjernoMjesto = 3.0500;

//      Ukupno
        double ukupno = iznosU + obnovljivi + mrezarinaU + mjernoMjesto;
        double pdv = ukupno * 1.17;
        System.out.println("Ukupno za uplatu"+ " " + pdv + " "+ "KM");
    }
}


