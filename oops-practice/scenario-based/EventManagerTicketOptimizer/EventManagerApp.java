import java.util.Random;

public class EventManagerApp {
    public static void main(String[] args) {

        int totalTickets = 100;
        Ticket[] tickets = new Ticket[totalTickets];
        Random random = new Random();

        for (int i = 0; i < totalTickets; i++) {
            tickets[i] = new Ticket(i + 1, 500 + random.nextInt(5000));
        }

        EventManagerService service = new EventManagerService();

        service.sortTicketsByPrice(tickets);

        service.displayTopTickets(tickets, 10, true);
        System.out.println();
        service.displayTopTickets(tickets, 10, false);
    }
}