public class WalletService {

    public void showTransactions(Wallet wallet) {
        System.out.println("Transaction History for " + wallet.user.name);
        for (Transaction t : wallet.transactions) {
            System.out.println(t.type + " | ₹" + t.amount);
        }
    }
}