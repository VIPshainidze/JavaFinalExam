package ge.edu.btu;

import java.util.ArrayList;
import java.util.List;

public class Train {
    List<Passenger> passengersList = new ArrayList<>();

    public void addPassenger(Passenger passenger) {
        if (passenger.hasTicket()) this.passengersList.add(passenger);
    }

    public List<Passenger> getPassengersList() {
        return this.passengersList;
    }
}
