public class Main {

    //Print Ticket Details Method

    public static String printTicketDetails(Ticket ticket) {
        return ticket.getPnrNumber();
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Flight Reservation System");

        Flight f1 = new Flight(01, "SpiceJet", 200);
        String locations[] = {"Juhu", "Haji Ali Dargah", "Gateway Of India", "Red Carpet Wax Museum", "Kidzania"};

        TouristTickets ticket1 = new TouristTickets(f1, "335566", "Vadodara", "Mumbai", "21:00", "19:00", "7/09/2021", "7/09/2021", 45, 5000, "Hotel Paramount", locations);
        RegularTickets ticket2 = new RegularTickets(f1, "445567", "Vadodara", "Mumbai", "21:00", "19:00", "7/09/2021", "7/09/2021", 45, 5000, "Food, Water, Snacks");

        System.out.println(Main.printTicketDetails(ticket1));
        System.out.println(Main.printTicketDetails(ticket2));


    }

}





