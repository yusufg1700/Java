package Practice.p03;

public class Q6_ArraysBelirliToplamiVerenIkililer {
    /*
    toplamları, verilen bir sayıya eşit olan Array element çiftlerini yazdıran bir method oluşturunuz.
    for example{4,6,5,-10,8,5,20}===>10
    4+6=10
    5+5=10
    -10+20=10
     */
    public static void main(String[] args) {

    }

    public static void findCouple(int[] arr,int number){
        for (int i=0; i<arr.length; i++){
            for (int j=1;j<arr.length;j++){
                if (arr[i]+arr[j]==number){
                    System.out.println(number);
                }
            }

        }
    }
}
