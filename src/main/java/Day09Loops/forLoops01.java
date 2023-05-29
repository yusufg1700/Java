package Day09Loops;

public class forLoops01 {
    public static void main(String[] args) {
       /* // example 1: type code to reverse a String
                        // for example : Tom==>moT
        String name= "Mark";
        for (int i=name.length()-1; i>=0;i--){
            System.out.print(name.charAt(i));//or char ch=name.charAt(i); System.Out.print(ch);
        }
        //example 2: Find the sum of the integers from 3 to 6

        int sum=0;
        for (int i=3;i<7;i++){
            sum=sum+i;

        }
        System.out.println(sum);*/


        /* example: type code to fid th sum of the digits of an integer 584==> 5+8+4

         */

        int a=584;

        int b=a%10;
        int c=a/10;
        System.out.println(c);
        int d=c%10;
        System.out.println(d);
        int e=c/10;
        System.out.println(b+d+e);
        //if digit equals negative value you can use math method
        int num=-584;
        num=Math.abs(num);// Math.abs method convert digit from negative to positive


        int sumOfDigits = 0;
        for (int i=num;i>0; i=i/10){
            sumOfDigits=sumOfDigits+i%10;

        }

        System.out.println(sumOfDigits);


    }
}
