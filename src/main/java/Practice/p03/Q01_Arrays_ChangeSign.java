package Practice.p03;

import java.util.Arrays;

public class Q01_Arrays_ChangeSign {
    /*
    Q01:write a code that changes the sign(+-) of the elements in array
    input:{1,2,-3,4,-5,-6}
    output:-1,-2,3,-4,5,6
     */
    public static void main(String[] args) {
        int arr[]={1,2,-3,4,-5,-6};
        int brr[]=new int[arr.length];
        int idx=0;
        for (int w:arr){
            brr[idx]=w*-1;
            idx++;
            }
        System.out.println(Arrays.toString(brr));
        }

    }


