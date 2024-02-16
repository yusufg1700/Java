package PracticeEveryday.Day3WhileLoop;

public class SumOfDigitNumber {
    public static void main(String[] args) {
        int digit=6789345;
        int leap=0;
        int total=0;

        while (digit!=0){
            leap= digit%10;
            digit=digit/10;
            total=leap+total;
        }
        System.out.println(total);
    }
}
