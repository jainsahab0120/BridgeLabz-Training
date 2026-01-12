public class Booking {
    String userName;
    Flight flight;

    public Booking(String userName, Flight flight) {
        this.userName = userName;
        this.flight = flight;
    }

    public void display() {
        System.out.println(
            userName + " booked " +
            flight.flightId + " | " +
            flight.source + " -> " +
            flight.destination
        );
    }
}
