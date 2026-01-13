import java.util.*;

public class Inventory {

    private List<Product> products = new ArrayList<>();
    private AlertService alertService;

    public Inventory(AlertService alertService) {
        this.alertService = alertService;
    }

    // ADD PRODUCT
    public void addProduct(Product product) {
        products.add(product);
    }

    // UPDATE STOCK
    public void updateStock(int productId, int quantity) throws OutOfStockException {
        for (Product p : products) {
            if (p.productId == productId) {
                if (quantity <= 0) {
                    throw new OutOfStockException("Product out of stock");
                }
                p.quantity = quantity;

                if (p.quantity < 5) {
                    alertService.sendLowStockAlert(p);
                }
                return;
            }
        }
        System.out.println("Product not found");
    }

    // DISPLAY STOCK
    public void displayStock() {
        for (Product p : products) {
            System.out.println(
                p.productId + " | " + p.name + " | Stock: " + p.quantity
            );
        }
    }
}