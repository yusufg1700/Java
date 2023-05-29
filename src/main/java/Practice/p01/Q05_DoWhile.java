package Practice.p01;

import java.util.Scanner;

public class Q05_DoWhile {
    public static void main(String[] args) {
        /*write a code that predicts numbers between zero and one hundred
            1)if your choise less than predict number, should be write "please write more than number"
            2)if your choise more than predict number, should be write "please write less than number"
            3)if your choise equals predict number, should be write "congrulations"
         */

        Scanner input=new Scanner(System.in);

        int digit;

        int randumNum =(int)(Math.random()*100)+1;
        int counter=0;

        do {
            counter++;
            System.out.println("enter a number between 0-100");
            digit=input.nextInt();
            if (digit<randumNum){
                System.out.println("please enter more than a number");
            }else {
                System.out.println("please enter less than a number");
            }
            if (counter==10){
                System.out.println("you are a loser");
                break;
            }
            System.out.println(10-counter+""+"kadar hakkınız kaldı");
        }while (digit!=randumNum);
    }
}
