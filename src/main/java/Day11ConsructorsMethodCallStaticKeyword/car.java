package Day11ConsructorsMethodCallStaticKeyword;

public class car {
    /*
    whem you create a class you will use it to create an object most probably, java knows it
    because of that when you create a class java puts "consturtor" in it automatically, its name is "defauilt constructor

    ıf you create your own constructor, java delete the "default constructor"

     */
    //how to create consturcor
    //Constructor name must match with the class name
    //what is the difference between "constructors" and "methods"
    // constructors don't have return type but methods have
    //constructor name must match with the class name but method name can be any name
    //constructors are used to create object but methods are used to create same actions
    // if any class you want to use is in the same packet no need to import
    //but if the class is ,n the different package you have you import it
    String make="Toyota";
    String model="Prius";
    int year=2000;
    int price=20000;


    public car(){

        System.out.println("car sontructor 1");

    }

    public car(String make,String model,int year,int price){
        this.make=make;//this class
        this.model=model;
        this.year=year;
        this.price=price;
    }

    public car(String make,String model, int year){
        this.make=make;
        this.model=model;
        this.year=year;


    }

}
