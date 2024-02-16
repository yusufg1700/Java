package PracticeEveryday.Day2IfElse;

public class TicketPrice {
    public static void main(String[] args) {
        int age=30;
        boolean subscription=true;

        double discount=(subscription)?0.2:0.0;

        double ticketPrice=(age<=18)?10*(1-discount):
                (age>65)?15*(1-discount):20*(1-discount);

        System.out.println("Ticket Price "+ticketPrice);
    }
}
