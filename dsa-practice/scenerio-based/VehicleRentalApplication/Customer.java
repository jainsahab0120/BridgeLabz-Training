public class Customer {
    String customerId;
    String name;

    public Customer(String name) {
        this.customerId = "C" + System.currentTimeMillis();
        this.name = name;
    }
}
