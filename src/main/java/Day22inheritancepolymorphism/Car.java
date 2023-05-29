package Day22inheritancepolymorphism;

public class Car extends Vehicle{
    /*
    Class oluşturduğunuzda java otomatik görünmez bir cosnstructor verir.
    java Classın bir kalıp olduğunu ve object oluşturmak için yaratıldığını ve object oluşturmak için constructorın il sart olduğunu bilir.
    constractor oluşturulursa default olan silinir.
    bir classta birden fazla constructor olabilir
     */

    public String color;
    int km;
    public Car(){

    }

    public Car(String color, int km){
        super("car");
        this.color=color;
        this.km=km;
        System.out.println("Car Constructor");

    }






}
