package Day10Loops;

import day04nestedIfswitch.Switch01;

import java.util.Scanner;

public class Nestedforloop01 {
    public static void main(String[] args) {
        /*
        example 1: type code to get the output like
            Week:1
                day :1
                day :2
            week:2
                day:1
                day:2

        for (int i=1; i<4;i++){
            System.out.println("Week:"+i);
            for(int j=1; j<8;j++) {
            System.out.println("     Day:" + j);
        }
       }

        /*
        example 2: write a java program to print rectangle star pattern using for loop
                note: get the number of rows and columns from user

        for (int a=0; a<3;a++){
                for (int c=0;c<3; c++){
                    System.out.print("*");
                }System.out.println();


        }
        /*
        type code to get  the output like
        1
        12
        123
        1234
        12345
         */
        Scanner input=new Scanner(System.in);


        System.out.println("enter row");
        int r=input.nextInt();
          for (int i=1; i<=r; i++){
              for (int j=1; j<=i; j++){
                  System.out.print(j);
              }
              System.out.println();
          }
    }

}
