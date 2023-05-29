package Day23inheritancePolymorphism;

public class Cat extends Mammal{

    public void meow(){
        System.out.println("Cat meow");
    }

    @Override //@override annotation kullanarak javanın yaptığımız override işlemini kontrol etmesini sağlarız.
    public void eat() {
        System.out.println("Cats eat");
    }

    @Override
    public int add(int a, int b) {
        return a+b+1;
    }

    @Override
    public Integer multiply(int a, int b) {
        return a*b+1;
    }

    @Override
    public Animal create() {
        return new Mammal();
    }


/*
    1)override yaparken "method'un body"si değiştirilir.
    2)override yaparken asla method signature (isim ve parametre) değiştirilemez.
    3)Overriide yaparken "inheritance ilişkisi olmak zorundadır.
     */
}
