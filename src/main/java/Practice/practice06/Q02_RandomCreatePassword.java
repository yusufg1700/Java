package Practice.practice06;

import java.util.Scanner;

public class Q02_RandomCreatePassword {
/*
write a code that generates a random password as long as the number of characters you receive from the user
 */

    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        System.out.println("please enter number of character");
        int numberOfCharacter=input.nextInt();
        String password="";
        int counter=0;

        String characters="ABCDEFGHIJKLMNOPQRSTUVYZabcdefghijklmnopqrstuvyz0123456789";
        int maxIndex=characters.length();

        while (counter<numberOfCharacter){
           int randomIndex= (int)(Math.random()*maxIndex);
           password+=characters.charAt(randomIndex);

           counter++;
        }
        System.out.println("password :"+password);

    }
}
