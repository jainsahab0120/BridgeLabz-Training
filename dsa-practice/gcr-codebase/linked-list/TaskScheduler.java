import java.util.*;

// Node representing a task
class Job {
    int id;
    String title;
    String level;
    String deadline;
    Job link;

    Job(int id, String title, String level, String deadline) {
        this.id = id;
        this.title = title;
        this.level = level;
        this.deadline = deadline;
        this.link = null;
    }
}

public class CircularTaskManager {

    static Job startNode = null;
    static Job cursor = null;

    public static void main(String[] args) {

        insertFirst(1, "Design Module", "High", "2026-01-10");
        insertLast(2, "Implement Logic", "Medium", "2026-01-12");
        insertAtIndex(2, 3, "Code Review", "Low", "2026-01-15");

        System.out.println("All Tasks:");
        printTasks();

        System.out.println("\nDeleting Task with ID 2");
        deleteTask(2);
        printTasks();

        System.out.println("\nSearch Priority = High");
        findByPriority("High");

        System.out.println("\nCircular Traversal:");
        showCurrent();
        showCurrent();
        showCurrent();
    }

    // Insert at beginning
    static void insertFirst(int id, String title, String level, String deadline) {
        Job node = new Job(id, title, level, deadline);

        if (startNode == null) {
            startNode = node;
            node.link = node;
            cursor = node;
            return;
        }

        Job temp = startNode;
        while (temp.link != startNode) {
            temp = temp.link;
        }

        node.link = startNode;
        temp.link = node;
        startNode = node;
    }

    // Insert at end
    static void insertLast(int id, String title, String level, String deadline) {
        Job node = new Job(id, title, level, deadline);

        if (startNode == null) {
            startNode = node;
            node.link = node;
            cursor = node;
            return;
        }

        Job temp = startNode;
        while (temp.link != startNode) {
            temp = temp.link;
        }

        temp.link = node;
        node.link = startNode;
    }

    // Insert at given position
    static void insertAtIndex(int pos, int id, String title, String level, String deadline) {
        if (pos <= 1) {
            insertFirst(id, title, level, deadline);
            return;
        }

        Job node = new Job(id, title, level, deadline);
        Job temp = startNode;
        int index = 1;

        while (temp.link != startNode && index < pos - 1) {
            temp = temp.link;
            index++;
        }

        node.link = temp.link;
        temp.link = node;
    }

    // Delete task using ID
    static void deleteTask(int id) {
        if (startNode == null) {
            System.out.println("No tasks available!");
            return;
        }

        Job temp = startNode;
        Job prev = null;

        // deleting first node
        if (temp.id == id) {
            if (temp.link == startNode) {
                startNode = null;
                cursor = null;
                return;
            }

            while (temp.link != startNode) {
                temp = temp.link;
            }

            temp.link = startNode.link;
            startNode = startNode.link;
            return;
        }

        temp = startNode;
        do {
            prev = temp;
            temp = temp.link;

            if (temp.id == id) {
                prev.link = temp.link;
                return;
            }
        } while (temp != startNode);

        System.out.println("Task ID not found!");
    }

    // Display current task and move forward
    static void showCurrent() {
        if (cursor == null) {
            System.out.println("No tasks to display!");
            return;
        }

        System.out.println("Current Task → ID: " + cursor.id +
                ", Name: " + cursor.title +
                ", Priority: " + cursor.level +
                ", Due: " + cursor.deadline);

        cursor = cursor.link;
    }

    // Print all tasks
    static void printTasks() {
        if (startNode == null) {
            System.out.println("Task list empty!");
            return;
        }

        Job temp = startNode;
        do {
            System.out.println("ID: " + temp.id +
                    ", Name: " + temp.title +
                    ", Priority: " + temp.level +
                    ", Due: " + temp.deadline);
            temp = temp.link;
        } while (temp != startNode);
    }

    // Search by priority
    static void findByPriority(String level) {
        if (startNode == null) {
            System.out.println("Task list empty!");
            return;
        }

        Job temp = startNode;
        boolean match = false;

        do {
            if (temp.level.equalsIgnoreCase(level)) {
                System.out.println("Found → ID: " + temp.id +
                        ", Name: " + temp.title +
                        ", Due: " + temp.deadline);
                match = true;
            }
            temp = temp.link;
        } while (temp != startNode);

        if (!match) {
            System.out.println("No task with priority: " + level);
        }
    }
}
