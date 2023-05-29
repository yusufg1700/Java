package Day24Statickeywordencapsulation;

public class Student {
    //Encapsulation:Data hiding.
    //why:datayı dış etkenlerden korumak için
    //how to hide:Access Modifier'ini "private" yaparak gizlerim.
    //after hide the data. başka classlardan okumak istersem ne yapmalıyım.
    //get method'lar oluşturarak gizlediğimiz dataları okunabilir hale getirebiliriz.
    //Datayı gizledikten sonra başka class'lardan değiştirmek istersen ne yaparsın?
    //set methodlar oluşturarak gizlediğimiz dataları değiştirebiliriz

    public String stdName="tom hanks";
    private String stdId="TH202201";
    private double gpa=3.8;
    private boolean retired=false;

    public String getStdId() {
        return stdId;
    }

    public double getGpa() {
        return gpa;
    }

    public boolean isRetired() {
        return retired;
    }



    public void setStdId(String stdId) {
        this.stdId = stdId;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setRetired(boolean retired) {
        this.retired = retired;
    }
}
