package Weekendcases;
public class TicketMain {
	public static void main(String[] args) {
		 // Runtime Polymorphism
        Ticket t1 = new RegularTicket(101, "puspha", "A10", 200,"offline ticket");
        Ticket t2 = new premiumTicket(102, "Bombay", "B15", 200,"online booking");
        Ticket t3 = new VIPticket(103, "RAAKA", "V01", 200,"online booking");
        System.out.println("**********************************************");
        t1.displaydetails();
        System.out.println("**********************************************");
        t2.displaydetails();
        System.out.println("**********************************************");
        t3.displaydetails();
        System.out.println("**********************************************");

	}

}
