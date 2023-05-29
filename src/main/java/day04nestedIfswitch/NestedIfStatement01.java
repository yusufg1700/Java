package day04nestedIfswitch;

import java.util.Scanner;

public class NestedIfStatement01 {
    public static void main(String[] args) {

        /*
        ask a user to enter a password
        ıf initial of the password is upparcase
            check if it is "A" or not.
            If it is "A" the output will be valid password
            otherwise the output will be invalid password
            for example ; Ali ==> valid password   -- ali==invalid password

         if the initial of the password is lowercase
         check if it is "z" or not
         if it is "z" the output will be valid
         or not invalid
         for example zoe is valid Zoe is invalid

         */


        Scanner input=new Scanner(System.in);
        System.out.println("please Enter Password :");
        char passwordInitial = input.next().charAt(0); // charAt() method returns just single character, data type for single characters is "char"

        if (passwordInitial>='A' && passwordInitial<='Z') {
            if (passwordInitial=='A'){
                System.out.println("Valid");
            }else{
                System.out.println("invalid");
            }
        }else if (passwordInitial>='a'&& passwordInitial<='z'){
            if (passwordInitial=='z'){
                System.out.println("valid password");
            }else{
                System.out.println("invalid password");
            }

        }else {
            System.out.println("invalid password");

        }
    }
}
