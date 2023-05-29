package Practice.p01;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Q01_ConvertfahrenheitToCelcius {
    public static void main(String[] args) {
        // get a  fahrenheit value from user and then convert to celcius
        Scanner input=new Scanner(System.in);
        System.out.println("please enter a fh value");

        //formul: c= (f-32)*5/9;

        double fh=input.nextDouble();
        double c= (fh-32)*5/9;
        System.out.println(c);

        NumberFormat numberFormat =new DecimalFormat(",##");
        String formattedC= numberFormat.format(c);
        System.out.println("formattedC"+formattedC+1);
        double doubleC= Double.valueOf(formattedC);
        System.out.println("doubleC="+ (doubleC+1));

    }
}
