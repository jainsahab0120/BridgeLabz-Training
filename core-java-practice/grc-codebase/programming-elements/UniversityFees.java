public class UniversityFees {
    public static void main(String[] args) {

        int semesterFees = 125000;
        int discountPercent = 10;

        double discountAmount = (discountPercent / 100.0) * semesterFees;
        double totalFeesAfterDiscount = semesterFees - discountAmount;

        System.out.println("the Discount amount in INR is " + discountAmount + "and Final Discount fees in INR " + totalFeesAfterDiscount);

    }
}
