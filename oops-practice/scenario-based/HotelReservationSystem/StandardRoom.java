public class StandardRoom extends Room {

    public StandardRoom(int roomNumber, PricingStrategy pricingStrategy) {
        super(roomNumber, pricingStrategy);
    }

    public String getType() {
        return "Standard";
    }
}