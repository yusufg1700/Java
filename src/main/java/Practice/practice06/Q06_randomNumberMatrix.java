package Practice.practice06;

import java.util.Scanner;

public class Q06_randomNumberMatrix {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("please enter a number");

        int number=input.nextInt();

        for (int i=0; i<number; i++){
            for (int j=0; j<number; j++) {
                System.out.print((int) (Math.random()*2));
            }
            System.out.println();
        }
    }
}
