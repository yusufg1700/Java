package Day07StringManipulations;

import java.util.Scanner;

public class day07free_exercise {
    public static void main(String[] args) {
        String chex="java is very beatiful";
        char res1=chex.charAt(6);

        System.out.println(res1);

        //find first and last character with charAt() method
        int res2=chex.length();
        System.out.println("the first character is : "+ chex.charAt(0));
        System.out.println("the last character is :"+chex.charAt(res2-1));
        for (int i=0; i<=chex.length()-1;i++){
            if(i%2!=0){
                System.out.println("charactee is :"+chex.charAt(i));
            }
        }
        //Let's see an example in which we are counting frequency of a character in the given string.

        Scanner input=new Scanner(System.in);
       /* System.out.println("please enter a new sentence");
        String sentencefreq=input.nextLine();


        int a=0;
        for (int i=0;i<=sentencefreq.length()-1; i++){
            if (sentencefreq.charAt(i)=='a'){
                a=a+1;
            }

        }
        System.out.println(a);*/
        System.out.println("please enter a semi sentence");
        String semiSent1=input.nextLine();
        System.out.println("please enter second semi sentence");
        String semisent2=input.nextLine();
        System.out.println("please enter third semi sentence");
        String semisent3=input.nextLine();

        semiSent1=semiSent1.concat(semisent2).concat(semisent3);
        System.out.println(semiSent1);













    }
}
