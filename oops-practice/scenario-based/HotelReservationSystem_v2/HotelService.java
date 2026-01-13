import java.util.*;

public class HotelService {

    private List<Room> rooms = new ArrayList<>();
    private List<Reservation> reservations = new ArrayList<>();

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public Reservation bookRoom(int reservationId, Guest guest, int days)
            throws RoomNotAvailableException {

        for (Room room : rooms) {
            if (room.isAvailable) {
                room.isAvailable = false;
                Reservation reservation =
                        new Reservation(reservationId, room, guest, days);
                reservations.add(reservation);
                return reservation;
            }
        }
        throw new RoomNotAvailableException("No rooms available");
    }

    public void checkout(int reservationId) {
        for (Reservation r : reservations) {
            if (r.reservationId == reservationId) {
                r.room.isAvailable = true;
                r.displayInvoice();
                return;
            }
        }
        System.out.println("Reservation not found");
    }

    public void displayRooms() {
        for (Room r : rooms) {
            String status = r.isAvailable ? "Available" : "Booked";
            System.out.println(
                r.roomNumber + " | " + r.getType() + " | " + status
            );
        }
    }
}