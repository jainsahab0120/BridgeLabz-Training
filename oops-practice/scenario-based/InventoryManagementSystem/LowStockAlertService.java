public class LowStockAlertService implements AlertService {
    public void sendLowStockAlert(Product product) {
        System.out.println(
            "ALERT: Low stock for " + product.name +
            " (Remaining: " + product.quantity + ")"
        );
    }
}