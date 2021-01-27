import ge.edu.btu.Passenger;
import ge.edu.btu.Train;
import org.junit.Test;

import static org.junit.Assert.*;

public class StationSquareTest {
    Passenger david = new Passenger("David", true);
    Passenger george = new Passenger("George", false);
    Passenger mark = new Passenger("Mark", true);

    Train train = new Train();

    @Test
    public void stationSquareTest() {
        train.addPassenger(david);
        assertEquals("Error in addPassenger()?", 1, train.getPassengersList().size());
        train.addPassenger(george);
        assertEquals("Error in addPassenger()?", 1, train.getPassengersList().size());
        train.addPassenger(mark);
        assertEquals("Error in addPassenger()?", 2, train.getPassengersList().size());
    }
}
