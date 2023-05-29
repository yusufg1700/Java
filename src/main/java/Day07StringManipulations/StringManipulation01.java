package Day07StringManipulations;

public class StringManipulation01 {
    public static void main(String[] args) {
        String str ="Java is easy";
        /*.contains() method
        //.contains() method will check... java will go to the str and then check exist or not. so this method return boolean
        contains method has case (upper/lower) sensitive
         */
        boolean isExist = str.contains("java");
        System.out.println(isExist);
        // every time string are case sensivity
        // startsWith method check to first character or word. if first character or word is true. result is true. this method return the boolean
        boolean result =str.startsWith("easy");
        System.out.println(result);
        boolean res =str.startsWith("i",5);
        /* java will come to the string (it is str). skip first five character.and then java will check the next one is "i" or not.
         */
        System.out.println(res);
        /*
        example 1 : check if the given password
            i) has "A" in any position
            ii)has "xy"at the begining
            iii)has "W" at 7th character
            iv) has 8 characterin total
         */
        String pwd="xy1Am5W?";
        //i) has "A" in any position
        boolean firstRule=pwd.contains("A");
        boolean secondRule=pwd.startsWith("xy");
        boolean thirdRule=pwd.startsWith("W",6);
        boolean fourthRule =pwd.length()==8;
        System.out.println("is the password valid ?"+(firstRule&&secondRule&&thirdRule&&fourthRule));

        String s= "do practice to be better";
        boolean rslt=s.endsWith("r");
        System.out.println(rslt);
        /*
        The Java String class endsWith() method checks if this string ends with a given suffix.
        It returns true if this string ends with the given suffix; else returns false.
         */
        String t =s.concat("!").concat("...");//there is no limit to use to concet method
                                                    //
        System.out.println(t);
    }
}
