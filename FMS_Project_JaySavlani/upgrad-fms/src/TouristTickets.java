// TouristTickets class Complete

import java.util.Arrays;

public class TouristTickets extends Ticket{

    private String hotelAddress;
    private String[] touristLocations = new String[5];


    public TouristTickets(Flight flight,String pnrNumber, String departureLocation, String destinationLocation, String arrivalTime, String departureTime, String arrivalDate, String departureDate, int seatNumber, float ticketPrice, String hotelAddress, String[] touristLocations) {
        super(flight,pnrNumber,departureLocation,destinationLocation,arrivalTime,departureTime,arrivalDate,departureDate,seatNumber,ticketPrice);
        this.hotelAddress = hotelAddress;
        this.touristLocations = touristLocations;
    }

    public void getTouristLocations() {
        for(int i = 0; i < touristLocations.length ; i++) {
            System.out.println(touristLocations[i]);
        }
    }

    public void setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress;
    }

    public void setTouristLocations (String[] locations) {
        for(int i = 0; i < locations.length ; i++) {
            touristLocations[i] = locations[i];
        }
    }


    public String  gethotelAddress() {
        return this.hotelAddress;
    }

    public void addTouristLocation(String touristLocation) {
        touristLocations = Arrays.copyOf(touristLocations, touristLocations.length + 1);
        touristLocations[touristLocations.length - 1] = touristLocation;

    }

    public void removeTouristLocation(String location) {
            String[] newArr = new String[touristLocations.length - 1];
            int m = 0;
            for (int i = 0 ; i < touristLocations.length ; i++) {
                if(location == touristLocations[i]) {
                    continue;
                }
               newArr[m] = touristLocations[i];
                m++;
        }
            touristLocations = newArr;
    }
}
