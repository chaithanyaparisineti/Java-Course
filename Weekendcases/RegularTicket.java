package Weekendcases;
class RegularTicket extends Ticket{

	RegularTicket(int ticketId, String movieName, String seatNo, double basePrice, String ticketType) {
		super(ticketId, movieName, seatNo, basePrice, ticketType);
		
	}
	  @Override
	    double calculatePrice() {
	        return BasePrice;
	  }

	}


