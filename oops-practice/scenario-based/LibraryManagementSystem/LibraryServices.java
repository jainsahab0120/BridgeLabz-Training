import java.util.*;

public class LibraryService {

    private List<Book> books = new ArrayList<>();
    private List<Member> members = new ArrayList<>();
    private List<Transaction> transactions = new ArrayList<>();

    // CREATE
    public void addBook(Book book) {
        books.add(book);
    }

    public void registerMember(Member member) {
        members.add(member);
    }

    // ISSUE BOOK
    public void issueBook(int bookId, Member member) throws BookNotAvailableException {
        for (Book book : books) {
            if (book.bookId == bookId) {
                if (!book.isAvailable) {
                    throw new BookNotAvailableException("Book is already issued");
                }
                book.isAvailable = false;
                System.out.println("Book issued: " + book.title);
                return;
            }
        }
        System.out.println("Book not found");
    }

    // RETURN BOOK
    public void returnBook(int bookId, Member member, int lateDays) {
        for (Book book : books) {
            if (book.bookId == bookId) {
                book.isAvailable = true;
                Transaction txn = new Transaction(book, member, lateDays);
                transactions.add(txn);
                System.out.println("Book returned: " + book.title);
                return;
            }
        }
        System.out.println("Book not found");
    }

    // READ
    public void displayBooks() {
        for (Book book : books) {
            String status = book.isAvailable ? "Available" : "Issued";
            System.out.println(book.bookId + " | " + book.title + " | " + status);
        }
    }

    public void showTransactions() {
        for (Transaction t : transactions) {
            t.display();
        }
    }
}
