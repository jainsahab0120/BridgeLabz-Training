


public class Flight {
    String flightId;
    String source;
    String destination;
    double price;

    public Flight(String flightId, String source, String destination, double price) {
        this.flightId = flightId;
        this.source = source;
        this.destination = destination;
        this.price = price;
    }

    public void display() {
        System.out.println(
            flightId + " | " + source + " -> " + destination + " | ₹" + price
        );
    }
}
