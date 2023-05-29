package Day16MultidimentionalarraysArrayList;

import java.util.Arrays;

public class MultidimentionalArray01 {
    public static void main(String[] args) {
        // create a integer multidimentional array
        // type a code to get this numbers collect
        int arr[][]={{2,5,1},{32,75},{13,21,43,56}};
        int sum =0;
        for (int[] w : arr){
            for (int k : w){
                sum=sum + k;
            }
        }
        System.out.println(sum);

        //type a code to convert from multidimensional array list to array list

        int brr[][]={{1,2,3},{4,5},{6,7,8,9,0}};
        int counter=0;

        for (int[] u:brr){

            counter=counter+ u.length;

        }
        int idx=0;
        int crr[]=new int[counter];
        for (int[] u: brr){
            for (int k : u){
                crr[idx]=k;
                idx++;
            }
        }

        System.out.println(Arrays.toString(crr));






    }
}
