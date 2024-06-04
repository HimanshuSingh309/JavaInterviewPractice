package may_21_2024;

public class RedBus {

	// Private fields (data members)
	private String busId;
	private String departureCity;
	private String arrivalCity;
	private String departureTime;
	private int availableSeats;
	private double seatPrice;

	public RedBus(String busId, String departureCity, String arrivalCity, String departureTime, int availableSeats, double seatPrice) {

		this.busId = busId;
		this.departureCity = departureCity;
		this.arrivalCity = arrivalCity;
		this.departureTime = departureTime;
		this.availableSeats = availableSeats;
		this.seatPrice = seatPrice;
	}

	public String getBusId() {
		return busId;
	}

	public String getDepartureCity() {
		return departureCity;
	}

	public String getArrivalCity() {
		return arrivalCity;
	}

	public String getDepartureTime() {
		return departureTime;
	}

	public int getAvailableSeats() {
		return availableSeats;
	}
	public double getseatPrice() {
		return seatPrice;
	}
	
	public void bookTickets(int ticketsToBeBooked, String departureCity, String arrivalCity) {
		if(departureCity.equalsIgnoreCase(this.departureCity) && arrivalCity.equalsIgnoreCase(this.arrivalCity)) {
			if(ticketsToBeBooked > 0 && ticketsToBeBooked <= this.availableSeats) {
				this.availableSeats -= ticketsToBeBooked;
				double totalFare = calculateTotalFare(ticketsToBeBooked);
				System.out.println(ticketsToBeBooked + " Tickets booked. and total fare is: " + totalFare);
			}
			else if(ticketsToBeBooked > this.availableSeats) {
				System.out.println("insufficient seats.");
			}
			else {
				System.out.println("Invalid number of seats to book. ");
			}
		}
		else
			System.out.println("You are entering the different rout city.");
	}
	
	// Private method to calculate total fare based on number of seats booked
    private double calculateTotalFare(int ticketsToBeBooked) {
        return ticketsToBeBooked * seatPrice;
    }

}
