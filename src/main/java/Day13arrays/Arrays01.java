package Day13arrays;

import java.util.Arrays;

public class Arrays01 {

    /*
    when we create byte short int float double char boolean container we can store just a single value in them
    sometimes we need to store multiple values in a single character
    to be able store multiple value java created a new stucture,its name is "array"
    note <arrays is to store multiple data in single data type.
    you can not store different data types in an array.

     */
    public static void main(String[] args) {
        // how to create array

        String names[] = new String[5];
        System.out.println(Arrays.toString(names)); // toString is a method. its prints the array
        names[1] = "tom";
        names[4] = "Mark";
        names[0] = "jim";
        names[2] = "Mary";
        names[3] = "Susan";

        System.out.println(Arrays.toString(names));
        // how to print a spesific element in an array
        System.out.println(names[3]);

        //create an integer array and print the sum of first and the last elements on the console
        int ages[] = new int[7];
        ages[0] = 1;
        ages[1] = 2;
        ages[2] = 3;
        ages[3] = 12;
        ages[4] = 13;
        ages[5] = 14;
        ages[6] = 15;
        System.out.println(Arrays.toString(ages));
        System.out.println(ages[0] + ages[ages.length - 1]);
        // example 2: create a double array and find the sum of all element

        double sumNum[] = new double[4];
        sumNum[0] = 1.2;
        sumNum[1] = 2.3;
        sumNum[2] = 5.0;
        sumNum[3] = 4.51;
        System.out.println(Arrays.toString(sumNum));
        double sum = 0;

        for (int i = 0; i < sumNum.length; i++) {
            sum = sumNum[i] + sum;
        }
        System.out.println(sum);

        //2.way we will solve the task by using for each-loop
        //for-each loop can be used with arrays and collections

        double sum2 = 0.00;


        for (double w : sumNum) {
            sum2 = sum2 + w;
        }
        System.out.println(sum2);

        // create a string array and print the elements in alphabetical order on the console in different lines
        String city[] = new String[5];
        city[0] = "new york";
        city[1] = "washington";
        city[2] = "colarado";
        city[3] = "transilvanya";
        city[4] = "berlin";
        System.out.println(Arrays.toString(city));
        // how to put elements in alphabeic order

        Arrays.sort(city);
        System.out.println(Arrays.toString(city));

        for (String w : city) {
            System.out.println(w);
        }
        // create a string array and print the elements whose lenght is less than 5
        String name3[] = {"tom", "ali", "huseyin", "memduh", "sellim"};
        System.out.println(Arrays.toString(name3));

        for (String w : name3) {
            if (w.length() < 5) {
                System.out.println(w);
            }

            for (String z : name3) {
                if (z.equals("sellim")) {
                    break;
                }
                System.out.println(z);

            }


        }

        //to get the numbur of characters from a string use "length()"
        //to get the number of elements from an array use "length"

        //example 5: create a string array and  print the elements diffirent from tom
        String employees[]={"ali","Thomas","Mark", "jackson","Tom","Martin"};
            for (String w : employees){
                if (w.equals("Tom")){
                    continue;
                }
                System.out.println(w);
            }
        }
    }



