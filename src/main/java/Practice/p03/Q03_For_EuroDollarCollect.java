package Practice.p03;

import java.util.Arrays;

public class Q03_For_EuroDollarCollect {
    /*
    Sum the euro and dollar values given in a single string separately
     */

    public static void main(String[] args) {
        String str="$1 $12 €34 €56 $45 €75";
        String arr[]= str.split(" ");
        System.out.println(Arrays.toString(arr));

        int dollar=0;
        int euro=0;
        for (String w:arr){
            if (w.contains("$")){

                dollar+=Integer.parseInt( w.replace("$",""));
            }else {
                euro+=Integer.parseInt( w.replace("€",""));
            }

        }
        System.out.println("dollar="+ dollar);
        System.out.println("euro="+euro);


    }

}
