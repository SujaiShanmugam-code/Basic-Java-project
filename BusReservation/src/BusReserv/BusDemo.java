package BusReserv;

import java.util.Scanner; //nested package/ hierarchical package
import java.util.ArrayList;

public class BusDemo {

    public static void main(String[] args) {
        System.out.println("\nHi Welcome to Sujai's Bus Reservation!");
        System.out.println();
        System.out.println("The Sujai's Bus details:\n ");

        ArrayList<Bus> buses = new ArrayList<Bus>();
        ArrayList<Booking> bookings = new ArrayList<Booking>();

        buses.add(new Bus(1001,true,2));
        buses.add(new Bus(2002,false,25));
        buses.add(new Bus(3003,true,50));

        int userOpt = 1;
        Scanner scanner = new Scanner(System.in);

        for(Bus b:buses) {
            b.displayBusInfo();
        }

        while(userOpt==1) {
            System.out.println("\nEnter 1 to BOOK A TCIKET and 2 to EXIT TICKET PROCESS!");
            userOpt = scanner.nextInt();
            if(userOpt == 1) {
                Booking booking = new Booking();
                if(booking.isAvailable(bookings,buses)) {
                    bookings.add(booking);
                    System.out.println("\nYour booking is confirmed");
                    System.out.println("Thanks for Choosing Sujai's Buses!!");
                }
                else
                    System.out.println("Sorry. Bus is full. Try another bus or date.");

            }
            System.out.println("Have a nice day! Paldies.");

        }
    }

}