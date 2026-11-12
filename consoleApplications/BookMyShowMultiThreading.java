package consoleApplications;
class MovieBooking{
	int AvailableSeats=10;
	synchronized void BookingTickets(String name,int seats) {
		System.out.println(name+" user trying to book tickets:"+seats+"tickets");
		if(AvailableSeats>=seats) {
			System.out.println("Booking Tickets for user:"+name);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			AvailableSeats=AvailableSeats-seats;
			System.out.println(name+" Tickets Booked Successfully:"+seats);
			System.out.println("Remaining Available Seat:"+AvailableSeats);
		}else {
			System.out.println(name+" Sorry No seats Available:"+seats);
			System.out.println("Try for next Show..");	
		}
	}
}
class users extends Thread{
	MovieBooking booking;
	String UserName;
	int seats;
	public users(MovieBooking booking, String userName, int seats) {
		super();
		this.booking = booking;
		UserName = userName;
		this.seats = seats;
	}
	@Override
	public void run() {
		 booking.BookingTickets(UserName, seats);
	}	
}
public class BookMyShowMultiThreading {

	public static void main(String[] args) {
		System.out.println(" Welcome to BookMyShow...");
		MovieBooking m1=new MovieBooking();
		users u=new users(m1, "chaithanya", 6);
		users u1=new users(m1, "ram", 4);
		users u2=new users(m1, "ravi", 2);
		
		u.start();
		u1.start();
		u2.start();
	}

}
