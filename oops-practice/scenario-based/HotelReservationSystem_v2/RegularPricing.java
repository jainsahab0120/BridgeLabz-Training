public class RegularPricing implements PricingStrategy {
    public double calculatePrice(int days) {
        return days * 2000;
    }
}