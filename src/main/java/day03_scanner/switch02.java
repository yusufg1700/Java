package day03_scanner;

import java.util.Scanner;

public class switch02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter number five or number");
        int mounth = input.nextInt();

        switch (mounth){
            case 1:
                System.out.println("january");
                break;
            case 2:
                System.out.println("february");
                break;
            case 3:
                System.out.println("march");
                break;
            case 4:
                System.out.println("april");
                break;
            case 5:
                System.out.println("may");
            case 6:
                System.out.println("june");
            case 7:
                System.out.println("july");
            case 8:
                System.out.println("august");
            case 9:
                System.out.println("september");
            case 10:
                System.out.println("october");
            case 11:
                System.out.println("november");
            case 12:
                System.out.println("december");
                break;
            default:
                System.out.println("invalid number");
        }
    }
}
