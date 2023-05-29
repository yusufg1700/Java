package Day18arraylistpassbyvalue;

public class MethodOverloading01 {
    public static void main(String[] args) {
        add(3,5);// java parametreleri kontrol eder, data type kontrol eder.
        add(3,5.0);// tam eşleşme 3. metodla tam uyumlu.
        //add(3.0,4.0); çalışmaz.

        /*
        method overloading nasıl yapılır.
        1) method isimleri aynı olmalı
        2)method parametreleri farklı olmalı
         *parametre sayıları değiştirilebilir.
         **parametre typler değiştirilebilir.
         ***parametre yerleri değiştirilebilir.ancak data tipleri farklı ise
         mehod ismi ve parametreler method signature dur.
         */


    }
    public static void add(int a,int b){// bu işlemi tercih eder çünkü parametreler ve data type tam uyumludur.
        System.out.println(a+b);
    }
    public static void add(int a,int b,int c){
        System.out.println(a+b+c);
    }
    public static void add(int a,double b) {//auto wedining olduğundan bu işlemi tercih etmez
        System.out.println(a + b);
    }
    public static void add(double a,int b) {//auto wedining olduğundan bu işlemi tercih etmez.
        System.out.println(a + b);
    }
}
