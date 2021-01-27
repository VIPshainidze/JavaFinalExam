package ge.edu.btu;

public class Passenger {

    String name;
    boolean ticket;

    Passenger() {}

    public Passenger(String passengerName, boolean hasTicketOrNot) {
        this.name = passengerName;
        this.ticket = hasTicketOrNot;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String passengerNewName) {
        this.name = passengerNewName;
    }

    public boolean hasTicket() {
        return this.ticket;
    }

    public void setTicket(boolean hasOrNot) {
        this.ticket = hasOrNot;
    }
}
