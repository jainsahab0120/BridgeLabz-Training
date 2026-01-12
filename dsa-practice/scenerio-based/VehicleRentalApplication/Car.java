public class Car extends Vehicle {

    public Car(String vehicleId, String brand) {
        super(vehicleId, brand);
    }

    @Override
    public double calculateRent(int days) {
        return days * 800;
    }
}
