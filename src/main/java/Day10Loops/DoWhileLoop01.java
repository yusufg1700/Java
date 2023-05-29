package Day10Loops;

import java.util.Scanner;

public class DoWhileLoop01 {
    public static void main(String[] args) {

        int i=1;
        while (i<1){
            System.out.println("while loop");
        i++;
        }
        //do-while
        int k=1;
        do {
            System.out.println("do while loop");
            k++;
        }while (k<1);

        /*
        example: ask a user to enter on integer.
        ıf the integer is less than 100, tell user "wan"
        otherwise tell user "lost"
         */
        Scanner input=new Scanner(System.in);
        int a;
        do {
            System.out.println("Please enter a number :");
            a=input.nextInt();
            if (a<100){
            System.out.println("won");
            }

        }while(a<100);

        System.out.println("lost");
    }
}

