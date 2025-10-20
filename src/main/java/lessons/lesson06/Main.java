package lessons.lesson06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Plane plane = new Plane();
        Scanner scanner = new Scanner(System.in);
        String filePath = "airplane_data.txt";

        while (true) {
            System.out.println(" AIRPLANE MENU ");
            System.out.println("1. Show all seats");
            System.out.println("2. Show available seats");
            System.out.println("3. Book a seat");
            System.out.println("4. Cancel booking");
            System.out.println("5. Find seat info");
            System.out.println("6. Save data and exit");
            System.out.print("Choose option: ");

            int userChoice = scanner.nextInt();
            scanner.nextLine();

            switch (userChoice) {
                case 1:
                    plane.showSeats();
                    break;
                case 2:
                    plane.showAvailableSeats();
                    break;
                case 3:
                    System.out.print("Enter seat number: ");
                    int seatNum = scanner.nextInt();
                    scanner.nextLine();
                    Seat seatToBook = plane.findByNum(seatNum);
                    if (seatToBook != null && !seatToBook.isBooked()) {
                        System.out.print("Enter passenger name: ");
                        String name = scanner.nextLine();
                        seatToBook.bookSeat(name);
                        System.out.println(" Seat booked successfully!");
                    } else {
                        System.out.println(" Seat not available!");
                    }
                    break;
                case 4:
                    System.out.print("Enter seat number to cancel: ");
                    int cancelNum = scanner.nextInt();
                    scanner.nextLine();
                    Seat seatToCancel = plane.findByNum(cancelNum);
                    if (seatToCancel != null && seatToCancel.isBooked()) {
                        seatToCancel.cancelBooking();
                        System.out.println(" Booking cancelled.");
                    } else {
                        System.out.println(" Seat not found or not booked.");
                    }
                    break;
                case 5:
                    System.out.print("Enter seat number: ");
                    int findNum = scanner.nextInt();
                    scanner.nextLine();
                    Seat seatInfo = plane.findByNum(findNum);
                    if (seatInfo != null) {
                        System.out.println(seatInfo);
                    } else {
                        System.out.println(" Seat not found.");
                    }
                    break;
                case 6:
                    plane.saveToFile(filePath);
                    System.out.println(" Goodbye!");
                    return;
                default:
                    System.out.println("Invalid option!");
            }
        }
    }
}
