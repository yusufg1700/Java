package Day07StringManipulations;

public class StringManipulations04 {
    public static void main(String[] args) {
        //The Java String class isEmpty() method checks if the input string is empty or not.
        // Note that here empty means the number of characters contained in a string is zero.

        String str=" ";
        boolean result1=str.isEmpty();// isEmpty() method returns true if the string does not have any character, return falseif the  string has any character
                                      //str.length()==0 and isEmpty have same meaning but to check if a string is empty using isEmpty is preferable
        System.out.println(result1);
        boolean result2=str.isBlank();
        System.out.println(result2);
        str.isBlank();// Blank strings are those strings that contain only white spaces.
                     // The isEmpty() method comes in very handy to check for the blank strings. Consider the following example

        //Example 1: check if a string has just letters and spaces in it

        String s ="learn java earn money!";
        boolean result3=s.replaceAll("[a-zA-Z ]","").isEmpty();
        System.out.println(result3);


        //example 3: check ssn for the following rules
        /*
        rules;
        1. ıt must have just digit
        2.it must have 9 digits
         */
        //1. ıt must have just digit
        String ssn ="1AB23CD89";
        boolean result0=ssn.replaceAll("[0-9]","").isEmpty();

        //2.it must have 9 digits
        boolean result01=ssn.length()==9;
       if(result0&&result01){
           System.out.println("valid ssn");
       }else{
           System.out.println("invalid ssn");
       }


    }
}
