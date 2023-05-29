package Day14ArraysForEachLoop;

import java.util.Arrays;
import java.util.Comparator;

public class Arrays02 {
    public static void main(String[] args) {



        int arr[]={0,2,3,0,12,0};
        int brr[]={0,0,0,0,0,0};
        int count1=0;
        int count2=0;


        for (int i=0;i<arr.length-1;i++){
            if (arr[i]!=0){
                brr[count2]=arr[i];
                count2++;

            }
        }
        System.out.println(Arrays.toString(brr));
        System.out.println();


       /* int crr[]={0,2,3,0,12,0};
        System.out.println("please enter a number and we will check this number");
        Scanner input=new Scanner(System.in);
        int valueChk=input.nextInt();
        for (int i=0;i<crr.length-1;i++){
            if (crr[i]==valueChk){
                System.out.println("we checked a number and this number is "+ valueChk+" ." );
                break;
            }
            if (crr[i]!=valueChk) {
                System.out.println("we checked a number and this number has not ");
            }
        }*/
        String drr[]={"en","uzun","kelimeyi","bulunuz",};
        int count=0;
        int count3=0;
        for (int i=0;i<drr.length-1;i++){
            if (drr[i].length()>count){
                count=drr[i].length();
                count3++;
            }

        }
        System.out.println(drr[count3]);

        //other method
        String othMthd="Java is easyp bu youllllllll have to work hardllllllllll";
        othMthd.replaceAll("\\p{Punct}", "");
        System.out.println(othMthd);


        System.out.println(othMthd);
        String[] words=othMthd.split("\\p{Space}");
        System.out.println(Arrays.toString(words));
        Arrays.sort(words, Comparator.comparingInt(String::length));
        System.out.println(Arrays.toString(words));
        System.out.println(words[words.length-1]);
       /* int count4=0;
        int j=0;

        for (int i=0;i<words.length;i++){
            if (words[i].length()>count4){
                count4= words[i].length();
                j=i;
            }

        }
        System.out.println(words[j]);*/





    }
}
