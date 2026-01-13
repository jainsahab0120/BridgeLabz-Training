public class VehicleQueue {

    private String[] queue;
    private int front;
    private int rear;
    private int size;

    public VehicleQueue(int capacity) {
        queue = new String[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public boolean isFull() {
        return size == queue.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void enqueue(String vehicleNumber) {
        if (isFull()) {
            System.out.println("Queue overflow: " + vehicleNumber);
            return;
        }

        rear = (rear + 1) % queue.length;
        queue[rear] = vehicleNumber;
        size++;
        System.out.println(vehicleNumber + " added to queue");
    }

    public String dequeue() {
        if (isEmpty()) {
            System.out.println("Queue underflow");
            return null;
        }

        String vehicle = queue[front];
        front = (front + 1) % queue.length;
        size--;
        return vehicle;
    }
}