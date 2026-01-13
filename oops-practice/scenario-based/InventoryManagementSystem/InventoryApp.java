public class InventoryApp {
    public static void main(String[] args) {

        AlertService alertService = new LowStockAlertService();
        Inventory inventory = new Inventory(alertService);

        inventory.addProduct(new Product(1, "Keyboard", 10));
        inventory.addProduct(new Product(2, "Mouse", 3));

        inventory.displayStock();

        try {
            inventory.updateStock(2, 2);
            inventory.updateStock(1, 0);
        } catch (OutOfStockException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\nUpdated Stock:");
        inventory.displayStock();
    }
}