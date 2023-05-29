package Day05TernaryStringManipulations;

import java.util.Scanner;

public class Ternary01 {
    public static void main(String[] args) {
        // Ternary does the same with "if else" by using more simple syntax
        // ıf an integer is positive print "the integer is positive" otherwise print "the integer is not positive

        //Scanner input=new Scanner(System.in);

        //System.out.println("please enter the number");
        //int digit=input.nextInt();
        /*int digit=input.nextInt();

       if (digit<0){
            System.out.println("the integer is negative number");
        } else if (digit>0) {
            System.out.println("the integer is positive number");

        }else if (digit==0){
            System.out.println("the number is zero");
        }else{
            System.out.println("invalid number");
        }*/

        //2.way
                            //condition     ?         will be select for true condition     :    will be select for false condition
        //String result = digit >=0           ?         "the integer is positive"             :     "the integer is negative";
        //System.out.println(result);

        //exercise
        // type a program to print the minimum of 2 integers on the console. use ternary
        /*Scanner input=new Scanner(System.in);
        System.out.println("please enter first number ");
        double firstNum=input.nextDouble();

        System.out.println("please enter second number");
        double secondNum=input.nextDouble();

        double result= firstNum>secondNum ? firstNum : secondNum ;
        System.out.println(result);*/
        /*double f1=-12.4;
        double result2= f1>0 ? f1 :-1*f1;
        System.out.println(result2);*/


        int a=12, b=13;
        // Object data type can be used for all data types
        Object res= a>0 && b>0 ? a*b : "ı do not how to multiply";
        System.out.println(res);



    }

}
