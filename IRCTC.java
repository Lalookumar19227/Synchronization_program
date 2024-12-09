package synchronization_program;

public class IRCTC {
	
	volatile int no_of_ticket=12;
	
	public synchronized void bookTicket() {
		
		System.out.println("===User Started Booking Ticket===");
		System.out.println("User is Booking Ticket");
		System.out.println("===User completed Booking Ticket===");
		System.out.println("===========COmpleted=================");
	}

}
