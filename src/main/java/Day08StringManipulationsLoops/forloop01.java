package Day08StringManipulationsLoops;

public class forloop01 {
    public static void main(String[] args) {
        /*
        example 1: type code to print "Hi" five times on the console
         */

        for (int i=0;i<=4; i++){
            System.out.println("hi!");
        }
        /*
        to do repeated actions java created "loops"
        // there are 4 loops in java
            i)for- loop
            ii)while-loop
            iii)do-while loop
            iv)for each loop
         */
        // type all integers from 11to 44 in the same line with a space between consecutive integers
        /*for (int i=11; i<45;i++){
            if (i%2==0) {
                System.out.print(i + " ");
            }
        }*/
        for (int i=68; i>12;i--){
            if (i%2!=0) {
                System.out.print(i + " ");
            }
        }
        System.out.println(" ");
        /*
        type all integers which are divisible 4 and not divigibleby 6from 120 to 11 in the same line with a space
         */
        for (int i=120; i>10; i--){
            if (i%4==0&&i%6!=0){
                System.out.print(i+" ");
            }
        }

    }
}
