package Day17arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList02 {
    public static void main(String[] args) {
        // type a code how to type without repetition.

        List<Integer> orgList = new ArrayList();
        orgList.add(2);
        orgList.add(3);
        orgList.add(2);
        orgList.add(2);
        orgList.add(5);
        System.out.println(orgList);

        List<Integer> newList = new ArrayList<>();

        for (Integer w : orgList) {
            if (!newList.contains(w)) {
                newList.add(w);
            }
        }
        System.out.println(newList);

        // get a letter from user and then if there is the letter in your list, you write "found" instead of the letter you received from the user.

        Scanner input = new Scanner(System.in);
        String letter ="";
        List<String> aList = new ArrayList<>();
        aList.add("A");
        aList.add("K");
        aList.add("R");
        aList.add("S");
        do {


            System.out.println("please enter a letter");
            letter = input.next().substring(0, 1);





            if (aList.contains(letter)) {
                aList.set(aList.indexOf(letter), "bulundu");
            } else if (!letter.equals("Q")){
                aList.add(letter);
            }
        } while (!letter.equals("Q"));
            System.out.println(aList);








    }
}
