import java.util.*;

public abstract class Account implements BankService {

    protected String accountNumber;
    protected double balance;
    protected List<String> transactions = new ArrayList<>();

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public abstract double calculateInterest();

    public void deposit(double amount) {
        balance += amount;
        transactions.add("Deposited: " + amount);
    }

    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance");
        }
        balance -= amount;
        transactions.add("Withdrawn: " + amount);
    }

    public void transfer(Account toAccount, double amount) throws InsufficientBalanceException {
        withdraw(amount);
        toAccount.deposit(amount);
        transactions.add("Transferred: " + amount + " to " + toAccount.accountNumber);
    }

    public void showTransactions() {
        for (String t : transactions) {
            System.out.println(t);
        }
    }
}