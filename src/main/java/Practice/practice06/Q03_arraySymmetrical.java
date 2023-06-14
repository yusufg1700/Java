package Practice.practice06;

public class Q03_arraySymmetrical {
    /*
    write a code that checks if an array is symmetric
     */
    public static void main(String[] args) {

        int[] arr={1,2,3,2,1};

        System.out.println("is array symmetric :"+symmetric(arr));

    }
    public static boolean symmetric(int[] arr){

        boolean result=true;
        for (int i=0; i<arr[arr.length-1]; i++){
            if (arr[i]!=arr.length-1-i){
                result=false;
                break;
            }
        }
        return result;
    }
}

