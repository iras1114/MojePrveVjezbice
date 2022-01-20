package Vjezba.oop.myjavaprogram;

public class Car5 {
    String make;
    String model;
    int numberDors;
    static int wheels = 4;//statičko polje zato se se može printati na nacin ispod, za razliu od ostalih polja.

    public static void main(String[] args) {
        Car5 car = new Car5();//konstruktor (kreiran je car)
        car.make = "BMW";
        car.model = "I5";
        car.numberDors = 5;
        System.out.println(car.make);
        System.out.println(car.model);
        System.out.println(car.numberDors);
        System.out.println("broj točkova" + " je " + wheels);


        car.printDetails(); // poziv metode ispod (on mora biti u bloku koda psvm)

    }
    //Metoda koju pozivamo u liniji 20
    void printDetails(){
        System.out.println("Makra je " + make);
        System.out.println("Model je " + model);
        System.out.println("Broj vrata je " + numberDors);
        System.out.println("Broj točkova je " + wheels);

    }
}

