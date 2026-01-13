public interface BankService {
    void deposit(double amount);
    void withdraw(double amount) throws InsufficientBalanceException;
    void transfer(Account toAccount, double amount) throws InsufficientBalanceException;
    double getBalance();
}