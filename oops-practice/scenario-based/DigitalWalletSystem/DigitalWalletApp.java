public class DigitalWalletApp {
    public static void main(String[] args) {

        User u1 = new User(1, "Aryan");
        User u2 = new User(2, "Rohit");

        Wallet w1 = new Wallet(101, u1);
        Wallet w2 = new Wallet(102, u2);

        w1.addMoney(5000);

        TransferService walletTransfer = new WalletToWalletTransfer();
        TransferService bankTransfer = new BankTransfer();

        try {
            walletTransfer.transfer(w1, w2, 2000);
            bankTransfer.transfer(w1, w2, 1000);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }

        WalletService service = new WalletService();
        service.showTransactions(w1);
    }
}