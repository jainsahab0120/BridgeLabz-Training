public class SavingsAccount extends Account {

    public SavingsAccount(String accNo, double balance) {
        super(accNo, balance);
    }

    public double calculateInterest() {
        return balance * 0.04;
    }
}