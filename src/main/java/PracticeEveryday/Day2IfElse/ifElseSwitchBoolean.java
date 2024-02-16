package PracticeEveryday.Day2IfElse;

import java.util.Scanner;

public class ifElseSwitchBoolean {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your age");
        int age=input.nextInt();
        String genderOffer;

        if (age>=18){
            System.out.println("Welcome our Website");
            System.out.println("please Enter your gender");
            String gender=input.next();
            switch (gender){
                case "male":
                    System.out.println("we dont have an offer for male");
                    break;
                case "female":
                    System.out.println("we have an offer for female");
                    break;
                case "not prefer to say":
                    System.out.println("we have an %5 offer for not prefer to say");
                    break;
                default:
                    System.out.println("invalid value");
                    break;
            }
        }else if (age<18){
            System.out.println("You can not enter our website");
        }else {
            System.out.println("invalid value");
        }
    }
}
