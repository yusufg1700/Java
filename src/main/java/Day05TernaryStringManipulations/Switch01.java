package Day05TernaryStringManipulations;

import java.util.Scanner;

public class Switch01 {
    public static void main(String[] args) {
        /*
        ask a user enter country name among "america england germany turkey India peru spain bulgaria albania france
        type code to print abbreviation of the countries us uk de tr ın pe es bg al fr
         */
        Scanner input= new Scanner(System.in);
        System.out.println("please enter country name");
        String country=input.nextLine().toLowerCase();

        switch (country){
            case "america":
                System.out.println("US");
                break;
            case "england":
                System.out.println("UK");
                break;
            case "germany":
                System.out.println("DE");
                break;
            case "turkey":
                System.out.println("TR");
            case "india":
                System.out.println("IN");
            case "peru":
                System.out.println("PE");
                break;
            case "spain":
                System.out.println("ES");
                break;
            case "bulgaria":
                System.out.println("BG");
            case "albania":
                System.out.println("AL");
            case "france":
                System.out.println("FR");
                break;
            default:
                System.out.println("invalid country");
        }



    }
}
