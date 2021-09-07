// RegularTickets class Complete

public class RegularTickets extends  Ticket {
    private String serices;

    public RegularTickets(Flight flight, String pnrNumber, String departureLocation, String destinationLocation, String arrivalTime, String departureTime, String arrivalDate, String departureDate, int seatNumber, float ticketPrice, String services) {
        super(flight,pnrNumber,departureLocation,destinationLocation,arrivalTime,departureTime,arrivalDate,departureDate,seatNumber,ticketPrice);
        this.serices = services;
    }

    public String getServices() {
        return serices;
    }

    public void setServices(String serices) {
        this.serices = serices;
    }
}
