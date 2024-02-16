package PracticeEveryday.Day3WhileLoop;

public class ReserveNumber {

    public static void main(String[] args) {
        int digit = 12345;

        while (digit != 0) {
            int reversedDigit = digit % 10;
            digit=digit/10;
            System.out.print(reversedDigit);
        }
    }
}
