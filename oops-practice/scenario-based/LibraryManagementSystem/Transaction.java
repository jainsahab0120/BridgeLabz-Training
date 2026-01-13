public class Transaction {
    Book book;
    Member member;
    int lateDays;

    public Transaction(Book book, Member member, int lateDays) {
        this.book = book;
        this.member = member;
        this.lateDays = lateDays;
    }

    public void display() {
        double fine = member.calculateFine(lateDays);
        System.out.println(
            member.name + " (" + member.getMemberType() + ") | Book: " +
            book.title + " | Late Days: " + lateDays + " | Fine: ₹" + fine
        );
    }
}
