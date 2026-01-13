public class DeluxeRoom extends Room {
    public DeluxeRoom(int roomNumber, PricingStrategy pricingStrategy) {
        super(roomNumber, pricingStrategy);
    }

    public String getType() {
        return "Deluxe";
    }
}