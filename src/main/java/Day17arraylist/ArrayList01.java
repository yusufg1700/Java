package Day17arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {
    public static void main(String[] args) {
       /* List<String> names = new ArrayList<>();
        names.add("Tom");
        names.add("tomas");
        names.add("tacettin");
        names.add("süleyman");
        System.out.println(names);

        List<String> cities = new ArrayList<>();
        cities.add("tomas");
        cities.add("tacettin");
        cities.add("süleyman");



        names.removeAll(cities);// if u use removeAll() method, only first list will  change.
        System.out.println(names);

        List<String> myNames = new ArrayList<>();
        myNames.add("Tom");
        myNames.add("tomas");
        myNames.add("tacettin");

        boolean result1= names.containsAll(myNames);
        System.out.println(result1);

        List<String> a= new ArrayList<>();
        a.add("Shoes");
        a.add("TV");
        a.add("Radio");
        a.add("Laptop");
        a.add("Shoes");
        a.add("Book");
        a.add("Shoes");

        //remove the first appearence of shoes element in a list
        a.remove("Shoes");
        System.out.println(a);

        //remove all shoes element in a list
        List<String> remove=new ArrayList<>();
        remove.add("Shoes");

        a.removeAll(remove);
        System.out.println(a);*/





        // example 3: create a salary list if salary less than 10000 icrease %20 if salary more than 20000 increase %10
        List<Double> salary =new ArrayList<>();
        salary.add(12345.00);
        salary.add(8674.50);
        salary.add(7897.10);
        salary.add(9500.50);
        salary.add(20500.00);
        for (Double w: salary){
            if (w<10000){
                salary.set(salary.indexOf(w),w*1.2);
            }else {
                salary.set(salary.indexOf(w),w*1.1);

            }
        }
        System.out.println(salary);

        //type code to check what two array equals each other.
        List<Character> m= new ArrayList<>();
        m.add('x');
        m.add('a');
        m.add('z');
        m.add('t');

        List<Character> n= new ArrayList<>();
        n.add('x');
        n.add('y');
        n.add('z');

        //1.way
        int counter=0;
        for (int i=0; i<m.size();i++){
            if (m.size()!=n.size()){
                counter++;
                System.out.println("listeler eşit değildir");
                break;
            }else if(m.get(i)!=n.get(i)){
                counter++;
                System.out.println("listeler eşit değildir");
                break;

            }
        }
        if (counter==0){
            System.out.println("listeler eşittir");
        }
        //2.way
        boolean eql= m.equals(n);
        if (eql){
            System.out.println("Both two list equals each other too");
        }else {
            System.out.println("Both two list don't equals each other too");
        }











    }
}
