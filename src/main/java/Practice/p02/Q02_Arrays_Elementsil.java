package Practice.p02;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q02_Arrays_Elementsil {
    /* get a new element from user and than create a new array and than remove this element

     */

    public static void main(String[] args) {

        System.out.println("please enter array limit value");
        Scanner input=new Scanner(System.in);
        int limit=input.nextInt();
        int newArray[]=new int[limit];

        for (int i=0; i<limit; i++) {
            System.out.println("Please enter a new element for array");
            newArray[i] = input.nextInt();

        }
        System.out.println(Arrays.toString(newArray));

        System.out.println("please enter index value whose you wanna remove");
        int removeIndex=input.nextInt();

        int newArray2[]=new int[limit-1];
        int idx=0;
        for (int k=0; k<newArray.length; k++){
            if (removeIndex==k) {
                continue;
            } else {
                newArray2[idx]=newArray[k];
                idx++;
            }


        }
        System.out.println(Arrays.toString(newArray2));
        //2.way
        List<Integer> list1=new ArrayList<>();
        for (int w:newArray2){
            list1.add(w);
        }
        System.out.println(list1);
        System.out.println("Please enter the directory of the value you want to remove");
        int removeIdx=input.nextInt();
        list1.remove(removeIdx);
        System.out.println(list1);
    }
}
