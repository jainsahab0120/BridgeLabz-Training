public class WalletToWalletTransfer implements TransferService {
    public void transfer(Wallet from, Wallet to, double amount)
            throws InsufficientBalanceException {

        from.withdrawMoney(amount);
        to.addMoney(amount);
        from.transactions.add(new Transaction("TRANSFER_TO_WALLET", amount));
    }
}