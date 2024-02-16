package PracticeEveryday.Day1Boolean;

public class PositiveNegativeNumbers {
    /*
    -we check if the variable "number" is positive
    if it is we print "The number is Positive"
    if it is not we print "The number is negative "
     */

    public static void main(String[] args) {
        int number=-5;
        boolean isPositive= number > 0;
        if (isPositive){
            System.out.println("The number is Positive");
        }else {
            System.out.println("The number is negative ");
        }

        int number2=7;
        String numberType=(number2%2==0) ? "even":"odd";
        System.out.println("number2 is "+numberType);
    }
}
