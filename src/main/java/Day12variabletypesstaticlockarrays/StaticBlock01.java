package Day12variabletypesstaticlockarrays;


            /*
           1) if you dont assign any value for static and non static variables, java assign "default values to them
            but java doesnt not assign default value for local variables.
           2) default values are 0 for numeric data types, it is null for string, it is false for boolean
           when we create a variable inside the main mathod we dont use static keywords because java knows everything inside the main static

            */
public class StaticBlock01 {

    /*
    1) java class loader makes the classes ready to use
    2)when the classes make ready, class members are loaded according to some order
    3)sometimes we need something to be loaded before main method, for this scenario we use "static block
        the codes inside the static block is executed before everything in the class, even before main method
    4) rule: static strutures can work just with static class members
       dont put non static class members in to static methods, it will give error.
    5) static block can be used just with static variables, because of the rule in 4th step
    6) static block is used to initialize(assigning
     */
    public static int age =13;

    public static double pi;

    public static void main(String[] args) {
        System.out.println("this is main mathod");

     String name= "alican";

    }
    static {
        System.out.println("this is static block");
        pi=3.14;
    }
    static {
        System.out.println("this is static block two");
    }


}
