package day03_scanner;

import java.util.Scanner;

public class Scanner04 {
    public static void main(String[] args) {
        // get from the user first middle last name and ssn from user then print them the given format
        //tom jim hanks
        //12345678910

        Scanner input=new Scanner(System.in);
        System.out.println("please enter fullname :");
        String fullname=input.nextLine();

        System.out.println("please enter your ssn :");
        Long ssn= input.nextLong();
        System.out.println(fullname);
        System.out.println(ssn);








    }
}
