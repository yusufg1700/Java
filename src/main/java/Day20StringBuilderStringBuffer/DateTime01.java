package Day20StringBuilderStringBuffer;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateTime01 {


    public static void main(String[] args) {
        //example 1:Tom aliden 3 yıl 8 ay 13 ggün sonra doğdu. alii ise veliden 1 yıl 15 gün önce doğdu.
        // tom2un doğum tarihi 18 kasım 2011 ise veli ve alinin doğum tarihlerini yazınız.

        LocalDate tomDate= LocalDate.of(2011,11,18);
        LocalDate aliDate= tomDate.minusDays(13).minusMonths(8).minusYears(3);
        LocalDate veliDate= aliDate.plusDays(15).plusYears(1);

        System.out.println(aliDate);
        System.out.println(veliDate);
    }
}
