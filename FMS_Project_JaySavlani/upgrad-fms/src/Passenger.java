// Passenger class complete

import java.sql.SQLOutput;
import java.util.Scanner;

public class Passenger {
    // private atrributes
    private static int idCounter=0;
    private Address address;
    private Contact contact;


    public Passenger(String name, String number, String emailId, String street, String city, String state) {
        this.address = new Address(street, city, state);
        this.contact = new Contact(name, number, emailId);
        idCounter++;
    }

    public Address getAddress() {
          return address;
        }
    public Contact getContact() { return contact; }

    public int getPassengerCount() {
        return idCounter;
    }

        //Creating nested class Address

        public class Address {
            private String street;
            private String city;
            private String state;

            public Address(String street, String city, String state) {
                this.street = street;
                this.city = city;
                this.state = state;
            }

            public String getAddressDetails() {
                String newLine = System.lineSeparator();
                return "Passenger Address Details: "+ newLine +  "Street: "+ street + newLine + "City: " + city + newLine + "State: " + state;

            }

            public void setAddressDetails (String street, String city, String state) {
                this.street = street;
                this.city = city;
                this.state = state;
            }

        }

        // Creating nested class Contact

        public class Contact {
            private String contactName;
            private String contactNum ;
            private String emailId;

            public Contact(String contactName, String contactNum, String emailId) {
                this.contactName = contactName;
                this.contactNum = contactNum;
                this.emailId = emailId;
            }

            public String getContactDetails() {
                String newLine = System.lineSeparator();
                return "Passenger Contact Details: "+ newLine + "Name: " + contactName +  newLine + "Number: " + contactNum + newLine + "Email ID: " + emailId;
            }

            public void setcontactDetails(String contactName, String contactNum, String emailId) {
                this.contactName = contactName;
                this.contactNum = contactNum;
                this.emailId = emailId;

            }
        }
}
