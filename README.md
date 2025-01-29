Basic-Java-project

Project Overview

The Basic Java Project is a console-based application designed to demonstrate fundamental Java concepts such as object-oriented programming, collections, and input validation. This project provides a simple yet functional implementation of a Bus Reservation System that allows users to book bus tickets, check availability, and manage reservations.

Features

Passenger Booking: Users can enter their details and select a bus for travel.

Bus Availability Check: Ensures that seats are available before confirming a booking.

Input Validation:

Ensures passenger names contain only alphabets.

Validates bus number selection from available options.

Enforces strict date format (dd-MM-yyyy).

Booking Confirmation: Provides confirmation upon successful reservation.

Technologies Used

Java (Core Programming)

Collections (ArrayList, HashSet) (Data Storage)

SimpleDateFormat (Date Handling)

Getting Started

Prerequisites

Java Development Kit (JDK 8 or later)

Integrated Development Environment (IDE) (IntelliJ IDEA, Eclipse, NetBeans, or command-line terminal)

Installation

Clone the repository:

git clone https://github.com/yourusername/basic-java-project.git
cd basic-java-project

Open the project in your preferred IDE.

Compile and run the application.

Running the Application

Execute the Main.java file.

Follow the console prompts to enter passenger details, select a bus, and confirm booking.

Sample Input/Output

Enter the Name of Passenger:
JohnDoe

Enter bus no:
101

Enter a Date (dd-MM-yyyy):
25-12-2025

Booking Confirmed! Your ticket is reserved on Bus 101 for 25-12-2025.

Project Structure

BasicJavaProject/
│
├── src/                        # Source Code
│   ├── Bus.java                # Stores bus details
│   ├── Booking.java            # Handles booking logic
│   ├── Main.java               # Entry point of the application
│
├── README.md                   # Project Documentation
└── .gitignore                  # Git Ignore File

Future Enhancements

Database Integration: Store bus and booking details in a database.

Graphical User Interface (GUI): Implement a user-friendly UI using JavaFX or Swing.

User Authentication: Add login and registration features.

Email/SMS Notifications: Send booking confirmation messages.

Contributing

If you would like to contribute:

Fork the repository.

Create a new branch (git checkout -b feature-branch).

Make changes and commit (git commit -am 'Add new feature').

Push the branch (git push origin feature-branch).

Open a pull request.

License

This project is licensed under the MIT License. See the LICENSE file for details.

