package Vjezba;

public class MultiplicationTable {
    public static void main(String[] args) {
        //int lenhght = 25;
        for (int i = 0; i < 25; i++) {
            System.out.print("*");
        }
        System.out.println();
        System.out.println("#\t\t1\t\t2\t\t3");
        for (int i = 0; i < 25; i++) {
            System.out.print("*");
        }
        System.out.println();
        int[] coulum = {1, 2, 3};
        int[] row = {1,2,3,4,5,6,7,8,9,10};
        for ( int i = 0; i< row.length; i++){
            int rowLine = row[i];
            System.out.print(rowLine + "\t\t");
            for (int j = 0; j< coulum.length; j++){
                int coulumLine = coulum[j];
                int product = rowLine*coulumLine;
                System.out.print(product + "\t\t");

            }
            System.out.println();
        }

    }
}
