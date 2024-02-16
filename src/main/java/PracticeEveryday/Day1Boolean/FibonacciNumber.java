package PracticeEveryday.Day1Boolean;

public class FibonacciNumber {
    public static boolean isFibonacci(int number){
        int a=0;
        int b=1;
        while (a<number){
            int temp = b;
            System.out.println("temp= "+temp);
            System.out.println(("b="+b));
            b = a + b;
            System.out.println("b="+b);
            a = temp;
            System.out.println("a="+a);
        }
        return a==number;

    }
    static int num=13;

    public static void main(String[] args) {
        System.out.println(num +" is fibonacci number " + isFibonacci(num));
    }
}
