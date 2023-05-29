package Practice.practice04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q02_addAndRemoveList {
    /*add a numbur you get from user to a list
    remove a numbur you get from user to a list
     */
    public static void main(String[] args) {

        System.out.println("what action do you want to do");
        Scanner input =new Scanner(System.in);
        List<Integer> list=new ArrayList<>();
        while (true){
            System.out.println("type 'Add' for adding\n"+
                    "type 'update' for updating\n"+
                    "type 'remove' for removing\n"+
                    "type 'quit' for exit");
            String option=input.next();
            if (option.equalsIgnoreCase("add")){
                System.out.println("please enter what do you want to add");
                int numOfAdd=input.nextInt();
                list.add(numOfAdd);
            } else if (option.equalsIgnoreCase("update")) {
                System.out.println("please enter what do you want to update");
                int numOfUpdate=input.nextInt();
                System.out.println("please enter what do you want to number of update");
                int newNum=input.nextInt();
                list.set(list.indexOf(numOfUpdate),newNum);
            } else if (option.equalsIgnoreCase("delete")) {
                System.out.println("please enter what do you want to remove number");
                int removeNum=input.nextInt();
                list.remove((Integer) removeNum);
            } else if (option.equalsIgnoreCase("quit")) {
                break;

            }else {
                System.out.println("please enter a valid command");
            }
            System.out.println(list);
        }
    }
}
