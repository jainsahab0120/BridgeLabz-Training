public class InPatient extends Patient {

    private int daysAdmitted;
    private double dailyCharge;

    public InPatient(int id, String name, int age, Doctor doctor,
                     int daysAdmitted, double dailyCharge) {
        super(id, name, age, doctor);
        this.daysAdmitted = daysAdmitted;
        this.dailyCharge = dailyCharge;
    }

    @Override
    public double calculateBill() {
        return daysAdmitted * dailyCharge;
    }

    @Override
    public void displayInfo() {
        System.out.println(
            "InPatient | ID: " + getPatientId() +
            " | Name: " + getName() +
            " | Doctor: " + getDoctor().getName() +
            " | Bill: ₹" + calculateBill()
        );
    }
}
