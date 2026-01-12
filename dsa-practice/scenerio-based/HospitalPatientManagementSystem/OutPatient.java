public class OutPatient extends Patient {

    private double consultationFee;

    public OutPatient(int id, String name, int age,
                      Doctor doctor, double consultationFee) {
        super(id, name, age, doctor);
        this.consultationFee = consultationFee;
    }

    @Override
    public double calculateBill() {
        return consultationFee;
    }

    @Override
    public void displayInfo() {
        System.out.println(
            "OutPatient | ID: " + getPatientId() +
            " | Name: " + getName() +
            " | Doctor: " + getDoctor().getName() +
            " | Bill: ₹" + calculateBill()
        );
    }
}
