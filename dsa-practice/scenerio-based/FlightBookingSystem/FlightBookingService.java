import java.util.ArrayList;
import java.util.List;

public class FlightBookingService {

    // Array to store available flights
    private Flight[] flights = {
        new Flight("F101", "Delhi", "Mumbai", 5500),
        new Flight("F102", "Delhi", "Bangalore", 6500),
        new Flight("F103", "Mumbai", "Chennai", 6000),
        new Flight("F104", "Pune", "Delhi", 4800)
    };

    // List to store bookings
    private List<Booking> bookings = new ArrayList<>();

    // SEARCH
    public void searchFlights(String source, String destination) {
        boolean found = false;

        for (Flight flight : flights) {
            if (flight.source.equalsIgnoreCase(source) &&
                flight.destination.equalsIgnoreCase(destination)) {

                flight.display();
                found = true;
            }
        }

        if (!found) {
            System.out.println("No flights found");
        }
    }

    // BOOK
    public void bookFlight(String userName, String flightId) {
        for (Flight flight : flights) {
            if (flight.flightId.equalsIgnoreCase(flightId)) {
                bookings.add(new Booking(userName, flight));
                System.out.println("Flight booked successfully");
                return;
            }
        }
        System.out.println("Invalid flight ID");
    }

    // READ (View bookings)
    public void displayBookings() {
        if (bookings.isEmpty()) {
            System.out.println("No bookings available");
            return;
        }

        for (Booking booking : bookings) {
            booking.display();
        }
    }
}
