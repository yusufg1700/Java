package day03_scanner;

import java.util.Scanner;

public class ifstatement02 {
    public static void main(String[] args) {
        /*


        example 1:type code to print "weekday" for the names,"weekend days

       */
        Scanner input=new Scanner(System.in);
        System.out.println("please enter one day");
        //to compare String, use "equals" method because String data type is non primitive data type.
        String day=input.next();
        /*
        //1. way
        if (day.equals("Monday")){
            System.out.println("weekday");
        }
        if (day.equals("Monday")) {
            System.out.println("weekday");
        }
        if (day.equals("Tuesday")) {
            System.out.println("weekday");
        }
        if (day.equals("Wednesday")) {
            System.out.println("weekday");
        }
        if (day.equals("Thursday")) {
            System.out.println("weekday");
        }
        if (day.equals("Friday")) {
            System.out.println("weekday");
        }
        if (day.equals("Saturday")) {
            System.out.println("weekend day");
        }
        if (day.equals("Sunday")) {
            System.out.println("weekend day");
        } else{
            System.out.println("invalid day");
        }*/
        //2.way
        /*if(day.equals("Monday")||day.equals("Tuesday")||day.equals("Wednesday")||day.equals("Thursday")||day.equals("Friday")){
            System.out.println("weekday");
        }else {
            System.out.println("weekend day");
        }*/
        //3.way
        if(day.equalsIgnoreCase("Monday")||day.equalsIgnoreCase("Tuesday")||day.equalsIgnoreCase("Wednesday")||day.equalsIgnoreCase("Thursday")||day.equalsIgnoreCase("Friday")){
            System.out.println("weekday");
        }
        else{
            System.out.println("weekend day");
        }



    }
}
