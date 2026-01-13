public class Order {
    int orderId;
    Product product;
    Customer customer;
    String status;

    public Order(int orderId, Product product, Customer customer) {
        this.orderId = orderId;
        this.product = product;
        this.customer = customer;
        this.status = "PLACED";
    }

    public void cancel() {
        status = "CANCELLED";
    }

    public void display() {
        System.out.println(
            "Order ID: " + orderId +
            " | Product: " + product.name +
            " | Customer: " + customer.name +
            " | Status: " + status
        );
    }
}