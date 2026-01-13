import java.util.*;

public class Wallet {
    int walletId;
    User user;
    double balance;
    List<Transaction> transactions = new ArrayList<>();

    public Wallet(int walletId, User user) {
        this.walletId = walletId;
        this.user = user;
        this.balance = 0;
    }

    public void addMoney(double amount) {
        balance += amount;
        transactions.add(new Transaction("ADD", amount));
    }

    public void withdrawMoney(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient wallet balance");
        }
        balance -= amount;
        transactions.add(new Transaction("WITHDRAW", amount));
    }
}