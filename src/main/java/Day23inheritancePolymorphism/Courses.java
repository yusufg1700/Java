package Day23inheritancePolymorphism;

public class Courses {
    public void liveSessions(){
        System.out.println("Course are live");
    }
    public Courses(){
        System.out.println("Constructor A");
    }

    public Courses(String s){
        System.out.println("Consturtor B");
    }
}
