package Day21AccesModifiersInheritance;


public class animalRunner {

    // Object class her class'ın parent'idir.
    //java'da Object class hariç her class'ın parent'i vardır.
    //private method ve variable child class'lar tarafından kullanılamaz.
    //protected method ve variable ve child classlar tarafından kullanılabilir.
    //protected method ve variable aynı package'deki child classlar tarafından kullanılabilir.
    //public method ve variable aynı package'deki child classlar tarafından kullanılabilir.
    // child class'lar tarafından kullanılabilir olmak inherit edilebilir demektir.

    /*
    inheritence tipleri
    1)multilevel Inheritence : java destekler
    2)hierarchical Interitance: bir parent için çoklu child, java bunu kabul eder.
    3)multiple Inheritance: bir child'a çoklu parent, java bunu desteklemez.
    4)single inheritance bir child class için bir parent class demektir. java bunu destekler.
     */
    public static void main(String[] args) {



        dog d1=new dog();
        d1.bark();
        d1.eat();
        d1.drink();

        animal a1=new animal();



    }
}
