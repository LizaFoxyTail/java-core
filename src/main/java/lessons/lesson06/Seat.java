package lessons.lesson06;

public class Seat {
    private int seatNumber;
    private String seatClass;
    private boolean isBooked;
    private String passengerName;

    public Seat(int seatNumber, String seatClass) {
        this.seatNumber = seatNumber;
        this.seatClass = seatClass;
        this.isBooked = false;
        this.passengerName = "";
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public String getSeatClass() {
        return seatClass;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void bookSeat(String passengerName) {
        if (!isBooked) {
            this.isBooked = true;
            this.passengerName = passengerName;
        } else {
            System.out.println("This seat is already booked.");
        }
    }

    public void cancelBooking() {
        this.isBooked = false;
        this.passengerName = "";
    }

    public String toFileFormat() {
        return seatNumber + ";" + seatClass + ";" + isBooked + ";" + passengerName;
    }

}

