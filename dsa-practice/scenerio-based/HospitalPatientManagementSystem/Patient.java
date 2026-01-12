public abstract class Patient implements IPayable {

    private int patientId;
    private String name;
    private int age;
    private Doctor doctor;

    public Patient(int patientId, String name, int age, Doctor doctor) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.doctor = doctor;
    }

    // Encapsulation (getters)
    public int getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    // Polymorphism
    public abstract void displayInfo();
}
