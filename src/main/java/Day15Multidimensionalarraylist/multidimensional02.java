package Day15Multidimensionalarraylist;

public class multidimensional02 {
    public static void main(String[] args) {
        //example 2: print the elements which have "a" from a 2 dimensional string array {{"Learn","java","it"},{"is","easy"}}

        String arr[][]={{"Learn","java","it"},{"is","easy"}};

        for (String[] w:arr){
            for (String u:w){
                if (u.contains("a")){
                    System.out.print(u+" ");
                }
            }

        }

        // create an integer multidimensional array then find the sum of the elements
        int brr[][]= { {12,54},{3,2,7}, {21} };
        int sum=0;
            for (int[]w:brr){
                for (int u:w){
                    sum=sum+u;
                }
            }
        System.out.println(sum);




    }
}
