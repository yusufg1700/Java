package Practice.p01;

public class Q03_RegexQuantifiers {
    public static void main(String[] args) {
        /*

         */

        String str="as";
        System.out.println( str.matches(".."));

        System.out.println(str.matches(".s"));
        System.out.println(str.matches("a."));
        System.out.println(str.matches("xz"));
        //match() method is run by regex and compares String with regex
        System.out.println(str.matches(".xz")); // has not three character


        String newStr= "Yusufasdasd";
        System.out.println(newStr.matches("..s.."));
        System.out.println(newStr.matches("..s.*"));
        System.out.println("askjdpoaksd".matches(".r.*"));

        /* type a code to checks if it contains letters

         */
        System.out.println("abc".matches("[a-zA-Z]"));
        System.out.println("abc".matches("[a-zA-Z]*"));
        System.out.println("abc!".matches("[a-zA-Z]*"));
        System.out.println("abc1".matches("[a-zA-Z]*"));
        System.out.println("ab".matches("\\w{2}"));
        System.out.println("abc".matches("\\w{3}"));
        /*
        Write code that checks the number of characters and the value of a string of letters
         */
        System.out.println("abcde".matches("[a-zA-Z]{5}"));
        System.out.println("abcdef".matches("[a-zA-Z]{5}"));
        System.out.println("abcde1".matches("[a-zA-Z]{6}"));

        System.out.println("12345".matches("[0-9]{6,}"));
        System.out.println("0123456789".matches("[0-9]{6,10}"));

        System.out.println("1234abcdABCD".matches("\\w{7,10}")); //00\\w{} means [a-zA-Z0-9]

        // first character should be  1, second character should be punctuation and other characters should be digit.
        System.out.println("1?2345678".matches("[1][\\p{Punct}][0-9]{8}"));
        System.out.println("1?!.12345678".matches("[1][\\p{Punct}]{3}[0-9]{8}"));
    }
}
