package Day10Loops;

import java.util.Scanner;

public class whileLoop01 {
    public static void main(String[] args) {
        /*
        example 1: type code to print integers from 3 to 6
         */
        //1.Way
       /* for (int i=3; i<7; i++){
            System.out.println(i);
        }
        //2.Way
        int i=3;
        while (i<7){
            System.out.println(i+" ");
            i++;
        }*/
        // example 2: type code to print add integers from 12 to 67 in the same line with a space between them
       /* int j=12;
        while (j<67){
            System.out.print(j+" ");
            j++;
        }*/
        //type code to find the sum of integers from 12 to 67
       /* int k=12;
        int sum=0;
        while (k<68){
            k++;
            sum=sum+k;
        }
        System.out.print(sum);*/


        /*
        example 4: type code by using while loop
                    i) write a program that prompts the user to input an integer
                    ii) ıt should then find the sum of digits of that number
                    for example 123==> 1+2+3
         */
        Scanner input=new Scanner(System.in);
        //System.out.println("please enter a digit ");
        /*int num1=input.nextInt();
        int sumOfDigits=0;
        while (num1>0){

            sumOfDigits=sumOfDigits + num1%10;
            num1=num1/10;
        }
        System.out.println(sumOfDigits);

        /*
        example 5: type java code by using while loop
        write a program that prompts to user to a input a number
        ıt sholud be mult. table of thatnumber
        3x1= 3 3x2=6.....
         */
        System.out.println("please enter a number");
        int num2=input.nextInt();
        int mult1=1;

        while (mult1<10){
            System.out.println(num2+"x"+mult1+"="+num2*mult1);
            mult1++;
        }
    }
}
