package Day19DateTime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime02 {
    public static void main(String[] args) {



    // java yıl ay gün formatında tarıh vverir ama değiştirilebilir.
    //example javadan aldığınız datei ay/gün/yıl olarak yazınız
    LocalDate currentDate = LocalDate.now();

    DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("MM/dd/yyyy");//10dan küçük ayları01,02,03 şeklinde yazar
    String formattedDate1= dtf1.format(currentDate);
    System.out.println(formattedDate1);

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("MMM/dd/yyyy");
        String formattedDate2= dtf2.format(currentDate);
        System.out.println(formattedDate2);

        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("MMMM/dd/yyyy");
        String formattedDate3= dtf3.format(currentDate);
        System.out.println(formattedDate3);

        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("M/dd/yyyy");
        String formattedDate4= dtf4.format(currentDate);
        System.out.println(formattedDate4);

        DateTimeFormatter dtf5 = DateTimeFormatter.ofPattern("M/dd/yy");
        String formattedDate5= dtf5.format(currentDate);
        System.out.println(formattedDate5);

        //javadan aldığınız Time formatı değiştiriniz
        LocalTime myTime=LocalTime.of(16,23,54,2345);
        System.out.println(myTime);

        DateTimeFormatter dtf7=DateTimeFormatter.ofPattern("HH:mm");
        String formattedMyTime= dtf7.format(myTime);
        System.out.println(formattedMyTime);

        DateTimeFormatter dtf8=DateTimeFormatter.ofPattern("hh:mm a");
        String formattedMyTime8= dtf8.format(myTime);
        System.out.println(formattedMyTime8);
    }
}
