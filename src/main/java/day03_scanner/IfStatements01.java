package day03_scanner;

import java.util.Scanner;

public class IfStatements01 {
    public static void main(String[] args) {
        //ıf statement: we sometimes need to execute some codes under some spesific conditions
        //if its rains ı will cancel the picnic

        // example 1: type code to print negative numbers less than zero non negative for numbers greater than or equal to zero
        double d=2.3;

        if (d<0){
            System.out.println("negative");

        }
        if (d>=0){
            System.out.println("positive");
        }


        // example : type to print "divisible by5  if the number can by 5, otherwise print "not diwisible by 5 cannot bla bla bla
        Scanner input= new Scanner(System.in);
        System.out.println("please enter one digit :");
        int a =input.nextInt();
        if (a%5==0){
            System.out.println("divigible number");

        /*}45
        if (a%5!=0){
            System.out.println("non divigible number");
*/
        }else {
            System.out.println("not devizible by 5");
        }




    }

}
