package Practice.practice04;

import java.util.Scanner;

public class Q01_Swich_MonthDays {
    /*
    LEAP YEAR write a code that prints the number of days od the month according to the entered year and month number
    girdi : yil:2000 ay:2
    çıktı:29
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("please enter year");
        int year=input.nextInt();

        System.out.println("enter month");
        int month=input.nextInt();

        int day;

        switch (month){
            case 1: case 3: case 5:
            case 7: case 8: case 10: case 12:
                day=31;
                System.out.println("the number of days of the month you entered:"+day);
                break;
            case 4: case 6: case 9: case 11:
                day=30;
            case 2:
                if (year%4==00&&year%100!=0|| year%400==0){
                    day=29;
                    System.out.println("the number of days of the month you entered:"+day);
                }else {
                    day=28;
                    System.out.println("the number of days of the month you entered:"+day);
                }
                break;
            default:
                System.out.println("asjdpoad");


        }

    }

    
}
