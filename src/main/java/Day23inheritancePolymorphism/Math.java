package Day23inheritancePolymorphism;

public class Math extends Courses{
    public void practice(){
        System.out.println("Solve questions");
    }

    public Math(){
        super("x");
        System.out.println("Constructor 1");

    }

    public Math(int a){
        this();//this olmazsa super() kullanılır.
        System.out.println("Constructor 2");
    }
}
