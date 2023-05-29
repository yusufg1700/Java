package Practice.practice05;

import java.util.Scanner;

public class Q01_Ascii {
    //write a code that prints all the characters you receive from the user
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("please enter first character");
        char ch1= input.next().charAt(0);
        System.out.println(ch1);

        System.out.println("please enter second character");
        char ch2=input.next().charAt(0);
        System.out.println(ch2);

        for (int i=ch1; i<ch2;i++){
            System.out.print((char)i+" ");
        }
    }
}
