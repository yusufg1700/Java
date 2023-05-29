package Day07StringManipulations;

public class StringManipulations {
    public static void main(String[] args) {
        String str="java is oop";
        /*
        The Java String class replace() method returns a string replacing all the old char or CharSequence to new char or CharSequence.
         */
        String result1 =str.replace('o','*');
        System.out.println(result1);

        String RSLT2=str.replace("java","*");// if you wanna change multiple character please select second replace.(
        System.out.println(RSLT2);
        //1.way
        String st= "ali is 13 years ol, i think he seems 15";
        // example 1 : change all digits to "*" in the given String.
        String result3=st.replace('0','*').
                          replace('1','*').
                          replace('2','*').
                          replace('3','*').
                          replace('4','*').
                          replace('5','*').
                          replace('6','*').
                          replace('7','*');
        System.out.println(result3);
        //2.way
        String result4=st.replaceAll("[0-9]","*");
        System.out.println(result4);
                /*
                regex means "regular expressions
                Regex represents a group of data
                all digit :[]0-9
                all lovercase latters:[a-z]
                all uppercases latters:[A-Z]
                all lower and uppercase letters: [a-zA-Z]
                all lower and uppercase and digits:[a-zA-Z0-9]
                some multiple characterslike a,e,i,o,u
                all characters diffirent from digits[^0-9]
                all characters diffirent from letters[^a-zA-Z]
                all characters diffirent from vawels :[^aeiou]
                space characters:\\s
                all characters diffirent from space characters:\\S
                alldigit: \\d
                all character diffirent from space digits:\\D

                all uppercase, lowercase letters and digits and_ :\\w
                diffirent from all uppercase, lowercase letters and digits and _:\\W

                all punctuation marks:\\p{punct}


                 */

                /* example 2: type code to check if a password is valid or not for the following conditions;
                password must have at least 8 characters diffirent from space character
                password must have at least 1 symbol
                 */
            String pwd2="!1a  23b  4?es";
            //password must have at least 8 characters diffirent from space character
            boolean firstRule1=pwd2.replaceAll("\\s","").length()>7;// find space characters replecement put  this character nothing
            // password must have at least 1 symbol
           // boolean secondRule2=pwd2.replaceAll("\\s","").replaceAll("[a-zA-Z0-9]","").length()>0;
            //System.out.println("is the password is valid"+(firstRule1 && secondRule2));
            // you can use replaceAll("[a-zA-Z0-9 ]" instead of  replaceAll("\\s","") there is space after 9 number.

            boolean secondRule2=pwd2.replaceAll("[a-zA-Z0-9 ]","").length()>0;
            System.out.println("is the password is valid"+(firstRule1 && secondRule2));
    }
}
