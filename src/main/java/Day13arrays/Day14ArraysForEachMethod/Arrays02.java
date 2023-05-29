package Day13arrays.Day14ArraysForEachMethod;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Arrays02 {
    public static void main(String[] args) {

        // example 01: a date will be given .09/20/2022 is given, print the date like "Month :09 day:20 year:2022
        String date="09/20/2022";
        String dateArray[]= date.split("/");
        System.out.println(Arrays.toString(dateArray));
        //split method returns arrays
        System.out.println("Month :"+ dateArray[0]);
        System.out.println("Day :"+dateArray[1]);
        System.out.println("Year :"+dateArray[2]);



        //example 2: get string from user and type code to find the number of words in the string
        //          "I like to move it, move it" ==> 7

        String issue="I like to move it, move it";
        int count=0;
        String issueArray[]=issue.split(" ");
        for (String w:issueArray){
            if (w!="null"){
                count++;
            }
        }
        System.out.println(count);
        System.out.println(Arrays.toString(issueArray));

        /*
        example 3:count the number of words start with "a" in the String
         */
        Scanner input=new Scanner(System.in);
        System.out.println("please enter a sentence");
        String str=input.nextLine();
        String strArray[]=str.split(" ");

        int counter=0;
        for (String w:strArray){
            if (w.startsWith("a")||w.startsWith("A")){
                counter++;
            }

        }System.out.println(counter+ " words start with a");

        //example4 :type code to find the longest word in the sentence
        System.out.println("================================================================");
        System.out.println("please enter a new sentence");
        String longestStc=input.nextLine();
        String arrstc[]=longestStc.split(" ");

        Arrays.sort(arrstc, Comparator.comparingInt(String::length));

        /*for (int i=0; i<arrstc.length-1; i++){
            if (arrstc[i].length()>arrstc[i+1].length()){
                System.out.println(arrstc[i]);
            }else {
                System.out.println(arrstc[i+1]);
            }*/
        System.out.println(arrstc[arrstc.length-1]);

        }


























    }

