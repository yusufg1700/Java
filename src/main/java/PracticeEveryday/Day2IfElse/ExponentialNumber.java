package PracticeEveryday.Day2IfElse;

import java.util.Scanner;

public class ExponentialNumber {
    static int number;
    static int us;
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("please enter number");
        number=input.nextInt();
        System.out.println("please enter us");
        us=input.nextInt();


        double result=(us>=0)?Math.pow(number,us):1.0/Math.pow(number,-us);
        System.out.println("Sonuc: "+result);


    }
}
