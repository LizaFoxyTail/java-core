package lessons.lesson07;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Duration;
public class Seat {
    private int seatNumber;
    private String seatClass;
    private static String seatStatus;
    private String passengerName;
    private LocalDateTime bookingTime;

    public Seat(int seatNumber, String seatClass) {
        this.seatNumber = seatNumber;
        this.seatClass = seatClass;
        this.passengerName = "";
        this.seatStatus = "free";
        this.bookingTime = null;
    }

    public int getSeatNumber() {
        return seatNumber;
    }
    public static String getSeatStatus() {
        return seatStatus;
    }
    public String getSeatClass() {
        return seatClass;
    }

    public String getPassengerName() {
        return passengerName;
    }
    
    public LocalDateTime getBookingTime() {
        return bookingTime;
    }

    public void bookSeat(String passengerName) {
        if (seatStatus.equals("free")) {
            seatStatus = "booked";
            this.passengerName = passengerName;
            this.bookingTime = LocalDateTime.now();
            System.out.println("Seat booked!");

        } else {
            System.out.println("This seat is already booked or paid");
        }
    }

    public void pay() {
        if (seatStatus.equals("booked")) {
            seatStatus = "paid";
            System.out.println("Seat paid successfully!");
        } else {
            System.out.println("Firstly book a seat");
        }
    }

    public void cancelBooking() {
        if (!seatStatus.equals("free")) {
            seatStatus = "free";
            this.passengerName = "";
            this.bookingTime = null;
            System.out.println("Booking was cancelled");
        } else {
            System.out.println("This seat is already free");
        }
    }

    public String toFileFormat() {
        return seatNumber + ";" + seatClass + ";" + seatStatus + ";" + passengerName;
    }

}

