package Day16MultidimentionalarraysArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList01 {
    public static void main(String[] args) {
        /*Java ArrayList class uses a dynamic array for storing the elements. It is like an array, but there is no size limit.
        We can add or remove elements anytime.
        So, it is much more flexible than the traditional array
        Java ArrayList class can contain duplicate elements.
        Java ArrayList class maintains insertion order.
        Java ArrayList class is non synchronized.
        Java ArrayList allows random access because the array works on an index basis.
        In ArrayList, manipulation is a little bit slower than the LinkedList in Java because
    a lot of shifting needs to occur if any element is removed from the array list.
        We can not create an array list of the primitive types, such as int, float, char, etc.
    It is required to use the required wrapper class in such cases.
    ARRAYS ARE SUPER FAST. ARRAYS  USE LOW  MEMORY


         */

        //HOW TO CREATE ARRAYLİST
        //1.way
        ArrayList<Integer> ages=new ArrayList<Integer>();
        //2.way
        ArrayList<Integer> heights= new ArrayList<>();
        //3.way
        List<Integer> nums=new ArrayList<>();

        // How to print ArrayList
        System.out.println(nums);//[]
        //how to add data in ArrayList
        nums.add(21);// boolean return if value is true, new data add the arraylist. if value is false, new data don't add the arraylist.
        nums.add(18);
        nums.add(15);
        System.out.println(nums);
        nums.add(1,50);
        System.out.println(nums);
        List<Integer> prices = new ArrayList<Integer>();
        prices.add(25);
        prices.add(27);
        prices.add(28);



        nums.addAll(prices);
        System.out.println(nums);
        System.out.println(prices);

        nums.addAll(2,prices);
        System.out.println(nums);

        //How to find number of elements in ArrayList
        int numberOfElements=nums.size();
        System.out.println(numberOfElements);//8

        // how to select any element in arraylist
        // gets method gets any element in arrayList
        int el1=nums.get(3);
        System.out.println(el1);

        boolean empty1=nums.isEmpty();//false
        System.out.println(empty1);
        boolean empty2=ages.isEmpty();//true
        System.out.println(empty2);
        //How to change an element in ArrayList
        nums.set(3,200);
        System.out.println(nums);

        //Example 1 print screen after increase 11 all odd number in nums ArrayList
        //all integers unless otherwise stated is primitive data type for java
        //primitive data type is not element of ArrayList
        // if you convert to wrapper class from primitive data type. non primitive will have element's ArrayList dont index.
        for (int w: nums){
            if (w%2!=0){
                nums.set(nums.indexOf(w),w+11);
            }

        }
        System.out.println(nums);
        //if you put in remove() method, java understand this is index.
        Integer digit =200;
        nums.remove(digit);
        System.out.println(nums);








    }
}
