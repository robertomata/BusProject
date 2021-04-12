package akademi.programmering.SystemFiles;

public class Bus {
    //Bus array defined by left and right
    Passenger[][] seatsLeft = new Passenger[2][20];
    Passenger[][] seatsRight = new Passenger[2][20];

    //bus variables
    public String departure;
    public String destination;

    //constructors for the Bus class
    public Bus(String departure, String destination) {
        this.departure = departure;
        this.destination = destination;
    }

    //iterates through the seatsRight and seatsLeft arrays searching for the next "null" position if available;
    public boolean checkSeatAvailability() {
        for (int i = 0; i < seatsRight.length; i++) {
            for (int j = 0; j < seatsRight[i].length; j++) {
                if (seatsRight[i][j] == null) {
                    return true;
                }
            }
        }

        for (int i = 0; i < seatsLeft.length; i++) {
            for (int j = 0; j < seatsLeft[i].length; j++) {
                if (seatsLeft[i][j] == null) {
                    return true;
                }
            }
        }
        return false;
    }

    //iterates through the seatsRight and seatsLeft arrays searching for the next "null" position,
    // when found a Passenger object "p" is assigned to the array position
    public void reserveNextAvailableSeat(Passenger p){
        for (int i = 0; i < seatsRight.length; i++) {
            for (int j = 0; j < seatsRight[i].length; j++) {
                if (seatsRight[i][j] == null) {
                    seatsRight[i][j] = p;
                    return;
                }
            }
        }
        for ( int i = 0; i < seatsLeft.length; i++) {
            for (int  j = 0; j < seatsLeft[i].length; j++) {
                if (seatsLeft[i][j] == null) {
                    seatsLeft[i][j] = p;
                    return;
                }
            }
        }
    }

    //deletes seat reservation by selecting a side and a position [row][colm] in the array and setting it to "null"
    public void deleteSeatReservation (String side,int row, int colm){

        if (side.equals("Right")){
            if(seatsRight[row][colm] != null){
                seatsRight[row][colm] = null;
                }
        }else if(side.equals("Left")){
            if(seatsLeft[row][colm] != null){
                seatsLeft[row][colm] = null;
            }
        }else{
            System.out.println("Assign the correct bus side");
        }
    }

    //iterates through the SeatsRight and seatsLeft arrays searching for "p" passenger and
    // eliminates the passenger object from the array
    public void deletePassengerReservation (Passenger p) {
        for (int i = 0; i < seatsRight.length; i++) {
            for (int j = 0; j < seatsRight[i].length; j++) {
                if (seatsRight[i][j] == p) {
                    seatsRight[i][j] = null;
                    System.out.println("Reservation Deleted");
                    return;
                }
            }
        }
        for (int i = 0; i < seatsLeft.length; i++) {
            for (int j = 0; j < seatsLeft[i].length; j++) {
                if (seatsLeft[i][j] == p) {
                    seatsLeft[i][j] = null;
                    System.out.println("Reservation Deleted");
                    return;
                }
            }
        }
        System.out.println("Passenger not found!");
    }

    //Overrides the toString() function and retrieves a formatted passenger list by iterating through the array
   @Override
   public String toString(){
        String passengerList = "";

        for (int i = 0; i < seatsRight.length; i++) {
           for (int j = 0; j < seatsRight[i].length; j++) {
               if(seatsRight[i][j] != null) {
                   passengerList += seatsRight[i][j];

               }
           }
        }

        for (int i = 0; i < seatsLeft.length; i++) {
           for (int j = 0; j < seatsLeft[i].length; j++) {
               if(seatsLeft[i][j] != null) {
                   passengerList += seatsLeft[i][j];

               }
           }
        }

        return passengerList;
   }

    //Returns the place of departure
    public String getDeparture(){
        return departure;
    }

    //Returns the destination
    public String getDestination() {
        return destination;
    }

}












