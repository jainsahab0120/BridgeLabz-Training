import java.util.Scanner;

public class totalPriceCalculator {
    public static void main(String[] args) {

        
        Scanner sc = new Scanner(System.in);

        // Item ka unit price input lena
        System.out.print("Enter unit price of the item: ");
        double unitPrice = sc.nextDouble();

        // Quantity input lena
        System.out.print("Enter quantity to be bought: ");
        int quantity = sc.nextInt();

        // Total price calculate kar rahe hain
        double totalPrice = unitPrice * quantity;

       
        System.out.println(
            "The total purchase price is INR " + totalPrice +
            " if the quantity " + quantity +
            " and unit price is INR " + unitPrice
        );
 
    }
}
