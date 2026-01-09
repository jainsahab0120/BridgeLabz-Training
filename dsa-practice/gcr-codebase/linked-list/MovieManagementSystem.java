import java.util.*;

// Doubly linked list node
class Film {
    String name;
    String director;
    int releaseYear;
    double score;
    Film next;
    Film prev;

    Film(String name, String director, int year, double score) {
        this.name = name;
        this.director = director;
        this.releaseYear = year;
        this.score = score;
        this.next = null;
        this.prev = null;
    }
}

public class FilmLibraryManager {

    public static void main(String[] args) {

        Film head = null;

        head = insertAtFront(head, "Inception", "Nolan", 2010, 9.0);
        head = insertAtEnd(head, "Interstellar", "Nolan", 2014, 8.6);
        head = insertAtIndex(head, "Tenet", "Nolan", 2020, 7.5, 2);

        printForward(head);
        System.out.println("------------------------------");

        head = removeByName(head, "Inception");
        printForward(head);
        System.out.println("------------------------------");

        head = insertAtFront(head, "Inception", "Nolan", 2010, 9.0);
        System.out.println("------------------------------");

        searchByScore(head, 8.6);
        System.out.println("------------------------------");

        head = modifyRating(head, "Inception", 8.6);
        System.out.println("------------------------------");

        printBackward(head);
    }

    // Insert at beginning
    static Film insertAtFront(Film head, String name, String director, int year, double score) {
        Film node = new Film(name, director, year, score);
        if (head != null) {
            node.next = head;
            head.prev = node;
        }
        return node;
    }

    // Insert at end
    static Film insertAtEnd(Film head, String name, String director, int year, double score) {
        Film node = new Film(name, director, year, score);
        if (head == null) return node;

        Film temp = head;
        while (temp.next != null) temp = temp.next;

        temp.next = node;
        node.prev = temp;
        return head;
    }

    // Insert at specific position
    static Film insertAtIndex(Film head, String name, String director, int year, double score, int pos) {
        if (pos <= 1) return insertAtFront(head, name, director, year, score);

        Film temp = head;
        for (int i = 1; temp != null && i < pos - 1; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Invalid position!");
            return head;
        }

        Film node = new Film(name, director, year, score);
        node.next = temp.next;
        node.prev = temp;

        if (temp.next != null) temp.next.prev = node;
        temp.next = node;

        return head;
    }

    // Display forward
    static void printForward(Film head) {
        Film temp = head;
        while (temp != null) {
            System.out.println(temp.name + " | " + temp.director +
                    " | " + temp.releaseYear + " | " + temp.score);
            temp = temp.next;
        }
    }

    // Delete by movie name
    static Film removeByName(Film head, String name) {
        Film temp = head;

        while (temp != null) {
            if (temp.name.equalsIgnoreCase(name)) {

                if (temp.prev != null)
                    temp.prev.next = temp.next;
                else
                    head = temp.next;

                if (temp.next != null)
                    temp.next.prev = temp.prev;

                return head;
            }
            temp = temp.next;
        }

        System.out.println("Movie not found!");
        return head;
    }

    // Search by rating
    static void searchByScore(Film head, double score) {
        Film temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.score == score) {
                System.out.println(temp.name + " | " + temp.director +
                        " | " + temp.releaseYear + " | " + temp.score);
                found = true;
            }
            temp = temp.next;
        }

        if (!found)
            System.out.println("No movie found with rating " + score);
    }

    // Update movie rating
    static Film modifyRating(Film head, String name, double newScore) {
        Film temp = head;

        while (temp != null) {
            if (temp.name.equalsIgnoreCase(name)) {
                temp.score = newScore;
                System.out.println("Rating updated:");
                System.out.println(temp.name + " | " + temp.director +
                        " | " + temp.releaseYear + " | " + temp.score);
                return head;
            }
            temp = temp.next;
        }

        System.out.println("Movie not found!");
        return head;
    }

    // Display backward
    static void printBackward(Film head) {
        if (head == null) return;

        Film temp = head;
        while (temp.next != null) temp = temp.next;

        while (temp != null) {
            System.out.println(temp.name + " | " + temp.director +
                    " | " + temp.releaseYear + " | " + temp.score);
            temp = temp.prev;
        }
    }
}
