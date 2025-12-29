import java.util.*;

public class MetroSmartCard {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double balance = input.nextDouble();

        while (balance > 0) {
            int distance = input.nextInt();

            if (distance == -1) {
                break;
            }

            double fare = distance <= 5 ? 10 : distance <= 15 ? 20 : 30;

            if (balance >= fare) {
                balance -= fare;
                System.out.println(balance);
            } else {
                System.out.println("Insufficient Balance");
                break;
            }
        }
    }
}
