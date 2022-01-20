package Vjezba;

public class TablicaMnozenja {
    public static void main(String[] args) {
        int lenght = 25;
        for (int i = 0; i < 25; i++) {
            System.out.print("*");
        }
        System.out.println();
        System.out.println("#\t\t1\t\t2\t\t3");
        //int lengh = 25;
        for (int i = 0; i < lenght; i++) {
            System.out.print("*");
        }
        System.out.println();
            int[] colum = {1, 2, 3};
            int[] row = {1,2,3,4,5,6,7,8,9,10};
            for (int i = 0; i<row.length; i++){
                int rowNmbers = row [i];
                System.out.print(rowNmbers + "\t\t");
                for (int j=0; j<colum.length; j++){
                 int columNmbers = colum[j];
                 int result = rowNmbers*columNmbers;
                    System.out.print(result+ "\t\t");
                }
                System.out.println();
            }

        }
        //int[][] table = new int[3][10];
        //for (int i = 0; i < table.length; i++) {
        //}
        //for (int j = 0; j < table.length; j ++){

        //}
    }



