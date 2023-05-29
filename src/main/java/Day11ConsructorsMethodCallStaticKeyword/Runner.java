package Day11ConsructorsMethodCallStaticKeyword;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        // create an object car class
        car audi =new car();


        car bmw=new car("bmw","m5",2022,50000);
        System.out.println(bmw.make);
        car mercedes= new car("mercedes","c300",2023,60500);
        System.out.println( mercedes.year);
        System.out.println(mercedes.make);
        System.out.println(mercedes.model);

        car itcar=new car("rolls royce","cullinan",2023);
        System.out.println(itcar.model);
        System.out.println(itcar.make);
        System.out.println(itcar.year);


        Static01 obj1=new Static01();
        Static01 obj2=new Static01();
        Static01 obj3=new Static01();

        System.out.println(obj3.nonStaticCounter);
        System.out.println(obj3.staticCounter);



    }
}
