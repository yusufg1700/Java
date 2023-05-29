package Practice.p03;

public class Q10_MultiArraySameIndexSum {
    /*
    arr1[]={{1,2},{3,4,5},{6}}
    arr2[]={{7,8,9},{10,11},{12}}
     */
    public static void main(String[] args) {
        int arr1[][]={{1,2},{3,4,5},{6}};
        int arr2[][]={{7,8,9},{10,11},{12}};
        int limit=0;
        int sum=0;

        for (int i=0; i<arr1.length; i++){
            limit=arr1[i].length;

            if (arr1[i].length>arr2[i].length) {
                limit = arr2[i].length;
            }
            for (int j=0; j<limit;j++){
                sum= arr1[i][j]+arr2[i][j];
                System.out.println("arr["+i+"]["+j+"]="+sum );
            }
        }



    }
}
