import java.util.*;

public class VehicleRentalService {

    private List<Vehicle> vehicles = new ArrayList<>();

    // CREATE
    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    // READ
    public void displayVehicles() {
        for (Vehicle v : vehicles) {
            String status = v.isAvailable ? "Available" : "Rented";
            System.out.println(v.vehicleId + " | " + v.brand + " | " + status);
        }
    }

    // UPDATE (Rent)
    public void rentVehicle(String vehicleId, Customer customer, int days) {
        for (Vehicle v : vehicles) {
            if (v.vehicleId.equals(vehicleId) && v.isAvailable) {

                double rent = v.calculateRent(days);
                v.isAvailable = false;

                System.out.println(
                    customer.name + " rented " + v.brand +
                    " for " + days + " days | Rent: ₹" + rent
                );
                return;
            }
        }
        System.out.println("Vehicle not available");
    }

    // DELETE
    public void removeVehicle(String vehicleId) {
        Iterator<Vehicle> it = vehicles.iterator();
        while (it.hasNext()) {
            Vehicle v = it.next();
            if (v.vehicleId.equals(vehicleId)) {
                it.remove();
                return;
            }
        }
    }
}
