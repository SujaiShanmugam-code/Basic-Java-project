package BusReserv;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Booking {
    String passengerName;
    int busNo;
    Date date;

    Booking() {
        Scanner scanner = new Scanner(System.in);

        // Loop for Passenger Name
        while (true) {
            System.out.println("Enter the Name of Passenger: ");
            passengerName = scanner.next();

            if (passengerName.matches("[a-zA-Z]+")) { // Ensures only alphabets
                break;
            } else {
                System.out.println("Invalid name! Please enter a valid passenger name (alphabets only).");
            }
        }

        // Loop for Bus Number
        while (true) {
            System.out.println("Enter a Bus Number: ");
            if (scanner.hasNextInt()) {  // Ensures only integer input
                busNo = scanner.nextInt();
                break;
            } else {
                System.out.println("Invalid bus number! Please enter a valid numeric bus number.");
                scanner.next(); // Clear invalid input
            }
        }

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        dateFormat.setLenient(false); // Ensures strict date validation

        // Loop for Date Input
        while (true) {
            System.out.println("Enter a Date (dd-MM-yyyy): ");
            String dateInput = scanner.next();

            try {
                date = dateFormat.parse(dateInput);
                break; // Exit loop if date is valid
            } catch (ParseException e) {
                System.out.println("Invalid date format! Please enter again in dd-MM-yyyy format.");
            }
        }
    }

    public boolean isAvailable(ArrayList<Booking> bookings, ArrayList<Bus> buses) {
        int capacity = 0;
        for (Bus bus : buses) {
            if (bus.getBusNo() == busNo) {
                capacity = bus.getCapacity();
                break;
            }
        }

        int booked = 0;
        for (Booking b : bookings) {
            if (b.busNo == busNo && b.date.equals(date)) {
                booked++;
            }
        }

        return booked < capacity;
    }
}
