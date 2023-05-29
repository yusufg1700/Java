package day04nestedIfswitch;

import java.util.Scanner;

public class Switch01 {
    public static void main(String[] args) {
        // switch statement does the if else statement.their foncunality more easy
        // it has just diffirent syntax
        // get the number of days from user and print the name of day
        //for example 1==> monday
        //fırst way if else

        Scanner input =new Scanner(System.in);
        System.out.println("please enter number instead of day from one to seven");
        int day=input.nextInt();

        /*if (day==1){
            System.out.println("Monday");
        }else if(day==2){
            System.out.println("tuesday");
        } else if (day==3) {
            System.out.println("wednesday");
        } else if (day==4) {
            System.out.println("thursday");
        } else if (day==5) {
            System.out.println("friday");
        } else if (day==6) {
            System.out.println("saturday");
        } else if (day==7) {
            System.out.println("sunday");
        }else{
            System.out.println("invalid number");
        }*/
        //second way switch statement
        switch (day){
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
            default:
                System.out.println("invalid number");
        }
    }
}
