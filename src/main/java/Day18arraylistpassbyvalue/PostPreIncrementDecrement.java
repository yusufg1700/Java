package Day18arraylistpassbyvalue;

public class PostPreIncrementDecrement {
    public static void main(String[] args) {
        int a=5;
        //post increment
        int b =a++;
        System.out.println(b);
        System.out.println(a);

        int c=12;
        int d= ++c;
        System.out.println(d);
        System.out.println(c);

        //pre increment
        int h=30;
        int i=--h;
        System.out.println(i);
        System.out.println(h);

    }

}
