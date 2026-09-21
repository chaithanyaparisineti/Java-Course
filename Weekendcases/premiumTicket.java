package Weekendcases;

class premiumTicket extends Ticket{

	premiumTicket(int ticketId, String movieName, String seatNo, double basePrice, String ticketType) {
		super(ticketId, movieName, seatNo, basePrice, ticketType);	
	}
	@Override
    double calculatePrice() {
		 return BasePrice + (BasePrice * 0.20);
  }

}
