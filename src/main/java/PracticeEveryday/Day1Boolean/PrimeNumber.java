package PracticeEveryday.Day1Boolean;

public class PrimeNumber {
    public static void main(String[] args) {
        int number=347;
        boolean isPrime=true;
        if (number<=1){
            isPrime=false;
        }else {
            for (int i=2; i<=Math.sqrt(number);i++){
                isPrime=false;
                break;
            }
        }
        System.out.println("Is "+number+" a prime number? "+isPrime);
    }

}
