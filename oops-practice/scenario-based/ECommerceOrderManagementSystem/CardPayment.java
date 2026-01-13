public class CardPayment implements Payment {
    public void pay(double amount) throws PaymentFailedException {
        if (amount <= 0) {
            throw new PaymentFailedException("Invalid payment amount");
        }
        System.out.println("Payment of ₹" + amount + " done using Card");
    }
}