package Vjezba;


import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        char operator;
        double number1, number2, result;
        Scanner input = new Scanner(System.in);
        System.out.println("Odaberi operatot + ili -");
        operator = input.next().charAt(0);
        System.out.println("Unesi jedan broj");
        number1 = input.nextDouble();
        System.out.println("Unesi drugi broj");
        number2 = input.nextDouble();

        switch (operator) {
            case '+':
        }
    }
}
