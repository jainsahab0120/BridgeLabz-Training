import java.util.ArrayList;
import java.util.List;

class NoDriverAvailableException extends Exception {
    NoDriverAvailableException(String msg) {
        super(msg);
    }
}

class User {
    String id;
    String name;
    String phone;

    User(String name, String phone) {
        this.id = "U" + System.nanoTime();
        this.name = name;
        this.phone = phone;
    }
}

class Driver {
    String id;
    String name;
    String phone;
    String vehicleNo;
    boolean available = true;

    Driver(String name, String phone, String vehicleNo) {
        this.id = "D" + System.nanoTime();
        this.name = name;
        this.phone = phone;
        this.vehicleNo = vehicleNo;
    }
}

class Ride {
    String id;
    User user;
    Driver driver;
    String from;
    String to;
    double distance;
    double fare;

    Ride(User user, Driver driver, String from, String to, double distance, double fare) {
        this.id = "R" + System.nanoTime();
        this.user = user;
        this.driver = driver;
        this.from = from;
        this.to = to;
        this.distance = distance;
        this.fare = fare;
    }
}

class CabBookingService {

    private List<Driver> drivers = new ArrayList<>();
    private List<Ride> rideList = new ArrayList<>();

    void addDriver(String name, String phone, String vehicleNo) {
        drivers.add(new Driver(name, phone, vehicleNo));
    }

    Ride bookRide(User user, String from, String to, double distance)
            throws NoDriverAvailableException {

        Driver driver = findDriver();

        double farePerKm = getFareRate();
        double fare = farePerKm * distance;

        driver.available = false;

        Ride ride = new Ride(user, driver, from, to, distance, fare);
        rideList.add(ride);
        return ride;
    }

    private Driver findDriver() throws NoDriverAvailableException {
        for (Driver d : drivers) {
            if (d.available) {
                return d;
            }
        }
        throw new NoDriverAvailableException("No driver free at the moment");
    }

    private double getFareRate() {
        int freeDrivers = 0;
        for (Driver d : drivers) {
            if (d.available) {
                freeDrivers++;
            }
        }
        return freeDrivers <= 2 ? 5.0 : 3.5;
    }

    void endRide(Ride ride) {
        ride.driver.available = true;
    }

    List<Ride> getHistory(User user) {
        List<Ride> result = new ArrayList<>();
        for (Ride r : rideList) {
            if (r.user.id.equals(user.id)) {
                result.add(r);
            }
        }
        return result;
    }
}

public class CabBookingApp {

    public static void main(String[] args) {

        CabBookingService service = new CabBookingService();

        service.addDriver("Lakhan", "1234567890", "XYZ1234");
        service.addDriver("Anuj", "9876543210", "ABC5678");

        User user = new User("Aryan", "5555555555");

        try {
            Ride ride = service.bookRide(user, "Point A", "Point B", 10);

            System.out.println("Ride booked");
            System.out.println("Driver: " + ride.driver.name);
            System.out.println("Fare: ₹" + ride.fare);

            service.endRide(ride);

            System.out.println("\nRide history:");
            for (Ride r : service.getHistory(user)) {
                System.out.println(r.from + " -> " + r.to + " | ₹" + r.fare);
            }

        } catch (NoDriverAvailableException e) {
            System.out.println(e.getMessage());
        }
    }
}





