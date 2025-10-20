package lessons.lesson07;

import java.util.Scanner;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Plane plane = new Plane(LocalDate.of(2025, 10, 15));
        Scanner scanner = new Scanner(System.in);
        String filePath = "airplane_data.txt";

        while (true) {
            System.out.println("\n=== AIRPLANE MENU ===");
            System.out.println("1. Show all seats");
            System.out.println("2. Show available seats");
            System.out.println("3. Book a seat");
            System.out.println("4. Pay for seat");
            System.out.println("5. Cancel booking");
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
                    if (seatToBook != null && seatToBook.getSeatStatus().equals("free")) {
                        System.out.print("Enter passenger name: ");
                        String name = scanner.nextLine();
                        seatToBook.bookSeat(name);
                    } else {
                        System.out.println("Seat not available!");
                    }
                    break;
                case 4:
                    System.out.print("Enter seat number to pay: ");
                    int payNum = scanner.nextInt();
                    scanner.nextLine();
                    Seat seatToPay = plane.findByNum(payNum);
                    if (seatToPay != null) {
                        seatToPay.pay();
                    } else {
                        System.out.println("Seat not found.");
                    }
                    break;
                case 5:
                    System.out.print("Enter seat number to cancel: ");
                    int cancelNum = scanner.nextInt();
                    scanner.nextLine();
                    Seat seatToCancel = plane.findByNum(cancelNum);
                    if (seatToCancel != null) {
                        seatToCancel.cancelBooking();
                    } else {
                        System.out.println("Seat not found.");
                    }
                    break;
                case 6:
                    plane.saveToFile(filePath);
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid option!");
            }
        }
    }
}
