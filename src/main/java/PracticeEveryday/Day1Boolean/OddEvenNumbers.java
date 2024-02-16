package PracticeEveryday.Day1Boolean;

public class OddEvenNumbers {
    public static void main(String[] args) {
        int number=5;
        boolean isEven=(number%2==0);
        if (isEven){
            System.out.println("The number is even");
        }else {
            System.out.println("The number is Odd ");
        }
    }
}
