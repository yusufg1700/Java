package Practice.p03;

import java.util.Arrays;

public class Q07_AsciiTypeYourName {
    /*
    write a code that prints your name without using the letters in your name
     */

    public static void main(String[] args) {
        int arr[]={'Y','U','S','U','F'};
        int brr[]=new int[arr.length];
        int idx=0;
        for ( int w:arr){
            brr[idx]=w+1;
            idx++;
            System.out.println(Arrays.toString(brr));
        }

    }
}
