public class BankTransfer implements TransferService {
    public void transfer(Wallet from, Wallet to, double amount)
            throws InsufficientBalanceException {

        from.withdrawMoney(amount);
        to.addMoney(amount);
        from.transactions.add(new Transaction("BANK_TRANSFER", amount));
    }
}