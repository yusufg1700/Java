package Day07StringManipulations;

import java.util.Scanner;

public class StringManipulations03 {
    public static void main(String[] args) {
        String str="Ali is 13 years old, I like Ali, Ali does not like me!...";
        // example 1: How many punctuation marks are used in the given String
        int numOfAllCharacters=str.length();
        int numOfAllChars=str.replaceAll("\\p{Punct}","").length();
        System.out.println(numOfAllCharacters-numOfAllChars);

        //Example 2:Ask user to enter his full name, and fix if he user enters space at the beginning and ar the end
        Scanner input=new Scanner(System.in);
        System.out.println("please enter your full name :");

        String fullName=input.nextLine();
        String fixFullName=fullName.trim();//trim method is remove  space in the text the begining and the and
        System.out.println(fixFullName);
    }
}
