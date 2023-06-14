package Practice.practice05;

public class Q05_MarketConsturtor {
    public static void main(String[] args) {
        Market productObject=new Market("bread",5,1);

        System.out.println(" product name "+productObject.productName);

        Market productObject2=new Market("nutella",50,2);

        System.out.println("productPrice "+productObject2.productPrice);

        Market glassObj= new Market("bardak",50,3);
        System.out.println(glassObj.productPrice+glassObj.expirationDate+glassObj.productName);

    }

}
