public class ECommerceApp {
    public static void main(String[] args) {

        OrderService service = new OrderService();

        Product p1 = new Product(1, "Laptop", 55000);
        Product p2 = new Product(2, "Headphones", 3000);

        service.addProduct(p1);
        service.addProduct(p2);

        Customer customer = new Customer(101, "Aryan");

        System.out.println("Product Catalog:");
        service.displayProducts();

        try {
            service.placeOrder(1001, p1, customer, new CardPayment());
            service.placeOrder(1002, p2, customer, new UPIPayment());
        } catch (PaymentFailedException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\nOrders:");
        service.displayOrders();

        System.out.println("\nCancelling Order:");
        service.cancelOrder(1002);

        System.out.println("\nUpdated Orders:");
        service.displayOrders();
    }
}