public class Bike extends Vehicle {

    public Bike(String vehicleId, String brand) {
        super(vehicleId, brand);
    }

    @Override
    public double calculateRent(int days) {
        return days * 300;
    }
}
