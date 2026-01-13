public class CurrentAccount extends Account {

    public CurrentAccount(String accNo, double balance) {
        super(accNo, balance);
    }

    public double calculateInterest() {
        return balance * 0.02;
    }
}