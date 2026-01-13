import java.util.*;

public class OrderService {

    private List<Product> products = new ArrayList<>();
    private List<Order> orders = new ArrayList<>();

    // CREATE
    public void addProduct(Product product) {
        products.add(product);
    }

    // READ
    public void displayProducts() {
        for (Product p : products) {
            System.out.println(p.productId + " | " + p.name + " | ₹" + p.price);
        }
    }

    // PLACE ORDER
    public void placeOrder(int orderId, Product product, Customer customer, Payment payment)
            throws PaymentFailedException {

        payment.pay(product.price);
        Order order = new Order(orderId, product, customer);
        orders.add(order);
        System.out.println("Order placed successfully");
    }

    // CANCEL ORDER
    public void cancelOrder(int orderId) {
        for (Order order : orders) {
            if (order.orderId == orderId) {
                order.cancel();
                System.out.println("Order cancelled");
                return;
            }
        }
        System.out.println("Order not found");
    }

    // TRACK ORDERS
    public void displayOrders() {
        for (Order order : orders) {
            order.display();
        }
    }
}