package Practice.p03;

import java.util.Scanner;

public class Q04_NestedFor_Matrix {
    public static void main(String[] args) {
        /*
        write the code that calculates and writes the multiplication table to the screen as a two-dimensional table
         */
        /*
        1 2 3 45
        2 4 6 8 10
        3 6 9 12 15
        4 8 12 16 20
        5 10 15 20 25
         */


        Scanner input=new Scanner(System.in);
        System.out.println("please enter a integer");
        int digit=input.nextInt();
        for (int i=1; i<=digit; i++){
            for (int j=1; j<=digit;j++){
                System.out.print(i*j+" ");
            }
            System.out.println();

        }
    }
}
