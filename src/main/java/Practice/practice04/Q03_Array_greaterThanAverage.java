package Practice.practice04;

public class Q03_Array_greaterThanAverage {
    /*
    write the code that prints the elements greater than the mean of the elements
     */
    public static void main(String[] args) {
        int[] arr={5,9,15,1,0,11,3};

        int sum=0;
        for (int w:arr){
            sum+=w;
        }

        double average=sum/arr.length;
        System.out.println(average);

        for (int w:arr){
            if (w>average){
                System.out.println(w+" ");

            }
        }

    }

}
