package Day19DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class DateTime01 {
    public static void main(String[] args) {
        //Example 1: anlık tarihi(current date) ekrana yazdıran kodu yazdırınız.
        LocalDate currentDate = LocalDate.now();// bulunduğun mekandaki anlık tarihi gir

        System.out.println(currentDate);

        //Example 2: anlık zamanı veren kodu yazınız.
        LocalTime currentTime= LocalTime.now();
        System.out.println(currentTime);

        //anlık tarihi ve zamanı veren kodu yazınız

        LocalDateTime currentDateTime= LocalDateTime.now();
        System.out.println(currentDateTime);

        // anlık tarih ve zamanı başka bir lokasyon için gösteren kodu yazınız.
        LocalDateTime currentDateTimeInJapan= LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(currentDateTimeInJapan);
        LocalDateTime currentDateTimeInIstanbul= LocalDateTime.now(ZoneId.of("Europe/Istanbul"));
        System.out.println(currentDateTimeInIstanbul);

        //Zamanda ileri gidelim. 789 gün sonraya gidelim. emeklilik tarihini hesaplayan kod.
        LocalDate countDate= LocalDate.of(2023,04,25);// LocalDate currentDate2=LocalDate.now(); bu şekilde çalışırsa hergün güncel tarihi çeker ve hesaplama yanlış olaur
        LocalDate retireDate= countDate.plusDays(789);
        System.out.println(retireDate);

        // iki çocuğunun doğum tarihleri arasındaki farkı gün olarak hesaplayan kodu yazınız.
        LocalDate dobAli= LocalDate.of(2005,5,17);
        LocalDate dobVeli= LocalDate.of(2001,3,12);

        //between method'u kullanıldığında eski olan tarih daha önce yazılmalıdır.
        Long diff= ChronoUnit.DAYS.between(dobVeli,dobAli);
        System.out.println(diff);

        // Istanbulun fethi ile Cumhuriyetin kurulması arasında kaç ay olduğunu gçsterem kodu yazınız.
        LocalDate historyOfIstanbul= LocalDate.of(1453,5,29);
        LocalDate historyOfCumhuriyet= LocalDate.of(1923,10,29);

        Long diff2=ChronoUnit.MONTHS.between(historyOfIstanbul,historyOfCumhuriyet);
        System.out.println(diff2);

        // verilen tarihin hangi burçta olduğunu gçsteren kodu yazınız.
        LocalDate myDate=LocalDate.of(1989,3,28);

        int day=myDate.getDayOfMonth();
        int month=myDate.getMonthValue();
        System.out.println(day+" "+ month);

        if (day>=21&& month==3 ){
            System.out.println("koc");
            } else if (day<=20&&month==4) {
            System.out.println("koc");
        } else if (day>=21&&month==4) {
            System.out.println("boga");
        } else if (day<=20&&month==5) {
            System.out.println("boga");
        }
        //2.way
        if ((day>=21&&month==3)||(day<=20&&month==4)){
            System.out.println("koc");
        } else if ((day>=21&&month==4)||(day<=20&&month==5)) {
            System.out.println("boga");

        }

    }

}
