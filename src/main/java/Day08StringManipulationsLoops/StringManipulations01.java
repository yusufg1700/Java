package Day08StringManipulationsLoops;

public class StringManipulations01 {
    public static void main(String[] args) {

        String str="Java is easy and Java is oop";
        String result1=str.replaceFirst("Java","Apex");
        System.out.println(result1);

        String result22=str.replace("Java","apex");
        System.out.println(result22);

        /*Example 1: String shirtPrice ="$12.99
                     String bookPrice="$35.99"
                     type code to find the sum of the shirt and book prices
        */

        String shirtPrice ="$12.99";
        String bookPrice="$35.99";
        // string must be in numeric format
        String shirtPrice2=shirtPrice.replace("$","");
        double sonuc1=Double.valueOf(shirtPrice2);
        String bookPrice2=bookPrice.replace("$","");
        double sonuc2=Double.valueOf(bookPrice2);
        System.out.println(sonuc1+ sonuc2);

        /*
        //example 2: swap the integers
                    a=12;
                    b=23;
         */
        int a=12;
        int b=13;
        int sum;
       /* sum=a;
        a=b;
        b=sum;
        System.out.println(a);
        System.out.println(b);*/

        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a);


    }
}
