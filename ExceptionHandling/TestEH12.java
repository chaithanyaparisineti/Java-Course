package ExceptionHandling;
import java.util.Scanner;
public class TestEH12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Booking process has been Started");
        // Passenger details
        System.out.print("Enter Passenger ID: ");
        String passengerId = sc.nextLine();

        System.out.print("Enter Passenger Age: ");
        String age = sc.nextLine();

        System.out.print("Enter Seat Number: ");
        String seatNo = sc.nextLine();

        System.out.print("Enter Number of Passengers: ");
        int numOfPassengers = sc.nextInt();

        // Passenger details in array
        String[] passengers = {"Chaithu", "Noor", "Ram"};

        // Different passenger data using Object[]
        Object[] passengersData = {"Chaithu", 22, "A15", 5000.0};

        // 1. NumberFormatException
        try {
            int id = Integer.parseInt(passengerId);
            int passengerAge = Integer.parseInt(age);

            System.out.println("Passenger ID: " + id);
            System.out.println("Passenger Age: " + passengerAge);

        } catch (NumberFormatException e) {
            System.out.println("Invalid Passenger ID or Age");
        }

        // 2. ArithmeticException
        try {
            int totalBaggage = 60;

            int averageBaggage = totalBaggage / numOfPassengers;

            System.out.println("Average Baggage: " + averageBaggage + " kg");

        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }

        // 3. ArrayIndexOutOfBoundsException
        try {
            System.out.print("Enter Passenger Array Index: ");
            int index = sc.nextInt();

            System.out.println("Passenger: " + passengers[index]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid Passenger Array Index");
        }

        // 4. StringIndexOutOfBoundsException
        try {
            System.out.print("Enter Seat Character Index: ");
            int index = sc.nextInt();

            char seat = seatNo.charAt(index);

            System.out.println("Seat Character: " + seat);

        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Invalid Seat String Index");
        }

        // 5. ClassCastException
        try {
            Object value = passengersData[0];

            String name = (String) value;

            System.out.println("Passenger Name: " + name);

            // Trying to convert String object into Integer
            Integer passengerAge = (Integer) value;

            System.out.println("Passenger Age: " + passengerAge);

        } catch (ClassCastException e) {
            System.out.println(
                "Object cannot be converted into the expected type"
            );
        }

        // 6. NullPointerException
        try {
            String passengerName = null;

            System.out.println(
                "Passenger Name Length: " + passengerName.length()
            );

        } catch (NullPointerException e) {
            System.out.println("Passenger Name cannot be null");
        }

        // 7. Booking Average
        try {
            double totalAmount = 15000;
            int totalSeats = 35;

            double bookingAverage = totalAmount / totalSeats;

            System.out.println(
                "Booking Average: " + bookingAverage
            );

        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }

        System.out.println("Booking process has completed successfully");

        sc.close();

	}

}
