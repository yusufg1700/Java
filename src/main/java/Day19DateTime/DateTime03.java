package Day19DateTime;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class DateTime03 {
    public static void main(String[] args) {


        //Example 1:Japonya ile almanya arasındaki zaman farkını saat hesaplayan kodu yazınız.

        LocalDateTime japanTime = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        LocalDateTime germanTime = LocalDateTime.now(ZoneId.of("Europe/Berlin"));
        System.out.println(japanTime);
        System.out.println(germanTime);

        Long dif =ChronoUnit.HOURS.between(germanTime,japanTime);
        System.out.println(dif);

        //Example 2: Sabit bir date oluşturunuz.
        LocalDate myDate=LocalDate.of(2011, Month.APRIL,13);
        System.out.println(myDate);

        /*
        1)javada sabit isimleri (Gün isimşler, Ay isimleri eyalet isimleri) depolamak için depolar oluşturulur
        bu depolara "Enum" denir.

         */
        //Example 3: USA için Woow, UK için "Big" yazın

        Countries country= Countries.USA;
        switch (country){
            case USA:
                System.out.println("woow");
                break;
            case UK:
                System.out.println("Big");
                break;
            case FRANCE:
                System.out.println("tanımsız");
                break;
            case RWANDA:
                System.out.println("asda");
                break;

        }


    }




}
