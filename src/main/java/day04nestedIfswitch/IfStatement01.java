package day04nestedIfswitch;

import java.util.Scanner;

public class IfStatement01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //type a code, get age from user and decide whitch stage on it
        //0-4 baby
        //5-12 child
        //13-20 teeneger
        //21-30 adult
        // else (not expected age
        System.out.println("please enter your age");
        int age= input.nextInt();

        if (age<0){
            System.out.println("invalid value");

        } else if (age<5) {
            System.out.println("baby");
            //why we use "<" instead of "<=".because first code is simply another code.
        } else if (age<13) {
            System.out.println("child");
        } else if (age<=20) {
            System.out.println("teeneger");
        } else if (age<=30) {
            System.out.println("adult");
        }else{
            System.out.println("not expected age");
        }


    }
}
