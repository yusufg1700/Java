package Day24Statickeywordencapsulation;

public class StudentRunner {
    public static void main(String[] args) {
        Student std1=new Student();
        System.out.println(std1.getStdId());
        System.out.println(std1.getGpa());
        System.out.println(std1.isRetired());

        std1.setStdId("AB");
        System.out.println(std1.getStdId());

        Student std2=new Student();
        System.out.println(std2.getStdId());
    }
}
