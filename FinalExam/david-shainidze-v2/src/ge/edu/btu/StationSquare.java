package ge.edu.btu;

public class StationSquare {
    public static void main(String[] args) {
        Passenger david = new Passenger("David", true);
        Passenger george = new Passenger("George", false);
        Passenger mark = new Passenger("Mark", true);

        Train train = new Train();

        train.addPassenger(david);
        train.addPassenger(george);
        train.addPassenger(mark);

        for (Passenger passenger:train.getPassengersList()) {
            System.out.println(passenger.getName());
        }
    }
}
