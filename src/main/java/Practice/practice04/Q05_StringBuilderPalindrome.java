package Practice.practice04;

public class Q05_StringBuilderPalindrome {
    /*
    write a code that checks if a string value is a palindrome
     */
    public static void main(String[] args) {
       /* String palindrome="nazan";
        String palindromeReverse="";

        for (int i=palindrome.length()-1; i>-1; i--){
            palindromeReverse+=palindrome.charAt(i);
        }
        System.out.println(palindromeReverse);
        if (palindrome.equalsIgnoreCase(palindromeReverse)){
            System.out.println("is Palindrome");
        }else {
            System.out.println("is not palindrome");
        }*/
        String str="nazan";
        StringBuilder stb=new StringBuilder(str);

        String stbReverse=String.valueOf(stb.reverse());
        System.out.println(stb);
        System.out.println(stbReverse);

        if (stb.equals(stbReverse)){
            System.out.println("Palindrome");
        }else {
            System.out.println("not polindrome");
        }
    }
}
