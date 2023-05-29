package Day12variabletypesstaticlockarrays;

public class VariableTypes01 {

    public String name="Tom Hanks"; //name is non static or object or instance variable
    public static int age=13;// age is static or class variable

    //local variable
    //note: ıf the return type is diffirent from void
    //      you have to use "return" keyword inside the method
    //if you create a variable inside a method, it is called "local variable"
    //when you create a method return keyword use the return keyword in the last line
    // you can not type any code after return keyword
    // local variables can be used just inside the method
    //      if you try to use it outside the method it will give error

    public int add(int a, int b){
        int x=12;
        System.out.println(name);
        return  a+b;
    }
    //create a method to do multiplication
    public int mult(int x,int y){
        String s="java";//local variable
        //local variable ; i)when you create a local variable it is mandatory to assign a value
        // ıf you try to use a local variable without assigning a value it complains.
        return x*y;
    }

}

