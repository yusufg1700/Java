package Day15Multidimensionalarraylist;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {
        //binarySearch() Method Binary search is used to search a key element from multiple elements. Binary search is faster than linear search.
        /*
        In case of binary search, array elements must be in ascending order.
        If you have unsorted array, you can sort the array using Arrays.sort(arr) method.
         */
        int []arr= {12,31,43,14};

        int sayi=43;
        int sayi2=58;

        Arrays.sort(arr);//[12,14,31,43]
        int idx=Arrays.binarySearch(arr,sayi);
        int sonuc=Arrays.binarySearch(arr,sayi2);
        System.out.println(idx);
        Arrays.binarySearch(arr,sayi2);
        System.out.println(sonuc);//(-) means of marks is array has not sayi2 value; means of (5) is if array has sayi2 value, location of sayi2 is 5.


        int brr[]={2,1,7,6};
        Arrays.sort(brr);
        System.out.println(Arrays.binarySearch(brr,2));//1
        System.out.println(Arrays.binarySearch(brr,7));//3
        System.out.println(Arrays.binarySearch(brr,3));//-3
        System.out.println(Arrays.binarySearch(brr,9));//-5

    }
}
