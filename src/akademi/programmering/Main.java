package akademi.programmering;

import akademi.programmering.SystemFiles.Passenger;
import akademi.programmering.SystemFiles.TicketSystem;

public class Main {

    public static void main(String[] args) {
        TicketSystem sys = new TicketSystem();

       //Create the passengers
        sys.createPassenger("Roger", "15/06/1968", "Ekraveien 82.");
        sys.createPassenger("Celine", "05/06/1996", "Karl Johans gate 6.");
        sys.createPassenger("a","b","c");

        //Create some buses
        sys.createBus("Oslo", "Madrid");
        sys.createBus("Stockholm", "Puerto Rico");

        //Add a ticket to a passenger and print it
        sys.findPassengerByName("Roger").createTicket("20/08/2020", "Oslo", "Madrid");
        sys.findPassengerByName("Roger").createTicket("07/10/2021", "Stockholm", "Puerto Rico");
        sys.printPassengerTickets("Roger");

        sys.addPassengerToBus(sys.findPassengerByName("Roger"), "Oslo", "Madrid");
        sys.addPassengerToBus(sys.findPassengerByName("Celine"), "Stockholm", "Puerto Rico");
        sys.addPassengerToBus(sys.findPassengerByName("Roger"), "Stockholm", "Puerto Rico");

        System.out.println("Are there available seats from Oslo to Madrid? " + sys.checkAvailability("Oslo", "Madrid"));

        System.out.println("Are there available seats from Stockholm to Puerto Rico? " + sys.checkAvailability("Stockholm", "Puerto Rico"));

        System.out.println(sys.findBus("Oslo", "Madrid").toString());
        System.out.println(sys.findBus("Stockholm", "Puerto Rico").toString());

        sys.removePassengerFromBus(sys.findPassengerByName("Roger"), "Stockholm", "Puerto Rico");
        System.out.println(sys.findBus("Stockholm", "Puerto Rico").toString());

        sys.removePassengerFromBus(sys.findPassengerByName("a"),"Oslo","Madrid");
    }

}
