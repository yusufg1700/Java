package Day14ArraysForEachLoop;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays01 {
    //you should use primitive data type
    public static void main(String[] args) {
        String str[]=new String[4];
        str[0]="Java";
        str[1]="did";
        str[2]="suprise you";
        System.out.println(str);
        //create array and print "tom" and before tom names
        String arr[]={"Jane","Mark","Christopher","Tom","Ali","Rojda"};
        for (String w:arr){
            System.out.println(w+" ");
            if (w.equals("Tom")){
                break;
            }
            System.out.println();
        }
        // create a string array if the array has Tom and Jane this name extract from array
        String brr[]={"Jane","Mark","Christopher","Tom","Ali","Rojda"};
        for (String w:brr){
            if (w.equals("Jane") || w.equals("Tom")){
                continue;
            }
            System.out.print(w + " ");

        }
        System.out.println();
        //example 3: create a new array with user. this array is a name list in a class

        Scanner input=new Scanner(System.in);
        System.out.println("How many student names will you enter");
        int numOfStd=input.nextInt();

        String names[]=new  String[numOfStd];

        for (int i=1; i<=numOfStd; i++){
            System.out.println("please enter"+i+". name");

            names[i-1]=input.next();

            System.out.println("if you wanna end the enter name please tap to Q button");
            char exit = input.next().charAt(0);
            if (exit=='Q' || exit=='q'){
                break;
            }
        }
        System.out.println(Arrays.toString(names));



    }
}
