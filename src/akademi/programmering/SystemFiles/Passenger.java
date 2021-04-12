package akademi.programmering.SystemFiles;

import java.util.ArrayList;

public class Passenger {

    //Passenger variables
    private String name;
    private String address;
    private String dob;
    private final ArrayList<Ticket> tickets = new ArrayList<>();

    //Passenger constructor
    public Passenger(String name, String address, String dob) {
        this.name = name;
        this.address = address;
        this.dob = dob;
    }

    //returns the tickets
    public ArrayList<Ticket> getTickets() {
        return tickets;
    }

    //returns the name of passenger
    public String getName() {
        return name;
    }

    //returns de address
    public String getAddress() {
        return address;
    }

    //returns the date of birth
    public String getDob() {
        return dob;
    }

    //set name
    public void setName(String name) {
        this.name = name;
    }

    //set address
    public void setAddress(String address) {
        this.address = address;
    }

    //set date of birht
    public void setDob(String dob) {
        this.dob = dob;
    }

    //creates a new ticket and ands it to the ArrayList
    public void createTicket(String date, String departure, String destination){

        Ticket newTicket = new Ticket(this.name,date, departure, destination);
        tickets.add(newTicket);
    }

    //Overrides the toString() function and gives a formatted Passenger Object information
    @Override
    public String toString() {

        return
                "\nPassenger name: " + getName() + "\n" +
                "Address: " + getAddress() + "\n" +
                "dob: " + getDob() + "\n";
    }

}