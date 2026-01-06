import java.util.ArrayList;
import java.util.List;

class BookNotAvailableException extends Exception {
    BookNotAvailableException(String msg) {
        super(msg);
    }
}

class Book {
    String title;
    String author;
    boolean available;

    Book(String title, String author, boolean available) {
        this.title = title;
        this.author = author;
        this.available = available;
    }

    void borrow() throws BookNotAvailableException {
        if (!available) {
            throw new BookNotAvailableException("Book is not available right now");
        }
        available = false;
    }

    void show() {
        System.out.println(
            title + " - " + author + " (" + (available ? "Available" : "Issued") + ")"
        );
    }
}

class LibraryManager {

    private List<Book> bookList = new ArrayList<>();

    LibraryManager(Book[] books) {
        for (Book b : books) {
            bookList.add(b);
        }
    }

    void showAll() {
        for (Book b : bookList) {
            b.show();
        }
    }

    void search(String word) {
        boolean found = false;

        for (Book b : bookList) {
            if (b.title.toLowerCase().contains(word.toLowerCase())) {
                b.show();
                found = true;
            }
        }

        if (!found) {
            System.out.println("No matching books found");
        }
    }

    boolean issueBook(String name) throws BookNotAvailableException {
        for (Book b : bookList) {
            if (b.title.equalsIgnoreCase(name)) {
                b.borrow();
                return true;
            }
        }
        return false;
    }
}

public class LibraryApplication {

    public static void main(String[] args) {

        Book[] books = {
            new Book("Clean Code", "Robert Martin", true),
            new Book("Effective Java", "Joshua Bloch", true),
            new Book("Java Concurrency", "Brian Goetz", false)
        };

        LibraryManager manager = new LibraryManager(books);

        System.out.println("Library Books:");
        manager.showAll();

        System.out.println("\nSearch result for 'Java':");
        manager.search("Java");

        try {
            if (manager.issueBook("Effective Java")) {
                System.out.println("\nBook issued successfully");
            }

            manager.issueBook("Java Concurrency");

        } catch (BookNotAvailableException e) {
            System.out.println("Issue failed: " + e.getMessage());
        }
    }
}
