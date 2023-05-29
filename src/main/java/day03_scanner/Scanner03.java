package day03_scanner;

import java.util.Scanner;

public class Scanner03 {
    public static void main(String[] args) {

        // example 3: ask user to enter witdh, heigth, and the length of a rectengular prism then calculate total area

        Scanner input=new Scanner(System.in);

        System.out.println("please enter witdh :");
        double width=input.nextDouble();

        System.out.println("please enter heigth :");
        double heigth =input.nextDouble();

        System.out.println("please enter length :");
        double length =input.nextDouble();

        System.out.println("total area :"+(2*(width*heigth)+2*(width*length)+2*(heigth*length)));




    }
}
