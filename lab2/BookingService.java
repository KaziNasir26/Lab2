package lab2;

import java.util.ArrayList;
import java.util.List;

public class BookingService {
    private List<Booking> bookings = new ArrayList<>();

    public void addBooking(Booking booking) {
        bookings.add(booking);
    }

    public void updateBooking(Booking booking) {
        for (int i = 0; i < bookings.size(); i++) {
            if (bookings.get(i).getId() == booking.getId()) {
                bookings.set(i, booking);
                break;
            }
        }
    }

    public Booking getBooking(int id) {
        for (Booking booking : bookings) {
            if (booking.getId() == id) {
                return booking;
            }
        }
        return null;
    }
}
