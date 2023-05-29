package Practice.p02;

import java.util.Scanner;

public class Q01_if_Diskriminant {
    public static void main(String[] args) {
        /*
        Find the roots of an equation with one unknown given the coefficients
        ax^2 +bx + c
        user give values of a,b,c
        delta=bb+4ac
        x1=(-b-root(delta))/2a
        x2=(-b+root(delta))/2a
         */
        System.out.println("please enter value of a");
        Scanner input =new Scanner(System.in);
        int a=input.nextInt();

        System.out.println("please enter value of b");
        Scanner input2=new Scanner(System.in);
        int b=input.nextInt();

        System.out.println("please enter value of c");
        Scanner input3=new Scanner(System.in);
        int c=input.nextInt();

        int delta;

        delta=b*b-4*a*c;

        if (delta>0){

            double x1=-b+Math.sqrt(delta)/(2*a);
            double x2=-b-Math.sqrt(delta)/(2*a);
            System.out.println("x1="+""+x1);
            System.out.println("x2="+""+x2);
        } else if (delta==0) {

            double x1=-b/(2*a);
            System.out.println("x1=x2"+""+x1);

        }else {
            System.out.println("there is no root");
        }


    }
}
