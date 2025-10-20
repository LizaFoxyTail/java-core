package lessons.lesson06;

import java.io.*;

public class Plane {
    private Seat[] seats;

    public Plane(){
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

    public void showAvailableSeats(){
        System.out.println("Available seats: ");
        boolean isFree = false;

        for (int i=0; i<seats.length; i++){
            if (!seats[i].isBooked()){
                System.out.println(seats[i]);
                isFree = true;
            }
        }
        if(!isFree){
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

    public int countBookedSeats() {
        int count = 0;
        for(int i=0; i<seats.length; i++){
            if (seats[i].isBooked()){
                count++;
            }
        }
        return count;
    }

    public void saveToFile(String file){
        BufferedWriter writer = null;

        try {
            writer = new BufferedWriter(new FileWriter(file));

            for(int i=0; i<seats.length; i++){
                writer.write(seats[i].toFileFormat());
                writer.newLine();
            }
            System.out.println("All the datas saved to file");
        }
        catch (IOException e){
            System.out.println("Can't save file :" + e.getMessage());
        }
        finally {
            if (writer != null) {
                try {
                    writer.close();
                }
                catch (IOException e){
                    System.out.println("Can't close file :" + e.getMessage());
                }
            }
        }
    }
}
