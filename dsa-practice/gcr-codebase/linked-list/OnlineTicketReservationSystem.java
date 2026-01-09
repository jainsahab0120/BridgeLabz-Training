import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

// Node representing a booking
class BookingNode {
    int bookingId;
    String customer;
    String movie;
    String seat;
    String timeStamp;
    BookingNode link;

    BookingNode(int bookingId, String customer, String movie, String seat) {
        this.bookingId = bookingId;
        this.customer = customer;
        this.movie = movie;
        this.seat = seat;
        this.timeStamp = LocalDateTime.now()
                .format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"));
        this.link = this; // circular
    }
}

public class TicketReservationManager {

    static BookingNode start = null;

    // Add new ticket
    static void bookTicket(int id, String customer, String movie, String seat) {
        BookingNode node = new BookingNode(id, customer, movie, seat);

        if (start == null) {
            start = node;
            System.out.println("Ticket booked successfully!");
            return;
        }

        BookingNode temp = start;
        while (temp.link != start) {
            temp = temp.link;
        }

        temp.link = node;
        node.link = start;
        System.out.println("Ticket booked successfully!");
    }

    // Cancel ticket
    static void cancelTicket(int id) {
        if (start == null) {
            System.out.println("No bookings available!");
            return;
        }

        BookingNode curr = start;
        BookingNode prev = null;

        do {
            if (curr.bookingId == id) {

                if (prev == null) {
                    if (start.link == start) {
                        start = null;
                    } else {
                        BookingNode last = start;
                        while (last.link != start) {
                            last = last.link;
                        }
                        start = start.link;
                        last.link = start;
                    }
                } else {
                    prev.link = curr.link;
                }

                System.out.println("Ticket ID " + id + " cancelled successfully!");
                return;
            }

            prev = curr;
            curr = curr.link;
        } while (curr != start);

        System.out.println("Ticket ID not found!");
    }

    // Display all bookings
    static void showAllBookings() {
        if (start == null) {
            System.out.println("No tickets booked yet!");
            return;
        }

        BookingNode temp = start;
        System.out.println("Current Bookings:");
        do {
            System.out.println("--------------------------------");
            System.out.println("Booking ID : " + temp.bookingId);
            System.out.println("Customer   : " + temp.customer);
            System.out.println("Movie      : " + temp.movie);
            System.out.println("Seat       : " + temp.seat);
            System.out.println("Booked At  : " + temp.timeStamp);
            temp = temp.link;
        } while (temp != start);
        System.out.println("--------------------------------");
    }

    // Search booking by customer or movie
    static void searchBooking(String keyword) {
        if (start == null) {
            System.out.println("No bookings available!");
            return;
        }

        BookingNode temp = start;
        boolean found = false;

        do {
            if (temp.customer.equalsIgnoreCase(keyword) ||
                temp.movie.equalsIgnoreCase(keyword)) {

                System.out.println("Booking Found:");
                System.out.println("Booking ID : " + temp.bookingId);
                System.out.println("Customer   : " + temp.customer);
                System.out.println("Movie      : " + temp.movie);
                System.out.println("Seat       : " + temp.seat);
                System.out.println("Booked At  : " + temp.timeStamp);
                System.out.println("--------------------------------");
                found = true;
            }
            temp = temp.link;
        } while (temp != start);

        if (!found) {
            System.out.println("No booking found for: " + keyword);
        }
    }

    // Count total tickets
    static int totalBookings() {
        if (start == null) return 0;

        int count = 0;
        BookingNode temp = start;
        do {
            count++;
            temp = temp.link;
        } while (temp != start);

        return count;
    }

    public static void main(String[] args) {

        bookTicket(101, "Alice", "Avatar 2", "A12");
        bookTicket(102, "Bob", "Avatar 2", "A13");
        bookTicket(103, "Charlie", "Batman", "B07");

        showAllBookings();
        System.out.println("Total Tickets: " + totalBookings());

        System.out.println("\nSearching for 'Avatar 2':");
        searchBooking("Avatar 2");

        System.out.println("\nCancelling Ticket ID 102");
        cancelTicket(102);

        showAllBookings();
        System.out.println("Total Tickets: " + totalBookings());
    }
}
