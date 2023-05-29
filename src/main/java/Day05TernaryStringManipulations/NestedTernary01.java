package Day05TernaryStringManipulations;

import java.util.Scanner;

public class NestedTernary01 {
    public static void main(String[] args) {
        /* Type java code by using nested ternary.
        write a program to check if a year is leap year or not
        i)ıf year is divisible by 100 then it must be divisibleby 400
        ii)if a year is not divisible by 100 then it must be divisible by 4.

         */
        Scanner input= new Scanner(System.in);
        //System.out.println("please enter a year");
        //int year=input.nextInt();

        /*String result= year%100==0 ? (year%400==0?"lead year":"not lead year"):(year%4==0?"lead year":"not lead year");
        System.out.println(result);*/
        /*
        type code to check the password
        if it has more than 8 character, initial should be 'i'
        if it has no more than 8 character initial should be 'K'
        solve the task by using nested-ternary
         */

        System.out.println("please enter the password");
        String pwd=input.next();
        String result3 =pwd.length()>8?(pwd.charAt(0)=='i' ? "valid": "invalid"): (pwd.charAt(0)=='K' ?"valid":"invalid");
        System.out.println(result3);













    }
}
