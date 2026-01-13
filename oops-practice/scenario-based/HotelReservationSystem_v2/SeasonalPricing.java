public class SeasonalPricing implements PricingStrategy {
    public double calculatePrice(int days) {
        return days * 3000;
    }
}