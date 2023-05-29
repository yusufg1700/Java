package Day24Statickeywordencapsulation;

public class CarRunner {
    public static void main(String[] args) {
        Car car1=new Car();
        Car car2=new Car();
        Car car3=new Car();
        Car car4=new Car();


        //Static variable'lara objeleri kullanarak ulaşmak mümkün ama tavsiye edilmez.
        System.out.println(car1.counter);
        //Static variable'lara class ismi kullanılarak ulaşımalıdır.
        System.out.println(Car.counter);
        System.out.println(car1.price);
    }
}

