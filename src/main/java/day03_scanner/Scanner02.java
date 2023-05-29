package day03_scanner;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {

        //example : get the width and length of rectangle from user
        Scanner input = new Scanner(System.in);

        System.out.println("please enter width value:");
        int width= input.nextInt();
        System.out.println("please enter length value:");
        int length=input.nextInt();
        System.out.println("total area :"+ (width*length));





    }
}
