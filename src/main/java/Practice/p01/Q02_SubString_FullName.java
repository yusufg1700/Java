package Practice.p01;

import java.util.Scanner;

public class Q02_SubString_FullName {
    public static void main(String[] args) {
    /*
    get fullname from user and then divide by name and second name
     */
        Scanner input =new Scanner(System.in);
        System.out.println("Please enter full name");

        String fullName=input.nextLine();
        String name = fullName.substring(0,fullName.indexOf(" "));
        String secondName= fullName.substring(fullName.indexOf(" ")+1);

        System.out.println(name);
        System.out.println(secondName);
    }
}
