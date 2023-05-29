package selfstudy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class selfstudyfor {
    public static void main(String[] args) {




        /*int i=0;
        do {
            if (i%2==0){
                System.out.print(i + " ");
            }
            i++;
        }while (i<20);*/
        /*
        Write a program to calculate the sum of first 10 natural number.


        int sum=0;
        for (int i=0;i<11; i++){
            sum=sum+i;
        }
        System.out.println(sum);*/


        /*
        Write a program that prompts the user to input a positive integer.
        It should then print the multiplication table of that number.

        Scanner input= new Scanner(System.in);
        System.out.println("Please enter a number :");
        int dig1=input.nextInt();

        for (int i=1; i<11; i++){
            System.out.println(dig1+"x"+i+"="+dig1*i);
        }*/

        /*
        Write a program to find the factorial value of any number entered through the keyboard.

        Scanner console=new Scanner(System.in);
        System.out.println("Please enter a Integer :");
        int integer=console.nextInt();

        if(integer<0){
            integer=integer*-1;

        }
        System.out.println(integer);
       Scanner console = new Scanner(System.in);

        int num; // To hold number
        int fact = 1; // To hold factorial

        System.out.print("Enter any positive integer: ");
        num = console.nextInt();

        for(int i=1; i<=num; i++)
        {
            fact *= i;
        }

        System.out.println("Factorial: "+ fact);*/
        /*
        Two numbers are entered through the keyboard.
        Write a program to find the value of one number raised to the power of another.
        (Do not use Java built-in method)
         */
        /*Scanner input=new Scanner(System.in);
        System.out.println("Please enter first number");
        int firstNum=input.nextInt();
        System.out.println("Please enter second number");
        int secondNum=input.nextInt();
        int sum=firstNum;
        for (int i=1;i<secondNum;i++){
            sum=sum*firstNum;
        }
        System.out.println(sum);
        Scanner input =new Scanner(System.in);
        System.out.println("Please enter a digit");
        String num=input.nextLine();
        for (int i=num.length()-1; i>=0; i--){
            System.out.print(num.charAt(i));
        }*/
        /*
        Write a program that reads a set of integers, and then prints the sum of the even and odd integers.

        Scanner input=new Scanner(System.in);
        int sumEven=0;
        int sumOdd=0;
        char yesno;

        do {
            int num1=input.nextInt();
            if (num1%2==0){
                sumEven=sumEven+num1;

            } else{
                sumOdd=sumOdd+num1;

            }
            System.out.println("Do you want to add a new integer");
            yesno=input.next().charAt(0);
        }while (yesno=='y'||yesno=='Y');
        System.out.println(sumEven);
        System.out.println(sumOdd);*/

        /*
        Write a program that prompts the user to input a positive integer.
        It should then output a message indicating whether the number is a prime number.

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a ınteger");
        int prime = input.nextInt();
        int num = 2;
        int a ;

        do {
            if (prime % num != 0) {
                a = 5;
            } else {
                a = 6;
            }
            num++;
        } while (num == prime);
            if (a == 5) {
                System.out.println("This number is prime");
            } else {
                System.out.println("this number is not prime");
            }*/
        /*
        Step 1: Divide the larger number by the smaller number first, such as;
                Larger Number/Smaller Number

        Step 2: Divide the divisor of step 1 by the remainder left.
                Divisor of step 1/Remainder

        Step 3: Again divide the divisor of step 2 by the remainder.
                Divisor of step 2/Remainder

        Step 4: Repeat the process until the remainder is zero.
        Step 5: The divisor of the last step is the HCF
         */
       /* Scanner input=new Scanner(System.in);
        System.out.println("Please enter first number");
        int firstNum=input.nextInt();
        System.out.println("Please enter second number");
        int secondNum=input.nextInt();
        if (firstNum%secondNum==0){
            System.out.println(secondNum);
        }else{
            System.out.println("1");
        }*/
        /*Scanner console = new Scanner(System.in);

        int dividend, divisor;
        int remainder, hcf = 0;

        System.out.print("Enter the first number ");
        dividend = console.nextInt();

        System.out.print("Enter the second number ");
        divisor = console.nextInt();

        do
        {
            remainder = dividend % divisor;

            if(remainder == 0)
            {
                hcf = divisor;
            }
            else
            {
                dividend = divisor;
                divisor = remainder;
            }

        }while(remainder != 0);

        System.out.println("HCF: " + hcf);
        /*
        Scanner input=new Scanner(System.in);
        System.out.println("please enter number of terms");
        int termOfnumber=input.nextInt();
        int onceki=0;
        int sonraki=1;
        int toplam;

        for (int i=0; i<termOfnumber; i++){
           toplam=onceki+sonraki;//0+1,1+1
           onceki=sonraki;


           sonraki=toplam;



            System.out.print(onceki+" ");*/
        Scanner input=new Scanner(System.in);
        System.out.println("please entree number");
        int a=input.nextInt();
        int sum=0;
        int sum1=0;
        for(int i=0; i<10; i++){

              sum=i+1;
              sum1=sum1+sum;


        }System.out.print("sum :"+sum1);









    }
}