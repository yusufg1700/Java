package Day15Multidimensionalarraylist;

import java.util.Arrays;

public class multidimensional03 {
    public static void main(String[] args) {
        //example 1: convert multidimensional array to one dimensional array
        //{"learn","java","it"},{"is","easy"}==> {"learn","java","it","is","easy"}
        //1. step find the total number of elements in the multidimensional array
       String arr[][]={{"learn","java","it"},{"is","easy"}};
       int sum=0;
        for (String[]w:arr){
            sum=sum +w.length;


        }
        // create one dimensional array by using the total number of elements in md.
        String brr[]=new String[sum];
        System.out.println(Arrays.toString(brr));
        //3.step transfer the element

        int idx=0;
        for (String[] w:arr){
            for (String u:w){
                brr[idx]=u;
                idx++;
            }

        }
        System.out.println(Arrays.toString(brr));
    }
}
