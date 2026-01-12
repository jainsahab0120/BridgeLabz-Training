import java.util.*;

public class HospitalService {

    private List<Patient> patients = new ArrayList<>();

    // CREATE
    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    // READ
    public void displayPatients() {
        if (patients.isEmpty()) {
            System.out.println("No patient records found");
            return;
        }
        for (Patient p : patients) {
            p.displayInfo();
        }
    }

    // UPDATE (Change Doctor)
    public void updateDoctor(int patientId, Doctor newDoctor) {
        for (Patient p : patients) {
            if (p.getPatientId() == patientId) {
                System.out.println("Doctor updated for patient " + p.getName());
                return;
            }
        }
        System.out.println("Patient not found");
    }

    // DELETE
    public void removePatient(int patientId) {
        Iterator<Patient> it = patients.iterator();
        while (it.hasNext()) {
            if (it.next().getPatientId() == patientId) {
                it.remove();
                System.out.println("Patient removed");
                return;
            }
        }
        System.out.println("Patient not found");
    }
}
