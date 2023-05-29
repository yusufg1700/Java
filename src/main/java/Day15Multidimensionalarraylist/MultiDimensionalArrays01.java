package Day15Multidimensionalarraylist;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionalArrays01 {
    public static void main(String[] args) {


    /*
    what the MultiDimensionalArray
        if an array has arrays as elements it's called MultiDimensionalArray.
        */
        // how to create MultiDimensionalArray
        int arr[][] = new int[4][2];
        System.out.println(Arrays.deepToString(arr));
        // how to assign values to MultiDimensionalArray elements.
        arr[0][0]=2;
        arr[0][1]=3;

        arr[1][0]=5;
        arr[1][1]=6;

        arr[2][0]=8;
        arr[2][1]=9;

        arr[3][0]=11;
        arr[3][1]=12;


        System.out.println(Arrays.deepToString(arr));
        // how to create multidimensional array in short way
        String brr[][]= {{"tom","jim"},{"angie"},{"carl","chris","ali"}};

        System.out.println(Arrays.deepToString(brr));
        //how to print a spesific element from a multidimensional array
        System.out.println(brr[2][1]);


        //type code to find the number of elements in a multiplicational array
        String crr[][]= {{"tom","jim"},{"angie"},{"carl","chris","ali"}};
        int sum=0;
        for (String[] w:crr){
            sum=sum+ w.length;

        }
        System.out.println(sum);



    }























}
