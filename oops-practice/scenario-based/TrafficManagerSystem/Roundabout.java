public class Roundabout {

    private VehicleNode head;
    private int capacity;
    private int count;

    public Roundabout(int capacity) {
        this.capacity = capacity;
        this.count = 0;
    }

    public boolean isFull() {
        return count == capacity;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addVehicle(String vehicleNumber) {
        if (isFull()) {
            System.out.println("Roundabout full");
            return;
        }

        VehicleNode newNode = new VehicleNode(vehicleNumber);

        if (head == null) {
            head = newNode;
            newNode.next = head;
        } else {
            VehicleNode temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head;
        }

        count++;
        System.out.println(vehicleNumber + " entered roundabout");
    }

    public String removeVehicle() {
        if (isEmpty()) {
            return null;
        }

        String removed = head.vehicleNumber;

        if (head.next == head) {
            head = null;
        } else {
            VehicleNode temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = head.next;
            head = head.next;
        }

        count--;
        System.out.println(removed + " exited roundabout");
        return removed;
    }

    public void printState() {
        if (isEmpty()) {
            System.out.println("Roundabout empty");
            return;
        }

        VehicleNode temp = head;
        System.out.print("Roundabout: ");
        do {
            System.out.print(temp.vehicleNumber + " -> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(back to start)");
    }
}