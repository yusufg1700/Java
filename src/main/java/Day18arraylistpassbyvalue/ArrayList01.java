package Day18arraylistpassbyvalue;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {
    public static void main(String[] args) {
        /*example 1: bir integer arraylistteki 7 hariç tüm elemanları 2 atırınız.

         */
        List<Integer> ages= new ArrayList<>();
        ages.add(12);
        ages.add(7);
        ages.add(21);
        ages.add(78);
        ages.add(9);
        for (Integer w: ages){
            if (w==7){
                continue;
            }
            //w= w+2; listler bu yöntemle update edilemezler.
            ages.set(ages.indexOf(w), w+2);
        }
        System.out.println(ages);
        //example 2: size verilen arraylistte 8 ve 8den önceki tüm elemanları iki katına çıkarınız.
        List<Integer> nums=new ArrayList<>();
        nums.add(12);
        nums.add(7);
        nums.add(21);
        nums.add(78);
        nums.add(8);

        for (Integer w: nums){
            if (w==8){
                break;
            }
            nums.set(nums.indexOf(w),w*2);
        }
        System.out.println(nums);
    }
}
