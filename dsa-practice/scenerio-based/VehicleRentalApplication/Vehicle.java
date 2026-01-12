public abstract class Vehicle implements IRentable {
    protected String vehicleId;
    protected String brand;
    protected boolean isAvailable;

    public Vehicle(String vehicleId, String brand) {
        this.vehicleId = vehicleId;
        this.brand = brand;
        this.isAvailable = true;
    }
}
