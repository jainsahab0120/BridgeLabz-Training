public class Reservation {
    int reservationId;
    Room room;
    Guest guest;
    int days;

    public Reservation(int reservationId, Room room, Guest guest, int days) {
        this.reservationId = reservationId;
        this.room = room;
        this.guest = guest;
        this.days = days;
    }

    public void displayInvoice() {
        System.out.println(
            "Reservation ID: " + reservationId +
            " | Guest: " + guest.name +
            " | Room: " + room.getType() +
            " | Days: " + days +
            " | Bill: ₹" + room.calculateBill(days)
        );
    }
}