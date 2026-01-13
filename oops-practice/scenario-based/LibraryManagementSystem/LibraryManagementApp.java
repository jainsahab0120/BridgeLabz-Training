public class LibraryApp {

    public static void main(String[] args) {

        LibraryService library = new LibraryService();

        Book b1 = new Book(1, "Clean Code");
        Book b2 = new Book(2, "Effective Java");

        library.addBook(b1);
        library.addBook(b2);

        Member student = new StudentMember(101, "Amit");
        Member staff = new StaffMember(201, "Mr. Sharma");

        library.registerMember(student);
        library.registerMember(staff);

        try {
            library.issueBook(1, student);
            library.returnBook(1, student, 3);

            library.issueBook(2, staff);
            library.returnBook(2, staff, 2);

        } catch (BookNotAvailableException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\nBooks:");
        library.displayBooks();

        System.out.println("\nTransactions:");
        library.showTransactions();
    }
}
