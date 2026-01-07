import java.util.ArrayList;
import java.util.List;

class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String msg) {
        super(msg);
    }
}

abstract class Account {

    protected String accountNo;
    protected double balance;
    protected List<String> history = new ArrayList<>();

    Account(String accountNo, double balance) {
        this.accountNo = accountNo;
        this.balance = balance;
        history.add("Account opened with balance: " + balance);
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            return;
        }
        balance += amount;
        history.add("Deposited: " + amount);
    }

    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance");
        }
        balance -= amount;
        history.add("Withdrawn: " + amount);
    }

    public double getBalance() {
        return balance;
    }

    public List<String> getHistory() {
        return history;
    }

    abstract double calculateInterest();
}

class SavingsAccount extends Account {

    SavingsAccount(String accNo, double balance) {
        super(accNo, balance);
    }

    double calculateInterest() {
        return balance * 0.04;
    }
}

class CurrentAccount extends Account {

    CurrentAccount(String accNo, double balance) {
        super(accNo, balance);
    }

    double calculateInterest() {
        return 0;
    }
}

public class BankSystemApp {

    public static void main(String[] args) {

        Account savings = new SavingsAccount("SA101", 5000);
        Account current = new CurrentAccount("CA201", 3000);

        System.out.println("Initial Balances:");
        System.out.println("Savings: " + savings.getBalance());
        System.out.println("Current: " + current.getBalance());

        savings.deposit(1500);

        try {
            savings.withdraw(2000);
            current.deposit(2000);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\nFinal Balances:");
        System.out.println("Savings: " + savings.getBalance());
        System.out.println("Current: " + current.getBalance());

        System.out.println("\nSavings Account Transactions:");
        for (String s : savings.getHistory()) {
            System.out.println(s);
        }

        System.out.println("\nCurrent Account Transactions:");
        for (String s : current.getHistory()) {
            System.out.println(s);
        }

        System.out.println("\nInterest on Savings Account: " + savings.calculateInterest());
    }
}
