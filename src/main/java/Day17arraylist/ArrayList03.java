package Day17arraylist;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

public class ArrayList03 {
    public static void main(String[] args) {
        //find the closest one of the elements in a list
        int c=Integer.MAX_VALUE;

        List<Integer> clList=new ArrayList<>();
        clList.add(12);
        clList.add(15);
        clList.add(19);
        clList.add(30);
        clList.add(21);
        Collections.sort(clList);

        for (int i=1; i<clList.size(); i++){
            c=Math.min(c,clList.get(i)-clList.get(i-1));



        }
        System.out.println(c);

    }
}
