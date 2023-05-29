package Practice.p03;

import java.util.Arrays;
import java.util.Scanner;

public class Q02_For_Continue {
    /*
    ask the user for 5 numbers
    Add this number without between 5 and 10.
     */
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        int arr[]=new int[5];
        int total=0;
        for (int i=0; i<5;i++){
            System.out.println("please enter a number");
            arr[i]=input.nextInt();
            if (arr[i]<5||arr[i]>10){
                total=total+arr[i];
            }
        }

        System.out.println(total);
    }
}
