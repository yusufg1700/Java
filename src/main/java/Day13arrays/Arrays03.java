package Day13arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays03 {
    public static void main(String[] args) {

        //example1 : Let user to enter student names into the application
        // (create an array together with the user)

        Scanner input =new Scanner(System.in);



        //1.step: create an array
        System.out.println("enter the number of students you wnt to enter");
        int numOfStd=input.nextInt();
        String namess[]=new String[numOfStd];

        //2.step: ınsert the elements into the array
        for (int i=0; i<numOfStd; i++){
            System.out.println("enter the "+(i+1)+ ". student name");
            String stdName=input.next();
            if (!stdName.equalsIgnoreCase("q")){
                namess[i]=stdName;
            }else{
                break;
            }


        }
        System.out.println(Arrays.toString(namess));




    }
}
