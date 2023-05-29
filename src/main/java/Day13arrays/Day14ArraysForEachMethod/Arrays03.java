package Day13arrays.Day14ArraysForEachMethod;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays03 {
    public static void main(String[] args) {
        /*
        example 1: type code to check if a spesific element exist in an array or not
         */

       int exChArr[]={1,2,3,4,5,6};
        Scanner input=new Scanner(System.in);
        /*System.out.println("please enter a number ");
        int chkNum=input.nextInt();
        input.nextLine();
        int counter=0;
        System.out.println("Please enter a number for check to list");

        for (int i=0; i<exChArr.length-1;i++){
            if (exChArr[i]==chkNum){
                counter++;
            }

        }
        if (counter>0){
            System.out.println("There are "+counter+" "+ chkNum+ " number in the array ");
            }else {
            System.out.println("there are not "+chkNum+" number in the array");
                 }*/




        /*String chkStrArr[]={"Ali","Ahmet","Selim","Mahmut"};
        System.out.println("please enter a name");
        String strArr=input.nextLine();
        int counter2=0;

        for (String w:chkStrArr){
            if (w.equals(strArr)){
                counter2++;

            }
        }
        if (counter2>0){
            System.out.println("there is"+counter2+ " name in array");
        }else {
            System.out.println("no name");
        }*/

        String str[]={"Ali","Tom","Carl","Carl"};
        //1.way
        String name="Ali";
        int counter=0;
        for (String w:str){
            if (w.equals(name)){
                counter++;
            }
        }

        if (counter>0){
            System.out.println(name+ " exist in the array");
        }else {
            System.out.println("name doesnt exist in the array");
        }
        //2.way we will use binarySearch() method
        // if the element exist binarySearch() method returns the index of the element
        Arrays.sort(str);
       int idx= Arrays.binarySearch(str,"Carl");
        System.out.println(idx);








    }

}
