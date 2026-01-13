import java.util.*;

public class HotelService {

    private List<Room> rooms = new ArrayList<>();
    private List<Reservation> reservations = new ArrayList<>();

    // ADD ROOM
    public void addRoom(Room room) {
        rooms.add(room);
    }

    // BOOK ROOM
    public Reservation bookRoom(int reservationId, Guest guest, int days)
            throws RoomNotAvailableException {

        for (Room room : rooms) {
            if (room.isAvailable) {
                room.isAvailable = false;
                Reservation res = new Reservation(reservationId, room, guest, days);
                reservations.add(res);
                return res;
            }
        }
        throw new RoomNotAvailableException("No rooms available");
    }

    // CHECK-OUT
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

    // DISPLAY ROOMS
    public void displayRooms() {
        for (Room r : rooms) {
            String status = r.isAvailable ? "Available" : "Booked";
            System.out.println(r.roomNumber + " | " + r.getType() + " | " + status);
        }
    }
}