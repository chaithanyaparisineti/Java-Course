package ExceptionHandling;
public class PassengerBooking {
	public static void main(String[] args) {
		System.out.println("Booking process has been Started");
		String passengerId="1215";
		String Age="twenty";
		String seatNo="A15";
		int NumOfpassenger=3;
		//passenger details on array
		String[]passengers= {"chaithu","Noor","Ram"};
		Object[]passengersData= {"chaithu",22,"A15",5000.0};
//		NumberFormatException 
		try {
			int id=Integer.parseInt(passengerId);
			int age=Integer.parseInt(Age);
			System.out.println("Passenger Id:"+passengerId);
			System.out.println("Passenger Age:"+Age);
		}catch(NumberFormatException e) {
			System.out.println("invalid passenger Id");
			System.out.println("invalid passenger Age");
		}
//		ArithmeticException 
		try {
			double totalBaggage=60;
			double Average=totalBaggage/NumOfpassenger;
			System.out.println("Average of Baggage:"+Average+"kg");
		}catch(ArithmeticException e) {
			System.out.println("invalid it cannot divided by Zero");
		}
//		ArrayIndexOutOfBoundsException
		try {
			int index=4;
			System.out.println("passengers:"+passengers[index]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid passenger Index");
		}
//		StringIndexOutOfBoundsException
		try {
			char seat=seatNo.charAt(10);
		}catch(StringIndexOutOfBoundsException e) {
			System.out.println("invalid index");
		}
//		ClassCastException
		try {
			Object value=passengersData[0];
			String name=(String)value;
			System.out.println("passenger Name:"+name);
			
		Integer age=(Integer)value;
		System.out.println("passenger Age:"+age);
		}
		catch(ClassCastException e) {
			System.out.println("object cannot be converted into Expected type");
		}
//		NullPointerException
		try {
			String passengerName=null;
			System.out.println("passenger name:"+passengerName.length());
		}catch(NullPointerException e) {
			System.out.println("String name cannot be null");
		}
//		ArithmeticException	
		try {
			double totalamount=15000;
			int totalSeats=35;
			double BookingAverage=totalamount/totalSeats;
			System.out.println("Total Booking Average"+BookingAverage);	
		}catch(ArithmeticException e) {
			System.out.println("invalid it cannot divided by zero");
		}
		System.out.println("Booking process has completed");
	}
		
	}

