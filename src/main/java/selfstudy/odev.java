package selfstudy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class odev {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        List<Integer> cl = new ArrayList<>();
        char yesno;
        do {


            System.out.println("Enter the ınteger");

            cl.add(input.nextInt());
            System.out.println("Do you want to add a new integer");
            yesno=input.next().charAt(0);




        } while (yesno=='y'||yesno=='Y');
        System.out.println(cl);






    }
}
