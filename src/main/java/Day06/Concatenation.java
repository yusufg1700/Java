package Day06;

public class Concatenation {
    /* concatination: joining string with each other or with other data types.
        1)use "+" sign
        2)use concat() method

     */
    public static void main(String[] args) {
        String s="tom";
        String t="hanks";
        char c='S';
        int a=7;
        int b=4;
       /* System.out.println(s+" "+t);
        System.out.println(s+t+c);
        System.out.println(s+t+a+b);
        System.out.println(s+t+(a+b));*/

        //concat() method only you can use just string data type
        System.out.println(s.concat(" ").concat(t));
















    }
}
