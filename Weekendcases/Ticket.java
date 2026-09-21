package Weekendcases;
abstract class Ticket {
	int ticketId;
	String MovieName;
	String SeatNo;
	double BasePrice;
	String TicketType;
	Ticket(int ticketId, String movieName, String seatNo, double basePrice, String ticketType) {
		super();
		this.ticketId = ticketId;
		MovieName = movieName;
		SeatNo = seatNo;
		BasePrice = basePrice;
		TicketType = ticketType;
	}
	abstract double calculatePrice();
	
	void displaydetails() {
		System.out.println("Ticked Id:"+ticketId);
		System.out.println("Movie Name:"+MovieName);
		System.out.println("Seat Number:"+SeatNo);
		System.out.println("Base price:"+BasePrice);
		System.out.println("Ticket Type:"+TicketType);
		System.out.println("Final price:"+calculatePrice());
		
	}

}
