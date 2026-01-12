public class Bill {
    public static void generate(Patient patient) {
        System.out.println(
            "Final Bill for " + patient.getName() +
            " : ₹" + patient.calculateBill()
        );
    }
}
