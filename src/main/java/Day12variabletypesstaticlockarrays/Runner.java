package Day12variabletypesstaticlockarrays;

import org.w3c.dom.ls.LSOutput;

public class Runner {
    public static void main(String[] args) {

        // to access a non static variable you have to create object
        VariableTypes01  obj= new VariableTypes01();

        //actullyyou can access to static class members by using objects, it is not
        //recommended
        System.out.println(obj.name);
        // to accees a static variable no need to create object
        System.out.println( VariableTypes01.age);

        System.out.println( obj.add(3,5));//8)
        System.out.println(obj.mult(3,7));

    }

}
