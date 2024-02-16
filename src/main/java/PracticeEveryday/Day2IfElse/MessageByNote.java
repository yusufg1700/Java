package PracticeEveryday.Day2IfElse;

import java.util.Scanner;

public class MessageByNote {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("please type your note");
        int myNote=input.nextInt();

        char gradeLetterValue   =   (myNote>=90) ? 'A': (myNote>=80) ? 'B': (myNote>=60) ? 'C': (myNote>=40) ? 'D' : 'F';
        if (gradeLetterValue=='A'||gradeLetterValue=='B'){
            System.out.println("Thank You");
        } else if (gradeLetterValue=='C'||gradeLetterValue=='D') {
            System.out.println("You have to Work");
        }else{
            System.out.println("You are lazy");
        }

        int yas = 35;
        boolean saglikliMi = true;

        double prim = (saglikliMi) ? (yas < 40) ? 500 : 700 : 1000;
        System.out.println("Sigorta primi: " + prim);
    }
}
