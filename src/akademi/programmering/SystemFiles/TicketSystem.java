package akademi.programmering.SystemFiles;

import java.util.ArrayList;

public class TicketSystem {

    //Arrays that store Bus Objects and Passenger Objects
    ArrayList <Bus> newBus = new ArrayList<>();
    ArrayList < Passenger > newPassengers = new ArrayList<>();

    // Creates a new Bus object and add it to the ArrayList
    public void createBus(String departure, String destination){
        Bus addBus = new Bus(departure,destination);
        newBus.add(addBus);
    }

    // Creates a new Passenger object and add it to the ArrayList
    public void createPassenger(String name, String dob, String address){
        Passenger p = new Passenger(name, address, dob);
        newPassengers.add(p);
    }

    // Finds a bus by departure and destination
    public Bus findBus(String departure, String destination){
        for(Bus findBus : newBus){
            if((findBus.getDeparture().equals(departure)) && (findBus.getDestination().equals(destination))){
                return findBus;
            }
        }
        return null;
    }

    // Adds Passenger to a specific bus
    public void addPassengerToBus(Passenger p, String departure, String destination){
        Bus bus = findBus(departure, destination);
        bus.reserveNextAvailableSeat(p);
    }

    //Removes passenger from specific bus.
    public void removePassengerFromBus(Passenger p, String departure, String destination){
        Bus bus = findBus(departure, destination);
        bus.deletePassengerReservation(p);
    }

    //Delete seat reservation
    public void deleteSeatReservation(String side, int row, int seat, String departure, String destination){
    Bus bus = findBus(departure, destination);
    bus.deleteSeatReservation(side,row,seat);
    }

    //Checks if there is at least one available seat on the bus
    public boolean checkAvailability(String departure, String destination) {
        Bus bus = findBus(departure, destination);
        if (bus != null) {
            return bus.checkSeatAvailability();
        }
        return false;
    }

    //Finds passenger by name
    public Passenger findPassengerByName(String name){
        for (Passenger p : newPassengers){
            if(name.equals(p.getName())){
                return p;
            }
        }
        return null;
    }

    //Finds Passenger and prints tickets from Passenger by accessing the Ticket array contents
    public void printPassengerTickets(String name){
        Passenger p = findPassengerByName(name);
        if( p != null) {
            for (Ticket print : p.getTickets()) {
                System.out.println(print);
            }
        }
    }

}
