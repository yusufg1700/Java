package Practice.p03;

import java.util.Scanner;

public class Q09_bouncingBall {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("please enter the high");
        double highBall=input.nextDouble();
        double sumWay=0;
        double jumpOfNums=0;
        do {
            jumpOfNums++;
            sumWay+=highBall;
            highBall=highBall*0.75;
            sumWay+=highBall;

        }while (highBall>1);
        System.out.println(sumWay);
        System.out.println(jumpOfNums);
    }
}
