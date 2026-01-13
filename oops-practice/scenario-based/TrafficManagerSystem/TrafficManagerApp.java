public class TrafficManagerApp {
    public static void main(String[] args) {

        Roundabout roundabout = new Roundabout(3);
        VehicleQueue waitingQueue = new VehicleQueue(3);

        String[] incomingVehicles = {"CAR-1", "CAR-2", "CAR-3", "CAR-4", "CAR-5"};

        for (String car : incomingVehicles) {
            if (!roundabout.isFull()) {
                roundabout.addVehicle(car);
            } else {
                waitingQueue.enqueue(car);
            }
        }

        roundabout.printState();

        System.out.println("\nVehicle exiting...");
        roundabout.removeVehicle();

        String next = waitingQueue.dequeue();
        if (next != null) {
            roundabout.addVehicle(next);
        }

        System.out.println();
        roundabout.printState();
    }
}