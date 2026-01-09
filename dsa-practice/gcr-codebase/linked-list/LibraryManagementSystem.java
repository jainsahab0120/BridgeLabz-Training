import java.util.*;

// Node representing a library item
class LibraryItem {
    int id;
    String name;
    String writer;
    String category;
    boolean available;
    LibraryItem prev, next;

    LibraryItem(int id, String name, String writer, String category, boolean available) {
        this.id = id;
        this.name = name;
        this.writer = writer;
        this.category = category;
        this.available = available;
        this.prev = null;
        this.next = null;
    }
}

public class DigitalLibraryManager {

    static LibraryItem first = null;
    static LibraryItem last = null;

    public static void main(String[] args) {

        insertFront(101, "The Alchemist", "Paulo Coelho", "Fiction", true);
        insertRear(102, "Java Programming", "James Gosling", "Education", true);
        insertAtIndex(2, 103, "1984", "George Orwell", "Dystopia", false);

        showForward();
        System.out.println();

        System.out.println("Searching by Title:");
        findByTitle("1984");
        System.out.println();

        System.out.println("Updating Availability:");
        changeAvailability(103, true);
        findByTitle("1984");
        System.out.println();

        System.out.println("Reverse Display:");
        showBackward();
        System.out.println();

        totalBooks();
        System.out.println();

        System.out.println("Removing Book ID 102...");
        deleteById(102);
        showForward();
        totalBooks();
    }

    // Insert at beginning
    static void insertFront(int id, String name, String writer, String category, boolean available) {
        LibraryItem node = new LibraryItem(id, name, writer, category, available);

        if (first == null) {
            first = last = node;
        } else {
            node.next = first;
            first.prev = node;
            first = node;
        }
    }

    // Insert at end
    static void insertRear(int id, String name, String writer, String category, boolean available) {
        LibraryItem node = new LibraryItem(id, name, writer, category, available);

        if (last == null) {
            first = last = node;
        } else {
            last.next = node;
            node.prev = last;
            last = node;
        }
    }

    // Insert at specific position
    static void insertAtIndex(int pos, int id, String name, String writer, String category, boolean available) {
        if (pos <= 1) {
            insertFront(id, name, writer, category, available);
            return;
        }

        LibraryItem temp = first;
        int index = 1;

        while (temp != null && index < pos - 1) {
            temp = temp.next;
            index++;
        }

        if (temp == null || temp.next == null) {
            insertRear(id, name, writer, category, available);
            return;
        }

        LibraryItem node = new LibraryItem(id, name, writer, category, available);
        node.next = temp.next;
        node.prev = temp;
        temp.next.prev = node;
        temp.next = node;
    }

    // Delete by ID
    static void deleteById(int id) {
        if (first == null) {
            System.out.println("Library is empty!");
            return;
        }

        LibraryItem temp = first;

        while (temp != null && temp.id != id) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Book not found!");
            return;
        }

        if (temp == first) {
            first = first.next;
            if (first != null) first.prev = null;
            else last = null;
        }
        else if (temp == last) {
            last = last.prev;
            last.next = null;
        }
        else {
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
        }

        System.out.println("Book removed successfully!");
    }

    // Search by title
    static void findByTitle(String title) {
        LibraryItem temp = first;
        boolean found = false;

        while (temp != null) {
            if (temp.name.equalsIgnoreCase(title)) {
                printDetails(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found)
            System.out.println("No book found with title: " + title);
    }

    // Search by author
    static void findByAuthor(String writer) {
        LibraryItem temp = first;
        boolean found = false;

        while (temp != null) {
            if (temp.writer.equalsIgnoreCase(writer)) {
                printDetails(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found)
            System.out.println("No book found by author: " + writer);
    }

    // Update availability
    static void changeAvailability(int id, boolean status) {
        LibraryItem temp = first;

        while (temp != null) {
            if (temp.id == id) {
                temp.available = status;
                System.out.println("Availability updated!");
                return;
            }
            temp = temp.next;
        }

        System.out.println("Book ID not found!");
    }

    // Display forward
    static void showForward() {
        if (first == null) {
            System.out.println("Library is empty!");
            return;
        }

        System.out.println("Books (Forward):");
        LibraryItem temp = first;
        while (temp != null) {
            printDetails(temp);
            temp = temp.next;
        }
    }

    // Display backward
    static void showBackward() {
        if (last == null) {
            System.out.println("Library is empty!");
            return;
        }

        System.out.println("Books (Reverse):");
        LibraryItem temp = last;
        while (temp != null) {
            printDetails(temp);
            temp = temp.prev;
        }
    }

    // Count books
    static void totalBooks() {
        int count = 0;
        LibraryItem temp = first;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        System.out.println("Total Books: " + count);
    }

    // Print details
    static void printDetails(LibraryItem b) {
        System.out.println(
                "ID: " + b.id +
                ", Title: " + b.name +
                ", Author: " + b.writer +
                ", Genre: " + b.category +
                ", Available: " + (b.available ? "Yes" : "No")
        );
    }
}
