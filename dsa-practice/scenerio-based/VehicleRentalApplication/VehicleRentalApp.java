public class VehicleRentalApp {

    public static void main(String[] args) {
        
        System.out.println("Welcome to Vehicle Rental Service");

       VehicleRentalService service = new VehicleRentalService();

        service.addVehicle(new Bike("B1", "Honda"));
        service.addVehicle(new Car("C1", "Hyundai"));
        service.addVehicle(new Truck("T1", "Tata"));

        Customer customer = new Customer("Aryan");

        System.out.println("Available Vehicles:");
        service.displayVehicles();

        System.out.println("\nRenting Vehicle:");
        service.rentVehicle("C1", customer, 3);

        System.out.println("\nUpdated Vehicle List:");
        service.displayVehicles();

        System.out.println("\nRemoving Vehicle:");
        service.removeVehicle("B1");

        System.out.println("\nFinal Vehicle List:");
        service.displayVehicles();



    }
}