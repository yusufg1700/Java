package Day11ConsructorsMethodCallStaticKeyword;

public class Static01 {
   /*
   1)"static" class members are common for all objects created from the class
   2)when you do any update on "static" class members, all objects will see the updates on it
   3) if you want every object informed about every update on a class member make it static
    */
    //how to create static variable
    //note: to  make a variable "static", put "static" keyword between "access modifier" and "data type
   public static int staticCounter=0;
    public int nonStaticCounter=0; // normally


    public Static01(){
        staticCounter++;
        nonStaticCounter++;
    }
}
