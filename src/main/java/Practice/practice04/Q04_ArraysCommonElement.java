package Practice.practice04;

import java.util.ArrayList;
import java.util.List;

public class Q04_ArraysCommonElement {
    /*
    write the code that prints the elements common to two elements.
    Input: {John, brad, angel, sofia, emily} input 2 {sofia, brad, grace, emily}
    Output: [brad,sofia, emily]
     */
    public static void main(String[] args) {
        String arr[]={"John","brad", "angel", "sofia", "emily"};
        String brr[]={"sofia", "brad", "grace", "emily"};
        List list=new ArrayList();

        for (String w:arr){
            for (String u:brr){
                if (w.equalsIgnoreCase(u)){
                    list.add(w);
                }
            }
        }
        System.out.println("Common elements : "+ list);
    }
}
