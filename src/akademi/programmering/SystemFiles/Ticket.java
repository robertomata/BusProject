package akademi.programmering.SystemFiles;

public class Ticket {

    //Ticket variables
    public String ticketHolder;
    public String date;
    public String departure;
    public String destination;
    private static int ticketSerial = 1;
    private int ticketNr;

    //Ticket constructor
    public Ticket(String ticketHolder,String date, String departure, String destination) {
        this.ticketHolder = ticketHolder;
        this.date = date;
        this.departure = departure;
        this.destination = destination;
        this.ticketNr = ticketSerial++;
    }

    //Returns the ticket holder’s name
    public String getTicketHolder(){
        return ticketHolder;
    }

    //Assigns the ticket holder’s name
    public void setTicketHolder(String ticketHolder){
        this.ticketHolder = ticketHolder;
    }

    //Returns the date of departure
    public String getDate(){
        return date;
    }

    //Assigns the date of departure
    public void setDate(String date){
        this.date = date;
    }

    //Returns the place of departure
    public String getDeparture(){
        return departure;
    }

    //Assigns the place of departure
    public void setDeparture(String departure){
        this.departure = departure;
    }


    //Returns the destination
    public String getDestination(){
        return destination;
    }

    //Assigns the destination
    public void setDestination(String destination){
        this.destination = destination;
    }

    //Override the toString() function and return a formatted Ticket Object details
    @Override
    public String toString (){
        return "\nPassenger: " + getTicketHolder() + "\n"
                + "Date: " + getDate() + "\n"
                + "Departure: " + getDeparture() + "\n"
                + "Destination: " + getDestination() + "\n"
                + "Ticket Number: " + ticketNr + "\n";

    }

}
