package Practice.practice05;

public class varArgsCalculator {

    public void   addition(int...a){
        int sum=0;
        for (int w:a){
            sum+=w;
        }
        System.out.println(sum);
    }

    public void extraction(int a, int b){

        System.out.println(a-b);
    }

    public void multiplication(int...a){
        int sum=1;
        for (int w:a){
            sum*=w;
        }
        System.out.println(sum);
    }
    public void division(double a, double b){
        double sum=1;
        if (b==0){
            System.out.println("b dont equal 0");
        }else {
            System.out.println(sum=a/b);
        }
        System.out.println(sum);
    }
}
