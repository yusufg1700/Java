package PracticeEveryday.Day3WhileLoop;

public class FactorialNumber {
    public static void main(String[] args) {
        int number=2;
        int loop;
        int factoriel=1;

        while (number<=5){

            factoriel=number*factoriel;
            number++;
        }
        System.out.println(factoriel);
    }
}
