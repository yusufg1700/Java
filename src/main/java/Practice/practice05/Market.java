package Practice.practice05;

import java.time.LocalDate;

public class Market {
    String productName;
    double productPrice;
    String expirationDate;


    Market(String prodName, double price, int afterMonth){

       productName=prodName;
       productPrice=price;
       expirationDate= LocalDate.now().plusMonths(afterMonth).toString();

    }

}
