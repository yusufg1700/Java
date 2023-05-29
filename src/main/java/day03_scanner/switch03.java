package day03_scanner;

import java.util.Scanner;

public class switch03 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("enter the firs number");
        double firstnumber=input.nextDouble();

        System.out.println("please enter operations among +,-,*,/..,");
        char operator=input.next().charAt(0);

        System.out.println("enter the second number");
        double secondnumber=input.nextDouble();


        switch (operator){
            case '+':
                System.out.println(firstnumber+secondnumber);
                break;
            case '-' :
                System.out.println(firstnumber-secondnumber);
                break;
            case '*':
                System.out.println(firstnumber*secondnumber);
                break;
            case '/':
                System.out.println(firstnumber/secondnumber);
                break;
            default:
                System.out.println("invalid operation");
        }


    }
}
