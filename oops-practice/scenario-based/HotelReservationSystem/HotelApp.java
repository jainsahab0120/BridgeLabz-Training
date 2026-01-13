public class HotelApp {
    public static void main(String[] args) {

        HotelService service = new HotelService();

        PricingStrategy regular = new RegularPricing();
        PricingStrategy seasonal = new SeasonalPricing();

        service.addRoom(new StandardRoom(101, regular));
        service.addRoom(new DeluxeRoom(201, seasonal));

        Guest guest = new Guest(1, "Aryan");

        service.displayRooms();

        try {
            Reservation res = service.bookRoom(1001, guest, 3);
            System.out.println("Room booked successfully");

            System.out.println("\nCheck-out:");
            service.checkout(1001);

        } catch (RoomNotAvailableException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\nFinal Room Status:");
        service.displayRooms();
    }
}