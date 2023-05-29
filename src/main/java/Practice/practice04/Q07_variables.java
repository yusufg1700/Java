package Practice.practice04;

public class Q07_variables {
    public static void main(String[] args) {
        int x=20;
        int y=15;
        System.out.println(x++ + ++y);
        System.out.println(x);
        System.out.println(y);


        int z=5;
        int result=++z + z++ + z++ + --z +z-- +z;
        System.out.println(result);
    }

}
