package Day18arraylistpassbyvalue;

public class Varargs01 {
    public static void main(String[] args) {
        int x=12;
        int y=13;
       /*
       farklı sayılardaki parametrelerle çalışılabilen bir metod oluşturmak isterseniz "varargs" kullanmalısınız.
       "varargs" arka tarafta "array" kullanır, bu yüzden "varargs" larla çalışırken "array" lerle çalışıyormuş gibi davranabiliriz.
       varargs oluşturmak için <data type>....<varargs ismi>
        */
        //System.out.println(vaule);
       // int result1=add(2,3,4);
       // System.out.println(result1);

    }
    //iki sayının toplamını return eden bir metod oluşturunuz.
   // public static int sub(int a,int b){
    //    return a+b;
    //}
    //public static  int add(int a, int b, int c,){
      //  return a+b+c;
   // }
    //istediğimiz kadar sayıyı toplayabileceğimiz bir method oluştur.
    public static int add(String s/*başa koyabiliriz*/,int... a/*String c başka bir parametre koyamazsınız. bütün yolladığınız parametreler ilkine gider.*/){
        int sum =0;
        for (int w:a){
            sum=sum+w;
        }
        return sum;

    }
}
