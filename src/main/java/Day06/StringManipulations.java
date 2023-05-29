package Day06;

public class StringManipulations {
    public static void main(String[] args) {
        // count the alphabetical characters in a given String
        String name= "  Tom12 Hanks!.... Hello...       ";
        int numofLetters=name.replaceAll("[A-Za-z]","").length();
        System.out.println(numofLetters);
        /*
        if your codes give you correct output for some data but if it is not giving you correct output for some other data this is called" hard coding"
        it is not accepted
        if your code works for all data is called "dynamic coding"

         */
        String name2="Tom";

    }
}
