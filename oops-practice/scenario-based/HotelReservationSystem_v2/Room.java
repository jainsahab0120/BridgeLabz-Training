public abstract class Room {
    protected int roomNumber;
    protected boolean isAvailable = true;
    protected PricingStrategy pricingStrategy;

    public Room(int roomNumber, PricingStrategy pricingStrategy) {
        this.roomNumber = roomNumber;
        this.pricingStrategy = pricingStrategy;
    }

    public abstract String getType();

    public double calculateBill(int days) {
        return pricingStrategy.calculatePrice(days);
    }
}