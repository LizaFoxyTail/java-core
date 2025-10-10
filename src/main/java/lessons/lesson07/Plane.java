package lessons.lesson07;

import java.time.Duration;
import java.time.LocalDate;
import java.io.*;
import java.time.LocalDateTime;

public class Plane {
    private Seat[] seats;
    private LocalDate departureDate;

    public Plane(LocalDate departureDate){
        this.departureDate = departureDate;
        seats = new Seat[116];
        int ind = 0;

        for(int i=1; i<=20; i++){
            seats[ind++]= new Seat(i, "Business");
        }

        for (int i=21; i<=116; i++){
            seats[ind++] = new Seat(i, "Economy");
        }
    }

    public Seat[] getSeats() {
        return seats;
    }

    public void setSeats(Seat[] seats) {
        this.seats = seats;
    }

    public  void showSeats(){
        for(int i=0; i<seats.length; i++){
            System.out.println(seats[i]);
        }
    }

    public void showAvailableSeats() {
        expireBookedSeats();
        System.out.println("Available seats: ");
        boolean isFree = false;

        for (int i = 0; i < seats.length; i++) {
            if (seats[i].getSeatStatus().equals("free")) {
                System.out.println(seats[i]);
                isFree = true;
            }
        }
        if (!isFree) {
            System.out.println("All seats are booked");
        }
    }

    public Seat findByNum(int seatNum) {
        for(int i=0; i<seats.length; i++){
            if (seats[i].getSeatNumber() == seatNum){
                return seats[i];
            }
        }
        return null;
    }

    public void expireBookedSeats() {
        for(int i=0; i<seats.length; i++){
            Seat seat = seats[i];
            if (Seat.getSeatStatus().equals("Booked")&& seat.getBookingTime() != null){
                Duration dur = Duration.between(seat.getBookingTime(), LocalDateTime.now());
            if (dur.toMinutes() >= 24) {
                seat.cancelBooking();
                System.out.println("Booking has been cancelled");
                }
            }
        }
    }

    public void saveToFile(String file) {
        BufferedWriter writer = null;

        try {
            writer = new BufferedWriter(new FileWriter(file));

            writer.write("Departure date: " + departureDate);
            writer.newLine();

            for (int i = 0; i < seats.length; i++) {
                writer.write(seats[i].toFileFormat());
                writer.newLine();
            }
            System.out.println("All data saved to file");
        } catch (IOException e) {
            System.out.println("Can't save file: " + e.getMessage());
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    System.out.println("Can't close file: " + e.getMessage());
                }
            }
        }
    }
}
