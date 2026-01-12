public class Truck extends Vehicle {

    public Truck(String vehicleId, String brand) {
        super(vehicleId, brand);
    }

    @Override
    public double calculateRent(int days) {
        return days * 1500;
    }
}
