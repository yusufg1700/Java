package Day22inheritancepolymorphism;

public class HondaAccord extends Honda{

    public int price;
    public int year;

    public String make;
    public String model;
    public HondaAccord(){

    }
    public HondaAccord(int price){
        this.price=price;

    }

    public HondaAccord(int price, int year){
        this.price=price;
        this.year=year;
        System.out.println("Honda Accord Constructor");

    }
    public HondaAccord(int price, int year, String Make, String Model){
        this.price=price;
        this.year=year;
        this.make=make;
        this.model=model;

    }

}
