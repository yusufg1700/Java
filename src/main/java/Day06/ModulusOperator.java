package Day06;

import java.util.Scanner;

public class ModulusOperator {
    public static void main(String[] args) {
        /*
        Modulus operator in java:%
        ıt returns the remainder in a division operation
        13/5 remain.modulus operator gives you  3
        13%5==>3


         */
        //example ask user to enter an integer then print 'even' on the consloe if the number is even.
       /* Scanner input= new Scanner(System.in);
        System.out.println("please enter a number");
        int digit= input.nextInt();*/
       /* //1.way
        String result=digit%2==0? "even number":"not even number";
        System.out.println(result);
        //2.way
        if (digit%2==0){
            System.out.println("even number");
        }else{
            System.out.println("not even number");
        }*/
        //3.way
        /*int absDigit=Math.abs(digit);
        System.out.println("is the number even"+(absDigit%2==0));
        //example

        Scanner input2=new Scanner(System.in);
        System.out.println("Please enter a digit and check if it is an odd number");
        int oddnumber=input2.nextInt();
        int absoddnumber=Math.abs(oddnumber);
        System.out.println("is the number is odd :"+(oddnumber%2!=0));
        */
        //exampleenter the digit and then sum this digits number
        System.out.println("please enter 3 digits number");
        Scanner treedigitnumber=new Scanner(System.in);
        int abstreedigitnumber=treedigitnumber.nextInt();
        int last=abstreedigitnumber%10;
        abstreedigitnumber=abstreedigitnumber/10;
        int second=abstreedigitnumber%10;
        abstreedigitnumber=abstreedigitnumber/10;
        int third= abstreedigitnumber;
        System.out.println(last+second+third);




    }
}
