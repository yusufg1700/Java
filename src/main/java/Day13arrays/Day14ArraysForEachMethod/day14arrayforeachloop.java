package Day13arrays.Day14ArraysForEachMethod;

import java.util.Arrays;
import java.util.Scanner;

public class day14arrayforeachloop {
    public static void main(String[] args) {
        /*
        example 1: [0,2,3,0,12,0] put the zeros to the end.
                   [2,3,12,0,0,0]
         */
        int brr[]= {1,2,3,0,12,0};
        int brrcpy[]=new int[brr.length];
        int brrnum=0;
        int idx=0;
        int idv=5;
        for (int i=0;i<brr.length-1;i++){
            if (brr[i]!=0){
                brrnum=brr[i];
                brrcpy[idx]=brrnum;
                idx++;

            }

        }
        System.out.println(Arrays.toString(brrcpy));

        /*
        type code to check if a spesific element exists in an array or not
        int crr[]={-12,23,5} check if 23 exist in the array or not
         */
        int crr[]={-12,23,5,8,18,23,45,23};
        int counter=0;
        int element=23;
        Scanner input=new Scanner(System.in);
        System.out.println("please enter a number");
        element=input.nextInt();
        for (int w:crr){
            if (w==element){
                counter++;

            }

        }
        if (counter>0){
            System.out.println("there are "+counter+" "+element);
        }else {
            System.out.println("it does not exist");
        }

    }
}
