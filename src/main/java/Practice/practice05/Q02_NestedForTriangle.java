package Practice.practice05;

import java.util.Scanner;

public class Q02_NestedForTriangle {
    /*
    write a code that prints the following figure according to the number of lines you receive from the user
                *
               * *
              * * *
             * * * *
            * * * * *
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("please enter line number");
        int line = input.nextInt();

        for (int i=0; i<line; i++){
            for (int space=line-i; space>1; space--){
                System.out.print(" ");
            }

            for (int star=0; star<=i; star++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
