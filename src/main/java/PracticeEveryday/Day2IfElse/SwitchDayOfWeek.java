package PracticeEveryday.Day2IfElse;

import java.util.Scanner;

public class SwitchDayOfWeek {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("please enter a number from 1 to 7");
        int day=input.nextInt();
        String dayOfWeek;

        switch (day){
            case 1:
                dayOfWeek="Monday";
                break;
            case 2:
                dayOfWeek="Tuesday";
                break;
            case 3:
                dayOfWeek="Wednesday";
                break;
            case 4:
                dayOfWeek="Thursday";
                break;
            case 5:
                dayOfWeek="Friday";
                break;
            case 6:
                dayOfWeek="Saturday";
                break;
            case 7:
                dayOfWeek="Sunday";
                break;
            default:
                dayOfWeek="invalid day";
                break;
        }
        System.out.println(dayOfWeek);
    }
}
