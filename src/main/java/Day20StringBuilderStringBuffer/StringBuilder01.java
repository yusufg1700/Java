package Day20StringBuilderStringBuffer;

public class StringBuilder01 {

    /*
    1)String builder javada bir classtır.(for example array)
    2)String builder String oluşturmaya yarar.
    3)String class varken neden "String Builder"'a ihtiyaç duyarız?
    **Çünkü string class Immutable class'dır. fakat biz bazen mutable stringlere ihtiyaç duyarız.
    **Stringbuilder mutable string verir.

     */
    public static void main(String[] args) {
        /*
        //String faydaları
        * immutable classta var olan değer değiştirilemez. yeni variable yeni bir değerle oluşturulur. eski variable pointer yeni variable a yönlenidirilir.
        ** eğer bir variable hiç bir pointer tarafından gösterimiyorsa o variable "garbage collector tarafından silinir.
        ***

         */

        String str="Java";
        str ="Super Java";
        System.out.println(str);

        /*
        Mutable class larda var olan değer değiştirilebilie orjinal değer korunmaz.
        aynı değere sahip birden fazla string olduğunda java bir tane container oluşturur ve aynı değere sahip stringlerin bu containeri
        kullanmasını sağlar
        ancak bir variable değiştiğinde diğer variable etkilenme tehlikesi vardır.
        bundan dolayı java stringleri immutable yapmıştır.
        herhangi bir variable,2ın değerini değiştirebilmek için java bir yöntem geliştirmiş.

         */


        StringBuilder strb=new StringBuilder("Java");
        strb=new StringBuilder("Super Java");
        System.out.println(strb);

        //2.way
        StringBuilder strb2=new StringBuilder();
        strb2.append("java");
        System.out.println(strb2);

        strb2.append(" is easy");
        System.out.println(strb2);
        strb2.append(" 111").append("!!!");
        System.out.println(strb2);

        //String builder'da karakter sayısı nasıl bulunur.
        StringBuilder strb3=new StringBuilder();
        strb3.append("java");
        int numOfChar= strb3.length();
        System.out.println(numOfChar);

        int capacity= strb3.capacity();
        System.out.println(capacity);
        strb3.append("xxxxxxxxxxxxxxx");

        int capacity2= strb3.capacity();
        System.out.println(capacity2);

        strb3.setCharAt(3,'r');
        System.out.println(strb3);

        strb3.delete(4,19);
        System.out.println(strb3);

        strb3.deleteCharAt(2);
        System.out.println(strb3);

        strb3.reverse();
        System.out.println(strb3);

        //"mutable'da sadece orjinal değeri kullanmak yeterlidir.
        //immutableda orjinal değeri korumak yeterli değildir. atama yapmak gerekir.
        String abc="Java";
        abc= abc.replace("a","i"); //string builder olmadığından deüişmedi.
        System.out.println(abc);

        //toString metodu string builder'ı stringe cevirir.
        String xyx=strb3.toString();
        System.out.println(xyx);

        StringBuilder strb4=new StringBuilder(xyx);
        System.out.println(strb4);

        strb4.insert(3,"XXX");
        System.out.println(strb4);//rajXXX

        strb4.insert(3,"KLMNOPQRSTU",5,8);
        System.out.println(strb4);

        //compare to methodu
        //* tamamı ile aynı ise sonuç sıfır verir.
        //*a alfabetik sırada b den sonra gelirse pozitif olarak aradaki alfabetik sıralama farkını gösterir.
        //**a alfabetik sırada b den önce gelirse negatif olarak aradaki alfabetik sıralama farkını gösterir.
        StringBuilder a=new StringBuilder("Iava");
        StringBuilder b=new StringBuilder("Java");
        int result= a.compareTo(b);
        System.out.println(result);




    }

}
