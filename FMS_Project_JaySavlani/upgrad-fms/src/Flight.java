// Flight Class Complete

public class Flight {
    //Attributes
    public static int flightCounter = 0;
    private int bookingCounter = 0;
    private int flightNumber;
    private String flightAirline;
    private int flightCapacity;
    private static int totalSeatsBooked;


    // Getters and Setters
    public int getFlightNumber() {
        return this.flightNumber;
    }

    public String getFlightAirline() {
        return flightAirline;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public void setFlightAirline(String flightAirline) {
        this.flightAirline = flightAirline;
    }

    public void setFlightCapacity(int flightCapacity) {
        this.flightCapacity = flightCapacity;
    }

    public void setTotalSeatsBooked(int totalSeatsBooked) {
        this.totalSeatsBooked = totalSeatsBooked;
    }

    public int getFlightCapacity() {
        return flightCapacity;
    }

    public int getBookingCounter() {
        return bookingCounter;
    }

    public int getTotalSeatsBooked() {
        return totalSeatsBooked;
    }


    // Constructor

    public Flight(int flightNumber, String flightAirline, int flightCapacity) {
        this.flightNumber = flightNumber;
        this.flightAirline = flightAirline;
        this.flightCapacity = flightCapacity;
        this.totalSeatsBooked = 0;
        flightCounter++;
    }

    // Other Methods

    public String getFlightDetails() {
        String newLine = System.lineSeparator();
        return "Flight Number: " + this.getFlightNumber() + newLine + "Flight Airline: " + this.getFlightAirline() + newLine + "Flight Capacity: " + this.getFlightCapacity() + newLine + "Available Tickets: " + (flightCapacity - totalSeatsBooked);
    }

    public boolean checkSeatAvailability() {
        return ((flightCapacity - totalSeatsBooked) > 0);

    }

    public void book() {
        if (bookingCounter < flightCapacity) {
            ++bookingCounter;
            totalSeatsBooked = this.bookingCounter;
        } else {
            totalSeatsBooked = totalSeatsBooked;
        }

    }

    public int getUnbookedSeats() {
        return flightCapacity - totalSeatsBooked;
    }


}
