public class EventManagerService {

    public void sortTicketsByPrice(Ticket[] tickets) {
        QuickSortUtil.quickSort(tickets, 0, tickets.length - 1);
    }

    public void displayTopTickets(Ticket[] tickets, int count, boolean cheapest) {
        int limit = Math.min(count, tickets.length);

        if (cheapest) {
            System.out.println("Top " + limit + " Cheapest Tickets:");
            for (int i = 0; i < limit; i++) {
                System.out.println("Ticket ID: " + tickets[i].ticketId +
                                   " | Price: ₹" + tickets[i].price);
            }
        } else {
            System.out.println("Top " + limit + " Expensive Tickets:");
            for (int i = tickets.length - 1; i >= tickets.length - limit; i--) {
                System.out.println("Ticket ID: " + tickets[i].ticketId +
                                   " | Price: ₹" + tickets[i].price);
            }
        }
    }
}