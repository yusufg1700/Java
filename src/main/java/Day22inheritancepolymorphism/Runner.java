package Day22inheritancepolymorphism;

import java.util.SortedMap;

public class Runner {
    public static void main(String[] args) {

        //Inheritance'da variable'lar seçilirken java object'in data type'ina bakar.
        //oncelikli istediğiniz variable'i object'in data type'i olan class'da arar
        Cat cat1=new Cat();
        System.out.println( cat1.a);
        System.out.println(cat1.b);
        System.out.println(cat1.c);
        Mammal cat2=new Cat();
        System.out.println(cat2.a);
        Animal cat3=new Cat();
        System.out.println( cat3.a);

        //Object oluştururken Object'in Data type'ı Child Class'lardan seçilemez.

        //Inheritance'da variable seçilirken Java COnstructor'a bakar
        //Oncelikle istediğiniz Method'u Constructor'ı kullanılan Class'dan alır.
        // o class'ta bulamazsa parent classa bakar
        //hiçbir class'ta bulamazsa hata verir.
        Cat cat4=new Cat();
        cat4.drink();
        cat4.eat();

        Mammal cat5=new Mammal();
        cat5.eat();

        Animal cat6=new Animal();
        cat6.eat();







    }
}
