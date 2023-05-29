package Day21AccesModifiersInheritance;

import Day22inheritancepolymorphism.Cat;

public class catRunner {
    /*
    1)Java'da object oluştururken Constructor'lar parent'dan Child'a doğru çalıştırılır.
    2)Java en üst parent consturtor'a çıkabilmek için super() kodunu kullanır.
    3)super() kodunu her constructor'ın ilk satırında gizli olarak bulunur.
    4)super() kodunu gorunur şekilde de yazarsanız sakın ilk satır dısında bir satıra koymayınız, hata verir
    5)super() kodunu gorunur sekilde de yazabilirsiniz.
    6)super() kodu parent class'dan constuctor cagırmaya yarar.
     */
    public static void main(String[] args) {
        Cat cat1=new Cat();//Animal çıktısı göreceğiz>mammal çıktısı göreceğiz>cat çıktısı göreceğiz
    }
}
