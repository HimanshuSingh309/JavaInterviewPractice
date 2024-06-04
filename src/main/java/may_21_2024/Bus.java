package may_21_2024;

public class Bus {

	public static void main(String[] args) {
		
		RedBus rb = new RedBus("HIM1003","Delhi","Manali","10:00 PM", 40, 1700);
		System.out.println("Bus id is: " + rb.getBusId());
		System.out.println("Departure City: " + rb.getDepartureCity());
		System.out.println("Arrival City : " + rb.getArrivalCity());
		System.out.println("Total avaialble seats are: " + rb.getAvailableSeats());
		System.out.println("Bus timing is: " + rb.getDepartureTime());
		System.out.println("Ticket price is: " + rb.getseatPrice());
		
		rb.bookTickets(3, "delhi", "manali");
		System.out.println("Now avaialble seats are: " + rb.getAvailableSeats());

	}

}
