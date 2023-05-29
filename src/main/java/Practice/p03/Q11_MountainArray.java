package Practice.p03;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Q11_MountainArray {
    /*
    write a code that checks if an array is a mountain array
     */
    public static void main(String[] args) {
        int[] arr = {-999, 1, 2, 5, 7, 9, 22, 8, 3, 1, -100};
        List<Integer> list = new ArrayList<>();

        for (int w : arr) {
            list.add(w);
        }
        System.out.println("list" + list);


        int max = arr[0];
        for (int w : arr) {
            if (w > max) {
                max = w;
            }
        }

        System.out.println("max=" + max);
        List<Integer> list1 = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == max) {
                    break;
            }
            list1.add(arr[i]);
        }
        System.out.println("list1=" + list1);


        List<Integer> list2 = new ArrayList<>();


        for (int i = 0; i < list.size(); i++) {
            if (i < list.indexOf(max)) {
                    continue;
            }
            list2.add(arr[i]);
        }
        System.out.println("list2" + list2);
        List<Integer> list1Copy=new ArrayList<>(list1);
        Collections.sort(list1Copy);
        System.out.println(list1Copy);

        List<Integer> list2Copy=new ArrayList<>(list2);
        System.out.println(list2Copy);
        Collections.sort(list2Copy);
        Collections.reverse(list2Copy);
        if (list1.equals(list1Copy)&&list2.equals(list2Copy)){
            System.out.println("Mountain Array");
        }else {
            System.out.println("Not Mountain array");
        }
    }
}
