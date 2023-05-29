package Day18arraylistpassbyvalue;

public class PassByValue01 {
    public static void main(String[] args) {
        int x=5;
        System.out.println(x);
        //static olan "main method" un içindeki herşey static olmalıdır.
        change(x);
        System.out.println(x);

        int price=100;
        int copy =indirim(price);
        /*
        orjinal değeri değiştirmek istersem
        price=indirim(price);
         */
        System.out.println(price);
        System.out.println(copy);
    }

    public static void change(int a){
        System.out.println(a*3);
    }
    // void dışındaki return type'larda method body'si içinde return keyword kullanılmalıdır.
    public static int indirim(int shirtPrice){
        return shirtPrice - 10;
    }
}
