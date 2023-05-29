package Day11ConsructorsMethodCallStaticKeyword;

import java.util.Scanner;

public class DoWhile01 {
    public static void main(String[] args) {



        /*
        Username is "admin", password is "pwd123"
        Ask user to enter username and password" massage
        ıf he enters correct credentials he should get "you are in your account!" message
        otherwise, he should see " enter your username and password" message 3 times
        after 3 times he should get " your account is blocked" message
         */




        /*
        type code to print digits just  in decimal part of thr given decimal number with asterix for example 75.4238 4*2*3*8
         */
        double num=75.4238;
        String str= String.valueOf(num);
        String s="";
        String decPart=str.split("\\.")[1];//when yuo use "." in split methode use it like "\\"
        int i=0;
        System.out.println(decPart);
        do {
            String r=decPart.substring(i,i+1);

            s=s+"*"+r;
            i++;

        }while (i<decPart.length());
        System.out.println(s);
    }
}
