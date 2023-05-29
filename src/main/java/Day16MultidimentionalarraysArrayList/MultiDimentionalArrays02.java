package Day16MultidimentionalarraysArrayList;

public class MultiDimentionalArrays02 {
    public static void main(String[] args) {


        //type a code what get max and min values to collect in array
        int arr[][] = {{7, 8, 9}, {1, 2, 3}, {6, 7, 8}};

        int max = arr[0][0];
        int min = arr[0][0];

        for (int[] w : arr) {
            for (int k : w) {
                max = Math.max(max,k);
                min = Math.min(min,k);

            }

        }
        System.out.println(max);
    }




}
