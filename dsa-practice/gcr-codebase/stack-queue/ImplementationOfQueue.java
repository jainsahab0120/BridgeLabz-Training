import java.util.Stack;

public class ImplememtationOfQueue {

    public static void main(String[] args) {

        Queue queue = new Queue();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println(queue.dequeue()); // 10
        System.out.println(queue.peek());    // 20
        System.out.println(queue.dequeue()); // 20
        System.out.println(queue.isEmpty()); // false
    }
}

class Queue {

    Stack<Integer> stEnq = new Stack<>();
    Stack<Integer> stDeq = new Stack<>();

    public void enqueue(int data) {
        stEnq.push(data);
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }

        if (stDeq.isEmpty()) {
            while (!stEnq.isEmpty()) {
                stDeq.push(stEnq.pop());
            }
        }
        return stDeq.pop();
    }

    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }

        if (stDeq.isEmpty()) {
            while (!stEnq.isEmpty()) {
                stDeq.push(stEnq.pop());
            }
        }
        return stDeq.peek();
    }

    public boolean isEmpty() {
        return stEnq.isEmpty() && stDeq.isEmpty();
    }
}
