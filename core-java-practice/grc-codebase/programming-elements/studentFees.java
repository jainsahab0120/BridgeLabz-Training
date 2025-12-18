
import java.util.Scanner;

public class StudentFees {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input: semester fees and discount percent
        int semesterFees = sc.nextInt();

        
        int discountPercent = sc.nextInt();

        double discountAmount = (discountPercent / 100.0) * semesterFees;
        double totalFeesAfterDiscount = semesterFees - discountAmount;

        System.out.println(
            "Discount Amount (INR): " + discountAmount +
            "  Final Fees After Discount (INR): " + totalFeesAfterDiscount
        );

       
    }
}