package PracticeEveryday.Day1Boolean;

public class LeapYear {
    public static void main(String[] args) {
        int year =2024;
        boolean leapYear=(year%4==0&&year%100!=0)||(year%400==00);
        if (leapYear){
            System.out.println(year+" is leap year");
        }else {
            System.out.println(year+" is not year");
        }

        int lastYear=2023;
        boolean isLastYearLeap=(lastYear%4==0&&lastYear!=0)||(lastYear%400==00);
        String lastYearStatus= isLastYearLeap? "last year is leap year":"last year is not leap year";
        System.out.println(lastYearStatus);

    }




}
