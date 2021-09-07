// Ticket Class Done

import java.util.Arrays;
import java.util.Scanner;
import java.util.SplittableRandom;



public abstract class Ticket {
    private String pnrNumber;
    private String departureLocation;
    private String destinationLocation;
    private  String arrivalTime;
    private String departureTime;
    private int arrivalTimeInt;
    private int departureTimeInt;
    private String arrivalDate;
    private String departureDate;
    private Passenger passengerDetails;
    private int seatNumber;
    private float ticketPrice;
    private boolean cancelStatus = false;
    private Flight flight;


    public Ticket(Flight flight, String pnrNumber, String departureLocation, String destinationLocation, String arrivalTime, String departureTime, String arrivalDate, String departureDate, int seatNumber, float ticketPrice) {

        this.pnrNumber = pnrNumber;
        this.departureLocation = departureLocation;
        this.destinationLocation = destinationLocation;
        this.arrivalTime = arrivalTime;
        this.departureTime = departureTime;
        this.arrivalDate = arrivalDate;
        this.departureDate = departureDate;
        this.seatNumber = seatNumber;
        this.ticketPrice = ticketPrice;
        this.flight = flight;
        flight.book();
    }

    // Getters and settors


    public String getPnrNumber() {
        return pnrNumber;
    }

    public void setPnrNumber(String pnrNumber) {
        this.pnrNumber = pnrNumber;
    }

    public String getDepartureLocation() {
        return departureLocation;
    }

    public void setDepartureLocation(String departureLocation) {
        this.departureLocation = departureLocation;
    }

    public String getDestinationLocation() {
        return destinationLocation;
    }

    public void setDestinationLocation(String destinationLocation) {
        this.destinationLocation = destinationLocation;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public int getArrivalTimeInt() {
        return arrivalTimeInt;
    }

    public void setArrivalTimeInt(int arrivalTimeInt) {
        this.arrivalTimeInt = arrivalTimeInt;
    }

    public int getDepartureTimeInt() {
        return departureTimeInt;
    }

    public void setDepartureTimeInt(int departureTimeInt) {
        this.departureTimeInt = departureTimeInt;
    }

    public String getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public float getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(float ticketPrice) {
        this.ticketPrice = ticketPrice;
    }



    // Other Methods
    public String getTicketDetails() {
        String newLine = System.lineSeparator();
        return "Ticket Details: " + newLine + "Flight Number : " + flight.getFlightNumber() + newLine + "PNR Number: " + this.getPnrNumber() + newLine + "Departure Location: " + this.getDepartureLocation() + newLine + "Departure Date: " + this.getDepartureDate() + newLine + "Departure Time: " + this.getDepartureTime() + newLine + "Destination Location: " + this.getDestinationLocation() + newLine + "Arrival Date: " + this.getArrivalDate() + newLine + "Arrivale Time: " + this.getArrivalTime() + newLine + "Duration: " + this.getFlightDuration()  + newLine + "Seat Number: " + this.getSeatNumber() + newLine + "Ticket Price: " + this.getTicketPrice();
    }

    public String StatusInfo() {
            if(cancelStatus == true) {
                return "Ticket Cancelled";
            }
            else {
                return "Ticket Confirmed";
            }
        }


        public int  getFlightDuration() {
            int intArr, intDep;

             String[] splitArr = arrivalTime.split(":");
             String s1 = splitArr[0];
             String s2 = splitArr[1];
             String s3 = s1.concat(s2);
             intArr = Integer.parseInt(s3);
             String[] splitArr1 = departureTime.split(":");
             String s4 = splitArr1[0];
             String s5 = splitArr1[1];
             String s6 = s4.concat(s5);
             intDep = Integer.parseInt(s6);
//            System.out.println(intArr);
//            System.out.println(intDep);

            if(intDep < 12 && intArr > 12) {
                return (1200 - intDep) + (intArr-1200);
            }

            else if(intArr < intDep ) {
                return 2400 - (intDep - intArr);
            }

            else if(intArr > 12 && intDep > 12) {
                return intArr - intDep;
            }


            else {
                return 0;
            }
        }




    public void cancelTicket() {
            cancelStatus = true;
            int newUnbookedSeats;
            newUnbookedSeats = this.flight.getTotalSeatsBooked() - 1;
            this.flight.setTotalSeatsBooked(newUnbookedSeats);


        }
}
