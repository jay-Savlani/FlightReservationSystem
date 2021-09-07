import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {



    public static void main(String[] args) {
        Passenger p1 = new Passenger("Jay Savlani", "9904669996", "jaysavlani2608@gmail.com", "Rajeshwar Gold", "Vadodara", "Gujarat");

        System.out.println(p1.getContact().getContactDetails());
        System.out.println(p1.getAddress().getAddressDetails());
        System.out.println();

        Flight f1 = new Flight(10, "Spice Jet", 250);
        f1.book();
        System.out.println(f1.getFlightDetails());

        System.out.println();
        String locations[] = {"Juhu", "Haji Ali Dargah", "Gateway Of India", "Red Carpet Wax Museum", "Kidzania"};
        TouristTickets ticket1 = new TouristTickets(f1, "235678", "Vadodara", "Mumbai", "23:00", "19:00", "07/09/2021", "07/09/2021", 45, 5000, "Hotel Paramount", locations);
        System.out.println(ticket1.getTicketDetails());
        System.out.println();
        RegularTickets ticket2 = new RegularTickets(f1, "785678", "Vadodara", "Mumbai", "09:00", "08:00", "07/09/2021", "08/09/2021", 60, 5500, "Food, Water, Snacks");
        System.out.println(ticket2.getTicketDetails());

    }

}





