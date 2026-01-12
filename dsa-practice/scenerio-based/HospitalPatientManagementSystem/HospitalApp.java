public class HospitalApp {

    public static void main(String[] args) {

        Doctor doc1 = new Doctor(1, "Dr. Sharma", "Cardiology");
        Doctor doc2 = new Doctor(2, "Dr. Mehta", "General");

        HospitalService service = new HospitalService();

        Patient p1 = new InPatient(101, "Amit", 45, doc1, 5, 2000);
        Patient p2 = new OutPatient(102, "Neha", 28, doc2, 500);

        service.addPatient(p1);
        service.addPatient(p2);

        System.out.println("All Patients:");
        service.displayPatients();

        System.out.println("\nGenerating Bills:");
        Bill.generate(p1);
        Bill.generate(p2);

        System.out.println("\nRemoving Patient:");
        service.removePatient(101);

        System.out.println("\nFinal Patient List:");
        service.displayPatients();
    }
}
