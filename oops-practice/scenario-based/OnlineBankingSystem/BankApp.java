public class BankApp {
    public static void main(String[] args) {

        Account savings = new SavingsAccount("SA101", 5000);
        Account current = new CurrentAccount("CA201", 8000);

        try {
            savings.deposit(2000);
            savings.transfer(current, 3000);
            current.withdraw(1000);

        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Savings Balance: " + savings.getBalance());
        System.out.println("Current Balance: " + current.getBalance());

        System.out.println("\nSavings Transactions:");
        savings.showTransactions();
    }
}